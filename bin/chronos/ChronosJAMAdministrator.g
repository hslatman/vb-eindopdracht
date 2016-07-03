tree grammar ChronosJAMAdministrator;

options {
  language = Java;
  tokenVocab = Chronos;
  ASTLabelType = CommonTree;
}

@header {
    package chronos;
}

@members {

    int varCount = 0;
    int constCount = 0;
    
    int stackSize = 0;
    int maxStackSize = 0;
    
    boolean readFound = false;
    
    public boolean containsRead(){
        return readFound;
    }
    
    public int getVarCount(){
        return varCount;
    }
    
    public int getConstCount(){
        return constCount;
    }
    
    public int getMaxStackSize(){
        return maxStackSize;
    }
    
}

program
    : ^(PROGRAM  (dsb1=decl_stat_blocks)+)          { if (stackSize > maxStackSize){
                                                          maxStackSize = stackSize;
                                                      } 
                                                    }
  ;
  
decl_stat_blocks returns [ String value = ""; ]
  :   ^(CONST id=IDENTIFIER ex=expression)        { constCount++; }
  |   ^(VAR id=IDENTIFIER t=type)                 { varCount++;   }
  |   expr=expression                             { $value = $expr.value; }
  ;

expression returns [ String value = ""; ]
  :   ^(PLUSU expr=expression)                      { $value = $expr.value; }
  |   ^(MINUSU expr=expression)                     { $value=$expr.value;   }
  |   ^(NOT expr=expression)                        { $value = $expr.value.equals("0") ? "1" : "0"; }
  |   ^(OR expr1=expression expr2=expression)       { $value = (!$expr1.value.equals("0") && !$expr1.value.equals("") || !$expr2.value.equals("0") && !$expr2.value.equals("")) ? "1" : "0"; }
  |   ^(AND expr1=expression expr2=expression)      { $value = (!$expr1.value.equals("0") && !$expr1.value.equals("") && !$expr2.value.equals("0") && !$expr2.value.equals("")) ? "1" : "0"; }
  |   ^(PLUS expr1=expression expr2=expression)     { int left = Integer.parseInt($expr1.value); 
                                                      int right = Integer.parseInt($expr2.value); 
                                                      $value = Integer.toString( left + right ); 
                                                    }
  |   ^(MINUS expr1=expression expr2=expression)    { int left = Integer.parseInt($expr1.value); 
                                                      int right = Integer.parseInt($expr2.value); 
                                                      $value = Integer.toString( left - right ); 
                                                    }
  |   ^(MULT expr1=expression expr2=expression)     { int left = Integer.parseInt($expr1.value);
                                                      int right = Integer.parseInt($expr2.value);
                                                      $value = Integer.toString(left * right);
                                                    }
  |   ^(DIV expr1=expression expr2=expression)      { int left = Integer.parseInt($expr1.value);
                                                      int right = Integer.parseInt($expr2.value);
                                                      $value = Integer.toString(left / right); }
  |   ^(MOD expr1=expression expr2=expression)      { int left = Integer.parseInt($expr1.value);
                                                      int right = Integer.parseInt($expr2.value);
                                                      $value = Integer.toString(left \% right); //escaping needed
                                                    }                                                    
  |   ^(BECOMES id=IDENTIFIER expr=expression)      { stackSize++; $value = $expr.value; }
  |   ^(GT expr1=expression expr2=expression)       { $value = Integer.parseInt($expr1.value) > Integer.parseInt($expr2.value) ? "1" : "0";  }
  |   ^(GE expr1=expression expr2=expression)       { $value = Integer.parseInt($expr1.value) >= Integer.parseInt($expr2.value) ? "1" : "0"; }
  |   ^(LT expr1=expression expr2=expression)       { $value = Integer.parseInt($expr1.value) < Integer.parseInt($expr2.value) ? "1" : "0";  }
  |   ^(LE expr1=expression expr2=expression)       { $value = Integer.parseInt($expr1.value) <= Integer.parseInt($expr2.value) ? "1" : "0"; }
  |   ^(EQ  expr1=expression expr2=expression)      { $value = $expr1.value == $expr2.value ? "1" : "0"; } 
  |   ^(NEQ expr1=expression expr2=expression)      { $value = $expr1.value == $expr2.value ? "1" : "0"; }
  |   ^(IDESTBLOCK dsb=decl_stat_blocks             { $value = $dsb.value; }
            (dsb=decl_stat_blocks                   { $value = $dsb.value; })*)                                             
  |   ^(PRINT ep=exprprint                          { $value = $ep.value;  }
            (ep=exprprint                           { $value = ""; }
            (exprprint)*)?)
  |   ^(READ er=exprread                            { $value = $er.value; readFound = true; }
            (exprread                               { $value = "";         }
            (exprread)*)?)
  |   ^(IF dsb=decl_stat_blocks
            (dsb=decl_stat_blocks)*                  
            et=exprthen                             { $value = $et.value; })
  |   ^(WHILE dsb=decl_stat_blocks 
            (dsb=decl_stat_blocks)*
            exprdo) 
  |   op=operand                                    { $value = $op.value; }            
  ;
  
exprprint returns [ String value = ""; ]
  :   expr=expression                               { $value = $expr.value; stackSize++;}
  ;
  
exprread returns [ String value = ""; ]
  :   id=IDENTIFIER                                 { $value = "1";  stackSize++; } 
  ;

exprdo returns [ String value = ""; ]
  :^(DO (dsb=decl_stat_blocks)*)
  ;
  
exprthen returns [ String value = ""; ]
  :  ^(THEN dsb=decl_stat_blocks
            (dsb=decl_stat_blocks)*
            (ee=exprelse)?)                     
  ;
  
exprelse returns [ String value = ""; ]
  :^(ELSE dsb=decl_stat_blocks
            (dsb=decl_stat_blocks)*                 { $value = $dsb.value; })
  ;
  
operand returns [String value = "1";]
  :   TRUE            { $value = "1"; stackSize++; }
  |   FALSE           { $value = "0"; stackSize++; }
  |   n=NUMBER        { $value = $n.text; stackSize++; }
  |   c=CHARACTER     { $value = $c.text; stackSize++; }
  |   id=IDENTIFIER   { stackSize++; }
  ;
  
type returns [String type = "1";]
  :   INTEGER         { $type = "int";  }
  |   CHAR            { $type = "char"; }
  |   BOOLEAN         { $type = "bool"; }
  |   VOID            { $type = "void"; }
  ;  