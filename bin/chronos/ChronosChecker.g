tree grammar ChronosChecker;

options {
  language = Java;
  output = AST;
  tokenVocab = Chronos;
  ASTLabelType = CommonTree;  
  k=1;
}

@header {
  package chronos;
  
  import chronos.utils.error.IChronosErrorReporter;
  import chronos.utils.ChronosCheckerToolbox; 
  import chronos.utils.exceptions.ChronosException;
}

@rulecatch {    

    catch (ChronosException e){
        if (errorReporter != null){
            errorReporter.addError(e.getMessage(),"");
        } else {
            throw e;
        }
    }
    
    catch(RecognitionException e){
        if (errorReporter != null){
            errorReporter.addError(e.getMessage(),"");
        } else {
            System.err.println("Recognition Exception Caught " + e);
        }
    }
    
}

@members {    

    private IChronosErrorReporter errorReporter = null;
    
    public void setErrorReporter(IChronosErrorReporter errorReporter) {
        this.errorReporter = errorReporter;
    }
    
    private ChronosCheckerToolbox toolbox = new ChronosCheckerToolbox();
    
}

program
    : ^(PROGRAM decl_stat_blocks+)
    ;
    
decl_stat_blocks returns [ String type = ""; ]
  :   d=declaration                     { $type = $d.type;   }
  |   ex=expression                     { $type = $ex.type;  }
  ;

declaration returns [ String type = "";]
    :   cd=constant_declaration         { $type = $cd.type; }
    |   vd=variable_declaration         { $type = $vd.type; }
    ;
  
constant_declaration  returns [ String type = "";]
    :   ^(CONST id=IDENTIFIER ex=expression)        { toolbox.putConst(id, $ex.type); $type = "no_type"; }
    ;
  
variable_declaration returns [ String type = "";]
    :   ^(VAR id=IDENTIFIER t=type)                 { toolbox.putVar(id, $t.type); $type = "no_type";    }
    ;

  
expression returns [ String type = ""; ]
  :   ^(PLUSU expr=expression)                      { $type = toolbox.checkInt($expr.type, expr);  }
  |   ^(MINUSU expr=expression)                     { $type = toolbox.checkInt($expr.type, expr);  }
  |   ^(NOT expr=expression)                        { $type = toolbox.checkBool($expr.type, expr); }
  |   ^(OR expr1=expression expr2=expression)       { toolbox.checkBool($expr1.type, expr1); $type = toolbox.checkBool($expr2.type, expr2); }
  |   ^(AND expr1=expression expr2=expression)      { toolbox.checkBool($expr1.type, expr1); $type = toolbox.checkBool($expr2.type, expr2); }
  |   ^(PLUS expr1=expression expr2=expression)     { toolbox.checkInt($expr1.type, expr1);  $type = toolbox.checkInt($expr2.type, expr2); }
  |   ^(MINUS expr1=expression expr2=expression)    { toolbox.checkInt($expr1.type, expr1);  $type = toolbox.checkInt($expr2.type, expr2); }
  |   ^(MULT expr1=expression expr2=expression)     { toolbox.checkInt($expr1.type, expr1); $type = toolbox.checkInt($expr2.type, expr2); }
  |   ^(DIV expr1=expression expr2=expression)      { toolbox.checkInt($expr1.type, expr1); $type = toolbox.checkInt($expr2.type, expr2); }
  |   ^(MOD expr1=expression expr2=expression)      { toolbox.checkInt($expr1.type, expr1); $type = toolbox.checkInt($expr2.type, expr2); }
  |   ^(BECOMES id=IDENTIFIER expr=expression)      { $type = toolbox.checkBecomes(id, $expr.type); }
  |   ^(GT expr1=expression expr2=expression)       { toolbox.checkInt($expr1.type, expr1); toolbox.checkInt($expr2.type, expr2); $type = "bool"; }
  |   ^(GE expr1=expression expr2=expression)       { toolbox.checkInt($expr1.type, expr1); toolbox.checkInt($expr2.type, expr2); $type = "bool"; }  
  |   ^(LT expr1=expression expr2=expression)       { toolbox.checkInt($expr1.type, expr1); toolbox.checkInt($expr2.type, expr2); $type = "bool"; }
  |   ^(LE expr1=expression expr2=expression)       { toolbox.checkInt($expr1.type, expr1); toolbox.checkInt($expr2.type, expr2); $type = "bool"; }
  |   ^(EQ expr1=expression expr2=expression)       { toolbox.compareTypes($expr1.type, expr1, $expr2.type, expr2); $type = "bool"; }
  |   ^(NEQ expr1=expression expr2=expression)      { toolbox.compareTypes($expr1.type, expr1, $expr2.type, expr2); $type = "bool"; }
  |   ^(IDESTBLOCK                                  { toolbox.tbOpenScope(); } 
            (dsb=decl_stat_blocks                   { $type = $dsb.type; })+ 
                                                    { toolbox.tbCloseScope(); })
  |   ^(PRINT expr1=expression                      { $type = $expr1.type; toolbox.checkPrintVoid($type, expr1);  }
            (expr2=expression                       { $type = "void"; toolbox.checkPrintVoid($expr2.type, expr2); })*)
  |   ^(READ id1=IDENTIFIER                         { $type = toolbox.getReadType(id1); }  
            (id2=IDENTIFIER                         { if (toolbox.checkRead(id2)) {
                                                          $type = "void"; };
                                                    })*)         
  |   ^(IF                                          { toolbox.tbOpenScope(); }
            d=decl_stat_blocks* ext=exprthen)       { toolbox.checkBool($d.type, d);
                                                      $type = $ext.type;
                                                      toolbox.tbCloseScope();
                                                    }
  |   ^(WHILE                                       { toolbox.tbOpenScope(); }
           d=decl_stat_blocks* exprdo)              { toolbox.checkBool($d.type, d);
                                                      $type = "void";
                                                      toolbox.tbCloseScope();
                                                    }
  |   o=operand                                     { $type = $o.type; }                                                    
  ;

exprdo returns [ String type = ""; ]
  :   ^(DO                                          { toolbox.tbOpenScope();  } 
          dsb=decl_stat_blocks*                     { toolbox.tbCloseScope(); })
  ; 
 
exprthen returns [ String type = ""; ]
  :   ^(THEN                                        { toolbox.tbOpenScope(); }
           dsb=decl_stat_blocks*                    { toolbox.tbCloseScope(); }
           (expr2=exprelse)?)                       {   try {
                                                            $type = toolbox.compareTypes($dsb.type, dsb, $expr2.type, expr2);
                                                        } catch(Exception e) {
                                                            $type = "void";
                                                        }
                                                    }
  ;

exprelse returns [ String type = ""; ]
  :   ^(ELSE                                        { toolbox.tbOpenScope(); }
          dsb=decl_stat_blocks*)                    { $type = $dsb.type; toolbox.tbCloseScope(); }
  ;
    
type returns [String type = "";]
    :   INTEGER         { $type = "int";  }
    |   CHAR            { $type = "char"; }
    |   BOOLEAN         { $type = "bool"; }
    |   VOID            { $type = "void"; }
    ;  
    
operand returns [String type = "";]
  :   FALSE             { $type = "bool"; }
  |   TRUE              { $type = "bool"; }
  |   CHARACTER         { $type = "char"; }
  |   NUMBER            { $type = "int";  }
  |   ^(id=IDENTIFIER   { $type = toolbox.getType(id); } )
  ;
  
