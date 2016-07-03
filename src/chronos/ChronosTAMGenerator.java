// $ANTLR 3.5 C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g 2013-07-07 14:30:04

  package chronos;
  
  import chronos.utils.ChronosTAMGeneratorToolbox;
  import chronos.utils.exceptions.ChronosException;
  import chronos.utils.error.IChronosErrorReporter;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ChronosTAMGenerator extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "APOSTROF", "BECOMES", 
		"BOOLEAN", "CHAR", "CHARACTER", "COLON", "COMMA", "COMMENT", "CONST", 
		"DIGIT", "DIV", "DO", "ELSE", "ENDDO", "ENDIF", "EQ", "FALSE", "GE", "GT", 
		"IDENTIFIER", "IDESTBLOCK", "IF", "INTEGER", "LCURLY", "LE", "LETTER", 
		"LOWER", "LPAREN", "LT", "MINUS", "MINUSU", "MOD", "MULT", "NEQ", "NOT", 
		"NUMBER", "OR", "PLUS", "PLUSU", "PRINT", "PROGRAM", "RCURLY", "READ", 
		"RPAREN", "SEMICOLON", "SINGLECHAR", "SYMBOL", "THEN", "TRUE", "UPPER", 
		"VAR", "VOID", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int APOSTROF=5;
	public static final int BECOMES=6;
	public static final int BOOLEAN=7;
	public static final int CHAR=8;
	public static final int CHARACTER=9;
	public static final int COLON=10;
	public static final int COMMA=11;
	public static final int COMMENT=12;
	public static final int CONST=13;
	public static final int DIGIT=14;
	public static final int DIV=15;
	public static final int DO=16;
	public static final int ELSE=17;
	public static final int ENDDO=18;
	public static final int ENDIF=19;
	public static final int EQ=20;
	public static final int FALSE=21;
	public static final int GE=22;
	public static final int GT=23;
	public static final int IDENTIFIER=24;
	public static final int IDESTBLOCK=25;
	public static final int IF=26;
	public static final int INTEGER=27;
	public static final int LCURLY=28;
	public static final int LE=29;
	public static final int LETTER=30;
	public static final int LOWER=31;
	public static final int LPAREN=32;
	public static final int LT=33;
	public static final int MINUS=34;
	public static final int MINUSU=35;
	public static final int MOD=36;
	public static final int MULT=37;
	public static final int NEQ=38;
	public static final int NOT=39;
	public static final int NUMBER=40;
	public static final int OR=41;
	public static final int PLUS=42;
	public static final int PLUSU=43;
	public static final int PRINT=44;
	public static final int PROGRAM=45;
	public static final int RCURLY=46;
	public static final int READ=47;
	public static final int RPAREN=48;
	public static final int SEMICOLON=49;
	public static final int SINGLECHAR=50;
	public static final int SYMBOL=51;
	public static final int THEN=52;
	public static final int TRUE=53;
	public static final int UPPER=54;
	public static final int VAR=55;
	public static final int VOID=56;
	public static final int WHILE=57;
	public static final int WS=58;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ChronosTAMGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChronosTAMGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ChronosTAMGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g"; }



	    boolean ifCondition = false;

	    private ChronosTAMGeneratorToolbox toolbox = new ChronosTAMGeneratorToolbox();
	    
	    private IChronosErrorReporter errorReporter = null;
	    
	    public void setErrorReporter(IChronosErrorReporter errorReporter) {
	        this.errorReporter = errorReporter;
	    }




	// $ANTLR start "program"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:44:1: program : ^( PROGRAM (dsb1= decl_stat_blocks )+ ) ;
	public final void program() throws RecognitionException {
		String dsb1 =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:45:3: ( ^( PROGRAM (dsb1= decl_stat_blocks )+ ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:45:6: ^( PROGRAM (dsb1= decl_stat_blocks )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program69); 
			match(input, Token.DOWN, null); 
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:45:16: (dsb1= decl_stat_blocks )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND||LA1_0==BECOMES||LA1_0==CHARACTER||LA1_0==CONST||LA1_0==DIV||(LA1_0 >= EQ && LA1_0 <= IF)||LA1_0==LE||(LA1_0 >= LT && LA1_0 <= PRINT)||LA1_0==READ||LA1_0==TRUE||LA1_0==VAR||LA1_0==WHILE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:45:17: dsb1= decl_stat_blocks
					{
					pushFollow(FOLLOW_decl_stat_blocks_in_program74);
					dsb1=decl_stat_blocks();
					state._fsp--;

					 if (dsb1 != null && !dsb1.equals("")){
					                                                          toolbox.printClean("dsb cleanup start",1);
					                                                    }
					                                                  
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 

			 toolbox.printEnd(); 
			}

		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "decl_stat_blocks"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:51:1: decl_stat_blocks returns [ String value = \"\"; ] : (cd= constant_declaration |vd= variable_declaration |expr= expression );
	public final String decl_stat_blocks() throws RecognitionException {
		String value =  "";;


		String cd =null;
		String vd =null;
		String expr =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:52:3: (cd= constant_declaration |vd= variable_declaration |expr= expression )
			int alt2=3;
			switch ( input.LA(1) ) {
			case CONST:
				{
				alt2=1;
				}
				break;
			case VAR:
				{
				alt2=2;
				}
				break;
			case AND:
			case BECOMES:
			case CHARACTER:
			case DIV:
			case EQ:
			case FALSE:
			case GE:
			case GT:
			case IDENTIFIER:
			case IDESTBLOCK:
			case IF:
			case LE:
			case LT:
			case MINUS:
			case MINUSU:
			case MOD:
			case MULT:
			case NEQ:
			case NOT:
			case NUMBER:
			case OR:
			case PLUS:
			case PLUSU:
			case PRINT:
			case READ:
			case TRUE:
			case WHILE:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:52:7: cd= constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_decl_stat_blocks116);
					cd=constant_declaration();
					state._fsp--;

					 value = cd;   
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:53:7: vd= variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_decl_stat_blocks150);
					vd=variable_declaration();
					state._fsp--;

					 value = vd;   
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:54:7: expr= expression
					{
					pushFollow(FOLLOW_expression_in_decl_stat_blocks184);
					expr=expression();
					state._fsp--;

					 value = expr; 
					}
					break;

			}
		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "decl_stat_blocks"



	// $ANTLR start "constant_declaration"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:57:1: constant_declaration returns [ String value = \"\";] : ^( CONST id= IDENTIFIER ex= expression ) ;
	public final String constant_declaration() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;
		String ex =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:58:3: ( ^( CONST id= IDENTIFIER ex= expression ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:58:7: ^( CONST id= IDENTIFIER ex= expression )
			{
			match(input,CONST,FOLLOW_CONST_in_constant_declaration241); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration245); 
			 toolbox.pushConst(id); 
			pushFollow(FOLLOW_expression_in_constant_declaration288);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			 toolbox.putConst(id, ex); 
			}

		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "constant_declaration"



	// $ANTLR start "variable_declaration"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:62:1: variable_declaration returns [ String value = \"\";] : ^( VAR id= IDENTIFIER t= type ) ;
	public final String variable_declaration() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;
		String t =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:63:3: ( ^( VAR id= IDENTIFIER t= type ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:63:7: ^( VAR id= IDENTIFIER t= type )
			{
			match(input,VAR,FOLLOW_VAR_in_variable_declaration338); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration342); 
			pushFollow(FOLLOW_type_in_variable_declaration346);
			t=type();
			state._fsp--;

			match(input, Token.UP, null); 

			 toolbox.putVar(id, t);   
			}

		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "variable_declaration"



	// $ANTLR start "expression"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:67:1: expression returns [ String value = \"\"; ] : ( ^( NOT expr= expression ) | ^( PLUSU expr= expression ) | ^( MINUSU expr= expression ) | ^( PLUS expr1= expression expr2= expression ) | ^( MINUS expr1= expression expr2= expression ) | ^( BECOMES id= IDENTIFIER expr= expression ) | ^( OR expr1= expression expr2= expression ) | ^( AND expr1= expression expr2= expression ) | ^( LT expr1= expression expr2= expression ) | ^( LE expr1= expression expr2= expression ) | ^( GT expr1= expression expr2= expression ) | ^( GE expr1= expression expr2= expression ) | ^( EQ expr1= expression expr2= expression ) | ^( NEQ expr1= expression expr2= expression ) | ^( MULT expr1= expression expr2= expression ) | ^( DIV expr1= expression expr2= expression ) | ^( MOD expr1= expression expr2= expression ) | ^( IDESTBLOCK dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) | ^( PRINT ep= exprprint (ep= exprprint ( exprprint )* )? ) | ^( READ er= exprread ( exprread ( exprread )* )? ) |o= operand | ^( IF dsb= decl_stat_blocks (dsb= decl_stat_blocks )* et= exprthen ) | ^( WHILE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* exprdo ) );
	public final String expression() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;
		String expr =null;
		String expr1 =null;
		String expr2 =null;
		String dsb =null;
		String ep =null;
		String er =null;
		String o =null;
		String et =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:68:3: ( ^( NOT expr= expression ) | ^( PLUSU expr= expression ) | ^( MINUSU expr= expression ) | ^( PLUS expr1= expression expr2= expression ) | ^( MINUS expr1= expression expr2= expression ) | ^( BECOMES id= IDENTIFIER expr= expression ) | ^( OR expr1= expression expr2= expression ) | ^( AND expr1= expression expr2= expression ) | ^( LT expr1= expression expr2= expression ) | ^( LE expr1= expression expr2= expression ) | ^( GT expr1= expression expr2= expression ) | ^( GE expr1= expression expr2= expression ) | ^( EQ expr1= expression expr2= expression ) | ^( NEQ expr1= expression expr2= expression ) | ^( MULT expr1= expression expr2= expression ) | ^( DIV expr1= expression expr2= expression ) | ^( MOD expr1= expression expr2= expression ) | ^( IDESTBLOCK dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) | ^( PRINT ep= exprprint (ep= exprprint ( exprprint )* )? ) | ^( READ er= exprread ( exprread ( exprread )* )? ) |o= operand | ^( IF dsb= decl_stat_blocks (dsb= decl_stat_blocks )* et= exprthen ) | ^( WHILE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* exprdo ) )
			int alt10=23;
			switch ( input.LA(1) ) {
			case NOT:
				{
				alt10=1;
				}
				break;
			case PLUSU:
				{
				alt10=2;
				}
				break;
			case MINUSU:
				{
				alt10=3;
				}
				break;
			case PLUS:
				{
				alt10=4;
				}
				break;
			case MINUS:
				{
				alt10=5;
				}
				break;
			case BECOMES:
				{
				alt10=6;
				}
				break;
			case OR:
				{
				alt10=7;
				}
				break;
			case AND:
				{
				alt10=8;
				}
				break;
			case LT:
				{
				alt10=9;
				}
				break;
			case LE:
				{
				alt10=10;
				}
				break;
			case GT:
				{
				alt10=11;
				}
				break;
			case GE:
				{
				alt10=12;
				}
				break;
			case EQ:
				{
				alt10=13;
				}
				break;
			case NEQ:
				{
				alt10=14;
				}
				break;
			case MULT:
				{
				alt10=15;
				}
				break;
			case DIV:
				{
				alt10=16;
				}
				break;
			case MOD:
				{
				alt10=17;
				}
				break;
			case IDESTBLOCK:
				{
				alt10=18;
				}
				break;
			case PRINT:
				{
				alt10=19;
				}
				break;
			case READ:
				{
				alt10=20;
				}
				break;
			case CHARACTER:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case TRUE:
				{
				alt10=21;
				}
				break;
			case IF:
				{
				alt10=22;
				}
				break;
			case WHILE:
				{
				alt10=23;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:68:7: ^( NOT expr= expression )
					{
					match(input,NOT,FOLLOW_NOT_in_expression388); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression392);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printNot();
					                                                      value = expr.equals("0") ? "1" : "0";
																												      
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:71:7: ^( PLUSU expr= expression )
					{
					match(input,PLUSU,FOLLOW_PLUSU_in_expression427); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression431);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = expr;  
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:72:7: ^( MINUSU expr= expression )
					{
					match(input,MINUSU,FOLLOW_MINUSU_in_expression464); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression468);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printUMinus(); 
					                                                      value =expr; 
					                                                    
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:75:7: ^( PLUS expr1= expression expr2= expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression500); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression504);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression508);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printAdd(); 
					                                                      int left = Integer.parseInt(expr1); 
					                                                      int right = Integer.parseInt(expr2); 
					                                                      value = Integer.toString( left + right ); 
					                                                    
					}
					break;
				case 5 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:80:7: ^( MINUS expr1= expression expr2= expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression524); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression528);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression532);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printSub(); 
					                                                      int left = Integer.parseInt(expr1); 
					                                                      int right = Integer.parseInt(expr2); 
					                                                      value = Integer.toString( left - right ); 
					                                                    
					}
					break;
				case 6 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:85:7: ^( BECOMES id= IDENTIFIER expr= expression )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expression547); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression551); 
					pushFollow(FOLLOW_expression_in_expression555);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.assignValue(id, expr ); 
					                                                      value = expr; 
					                                                    
					}
					break;
				case 7 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:88:7: ^( OR expr1= expression expr2= expression )
					{
					match(input,OR,FOLLOW_OR_in_expression572); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression576);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression580);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printOr(); 
					                                                      value = (!expr1.equals("0") && !expr1.equals("") || !expr2.equals("0") && !expr2.equals("")) ? "1" : "0";
					                                                    
					}
					break;
				case 8 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:91:7: ^( AND expr1= expression expr2= expression )
					{
					match(input,AND,FOLLOW_AND_in_expression598); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression602);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression606);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printAnd(); 
					                                                      value = (!expr1.equals("0") && !expr1.equals("") && !expr2.equals("0") && !expr2.equals("")) ? "1" : "0";
					                                                    
					}
					break;
				case 9 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:94:7: ^( LT expr1= expression expr2= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression623); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression627);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression631);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printLT();
					                                                      value = Integer.parseInt(expr1) < Integer.parseInt(expr2) ? "1" : "0";
					                                                    
					}
					break;
				case 10 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:97:7: ^( LE expr1= expression expr2= expression )
					{
					match(input,LE,FOLLOW_LE_in_expression649); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression653);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression657);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printLE();
					                                                      value = Integer.parseInt(expr1) <= Integer.parseInt(expr2) ? "1" : "0";
					                                                    
					}
					break;
				case 11 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:100:7: ^( GT expr1= expression expr2= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression675); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression679);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression683);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printGT();
					                                                      value = Integer.parseInt(expr1) > Integer.parseInt(expr2) ? "1" : "0";
					                                                    
					}
					break;
				case 12 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:103:7: ^( GE expr1= expression expr2= expression )
					{
					match(input,GE,FOLLOW_GE_in_expression701); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression705);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression709);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printGE();
					                                                      value = Integer.parseInt(expr1) >= Integer.parseInt(expr2) ? "1" : "0";
					                                                    
					}
					break;
				case 13 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:106:7: ^( EQ expr1= expression expr2= expression )
					{
					match(input,EQ,FOLLOW_EQ_in_expression727); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression732);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression736);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printEQ();
					                                                      value = expr1 == expr2 ? "1" : "0";
					                                                    
					}
					break;
				case 14 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:109:7: ^( NEQ expr1= expression expr2= expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_expression754); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression758);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression762);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printNEQ() ;
					                                                      value = expr1 != expr2 ? "1" : "0"; 
					                                                    
					}
					break;
				case 15 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:112:7: ^( MULT expr1= expression expr2= expression )
					{
					match(input,MULT,FOLLOW_MULT_in_expression779); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression783);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression787);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printMult();
					                                                      int left = Integer.parseInt(expr1);
					                                                      int right = Integer.parseInt(expr2);
					                                                      value = Integer.toString(left * right);
					                                                    
					}
					break;
				case 16 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:117:7: ^( DIV expr1= expression expr2= expression )
					{
					match(input,DIV,FOLLOW_DIV_in_expression803); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression807);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression811);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printDiv();
					                                                      int left = Integer.parseInt(expr1);
					                                                      int right = Integer.parseInt(expr2);
					                                                      value = Integer.toString(left / right); 
					}
					break;
				case 17 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:121:7: ^( MOD expr1= expression expr2= expression )
					{
					match(input,MOD,FOLLOW_MOD_in_expression829); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression833);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression837);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printMod();
					                                                      int left = Integer.parseInt(expr1);
					                                                      int right = Integer.parseInt(expr2);
					                                                      value = Integer.toString(left % right);
					                                                    
					}
					break;
				case 18 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:126:7: ^( IDESTBLOCK dsb= decl_stat_blocks (dsb= decl_stat_blocks )* )
					{
					match(input,IDESTBLOCK,FOLLOW_IDESTBLOCK_in_expression854); 
					 toolbox.tbOpenScope(); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_decl_stat_blocks_in_expression905);
					dsb=decl_stat_blocks();
					state._fsp--;

					 value = dsb; 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:128:53: (dsb= decl_stat_blocks )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==AND||LA3_0==BECOMES||LA3_0==CHARACTER||LA3_0==CONST||LA3_0==DIV||(LA3_0 >= EQ && LA3_0 <= IF)||LA3_0==LE||(LA3_0 >= LT && LA3_0 <= PRINT)||LA3_0==READ||LA3_0==TRUE||LA3_0==VAR||LA3_0==WHILE) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:128:54: dsb= decl_stat_blocks
							{

							                                                        if(!value.equals("")) {
							                                                            toolbox.printClean("indent dsb cleanup", 1);
							                                                        }
							                                                    
							pushFollow(FOLLOW_decl_stat_blocks_in_expression997);
							dsb=decl_stat_blocks();
							state._fsp--;

							 value = dsb; 
							}
							break;

						default :
							break loop3;
						}
					}

					match(input, Token.UP, null); 

					 
					                                                        if(value.equals("")){
					                                                            toolbox.tbCloseScope(0);
					                                                        } else {
					                                                            toolbox.tbCloseScope(1);
					                                                        }
					                                                    
					}
					break;
				case 19 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:140:7: ^( PRINT ep= exprprint (ep= exprprint ( exprprint )* )? )
					{
					match(input,PRINT,FOLLOW_PRINT_in_expression1082); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exprprint_in_expression1086);
					ep=exprprint();
					state._fsp--;

					 value = ep; 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:141:13: (ep= exprprint ( exprprint )* )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==AND||LA5_0==BECOMES||LA5_0==CHARACTER||LA5_0==DIV||(LA5_0 >= EQ && LA5_0 <= IF)||LA5_0==LE||(LA5_0 >= LT && LA5_0 <= PRINT)||LA5_0==READ||LA5_0==TRUE||LA5_0==WHILE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:141:14: ep= exprprint ( exprprint )*
							{
							pushFollow(FOLLOW_exprprint_in_expression1130);
							ep=exprprint();
							state._fsp--;

							 toolbox.printClean("print", 2); 
							                                                        value = "";
							                                                    
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:144:13: ( exprprint )*
							loop4:
							while (true) {
								int alt4=2;
								int LA4_0 = input.LA(1);
								if ( (LA4_0==AND||LA4_0==BECOMES||LA4_0==CHARACTER||LA4_0==DIV||(LA4_0 >= EQ && LA4_0 <= IF)||LA4_0==LE||(LA4_0 >= LT && LA4_0 <= PRINT)||LA4_0==READ||LA4_0==TRUE||LA4_0==WHILE) ) {
									alt4=1;
								}

								switch (alt4) {
								case 1 :
									// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:144:14: exprprint
									{
									pushFollow(FOLLOW_exprprint_in_expression1173);
									exprprint();
									state._fsp--;

									 toolbox.printClean("print", 1); 
									                                                    
									}
									break;

								default :
									break loop4;
								}
							}

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 20 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:146:7: ^( READ er= exprread ( exprread ( exprread )* )? )
					{
					match(input,READ,FOLLOW_READ_in_expression1219); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exprread_in_expression1223);
					er=exprread();
					state._fsp--;

					 value = er; 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:147:13: ( exprread ( exprread )* )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==IDENTIFIER) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:147:14: exprread ( exprread )*
							{
							pushFollow(FOLLOW_exprread_in_expression1267);
							exprread();
							state._fsp--;

							 toolbox.printClean("read", 2);
							                                                      value = "";  
							                                                    
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:150:13: ( exprread )*
							loop6:
							while (true) {
								int alt6=2;
								int LA6_0 = input.LA(1);
								if ( (LA6_0==IDENTIFIER) ) {
									alt6=1;
								}

								switch (alt6) {
								case 1 :
									// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:150:14: exprread
									{
									pushFollow(FOLLOW_exprread_in_expression1314);
									exprread();
									state._fsp--;

									 toolbox.printClean("read", 1); 
									                                                    
									}
									break;

								default :
									break loop6;
								}
							}

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 21 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:152:7: o= operand
					{
					pushFollow(FOLLOW_operand_in_expression1362);
					o=operand();
					state._fsp--;

					 value = o; 
					}
					break;
				case 22 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:153:7: ^( IF dsb= decl_stat_blocks (dsb= decl_stat_blocks )* et= exprthen )
					{
					match(input,IF,FOLLOW_IF_in_expression1409); 
					 toolbox.tbOpenScope();  
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_decl_stat_blocks_in_expression1468);
					dsb=decl_stat_blocks();
					state._fsp--;

					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:154:53: (dsb= decl_stat_blocks )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==AND||LA8_0==BECOMES||LA8_0==CHARACTER||LA8_0==CONST||LA8_0==DIV||(LA8_0 >= EQ && LA8_0 <= IF)||LA8_0==LE||(LA8_0 >= LT && LA8_0 <= PRINT)||LA8_0==READ||LA8_0==TRUE||LA8_0==VAR||LA8_0==WHILE) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:154:54: dsb= decl_stat_blocks
							{
							 if(!dsb.equals("")) {
							                                                            toolbox.printClean("if cleanup start", 1);
							                                                        }
							                                                    
							pushFollow(FOLLOW_decl_stat_blocks_in_expression1506);
							dsb=decl_stat_blocks();
							state._fsp--;

							}
							break;

						default :
							break loop8;
						}
					}

					 toolbox.printIf();
					                                                      ifCondition = dsb.equals("1"); 
					                                                    
					pushFollow(FOLLOW_exprthen_in_expression1543);
					et=exprthen();
					state._fsp--;

					 toolbox.printEndIf();
					                                                      value = et;
																									              if(et == null || et.equals("")){
																									                  toolbox.tbCloseScope(0);
																									              } else {
																									                  toolbox.tbCloseScope(1); 
																									              }
																									            
					match(input, Token.UP, null); 

					}
					break;
				case 23 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:169:6: ^( WHILE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* exprdo )
					{
					match(input,WHILE,FOLLOW_WHILE_in_expression1582); 
					 Object[] whileInfo = toolbox.printWhile(); 
					                                                      toolbox.tbOpenScope(); 
					                                                    
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_decl_stat_blocks_in_expression1639);
					dsb=decl_stat_blocks();
					state._fsp--;

					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:172:53: (dsb= decl_stat_blocks )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==AND||LA9_0==BECOMES||LA9_0==CHARACTER||LA9_0==CONST||LA9_0==DIV||(LA9_0 >= EQ && LA9_0 <= IF)||LA9_0==LE||(LA9_0 >= LT && LA9_0 <= PRINT)||LA9_0==READ||LA9_0==TRUE||LA9_0==VAR||LA9_0==WHILE) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:172:54: dsb= decl_stat_blocks
							{

							                                                      if(dsb.equals("")) {
							                                                          toolbox.printClean("while cleanup start", 1);
							                                                      }
							                                                    
							pushFollow(FOLLOW_decl_stat_blocks_in_expression1677);
							dsb=decl_stat_blocks();
							state._fsp--;

							}
							break;

						default :
							break loop9;
						}
					}

					 toolbox.printWhileDo(whileInfo); 
					pushFollow(FOLLOW_exprdo_in_expression1712);
					exprdo();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printWhileEnd(whileInfo);
					                                                      toolbox.tbCloseScope(0); 
					                                                    
					}
					break;

			}
		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expression"



	// $ANTLR start "exprprint"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:183:1: exprprint returns [ String value = \"\"; ] : expr= expression ;
	public final String exprprint() throws RecognitionException {
		String value =  "";;


		String expr =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:184:3: (expr= expression )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:184:7: expr= expression
			{
			pushFollow(FOLLOW_expression_in_exprprint1770);
			expr=expression();
			state._fsp--;

			 toolbox.printPrint(expr); value = expr; 
			}

		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exprprint"



	// $ANTLR start "exprread"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:187:1: exprread returns [ String value = \"\"; ] : id= IDENTIFIER ;
	public final String exprread() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:188:3: (id= IDENTIFIER )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:188:7: id= IDENTIFIER
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exprread1795); 
			 toolbox.printRead(id); value = toolbox.getValue(id); 
			}

		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exprread"



	// $ANTLR start "exprthen"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:191:1: exprthen returns [ String value = \"\"; ] : ^( THEN dsb= decl_stat_blocks (dsb= decl_stat_blocks )* (ee= exprelse )? ) ;
	public final String exprthen() throws RecognitionException {
		String value =  "";;


		String dsb =null;
		String ee =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:192:3: ( ^( THEN dsb= decl_stat_blocks (dsb= decl_stat_blocks )* (ee= exprelse )? ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:192:6: ^( THEN dsb= decl_stat_blocks (dsb= decl_stat_blocks )* (ee= exprelse )? )
			{
			match(input,THEN,FOLLOW_THEN_in_exprthen1819); 
			 toolbox.tbOpenScope(); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_decl_stat_blocks_in_exprthen1878);
			dsb=decl_stat_blocks();
			state._fsp--;

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:193:53: (dsb= decl_stat_blocks )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==AND||LA11_0==BECOMES||LA11_0==CHARACTER||LA11_0==CONST||LA11_0==DIV||(LA11_0 >= EQ && LA11_0 <= IF)||LA11_0==LE||(LA11_0 >= LT && LA11_0 <= PRINT)||LA11_0==READ||LA11_0==TRUE||LA11_0==VAR||LA11_0==WHILE) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:193:54: dsb= decl_stat_blocks
					{

					                                                      if(!dsb.equals("")) {
					                                                          toolbox.printClean("exprthen cleanup", 1);
					                                                      }
					                                                    
					pushFollow(FOLLOW_decl_stat_blocks_in_exprthen1916);
					dsb=decl_stat_blocks();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			 if(dsb.equals("")){
			                                                          toolbox.tbCloseScope(0);
			                                                      } else {
			                                                          toolbox.tbCloseScope(1); 
			                                                      }
			                                                      toolbox.printIfElse();
			                                                    
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:205:13: (ee= exprelse )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ELSE) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:205:14: ee= exprelse
					{
					pushFollow(FOLLOW_exprelse_in_exprthen1954);
					ee=exprelse();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			 if(ifCondition){
			                                                          value = dsb;
																							              }else{
																							                  value = ee;
																							              }
																							              
																							            
			}

		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exprthen"



	// $ANTLR start "exprelse"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:214:1: exprelse returns [ String value = \"\"; ] : ^( ELSE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) ;
	public final String exprelse() throws RecognitionException {
		String value =  "";;


		String dsb =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:215:3: ( ^( ELSE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:215:4: ^( ELSE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* )
			{
			match(input,ELSE,FOLLOW_ELSE_in_exprelse2002); 
			 toolbox.tbOpenScope(); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_decl_stat_blocks_in_exprelse2063);
			dsb=decl_stat_blocks();
			state._fsp--;

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:216:53: (dsb= decl_stat_blocks )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==AND||LA13_0==BECOMES||LA13_0==CHARACTER||LA13_0==CONST||LA13_0==DIV||(LA13_0 >= EQ && LA13_0 <= IF)||LA13_0==LE||(LA13_0 >= LT && LA13_0 <= PRINT)||LA13_0==READ||LA13_0==TRUE||LA13_0==VAR||LA13_0==WHILE) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:216:54: dsb= decl_stat_blocks
					{
					 if(!dsb.equals("")) {
					                                                          toolbox.printClean("exprelse cleanup", 1);
					                                                       }
					                                                    
					pushFollow(FOLLOW_decl_stat_blocks_in_exprelse2101);
					dsb=decl_stat_blocks();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			 value = dsb;
																							              if(dsb.equals("")){
																							                  toolbox.tbCloseScope(0);
																							              } else {
																							                  toolbox.tbCloseScope(1); 
																							              }
																							            
			match(input, Token.UP, null); 

			}

		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exprelse"



	// $ANTLR start "exprdo"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:229:1: exprdo returns [ String value = \"\"; ] : ^( DO (dsb= decl_stat_blocks )* ) ;
	public final String exprdo() throws RecognitionException {
		String value =  "";;


		String dsb =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:230:3: ( ^( DO (dsb= decl_stat_blocks )* ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:230:4: ^( DO (dsb= decl_stat_blocks )* )
			{
			match(input,DO,FOLLOW_DO_in_exprdo2143); 
			 toolbox.tbOpenScope(); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:231:13: (dsb= decl_stat_blocks )*
				loop14:
				while (true) {
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==AND||LA14_0==BECOMES||LA14_0==CHARACTER||LA14_0==CONST||LA14_0==DIV||(LA14_0 >= EQ && LA14_0 <= IF)||LA14_0==LE||(LA14_0 >= LT && LA14_0 <= PRINT)||LA14_0==READ||LA14_0==TRUE||LA14_0==VAR||LA14_0==WHILE) ) {
						alt14=1;
					}

					switch (alt14) {
					case 1 :
						// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:231:14: dsb= decl_stat_blocks
						{
						pushFollow(FOLLOW_decl_stat_blocks_in_exprdo2206);
						dsb=decl_stat_blocks();
						state._fsp--;

						 if(!dsb.equals("")) {
						                                                          toolbox.printClean("exprdo cleanup", 1);
						                                                      }
						                                                    
						}
						break;

					default :
						break loop14;
					}
				}

				match(input, Token.UP, null); 
			}

			 toolbox.tbCloseScope(0); 
			}

		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exprdo"



	// $ANTLR start "operand"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:237:1: operand returns [String value = \"\";] : ( TRUE | FALSE |n= NUMBER |c= CHARACTER |id= IDENTIFIER );
	public final String operand() throws RecognitionException {
		String value =  "";;


		CommonTree n=null;
		CommonTree c=null;
		CommonTree id=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:238:3: ( TRUE | FALSE |n= NUMBER |c= CHARACTER |id= IDENTIFIER )
			int alt15=5;
			switch ( input.LA(1) ) {
			case TRUE:
				{
				alt15=1;
				}
				break;
			case FALSE:
				{
				alt15=2;
				}
				break;
			case NUMBER:
				{
				alt15=3;
				}
				break;
			case CHARACTER:
				{
				alt15=4;
				}
				break;
			case IDENTIFIER:
				{
				alt15=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:238:7: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand2251); 
					 value = "1"; toolbox.printTrue();             
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:239:7: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand2272); 
					 value = "0"; toolbox.printFalse();            
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:240:7: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand2294); 
					 value = (n!=null?n.getText():null); toolbox.printNumber(value); 
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:241:7: c= CHARACTER
					{
					c=(CommonTree)match(input,CHARACTER,FOLLOW_CHARACTER_in_operand2313); 
					 value = (c!=null?c.getText():null); toolbox.printChar(value);   
					}
					break;
				case 5 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:242:7: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand2329); 
					 value = toolbox.getValue(id);                 
					}
					break;

			}
		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:245:1: type returns [String type = \"\";] : ( INTEGER | CHAR | BOOLEAN | VOID );
	public final String type() throws RecognitionException {
		String type =  "";;


		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:246:3: ( INTEGER | CHAR | BOOLEAN | VOID )
			int alt16=4;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt16=1;
				}
				break;
			case CHAR:
				{
				alt16=2;
				}
				break;
			case BOOLEAN:
				{
				alt16=3;
				}
				break;
			case VOID:
				{
				alt16=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:246:7: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type2354); 
					 type = "int";  
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:247:7: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type2372); 
					 type = "char"; 
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:248:7: BOOLEAN
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type2393); 
					 type = "bool"; 
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosTAMGenerator.g:249:7: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_type2411); 
					 type = "void"; 
					}
					break;

			}
		}
		 

		    catch (ChronosException e){
		        if (errorReporter != null){
		            errorReporter.addError(e.getMessage(),"");
		        } else {
		            throw e;
		        }
		    }


		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program69 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_program74 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_constant_declaration_in_decl_stat_blocks116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_decl_stat_blocks150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_decl_stat_blocks184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration245 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_constant_declaration288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_variable_declaration338 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration342 = new BitSet(new long[]{0x0100000008000180L});
	public static final BitSet FOLLOW_type_in_variable_declaration346 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expression388 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression392 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUSU_in_expression427 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression431 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUSU_in_expression464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression468 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression504 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression508 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression524 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression528 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression532 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expression547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression551 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression555 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expression572 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression576 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression580 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expression598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression602 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression606 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression623 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression627 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression631 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expression649 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression653 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression657 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression675 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression679 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression683 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expression701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression705 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression709 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expression727 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression732 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression736 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expression754 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression758 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression762 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_expression779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression783 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression787 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression803 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression807 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression811 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expression829 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression833 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDESTBLOCK_in_expression854 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression905 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression997 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_PRINT_in_expression1082 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprprint_in_expression1086 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_exprprint_in_expression1130 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_exprprint_in_expression1173 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_READ_in_expression1219 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprread_in_expression1223 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_exprread_in_expression1267 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_exprread_in_expression1314 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_operand_in_expression1362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expression1409 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1468 = new BitSet(new long[]{0x02B09FFE27F0A250L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1506 = new BitSet(new long[]{0x02B09FFE27F0A250L});
	public static final BitSet FOLLOW_exprthen_in_expression1543 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_expression1582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1639 = new BitSet(new long[]{0x02A09FFE27F1A250L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1677 = new BitSet(new long[]{0x02A09FFE27F1A250L});
	public static final BitSet FOLLOW_exprdo_in_expression1712 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_exprprint1770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_exprread1795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THEN_in_exprthen1819 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprthen1878 = new BitSet(new long[]{0x02A09FFE27F2A258L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprthen1916 = new BitSet(new long[]{0x02A09FFE27F2A258L});
	public static final BitSet FOLLOW_exprelse_in_exprthen1954 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_exprelse2002 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprelse2063 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprelse2101 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_DO_in_exprdo2143 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprdo2206 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_TRUE_in_operand2251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand2272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand2294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_operand2313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand2329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type2354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type2372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type2393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type2411 = new BitSet(new long[]{0x0000000000000002L});
}
