tree grammar ChronosTAMGenerator;

options {
  language = Java;
  //output = AST;
  tokenVocab = Chronos;
  ASTLabelType = CommonTree;
}

@header {
  package chronos;
  
  import chronos.utils.ChronosTAMGeneratorToolbox;
  import chronos.utils.exceptions.ChronosException;
  import chronos.utils.error.IChronosErrorReporter;
}

@rulecatch { 

    catch (ChronosException e){
        if (errorReporter != null){
            errorReporter.addError(e.getMessage(),"");
        } else {
            throw e;
        }
    }

}

@members {

    boolean ifCondition = false;

    private ChronosTAMGeneratorToolbox toolbox = new ChronosTAMGeneratorToolbox();
    
    private IChronosErrorReporter errorReporter = null;
    
    public void setErrorReporter(IChronosErrorReporter errorReporter) {
        this.errorReporter = errorReporter;
    }

}

program
  :  ^(PROGRAM (dsb1=decl_stat_blocks             { if ($dsb1.value != null && !$dsb1.value.equals("")){
                                                          toolbox.printClean("dsb cleanup start",1);
                                                    }
                                                  })+) { toolbox.printEnd(); }
  ;
  
decl_stat_blocks returns [ String value = ""; ]
  :   cd=constant_declaration                       { $value = $cd.value;   }
  |   vd=variable_declaration                       { $value = $vd.value;   }
  |   expr=expression                               { $value = $expr.value; }
  ;
    
constant_declaration  returns [ String value = "";]
  :   ^(CONST id=IDENTIFIER                         { toolbox.pushConst(id); } 
            ex=expression)                          { toolbox.putConst(id, $ex.value); }
  ;
  
variable_declaration returns [ String value = "";]
  :   ^(VAR id=IDENTIFIER t=type)                   { toolbox.putVar(id, $t.type);   }
  ;


expression returns [ String value = ""; ]
  :   ^(NOT expr=expression)                        { toolbox.printNot();
                                                      $value = $expr.value.equals("0") ? "1" : "0";
																							      }
  |   ^(PLUSU expr=expression)                      { $value = $expr.value;  }
  |   ^(MINUSU expr=expression)                     { toolbox.printUMinus(); 
                                                      $value=$expr.value; 
                                                    }
  |   ^(PLUS expr1=expression expr2=expression)     { toolbox.printAdd(); 
                                                      int left = Integer.parseInt($expr1.value); 
                                                      int right = Integer.parseInt($expr2.value); 
                                                      $value = Integer.toString( left + right ); 
                                                    }
  |   ^(MINUS expr1=expression expr2=expression)    { toolbox.printSub(); 
                                                      int left = Integer.parseInt($expr1.value); 
                                                      int right = Integer.parseInt($expr2.value); 
                                                      $value = Integer.toString( left - right ); 
                                                    }
  |   ^(BECOMES id=IDENTIFIER expr=expression)      { toolbox.assignValue(id, $expr.value ); 
                                                      $value = $expr.value; 
                                                    }
  |   ^(OR expr1=expression expr2=expression)       { toolbox.printOr(); 
                                                      $value = (!$expr1.value.equals("0") && !$expr1.value.equals("") || !$expr2.value.equals("0") && !$expr2.value.equals("")) ? "1" : "0";
                                                    }
  |   ^(AND expr1=expression expr2=expression)      { toolbox.printAnd(); 
                                                      $value = (!$expr1.value.equals("0") && !$expr1.value.equals("") && !$expr2.value.equals("0") && !$expr2.value.equals("")) ? "1" : "0";
                                                    }
  |   ^(LT expr1=expression expr2=expression)       { toolbox.printLT();
                                                      $value = Integer.parseInt($expr1.value) < Integer.parseInt($expr2.value) ? "1" : "0";
                                                    }
  |   ^(LE expr1=expression expr2=expression)       { toolbox.printLE();
                                                      $value = Integer.parseInt($expr1.value) <= Integer.parseInt($expr2.value) ? "1" : "0";
                                                    }
  |   ^(GT expr1=expression expr2=expression)       { toolbox.printGT();
                                                      $value = Integer.parseInt($expr1.value) > Integer.parseInt($expr2.value) ? "1" : "0";
                                                    }
  |   ^(GE expr1=expression expr2=expression)       { toolbox.printGE();
                                                      $value = Integer.parseInt($expr1.value) >= Integer.parseInt($expr2.value) ? "1" : "0";
                                                    }
  |   ^(EQ  expr1=expression expr2=expression)      { toolbox.printEQ();
                                                      $value = $expr1.value == $expr2.value ? "1" : "0";
                                                    } 
  |   ^(NEQ expr1=expression expr2=expression)      { toolbox.printNEQ() ;
                                                      $value = $expr1.value != $expr2.value ? "1" : "0"; 
                                                    }
  |   ^(MULT expr1=expression expr2=expression)     { toolbox.printMult();
                                                      int left = Integer.parseInt($expr1.value);
                                                      int right = Integer.parseInt($expr2.value);
                                                      $value = Integer.toString(left * right);
                                                    }
  |   ^(DIV expr1=expression expr2=expression)      { toolbox.printDiv();
                                                      int left = Integer.parseInt($expr1.value);
                                                      int right = Integer.parseInt($expr2.value);
                                                      $value = Integer.toString(left / right); } 
  |   ^(MOD expr1=expression expr2=expression)      { toolbox.printMod();
                                                      int left = Integer.parseInt($expr1.value);
                                                      int right = Integer.parseInt($expr2.value);
                                                      $value = Integer.toString(left \% right);
                                                    }
  |   ^(IDESTBLOCK                                  { toolbox.tbOpenScope(); }
            dsb=decl_stat_blocks                    { $value = $dsb.value; }
                                                    ({
                                                        if(!$value.equals("")) {
                                                            toolbox.printClean("indent dsb cleanup", 1);
                                                        }
                                                    }
            dsb=decl_stat_blocks                    { $value = $dsb.value; })*) { 
                                                        if($value.equals("")){
                                                            toolbox.tbCloseScope(0);
                                                        } else {
                                                            toolbox.tbCloseScope(1);
                                                        }
                                                    }                                                  
  |   ^(PRINT ep=exprprint                          { $value = $ep.value; }
            (ep=exprprint                           { toolbox.printClean("print", 2); 
                                                        $value = "";
                                                    }
            (exprprint                              { toolbox.printClean("print", 1); 
                                                    } )*)?)
  |   ^(READ er=exprread                            { $value = $er.value; }
            (exprread                               { toolbox.printClean("read", 2);
                                                      $value = "";  
                                                    }
            (exprread                               { toolbox.printClean("read", 1); 
                                                    } )*)?)
  |   o=operand                                     { $value = $o.value; }
  |   ^(IF                                          { toolbox.tbOpenScope();  }
            dsb=decl_stat_blocks                    ({ if(!$dsb.value.equals("")) {
                                                            toolbox.printClean("if cleanup start", 1);
                                                        }
                                                    }
            dsb=decl_stat_blocks)*                  { toolbox.printIf();
                                                      ifCondition = $dsb.value.equals("1"); 
                                                    }
            et=exprthen                             { toolbox.printEndIf();
                                                      $value = $et.value;
																				              if($et.value == null || $et.value.equals("")){
																				                  toolbox.tbCloseScope(0);
																				              } else {
																				                  toolbox.tbCloseScope(1); 
																				              }
																				            })
  |  ^(WHILE                                        { Object[] whileInfo = toolbox.printWhile(); 
                                                      toolbox.tbOpenScope(); 
                                                    }
            dsb=decl_stat_blocks                    ({
                                                      if($dsb.value.equals("")) {
                                                          toolbox.printClean("while cleanup start", 1);
                                                      }
                                                    }
            dsb=decl_stat_blocks)*                  { toolbox.printWhileDo(whileInfo); }
            exprdo)                                 { toolbox.printWhileEnd(whileInfo);
                                                      toolbox.tbCloseScope(0); 
                                                    }
  ;
  
exprprint returns [ String value = ""; ]
  :   expr=expression { toolbox.printPrint($expr.value); $value = $expr.value; }
  ;
  
exprread returns [ String value = ""; ]
  :   id=IDENTIFIER { toolbox.printRead(id); $value= toolbox.getValue(id); } 
  ;
  
exprthen returns [ String value = ""; ]
  :  ^(THEN                                         { toolbox.tbOpenScope(); } 
            dsb=decl_stat_blocks                    ({
                                                      if(!$dsb.value.equals("")) {
                                                          toolbox.printClean("exprthen cleanup", 1);
                                                      }
                                                    }
            dsb=decl_stat_blocks)*                  { if($dsb.value.equals("")){
                                                          toolbox.tbCloseScope(0);
                                                      } else {
                                                          toolbox.tbCloseScope(1); 
                                                      }
                                                      toolbox.printIfElse();
                                                    }
            (ee=exprelse)?)                         { if(ifCondition){
                                                          $value = $dsb.value;
																				              }else{
																				                  $value = $ee.value;
																				              }
																				              
																				            }
  ;
  
exprelse returns [ String value = ""; ]
  :^(ELSE                                           { toolbox.tbOpenScope(); } 
            dsb=decl_stat_blocks                    ({ if(!$dsb.value.equals("")) {
                                                          toolbox.printClean("exprelse cleanup", 1);
                                                       }
                                                    }
            dsb=decl_stat_blocks)*                  { $value = $dsb.value;
																				              if($dsb.value.equals("")){
																				                  toolbox.tbCloseScope(0);
																				              } else {
																				                  toolbox.tbCloseScope(1); 
																				              }
																				            }) 
  ;
  
exprdo returns [ String value = ""; ]
  :^(DO                                             { toolbox.tbOpenScope(); }
            (dsb=decl_stat_blocks                   { if(!$dsb.value.equals("")) {
                                                          toolbox.printClean("exprdo cleanup", 1);
                                                      }
                                                    })*){ toolbox.tbCloseScope(0); }
  ;
  
operand returns [String value = "";]
  :   TRUE            { $value = "1"; toolbox.printTrue();             }
  |   FALSE           { $value = "0"; toolbox.printFalse();            }
  |   n=NUMBER        { $value = $n.text; toolbox.printNumber($value); }
  |   c=CHARACTER     { $value = $c.text; toolbox.printChar($value);   }
  |   id=IDENTIFIER   { $value = toolbox.getValue(id);                 }
  ;
  
type returns [String type = "";]
  :   INTEGER         { $type = "int";  }
  |   CHAR            { $type = "char"; }
  |   BOOLEAN         { $type = "bool"; }
  |   VOID            { $type = "void"; }
  ;  