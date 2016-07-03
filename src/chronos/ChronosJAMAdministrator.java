// $ANTLR 3.5 C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g 2013-07-07 14:30:07

    package chronos;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ChronosJAMAdministrator extends TreeParser {
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


	public ChronosJAMAdministrator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChronosJAMAdministrator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ChronosJAMAdministrator.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g"; }



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
	    



	// $ANTLR start "program"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:41:1: program : ^( PROGRAM (dsb1= decl_stat_blocks )+ ) ;
	public final void program() throws RecognitionException {
		String dsb1 =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:42:5: ( ^( PROGRAM (dsb1= decl_stat_blocks )+ ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:42:7: ^( PROGRAM (dsb1= decl_stat_blocks )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program61); 
			match(input, Token.DOWN, null); 
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:42:18: (dsb1= decl_stat_blocks )+
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:42:19: dsb1= decl_stat_blocks
					{
					pushFollow(FOLLOW_decl_stat_blocks_in_program67);
					dsb1=decl_stat_blocks();
					state._fsp--;

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

			 if (stackSize > maxStackSize){
			                                                          maxStackSize = stackSize;
			                                                      } 
			                                                    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "decl_stat_blocks"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:48:1: decl_stat_blocks returns [ String value = \"\"; ] : ( ^( CONST id= IDENTIFIER ex= expression ) | ^( VAR id= IDENTIFIER t= type ) |expr= expression );
	public final String decl_stat_blocks() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;
		String ex =null;
		String t =null;
		String expr =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:49:3: ( ^( CONST id= IDENTIFIER ex= expression ) | ^( VAR id= IDENTIFIER t= type ) |expr= expression )
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:49:7: ^( CONST id= IDENTIFIER ex= expression )
					{
					match(input,CONST,FOLLOW_CONST_in_decl_stat_blocks103); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_decl_stat_blocks107); 
					pushFollow(FOLLOW_expression_in_decl_stat_blocks111);
					ex=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 constCount++; 
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:50:7: ^( VAR id= IDENTIFIER t= type )
					{
					match(input,VAR,FOLLOW_VAR_in_decl_stat_blocks130); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_decl_stat_blocks134); 
					pushFollow(FOLLOW_type_in_decl_stat_blocks138);
					t=type();
					state._fsp--;

					match(input, Token.UP, null); 

					 varCount++;   
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:51:7: expr= expression
					{
					pushFollow(FOLLOW_expression_in_decl_stat_blocks167);
					expr=expression();
					state._fsp--;

					 value = expr; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "decl_stat_blocks"



	// $ANTLR start "expression"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:54:1: expression returns [ String value = \"\"; ] : ( ^( PLUSU expr= expression ) | ^( MINUSU expr= expression ) | ^( NOT expr= expression ) | ^( OR expr1= expression expr2= expression ) | ^( AND expr1= expression expr2= expression ) | ^( PLUS expr1= expression expr2= expression ) | ^( MINUS expr1= expression expr2= expression ) | ^( MULT expr1= expression expr2= expression ) | ^( DIV expr1= expression expr2= expression ) | ^( MOD expr1= expression expr2= expression ) | ^( BECOMES id= IDENTIFIER expr= expression ) | ^( GT expr1= expression expr2= expression ) | ^( GE expr1= expression expr2= expression ) | ^( LT expr1= expression expr2= expression ) | ^( LE expr1= expression expr2= expression ) | ^( EQ expr1= expression expr2= expression ) | ^( NEQ expr1= expression expr2= expression ) | ^( IDESTBLOCK dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) | ^( PRINT ep= exprprint (ep= exprprint ( exprprint )* )? ) | ^( READ er= exprread ( exprread ( exprread )* )? ) | ^( IF dsb= decl_stat_blocks (dsb= decl_stat_blocks )* et= exprthen ) | ^( WHILE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* exprdo ) |op= operand );
	public final String expression() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;
		String expr =null;
		String expr1 =null;
		String expr2 =null;
		String dsb =null;
		String ep =null;
		String er =null;
		String et =null;
		String op =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:55:3: ( ^( PLUSU expr= expression ) | ^( MINUSU expr= expression ) | ^( NOT expr= expression ) | ^( OR expr1= expression expr2= expression ) | ^( AND expr1= expression expr2= expression ) | ^( PLUS expr1= expression expr2= expression ) | ^( MINUS expr1= expression expr2= expression ) | ^( MULT expr1= expression expr2= expression ) | ^( DIV expr1= expression expr2= expression ) | ^( MOD expr1= expression expr2= expression ) | ^( BECOMES id= IDENTIFIER expr= expression ) | ^( GT expr1= expression expr2= expression ) | ^( GE expr1= expression expr2= expression ) | ^( LT expr1= expression expr2= expression ) | ^( LE expr1= expression expr2= expression ) | ^( EQ expr1= expression expr2= expression ) | ^( NEQ expr1= expression expr2= expression ) | ^( IDESTBLOCK dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) | ^( PRINT ep= exprprint (ep= exprprint ( exprprint )* )? ) | ^( READ er= exprread ( exprread ( exprread )* )? ) | ^( IF dsb= decl_stat_blocks (dsb= decl_stat_blocks )* et= exprthen ) | ^( WHILE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* exprdo ) |op= operand )
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:55:7: ^( PLUSU expr= expression )
					{
					match(input,PLUSU,FOLLOW_PLUSU_in_expression217); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression221);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = expr; 
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:56:7: ^( MINUSU expr= expression )
					{
					match(input,MINUSU,FOLLOW_MINUSU_in_expression254); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression258);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value =expr;   
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:57:7: ^( NOT expr= expression )
					{
					match(input,NOT,FOLLOW_NOT_in_expression290); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression294);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = expr.equals("0") ? "1" : "0"; 
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:58:7: ^( OR expr1= expression expr2= expression )
					{
					match(input,OR,FOLLOW_OR_in_expression329); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression333);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression337);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = (!expr1.equals("0") && !expr1.equals("") || !expr2.equals("0") && !expr2.equals("")) ? "1" : "0"; 
					}
					break;
				case 5 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:59:7: ^( AND expr1= expression expr2= expression )
					{
					match(input,AND,FOLLOW_AND_in_expression355); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression359);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression363);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = (!expr1.equals("0") && !expr1.equals("") && !expr2.equals("0") && !expr2.equals("")) ? "1" : "0"; 
					}
					break;
				case 6 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:60:7: ^( PLUS expr1= expression expr2= expression )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expression380); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression384);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression388);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 int left = Integer.parseInt(expr1); 
					                                                      int right = Integer.parseInt(expr2); 
					                                                      value = Integer.toString( left + right ); 
					                                                    
					}
					break;
				case 7 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:64:7: ^( MINUS expr1= expression expr2= expression )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expression404); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression408);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression412);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 int left = Integer.parseInt(expr1); 
					                                                      int right = Integer.parseInt(expr2); 
					                                                      value = Integer.toString( left - right ); 
					                                                    
					}
					break;
				case 8 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:68:7: ^( MULT expr1= expression expr2= expression )
					{
					match(input,MULT,FOLLOW_MULT_in_expression427); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression431);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression435);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 int left = Integer.parseInt(expr1);
					                                                      int right = Integer.parseInt(expr2);
					                                                      value = Integer.toString(left * right);
					                                                    
					}
					break;
				case 9 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:72:7: ^( DIV expr1= expression expr2= expression )
					{
					match(input,DIV,FOLLOW_DIV_in_expression451); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression455);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression459);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 int left = Integer.parseInt(expr1);
					                                                      int right = Integer.parseInt(expr2);
					                                                      value = Integer.toString(left / right); 
					}
					break;
				case 10 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:75:7: ^( MOD expr1= expression expr2= expression )
					{
					match(input,MOD,FOLLOW_MOD_in_expression476); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression480);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression484);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 int left = Integer.parseInt(expr1);
					                                                      int right = Integer.parseInt(expr2);
					                                                      value = Integer.toString(left % right); //escaping needed
					                                                    
					}
					break;
				case 11 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:79:7: ^( BECOMES id= IDENTIFIER expr= expression )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_expression553); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression557); 
					pushFollow(FOLLOW_expression_in_expression561);
					expr=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 stackSize++; value = expr; 
					}
					break;
				case 12 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:80:7: ^( GT expr1= expression expr2= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression578); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression582);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression586);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = Integer.parseInt(expr1) > Integer.parseInt(expr2) ? "1" : "0";  
					}
					break;
				case 13 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:81:7: ^( GE expr1= expression expr2= expression )
					{
					match(input,GE,FOLLOW_GE_in_expression604); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression608);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression612);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = Integer.parseInt(expr1) >= Integer.parseInt(expr2) ? "1" : "0"; 
					}
					break;
				case 14 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:82:7: ^( LT expr1= expression expr2= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression630); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression634);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression638);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = Integer.parseInt(expr1) < Integer.parseInt(expr2) ? "1" : "0";  
					}
					break;
				case 15 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:83:7: ^( LE expr1= expression expr2= expression )
					{
					match(input,LE,FOLLOW_LE_in_expression656); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression660);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression664);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = Integer.parseInt(expr1) <= Integer.parseInt(expr2) ? "1" : "0"; 
					}
					break;
				case 16 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:84:7: ^( EQ expr1= expression expr2= expression )
					{
					match(input,EQ,FOLLOW_EQ_in_expression682); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression687);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression691);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = expr1 == expr2 ? "1" : "0"; 
					}
					break;
				case 17 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:85:7: ^( NEQ expr1= expression expr2= expression )
					{
					match(input,NEQ,FOLLOW_NEQ_in_expression709); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression713);
					expr1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression717);
					expr2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = expr1 == expr2 ? "1" : "0"; 
					}
					break;
				case 18 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:86:7: ^( IDESTBLOCK dsb= decl_stat_blocks (dsb= decl_stat_blocks )* )
					{
					match(input,IDESTBLOCK,FOLLOW_IDESTBLOCK_in_expression734); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_decl_stat_blocks_in_expression738);
					dsb=decl_stat_blocks();
					state._fsp--;

					 value = dsb; 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:87:13: (dsb= decl_stat_blocks )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==AND||LA3_0==BECOMES||LA3_0==CHARACTER||LA3_0==CONST||LA3_0==DIV||(LA3_0 >= EQ && LA3_0 <= IF)||LA3_0==LE||(LA3_0 >= LT && LA3_0 <= PRINT)||LA3_0==READ||LA3_0==TRUE||LA3_0==VAR||LA3_0==WHILE) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:87:14: dsb= decl_stat_blocks
							{
							pushFollow(FOLLOW_decl_stat_blocks_in_expression769);
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

					}
					break;
				case 19 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:88:7: ^( PRINT ep= exprprint (ep= exprprint ( exprprint )* )? )
					{
					match(input,PRINT,FOLLOW_PRINT_in_expression846); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exprprint_in_expression850);
					ep=exprprint();
					state._fsp--;

					 value = ep;  
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:89:13: (ep= exprprint ( exprprint )* )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==AND||LA5_0==BECOMES||LA5_0==CHARACTER||LA5_0==DIV||(LA5_0 >= EQ && LA5_0 <= IF)||LA5_0==LE||(LA5_0 >= LT && LA5_0 <= PRINT)||LA5_0==READ||LA5_0==TRUE||LA5_0==WHILE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:89:14: ep= exprprint ( exprprint )*
							{
							pushFollow(FOLLOW_exprprint_in_expression894);
							ep=exprprint();
							state._fsp--;

							 value = ""; 
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:90:13: ( exprprint )*
							loop4:
							while (true) {
								int alt4=2;
								int LA4_0 = input.LA(1);
								if ( (LA4_0==AND||LA4_0==BECOMES||LA4_0==CHARACTER||LA4_0==DIV||(LA4_0 >= EQ && LA4_0 <= IF)||LA4_0==LE||(LA4_0 >= LT && LA4_0 <= PRINT)||LA4_0==READ||LA4_0==TRUE||LA4_0==WHILE) ) {
									alt4=1;
								}

								switch (alt4) {
								case 1 :
									// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:90:14: exprprint
									{
									pushFollow(FOLLOW_exprprint_in_expression937);
									exprprint();
									state._fsp--;

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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:91:7: ^( READ er= exprread ( exprread ( exprread )* )? )
					{
					match(input,READ,FOLLOW_READ_in_expression951); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exprread_in_expression955);
					er=exprread();
					state._fsp--;

					 value = er; readFound = true; 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:92:13: ( exprread ( exprread )* )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==IDENTIFIER) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:92:14: exprread ( exprread )*
							{
							pushFollow(FOLLOW_exprread_in_expression999);
							exprread();
							state._fsp--;

							 value = "";         
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:93:13: ( exprread )*
							loop6:
							while (true) {
								int alt6=2;
								int LA6_0 = input.LA(1);
								if ( (LA6_0==IDENTIFIER) ) {
									alt6=1;
								}

								switch (alt6) {
								case 1 :
									// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:93:14: exprread
									{
									pushFollow(FOLLOW_exprread_in_expression1046);
									exprread();
									state._fsp--;

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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:94:7: ^( IF dsb= decl_stat_blocks (dsb= decl_stat_blocks )* et= exprthen )
					{
					match(input,IF,FOLLOW_IF_in_expression1060); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_decl_stat_blocks_in_expression1064);
					dsb=decl_stat_blocks();
					state._fsp--;

					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:95:13: (dsb= decl_stat_blocks )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==AND||LA8_0==BECOMES||LA8_0==CHARACTER||LA8_0==CONST||LA8_0==DIV||(LA8_0 >= EQ && LA8_0 <= IF)||LA8_0==LE||(LA8_0 >= LT && LA8_0 <= PRINT)||LA8_0==READ||LA8_0==TRUE||LA8_0==VAR||LA8_0==WHILE) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:95:14: dsb= decl_stat_blocks
							{
							pushFollow(FOLLOW_decl_stat_blocks_in_expression1081);
							dsb=decl_stat_blocks();
							state._fsp--;

							}
							break;

						default :
							break loop8;
						}
					}

					pushFollow(FOLLOW_exprthen_in_expression1117);
					et=exprthen();
					state._fsp--;

					 value = et; 
					match(input, Token.UP, null); 

					}
					break;
				case 22 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:97:7: ^( WHILE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* exprdo )
					{
					match(input,WHILE,FOLLOW_WHILE_in_expression1157); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_decl_stat_blocks_in_expression1161);
					dsb=decl_stat_blocks();
					state._fsp--;

					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:98:13: (dsb= decl_stat_blocks )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==AND||LA9_0==BECOMES||LA9_0==CHARACTER||LA9_0==CONST||LA9_0==DIV||(LA9_0 >= EQ && LA9_0 <= IF)||LA9_0==LE||(LA9_0 >= LT && LA9_0 <= PRINT)||LA9_0==READ||LA9_0==TRUE||LA9_0==VAR||LA9_0==WHILE) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:98:14: dsb= decl_stat_blocks
							{
							pushFollow(FOLLOW_decl_stat_blocks_in_expression1179);
							dsb=decl_stat_blocks();
							state._fsp--;

							}
							break;

						default :
							break loop9;
						}
					}

					pushFollow(FOLLOW_exprdo_in_expression1195);
					exprdo();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 23 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:100:7: op= operand
					{
					pushFollow(FOLLOW_operand_in_expression1207);
					op=operand();
					state._fsp--;

					 value = op; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expression"



	// $ANTLR start "exprprint"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:103:1: exprprint returns [ String value = \"\"; ] : expr= expression ;
	public final String exprprint() throws RecognitionException {
		String value =  "";;


		String expr =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:104:3: (expr= expression )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:104:7: expr= expression
			{
			pushFollow(FOLLOW_expression_in_exprprint1279);
			expr=expression();
			state._fsp--;

			 value = expr; stackSize++;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exprprint"



	// $ANTLR start "exprread"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:107:1: exprread returns [ String value = \"\"; ] : id= IDENTIFIER ;
	public final String exprread() throws RecognitionException {
		String value =  "";;


		CommonTree id=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:108:3: (id= IDENTIFIER )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:108:7: id= IDENTIFIER
			{
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exprread1334); 
			 value = "1";  stackSize++; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exprread"



	// $ANTLR start "exprdo"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:111:1: exprdo returns [ String value = \"\"; ] : ^( DO (dsb= decl_stat_blocks )* ) ;
	public final String exprdo() throws RecognitionException {
		String value =  "";;


		String dsb =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:112:3: ( ^( DO (dsb= decl_stat_blocks )* ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:112:4: ^( DO (dsb= decl_stat_blocks )* )
			{
			match(input,DO,FOLLOW_DO_in_exprdo1386); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:112:9: (dsb= decl_stat_blocks )*
				loop11:
				while (true) {
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==AND||LA11_0==BECOMES||LA11_0==CHARACTER||LA11_0==CONST||LA11_0==DIV||(LA11_0 >= EQ && LA11_0 <= IF)||LA11_0==LE||(LA11_0 >= LT && LA11_0 <= PRINT)||LA11_0==READ||LA11_0==TRUE||LA11_0==VAR||LA11_0==WHILE) ) {
						alt11=1;
					}

					switch (alt11) {
					case 1 :
						// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:112:10: dsb= decl_stat_blocks
						{
						pushFollow(FOLLOW_decl_stat_blocks_in_exprdo1391);
						dsb=decl_stat_blocks();
						state._fsp--;

						}
						break;

					default :
						break loop11;
					}
				}

				match(input, Token.UP, null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exprdo"



	// $ANTLR start "exprthen"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:115:1: exprthen returns [ String value = \"\"; ] : ^( THEN dsb= decl_stat_blocks (dsb= decl_stat_blocks )* (ee= exprelse )? ) ;
	public final String exprthen() throws RecognitionException {
		String value =  "";;


		String dsb =null;
		String ee =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:116:3: ( ^( THEN dsb= decl_stat_blocks (dsb= decl_stat_blocks )* (ee= exprelse )? ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:116:6: ^( THEN dsb= decl_stat_blocks (dsb= decl_stat_blocks )* (ee= exprelse )? )
			{
			match(input,THEN,FOLLOW_THEN_in_exprthen1415); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_decl_stat_blocks_in_exprthen1419);
			dsb=decl_stat_blocks();
			state._fsp--;

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:117:13: (dsb= decl_stat_blocks )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==AND||LA12_0==BECOMES||LA12_0==CHARACTER||LA12_0==CONST||LA12_0==DIV||(LA12_0 >= EQ && LA12_0 <= IF)||LA12_0==LE||(LA12_0 >= LT && LA12_0 <= PRINT)||LA12_0==READ||LA12_0==TRUE||LA12_0==VAR||LA12_0==WHILE) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:117:14: dsb= decl_stat_blocks
					{
					pushFollow(FOLLOW_decl_stat_blocks_in_exprthen1436);
					dsb=decl_stat_blocks();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:118:13: (ee= exprelse )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ELSE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:118:14: ee= exprelse
					{
					pushFollow(FOLLOW_exprelse_in_exprthen1455);
					ee=exprelse();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exprthen"



	// $ANTLR start "exprelse"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:121:1: exprelse returns [ String value = \"\"; ] : ^( ELSE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) ;
	public final String exprelse() throws RecognitionException {
		String value =  "";;


		String dsb =null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:122:3: ( ^( ELSE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:122:4: ^( ELSE dsb= decl_stat_blocks (dsb= decl_stat_blocks )* )
			{
			match(input,ELSE,FOLLOW_ELSE_in_exprelse1498); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_decl_stat_blocks_in_exprelse1502);
			dsb=decl_stat_blocks();
			state._fsp--;

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:123:13: (dsb= decl_stat_blocks )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==AND||LA14_0==BECOMES||LA14_0==CHARACTER||LA14_0==CONST||LA14_0==DIV||(LA14_0 >= EQ && LA14_0 <= IF)||LA14_0==LE||(LA14_0 >= LT && LA14_0 <= PRINT)||LA14_0==READ||LA14_0==TRUE||LA14_0==VAR||LA14_0==WHILE) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:123:14: dsb= decl_stat_blocks
					{
					pushFollow(FOLLOW_decl_stat_blocks_in_exprelse1519);
					dsb=decl_stat_blocks();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			 value = dsb; 
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exprelse"



	// $ANTLR start "operand"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:126:1: operand returns [String value = \"1\";] : ( TRUE | FALSE |n= NUMBER |c= CHARACTER |id= IDENTIFIER );
	public final String operand() throws RecognitionException {
		String value =  "1";;


		CommonTree n=null;
		CommonTree c=null;
		CommonTree id=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:127:3: ( TRUE | FALSE |n= NUMBER |c= CHARACTER |id= IDENTIFIER )
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:127:7: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand1561); 
					 value = "1"; stackSize++; 
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:128:7: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand1582); 
					 value = "0"; stackSize++; 
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:129:7: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1604); 
					 value = (n!=null?n.getText():null); stackSize++; 
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:130:7: c= CHARACTER
					{
					c=(CommonTree)match(input,CHARACTER,FOLLOW_CHARACTER_in_operand1623); 
					 value = (c!=null?c.getText():null); stackSize++; 
					}
					break;
				case 5 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:131:7: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1639); 
					 stackSize++; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:134:1: type returns [String type = \"1\";] : ( INTEGER | CHAR | BOOLEAN | VOID );
	public final String type() throws RecognitionException {
		String type =  "1";;


		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:135:3: ( INTEGER | CHAR | BOOLEAN | VOID )
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:135:7: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_type1664); 
					 type = "int";  
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:136:7: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type1682); 
					 type = "char"; 
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:137:7: BOOLEAN
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1703); 
					 type = "bool"; 
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosJAMAdministrator.g:138:7: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_type1721); 
					 type = "void"; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program61 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_program67 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_CONST_in_decl_stat_blocks103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_decl_stat_blocks107 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_decl_stat_blocks111 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_decl_stat_blocks130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_decl_stat_blocks134 = new BitSet(new long[]{0x0100000008000180L});
	public static final BitSet FOLLOW_type_in_decl_stat_blocks138 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_decl_stat_blocks167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUSU_in_expression217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression221 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUSU_in_expression254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression258 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expression290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression294 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expression329 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression333 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression337 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expression355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression359 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression380 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression384 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression388 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression404 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression408 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression412 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_expression427 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression431 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression435 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression455 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression459 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expression476 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression480 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression484 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expression553 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression557 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression561 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression578 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression582 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression586 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expression604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression608 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression612 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression630 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression634 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression638 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expression656 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression660 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression664 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expression682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression687 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression691 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expression709 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression713 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression717 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDESTBLOCK_in_expression734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression738 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression769 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_PRINT_in_expression846 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprprint_in_expression850 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_exprprint_in_expression894 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_exprprint_in_expression937 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_READ_in_expression951 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprread_in_expression955 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_exprread_in_expression999 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_exprread_in_expression1046 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_IF_in_expression1060 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1064 = new BitSet(new long[]{0x02B09FFE27F0A250L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1081 = new BitSet(new long[]{0x02B09FFE27F0A250L});
	public static final BitSet FOLLOW_exprthen_in_expression1117 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_expression1157 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1161 = new BitSet(new long[]{0x02A09FFE27F1A250L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1179 = new BitSet(new long[]{0x02A09FFE27F1A250L});
	public static final BitSet FOLLOW_exprdo_in_expression1195 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expression1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprprint1279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_exprread1334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_exprdo1386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprdo1391 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_THEN_in_exprthen1415 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprthen1419 = new BitSet(new long[]{0x02A09FFE27F2A258L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprthen1436 = new BitSet(new long[]{0x02A09FFE27F2A258L});
	public static final BitSet FOLLOW_exprelse_in_exprthen1455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_exprelse1498 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprelse1502 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprelse1519 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_TRUE_in_operand1561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_operand1623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type1721 = new BitSet(new long[]{0x0000000000000002L});
}
