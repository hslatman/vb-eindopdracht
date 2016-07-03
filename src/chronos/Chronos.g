grammar Chronos;

options {
  language = Java;
  k=1;
  output = AST;
}

tokens {

  //punctuation
  PROGRAM     = 'program';
  COLON       = ':';
  COMMA       = ',';
  SEMICOLON   = ';';
  LCURLY      = '{';
  RCURLY      = '}';
  LPAREN      = '(';
  RPAREN      = ')';
  
  //keywords
  CONST       = 'const';
  VAR         = 'var';
  READ        = 'read';
  PRINT       = 'print';
  WHILE       = 'while';
  DO          = 'do';
  ENDDO       = 'od';
  IF          = 'if';
  ENDIF       = 'fi';
  THEN        = 'then';
  ELSE        = 'else';
  BECOMES     = ':=';
  
  //binary operators
  GT          = '>';
  GE          = '>=';
  LT          = '<';
  LE          = '<=';
  EQ          = '==';
  NEQ         = '!=';
  
  //logic operators
  NOT         = '!';
  OR          = '||';
  AND         = '&&';
  
  //operators
  PLUS        = '+';
  MINUS       = '-';
  MULT        = '*';
  DIV         = '/';
  MOD         = '%';
  
  //booleans
  TRUE        = 'true';
  FALSE       = 'false';
  
  //unary operators
  PLUSU       = 'plusu';
  MINUSU      = 'minusu';

  //indicator for indented block
  IDESTBLOCK  = 'indent';
  
  //types
  INTEGER   = 'int';
  CHAR      = 'char';
  BOOLEAN   = 'bool';
  VOID      = 'void';
  
  //apostrof used for single characters
  APOSTROF    = '\'';  //verwijder regel om syntax highlighting terug te krijgen

}


@lexer::header {
  package chronos;
  import chronos.utils.error.IChronosErrorReporter;
}

@header {
  package chronos;
  import chronos.utils.error.IChronosErrorReporter;
}

@members {
  
    private IChronosErrorReporter errorReporter = null;
    
    public void setErrorReporter(IChronosErrorReporter errorReporter) {
        this.errorReporter = errorReporter;
    }
    
    @Override
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        if (errorReporter != null){
            errorReporter.addError(hdr, msg);
        } else {
            System.err.print("NO-ERRORREPORTER: ");
            super.displayRecognitionError(tokenNames, e);
        }
    }
    
}

//parser rules

program
    :   decl_stat_blocks EOF
            ->^(PROGRAM decl_stat_blocks)
    ;

decl_stat_blocks
    :   ((declaration SEMICOLON!)* expression SEMICOLON!)+
    ;

indent_decl_stat_blocks
    :   LCURLY decl_stat_blocks RCURLY
          -> ^(IDESTBLOCK decl_stat_blocks)
    ;

declaration
    :   constant_declaration
    |   variable_declaration
    ;

constant_declaration
    :   CONST^ IDENTIFIER BECOMES! expression
    ;
  
variable_declaration
    :   VAR^ IDENTIFIER COLON! type
    ;

type
    :   INTEGER
    |   CHAR
    |   BOOLEAN //VOID???
    ;    

expression
    :   assign_statement
    |   while_statement
    ;

assign_statement
  :  expror (BECOMES^ assign_statement)? //multiple assignment
  ;

expror
  :  exprand (OR^ exprand)*
  ;
  
exprand
  :   exprrel (AND^ exprrel)*
  ;
    
exprrel
  : exprplusminus ((GT^ | GE^ | LT^ | LE^ | EQ^ | NEQ^) exprplusminus)*
  ;
    
exprplusminus
    :   exprmultdiv ((PLUS^ | MINUS^) exprmultdiv)*
    ;

exprmultdiv
  : exprunary ((MOD^ | MULT^ | DIV^) exprunary)*
  ;
  
exprunary
  :   operand
  |   NOT^ operand
  |   PLUS operand
      -> ^(PLUSU operand)
  |   MINUS operand
      -> ^(MINUSU operand)
  ;

operand
  :   TRUE
  |   FALSE
  |   NUMBER
  |   CHARACTER
  |   IDENTIFIER
  |   LPAREN! expression RPAREN!
  |   indent_decl_stat_blocks
  |   read
  |   print
  |   exprif
  ;
  
read
  :   READ^ LPAREN! varlist RPAREN!
  ;
    
print
  :   PRINT^ LPAREN! exprlist RPAREN!
  ;
  
varlist
  :   IDENTIFIER (COMMA! IDENTIFIER)*
  ;
  
exprlist
  :   expression (COMMA! expression)*
  ;

exprif
  :   IF^ decl_stat_blocks exprthen ENDIF!
  ;
  
exprthen
  :   THEN^ decl_stat_blocks (exprelse)?
  ;

exprelse
  :   ELSE^ decl_stat_blocks
  ;
  
while_statement
    :   WHILE^ decl_stat_blocks exprdo ENDDO!
    ;
    
exprdo
    :   DO^ decl_stat_blocks
    ;

//lexer rules

COMMENT
  :   '//' .* '\n' 
        { $channel=HIDDEN; }
  ;

WS
  :   (' ' | '\t' | '\f' | '\r' | '\n')+
        { $channel=HIDDEN; }
  ;

IDENTIFIER
  :   LETTER (LETTER | DIGIT)*
  ;
  
NUMBER
  :   DIGIT+
  ;

CHARACTER
  :   APOSTROF SINGLECHAR APOSTROF
  ;
  
fragment DIGIT        :   ('0'..'9') ;
fragment LOWER        :   ('a'..'z') ;
fragment UPPER        :   ('A'..'Z') ;
fragment LETTER       :   (LOWER | UPPER) ;
fragment SYMBOL       :   (' '|'-');
fragment SINGLECHAR   :   (LETTER | SYMBOL | DIGIT);
