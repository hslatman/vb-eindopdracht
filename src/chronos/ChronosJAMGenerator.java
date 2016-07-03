// $ANTLR 3.5 C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g 2013-07-07 14:30:06

  package chronos;
  
  import chronos.utils.ChronosJAMGeneratorToolbox;
  import chronos.utils.exceptions.ChronosException;
  import chronos.utils.error.IChronosErrorReporter;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ChronosJAMGenerator extends TreeParser {
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


	public ChronosJAMGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChronosJAMGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ChronosJAMGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g"; }



	    private int numberOfVars = 0;
	    private int numberOfConsts = 0;
	    private int stackSize = 0;
	    private boolean readFound = false;
	    private String className = "";
	    
	    public void setReadFound(boolean b){
	        readFound = b;
	    }
	    
	    public void setNumberOfVars(int n){
	        numberOfVars = n;
	    }

	    public void setNumberOfConsts(int n){
	        numberOfConsts = n;
	    }
	    
	    public void setStackSize(int n){
	        stackSize = n;
	    }
	    
	    public void setClassName(String cName){
	        className = cName;
	    }

	    boolean ifCondition = false;
	    int ifLabel = 0;

	    private ChronosJAMGeneratorToolbox toolbox = new ChronosJAMGeneratorToolbox();
	    
	    private IChronosErrorReporter errorReporter = null;
	    
	    public void setErrorReporter(IChronosErrorReporter errorReporter) {
	        this.errorReporter = errorReporter;
	    }
	    
	    public void printJAMHeader(String s){
	        toolbox.printJAMHeader(s);
	    }



	// $ANTLR start "program"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:73:1: program : ^( PROGRAM (dsb1= decl_stat_blocks )+ ) ;
	public final void program() throws RecognitionException {
		String dsb1 =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:74:5: ( ^( PROGRAM (dsb1= decl_stat_blocks )+ ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:74:7: ^( PROGRAM (dsb1= decl_stat_blocks )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program67); 
			 toolbox.printProgramStart(numberOfVars, numberOfConsts, stackSize, readFound, className); 
			match(input, Token.DOWN, null); 
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:75:15: (dsb1= decl_stat_blocks )+
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:75:16: dsb1= decl_stat_blocks
					{
					pushFollow(FOLLOW_decl_stat_blocks_in_program127);
					dsb1=decl_stat_blocks();
					state._fsp--;

					  if (!dsb1.equals("")){
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

			 toolbox.printProgramEnd(); 
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
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:82:1: decl_stat_blocks returns [ String value = \"\"; ] : (cd= constant_declaration |vd= variable_declaration |expr= expression );
	public final String decl_stat_blocks() throws RecognitionException {
		String value =  "";;


		String cd =null;
		String vd =null;
		String expr =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:83:3: (cd= constant_declaration |vd= variable_declaration |expr= expression )
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:83:7: cd= constant_declaration
					{
					pushFollow(FOLLOW_constant_declaration_in_decl_stat_blocks229);
					cd=constant_declaration();
					state._fsp--;

					 value = cd;   
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:84:7: vd= variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_decl_stat_blocks265);
					vd=variable_declaration();
					state._fsp--;

					 value = vd;   
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:85:7: expr= expression
					{
					pushFollow(FOLLOW_expression_in_decl_stat_blocks301);
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
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:88:1: constant_declaration returns [ String value = \"\";] : ^( CONST id= IDENTIFIER ex= expression ) ;
	public final String constant_declaration() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;
		String ex =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:89:5: ( ^( CONST id= IDENTIFIER ex= expression ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:89:9: ^( CONST id= IDENTIFIER ex= expression )
			{
			match(input,CONST,FOLLOW_CONST_in_constant_declaration358); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration412); 
			 toolbox.pushConst(id); 
			pushFollow(FOLLOW_expression_in_constant_declaration458);
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
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:94:1: variable_declaration returns [ String value = \"\";] : ^( VAR id= IDENTIFIER t= type ) ;
	public final String variable_declaration() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;
		String t =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:95:5: ( ^( VAR id= IDENTIFIER t= type ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:95:9: ^( VAR id= IDENTIFIER t= type )
			{
			match(input,VAR,FOLLOW_VAR_in_variable_declaration512); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration516); 
			pushFollow(FOLLOW_type_in_variable_declaration520);
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
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:98:1: expression returns [ String value = \"\"; ] : ( ^( PLUSU expr= expression ) | ^( MINUSU expr= expression ) | ^( NOT expr= expression ) | ^( OR expr1= expression expr2= expression ) | ^( AND expr1= expression expr2= expression ) | ^( PLUS expre1= expression expre2= expression ) | ^( MINUS expre1= expression expre2= expression ) | ^( MULT expr1= expression expr2= expression ) | ^( DIV expr1= expression expr2= expression ) | ^( MOD expr1= expression expr2= expression ) | ^( BECOMES id= IDENTIFIER expr= expression ) | ^( GT expr1= expression expr2= expression ) | ^( GE expr1= expression expr2= expression ) | ^( LT expr1= expression expr2= expression ) | ^( LE expr1= expression expr2= expression ) | ^( EQ expr1= expression expr2= expression ) | ^( NEQ expr1= expression expr2= expression ) | ^( IDESTBLOCK dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) | ^( PRINT ep= exprprint (ep= exprprint ( exprprint )* )? ) | ^( READ erread= exprread ( exprread ( exprread )* )? ) | ^( IF dsb= decl_stat_blocks (dsb= decl_stat_blocks )* et= exprthen ) | ^( WHILE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* exprdo ) |oper= operand );
	public final String expression() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;
		String expr =null;
		String expr1 =null;
		String expr2 =null;
		String expre1 =null;
		String expre2 =null;
		String dsb =null;
		String ep =null;
		String erread =null;
		String et =null;
		String oper =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:99:3: ( ^( PLUSU expr= expression ) | ^( MINUSU expr= expression ) | ^( NOT expr= expression ) | ^( OR expr1= expression expr2= expression ) | ^( AND expr1= expression expr2= expression ) | ^( PLUS expre1= expression expre2= expression ) | ^( MINUS expre1= expression expre2= expression ) | ^( MULT expr1= expression expr2= expression ) | ^( DIV expr1= expression expr2= expression ) | ^( MOD expr1= expression expr2= expression ) | ^( BECOMES id= IDENTIFIER expr= expression ) | ^( GT expr1= expression expr2= expression ) | ^( GE expr1= expression expr2= expression ) | ^( LT expr1= expression expr2= expression ) | ^( LE expr1= expression expr2= expression ) | ^( EQ expr1= expression expr2= expression ) | ^( NEQ expr1= expression expr2= expression ) | ^( IDESTBLOCK dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) | ^( PRINT ep= exprprint (ep= exprprint ( exprprint )* )? ) | ^( READ erread= exprread ( exprread ( exprread )* )? ) | ^( IF dsb= decl_stat_blocks (dsb= decl_stat_blocks )* et= exprthen ) | ^( WHILE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* exprdo ) |oper= operand )
			int alt10=23;
			switch ( input.LA(1) ) {
			case PLUSU:
				{
				alt10=1;
				}
				break;
			case MINUSU:
				{
				alt10=2;
				}
				break;
			case NOT:
				{
				alt10=3;
				}
				break;
			case OR:
				{
				alt10=4;
				}
				break;
			case AND:
				{
				alt10=5;
				}
				break;
			case PLUS:
				{
				alt10=6;
				}
				break;
			case MINUS:
				{
				alt10=7;
				}
				break;
			case MULT:
				{
				alt10=8;
				}
				break;
			case DIV:
				{
				alt10=9;
				}
				break;
			case MOD:
				{
				alt10=10;
				}
				break;
			case BECOMES:
				{
				alt10=11;
				}
				break;
			case GT:
				{
				alt10=12;
				}
				break;
			case GE:
				{
				alt10=13;
				}
				break;
			case LT:
				{
				alt10=14;
				}
				break;
			case LE:
				{
				alt10=15;
				}
				break;
			case EQ:
				{
				alt10=16;
				}
				break;
			case NEQ:
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
			case IF:
				{
				alt10=21;
				}
				break;
			case WHILE:
				{
				alt10=22;
				}
				break;
			case CHARACTER:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case TRUE:
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:99:7: ^( PLUSU expr= expression )
					{
					match(input,PLUSU,FOLLOW_PLUSU_in_expression563); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression567);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = expr; /* basically, doing nothing */ 
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:100:7: ^( MINUSU expr= expression )
					{
					match(input,MINUSU,FOLLOW_MINUSU_in_expression602); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression606);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printUMinus(); 
					                                                        value =expr; 
					                                                      
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:103:7: ^( NOT expr= expression )
					{
					match(input,NOT,FOLLOW_NOT_in_expression640); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression644);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printNot();
					                                                        value = expr.equals("0") ? "1" : "0";
					                                                      
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:106:7: ^( OR expr1= expression expr2= expression )
					{
					match(input,OR,FOLLOW_OR_in_expression681); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression685);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression689);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printOr();
					                                                        value = (!expr1.equals("0") && !expr1.equals("") || !expr2.equals("0") && !expr2.equals("")) ? "1" : "0";
					                                                      
					}
					break;
				case 5 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:109:7: ^( AND expr1= expression expr2= expression )
					{
					match(input,AND,FOLLOW_AND_in_expression709); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression713);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression717);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printAnd();
					                                                        value = (!expr1.equals("0") && !expr1.equals("") && !expr2.equals("0") && !expr2.equals("")) ? "1" : "0";
					                                                      
					}
					break;
				case 6 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:112:7: ^( PLUS expre1= expression expre2= expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression790); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression794);
					expre1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression799);
					expre2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printAdd(); 
					                                                        int left = Integer.parseInt(expre1); 
					                                                        int right = Integer.parseInt(expre2); 
					                                                        value = Integer.toString( left + right ); 
					                                                      
					}
					break;
				case 7 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:117:7: ^( MINUS expre1= expression expre2= expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression814); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression818);
					expre1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression822);
					expre2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printMinus();
					                                                        int left = Integer.parseInt(expre1); 
					                                                        int right = Integer.parseInt(expre2); 
					                                                        value = Integer.toString( left - right ); 
					                                                      
					}
					break;
				case 8 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:122:7: ^( MULT expr1= expression expr2= expression )
					{
					match(input,MULT,FOLLOW_MULT_in_expression837); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression841);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression845);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printMult();
					                                                        int left = Integer.parseInt(expr1);
					                                                        int right = Integer.parseInt(expr2);
					                                                        value = Integer.toString(left * right);
					                                                      
					}
					break;
				case 9 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:127:7: ^( DIV expr1= expression expr2= expression )
					{
					match(input,DIV,FOLLOW_DIV_in_expression863); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression867);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression871);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					  toolbox.printDiv();
					                                                        int left = Integer.parseInt(expr1);
					                                                        int right = Integer.parseInt(expr2);
					                                                        value = Integer.toString(left / right); 
					                                                      
					}
					break;
				case 10 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:132:7: ^( MOD expr1= expression expr2= expression )
					{
					match(input,MOD,FOLLOW_MOD_in_expression891); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression895);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression899);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printMod();
					                                                        int left = Integer.parseInt(expr1);
					                                                        int right = Integer.parseInt(expr2);
					                                                        value = Integer.toString(left % right); //escaping needed
					                                                      
					}
					break;
				case 11 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:137:7: ^( BECOMES id= IDENTIFIER expr= expression )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expression972); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression976); 
					pushFollow(FOLLOW_expression_in_expression980);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.assignValue(id, expr ); 
					                                                        value = expr; 
					                                                      
					}
					break;
				case 12 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:140:7: ^( GT expr1= expression expr2= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression999); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1003);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1007);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printGT();
					                                                        value = Integer.parseInt(expr1) > Integer.parseInt(expr2) ? "1" : "0";
					                                                      
					}
					break;
				case 13 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:143:7: ^( GE expr1= expression expr2= expression )
					{
					match(input,GE,FOLLOW_GE_in_expression1027); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1031);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1035);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printGE();
					                                                        value = Integer.parseInt(expr1) >= Integer.parseInt(expr2) ? "1" : "0";
					                                                      
					}
					break;
				case 14 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:146:7: ^( LT expr1= expression expr2= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression1109); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1113);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1117);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printLT();
					                                                        value = Integer.parseInt(expr1) < Integer.parseInt(expr2) ? "1" : "0";
					                                                      
					}
					break;
				case 15 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:149:7: ^( LE expr1= expression expr2= expression )
					{
					match(input,LE,FOLLOW_LE_in_expression1137); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1141);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1145);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printLE();
					                                                        value = Integer.parseInt(expr1) <= Integer.parseInt(expr2) ? "1" : "0";
					                                                      
					}
					break;
				case 16 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:152:7: ^( EQ expr1= expression expr2= expression )
					{
					match(input,EQ,FOLLOW_EQ_in_expression1165); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1170);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1174);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printEQ();
					                                                        value = expr1 == expr2 ? "1" : "0";
					                                                      
					}
					break;
				case 17 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:155:7: ^( NEQ expr1= expression expr2= expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_expression1194); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1198);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1202);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printNEQ();
					                                                        value = expr1 != expr2 ? "1" : "0"; 
					                                                      
					}
					break;
				case 18 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:158:7: ^( IDESTBLOCK dsb= decl_stat_blocks (dsb= decl_stat_blocks )* )
					{
					match(input,IDESTBLOCK,FOLLOW_IDESTBLOCK_in_expression1221); 
					 toolbox.tbOpenScope();  
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_decl_stat_blocks_in_expression1274);
					dsb=decl_stat_blocks();
					state._fsp--;

					 value = dsb; 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:159:79: (dsb= decl_stat_blocks )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==AND||LA3_0==BECOMES||LA3_0==CHARACTER||LA3_0==CONST||LA3_0==DIV||(LA3_0 >= EQ && LA3_0 <= IF)||LA3_0==LE||(LA3_0 >= LT && LA3_0 <= PRINT)||LA3_0==READ||LA3_0==TRUE||LA3_0==VAR||LA3_0==WHILE) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:160:55: dsb= decl_stat_blocks
							{
							 if(!value.equals("")) {
							                                                            toolbox.printClean("indent dsb cleanup", 1);
							                                                        }
							                                                      
							pushFollow(FOLLOW_decl_stat_blocks_in_expression1370);
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:171:7: ^( PRINT ep= exprprint (ep= exprprint ( exprprint )* )? )
					{
					match(input,PRINT,FOLLOW_PRINT_in_expression1511); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exprprint_in_expression1515);
					ep=exprprint();
					state._fsp--;

					 value = ep; 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:172:13: (ep= exprprint ( exprprint )* )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==AND||LA5_0==BECOMES||LA5_0==CHARACTER||LA5_0==DIV||(LA5_0 >= EQ && LA5_0 <= IF)||LA5_0==LE||(LA5_0 >= LT && LA5_0 <= PRINT)||LA5_0==READ||LA5_0==TRUE||LA5_0==WHILE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:172:14: ep= exprprint ( exprprint )*
							{
							pushFollow(FOLLOW_exprprint_in_expression1561);
							ep=exprprint();
							state._fsp--;

							 toolbox.printClean("print", 2);
							                                                        value = "";
							                                                      
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:175:13: ( exprprint )*
							loop4:
							while (true) {
								int alt4=2;
								int LA4_0 = input.LA(1);
								if ( (LA4_0==AND||LA4_0==BECOMES||LA4_0==CHARACTER||LA4_0==DIV||(LA4_0 >= EQ && LA4_0 <= IF)||LA4_0==LE||(LA4_0 >= LT && LA4_0 <= PRINT)||LA4_0==READ||LA4_0==TRUE||LA4_0==WHILE) ) {
									alt4=1;
								}

								switch (alt4) {
								case 1 :
									// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:175:14: exprprint
									{
									pushFollow(FOLLOW_exprprint_in_expression1606);
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:177:7: ^( READ erread= exprread ( exprread ( exprread )* )? )
					{
					match(input,READ,FOLLOW_READ_in_expression1653); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exprread_in_expression1657);
					erread=exprread();
					state._fsp--;

					 value = erread; /*System.err.println("value: " + value);*/ 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:178:13: ( exprread ( exprread )* )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==IDENTIFIER) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:178:14: exprread ( exprread )*
							{
							pushFollow(FOLLOW_exprread_in_expression1699);
							exprread();
							state._fsp--;

							 toolbox.printClean("read", 2);
							                                                        value = "";  //value leeg zetten, want void
							                                                      
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:181:13: ( exprread )*
							loop6:
							while (true) {
								int alt6=2;
								int LA6_0 = input.LA(1);
								if ( (LA6_0==IDENTIFIER) ) {
									alt6=1;
								}

								switch (alt6) {
								case 1 :
									// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:181:14: exprread
									{
									pushFollow(FOLLOW_exprread_in_expression1748);
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:183:7: ^( IF dsb= decl_stat_blocks (dsb= decl_stat_blocks )* et= exprthen )
					{
					match(input,IF,FOLLOW_IF_in_expression1796); 
					 toolbox.tbOpenScope(); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_decl_stat_blocks_in_expression1857);
					dsb=decl_stat_blocks();
					state._fsp--;

					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:184:34: (dsb= decl_stat_blocks )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==AND||LA8_0==BECOMES||LA8_0==CHARACTER||LA8_0==CONST||LA8_0==DIV||(LA8_0 >= EQ && LA8_0 <= IF)||LA8_0==LE||(LA8_0 >= LT && LA8_0 <= PRINT)||LA8_0==READ||LA8_0==TRUE||LA8_0==VAR||LA8_0==WHILE) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:184:55: dsb= decl_stat_blocks
							{
							 if(!dsb.equals("")) {
							                                                            toolbox.printClean("if cleanup start", 1);
							                                                        }
							                                                      
							pushFollow(FOLLOW_decl_stat_blocks_in_expression1896);
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
					                                                      
					pushFollow(FOLLOW_exprthen_in_expression1935);
					et=exprthen();
					state._fsp--;

					 toolbox.printEndIf();
					                                                        value = et;
					                                                        if(et.equals("")){
					                                                            toolbox.tbCloseScope(0); //0
					                                                        } else {
					                                                            toolbox.tbCloseScope(1); //1
					                                                        }
					                                                      
					match(input, Token.UP, null); 

					}
					break;
				case 22 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:199:7: ^( WHILE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* exprdo )
					{
					match(input,WHILE,FOLLOW_WHILE_in_expression1977); 
					 Object[] whileInfo = toolbox.printWhile(); 
					                                                        toolbox.tbOpenScope();
					                                                      
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_decl_stat_blocks_in_expression2035);
					dsb=decl_stat_blocks();
					state._fsp--;

					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:202:34: (dsb= decl_stat_blocks )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==AND||LA9_0==BECOMES||LA9_0==CHARACTER||LA9_0==CONST||LA9_0==DIV||(LA9_0 >= EQ && LA9_0 <= IF)||LA9_0==LE||(LA9_0 >= LT && LA9_0 <= PRINT)||LA9_0==READ||LA9_0==TRUE||LA9_0==VAR||LA9_0==WHILE) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:202:55: dsb= decl_stat_blocks
							{
							 if(dsb.equals("")) {
							                                                            toolbox.printClean("while cleanup start", 1);
							                                                        }
							                                                      
							pushFollow(FOLLOW_decl_stat_blocks_in_expression2074);
							dsb=decl_stat_blocks();
							state._fsp--;

							}
							break;

						default :
							break loop9;
						}
					}

					 toolbox.printWhileDo(whileInfo);
					                                                      
					pushFollow(FOLLOW_exprdo_in_expression2111);
					exprdo();
					state._fsp--;

					match(input, Token.UP, null); 

					 toolbox.printWhileEnd(whileInfo);
					                                                        toolbox.tbCloseScope(0); //0
					                                                      
					}
					break;
				case 23 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:211:7: oper= operand
					{
					pushFollow(FOLLOW_operand_in_expression2158);
					oper=operand();
					state._fsp--;

					 value = oper; 
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
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:214:1: exprprint returns [ String value = \"\"; ] : expres= expression ;
	public final String exprprint() throws RecognitionException {
		String value =  "";;


		String expres =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:215:3: (expres= expression )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:215:7: expres= expression
			{
			pushFollow(FOLLOW_expression_in_exprprint2272);
			expres=expression();
			state._fsp--;

			 toolbox.printPrint(expres); 
			                                                        value = expres; 
			                                                      
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
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:220:1: exprread returns [ String value = \"\"; ] : id= IDENTIFIER ;
	public final String exprread() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:221:3: (id= IDENTIFIER )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:221:7: id= IDENTIFIER
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exprread2327); 
			 toolbox.printRead(id); 
			                                                        value = toolbox.getValue(id, false); 
			                                                      
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



	// $ANTLR start "exprdo"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:226:1: exprdo returns [ String value = \"\"; ] : ^( DO (dsb= decl_stat_blocks )* ) ;
	public final String exprdo() throws RecognitionException {
		String value =  "";;


		String dsb =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:227:3: ( ^( DO (dsb= decl_stat_blocks )* ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:227:4: ^( DO (dsb= decl_stat_blocks )* )
			{
			match(input,DO,FOLLOW_DO_in_exprdo2425); 
			 toolbox.tbOpenScope(); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:228:13: (dsb= decl_stat_blocks )*
				loop11:
				while (true) {
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==AND||LA11_0==BECOMES||LA11_0==CHARACTER||LA11_0==CONST||LA11_0==DIV||(LA11_0 >= EQ && LA11_0 <= IF)||LA11_0==LE||(LA11_0 >= LT && LA11_0 <= PRINT)||LA11_0==READ||LA11_0==TRUE||LA11_0==VAR||LA11_0==WHILE) ) {
						alt11=1;
					}

					switch (alt11) {
					case 1 :
						// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:228:14: dsb= decl_stat_blocks
						{
						pushFollow(FOLLOW_decl_stat_blocks_in_exprdo2490);
						dsb=decl_stat_blocks();
						state._fsp--;

						 if(!dsb.equals("")) {
						                                                            toolbox.printClean("exprdo cleanup", 1);
						                                                        }
						                                                      
						}
						break;

					default :
						break loop11;
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



	// $ANTLR start "exprthen"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:235:1: exprthen returns [ String value = \"\"; ] : ^( THEN dsb= decl_stat_blocks (dsb= decl_stat_blocks )* (ee= exprelse )? ) ;
	public final String exprthen() throws RecognitionException {
		String value =  "";;


		String dsb =null;
		String ee =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:236:3: ( ^( THEN dsb= decl_stat_blocks (dsb= decl_stat_blocks )* (ee= exprelse )? ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:236:6: ^( THEN dsb= decl_stat_blocks (dsb= decl_stat_blocks )* (ee= exprelse )? )
			{
			match(input,THEN,FOLLOW_THEN_in_exprthen2592); 
			 toolbox.tbOpenScope(); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_decl_stat_blocks_in_exprthen2653);
			dsb=decl_stat_blocks();
			state._fsp--;

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:237:33: (dsb= decl_stat_blocks )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==AND||LA12_0==BECOMES||LA12_0==CHARACTER||LA12_0==CONST||LA12_0==DIV||(LA12_0 >= EQ && LA12_0 <= IF)||LA12_0==LE||(LA12_0 >= LT && LA12_0 <= PRINT)||LA12_0==READ||LA12_0==TRUE||LA12_0==VAR||LA12_0==WHILE) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:237:55: dsb= decl_stat_blocks
					{
					 if(!dsb.equals("")) {
					                                                            toolbox.printClean("exprthen cleanup", 1);
					                                                        }
					                                                      
					pushFollow(FOLLOW_decl_stat_blocks_in_exprthen2692);
					dsb=decl_stat_blocks();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			 if(!dsb.equals("")){
			                                                            toolbox.tbCloseScope(0); //0
			                                                        } else {
			                                                            toolbox.tbCloseScope(1); //1
			                                                        }
			                                                        toolbox.printIfElse();
			                                                      
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:248:13: (ee= exprelse )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ELSE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:248:14: ee= exprelse
					{
					pushFollow(FOLLOW_exprelse_in_exprthen2732);
					ee=exprelse();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			 if(ifCondition){
			                                                            value = dsb;

			                                                        } else {
			                                                            value = ee;
			                                                        }
			                                                        
			                                                        if (ee == null){
			                                                            toolbox.printNoElse();
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
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:262:1: exprelse returns [ String value = \"\"; ] : ^( ELSE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) ;
	public final String exprelse() throws RecognitionException {
		String value =  "";;


		String dsb =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:263:3: ( ^( ELSE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:263:4: ^( ELSE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* )
			{
			match(input,ELSE,FOLLOW_ELSE_in_exprelse2782); 
			 toolbox.tbOpenScope(); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_decl_stat_blocks_in_exprelse2845);
			dsb=decl_stat_blocks();
			state._fsp--;

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:264:33: (dsb= decl_stat_blocks )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==AND||LA14_0==BECOMES||LA14_0==CHARACTER||LA14_0==CONST||LA14_0==DIV||(LA14_0 >= EQ && LA14_0 <= IF)||LA14_0==LE||(LA14_0 >= LT && LA14_0 <= PRINT)||LA14_0==READ||LA14_0==TRUE||LA14_0==VAR||LA14_0==WHILE) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:264:55: dsb= decl_stat_blocks
					{
					 if(!dsb.equals("")) {
					                                                            toolbox.printClean("exprelse cleanup", 1);
					                                                        }
					                                                      
					pushFollow(FOLLOW_decl_stat_blocks_in_exprelse2884);
					dsb=decl_stat_blocks();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			 value = dsb;
			                                                        if(dsb.equals("")){
			                                                            toolbox.tbCloseScope(0); //0
			                                                        } else {
			                                                            toolbox.tbCloseScope(1); //1
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



	// $ANTLR start "operand"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:277:1: operand returns [String value = \"\";] : ( TRUE | FALSE |n= NUMBER |c= CHARACTER |id= IDENTIFIER );
	public final String operand() throws RecognitionException {
		String value =  "";;


		CommonTree n=null;
		CommonTree c=null;
		CommonTree id=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:278:3: ( TRUE | FALSE |n= NUMBER |c= CHARACTER |id= IDENTIFIER )
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:278:7: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand2929); 
					 value = "1"; toolbox.printTrue();             
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:279:7: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand2950); 
					 value = "0"; toolbox.printFalse();            
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:280:7: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand2972); 
					 value = (n!=null?n.getText():null); toolbox.printNumber(value); 
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:281:7: c= CHARACTER
					{
					c=(CommonTree)match(input,CHARACTER,FOLLOW_CHARACTER_in_operand2991); 
					 value = (c!=null?c.getText():null); toolbox.printChar(value);   
					}
					break;
				case 5 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:282:7: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand3007); 
					 value = toolbox.getValue(id, true);           
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
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:285:1: type returns [String type = \"\";] : ( INTEGER | CHAR | BOOLEAN | VOID );
	public final String type() throws RecognitionException {
		String type =  "";;


		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:286:5: ( INTEGER | CHAR | BOOLEAN | VOID )
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:286:9: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type3034); 
					 type = "int";  
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:287:9: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type3054); 
					 type = "char"; 
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:288:9: BOOLEAN
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type3077); 
					 type = "bool"; 
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMGenerator.g:289:9: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_type3097); 
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



	public static final BitSet FOLLOW_PROGRAM_in_program67 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_program127 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_constant_declaration_in_decl_stat_blocks229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_decl_stat_blocks265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_decl_stat_blocks301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration358 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration412 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_constant_declaration458 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_variable_declaration512 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration516 = new BitSet(new long[]{0x0100000008000180L});
	public static final BitSet FOLLOW_type_in_variable_declaration520 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUSU_in_expression563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUSU_in_expression602 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression606 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expression640 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression644 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expression681 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression685 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expression709 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression713 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression717 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression790 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression794 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression799 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression814 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression818 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression822 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_expression837 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression841 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression845 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression863 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression867 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression871 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expression891 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression895 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression899 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expression972 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression976 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression980 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression999 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1003 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression1007 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expression1027 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1031 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression1035 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression1109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1113 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression1117 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expression1137 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1141 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression1145 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expression1165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1170 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression1174 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expression1194 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1198 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression1202 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDESTBLOCK_in_expression1221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1274 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1370 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_PRINT_in_expression1511 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprprint_in_expression1515 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_exprprint_in_expression1561 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_exprprint_in_expression1606 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_READ_in_expression1653 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprread_in_expression1657 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_exprread_in_expression1699 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_exprread_in_expression1748 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_IF_in_expression1796 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1857 = new BitSet(new long[]{0x02B09FFE27F0A250L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1896 = new BitSet(new long[]{0x02B09FFE27F0A250L});
	public static final BitSet FOLLOW_exprthen_in_expression1935 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_expression1977 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression2035 = new BitSet(new long[]{0x02A09FFE27F1A250L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression2074 = new BitSet(new long[]{0x02A09FFE27F1A250L});
	public static final BitSet FOLLOW_exprdo_in_expression2111 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expression2158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprprint2272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_exprread2327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_exprdo2425 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprdo2490 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_THEN_in_exprthen2592 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprthen2653 = new BitSet(new long[]{0x02A09FFE27F2A258L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprthen2692 = new BitSet(new long[]{0x02A09FFE27F2A258L});
	public static final BitSet FOLLOW_exprelse_in_exprthen2732 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_exprelse2782 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprelse2845 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprelse2884 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_TRUE_in_operand2929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand2950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand2972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_operand2991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand3007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type3034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type3054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type3077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type3097 = new BitSet(new long[]{0x0000000000000002L});
}
