// $ANTLR 3.5 C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g 2013-07-07 14:30:10

  package chronos;
  import chronos.utils.error.IChronosErrorReporter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ChronosLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ChronosLexer() {} 
	public ChronosLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChronosLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:12:5: ( '&&' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:12:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "APOSTROF"
	public final void mAPOSTROF() throws RecognitionException {
		try {
			int _type = APOSTROF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:13:10: ( '\\'' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:13:12: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APOSTROF"

	// $ANTLR start "BECOMES"
	public final void mBECOMES() throws RecognitionException {
		try {
			int _type = BECOMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:14:9: ( ':=' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:14:11: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BECOMES"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:15:9: ( 'bool' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:15:11: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:16:6: ( 'char' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:16:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:17:7: ( ':' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:17:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:18:7: ( ',' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:18:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:19:7: ( 'const' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:19:9: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:20:5: ( '/' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:20:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:21:4: ( 'do' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:21:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:22:6: ( 'else' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:22:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ENDDO"
	public final void mENDDO() throws RecognitionException {
		try {
			int _type = ENDDO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:23:7: ( 'od' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:23:9: 'od'
			{
			match("od"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDDO"

	// $ANTLR start "ENDIF"
	public final void mENDIF() throws RecognitionException {
		try {
			int _type = ENDIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:24:7: ( 'fi' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:24:9: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDIF"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:25:4: ( '==' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:25:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:26:7: ( 'false' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:26:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:27:4: ( '>=' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:27:6: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:28:4: ( '>' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:28:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "IDESTBLOCK"
	public final void mIDESTBLOCK() throws RecognitionException {
		try {
			int _type = IDESTBLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:29:12: ( 'indent' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:29:14: 'indent'
			{
			match("indent"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDESTBLOCK"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:30:4: ( 'if' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:30:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:31:9: ( 'int' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:31:11: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:32:8: ( '{' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:32:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:33:4: ( '<=' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:33:6: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:34:8: ( '(' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:34:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:35:4: ( '<' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:35:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:36:7: ( '-' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:36:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MINUSU"
	public final void mMINUSU() throws RecognitionException {
		try {
			int _type = MINUSU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:37:8: ( 'minusu' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:37:10: 'minusu'
			{
			match("minusu"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUSU"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:38:5: ( '%' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:38:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:39:6: ( '*' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:39:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:40:5: ( '!=' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:40:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:41:5: ( '!' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:41:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:42:4: ( '||' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:42:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:43:6: ( '+' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:43:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "PLUSU"
	public final void mPLUSU() throws RecognitionException {
		try {
			int _type = PLUSU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:44:7: ( 'plusu' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:44:9: 'plusu'
			{
			match("plusu"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUSU"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:45:7: ( 'print' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:45:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "PROGRAM"
	public final void mPROGRAM() throws RecognitionException {
		try {
			int _type = PROGRAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:46:9: ( 'program' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:46:11: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROGRAM"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:47:8: ( '}' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:47:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:48:6: ( 'read' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:48:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:49:8: ( ')' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:49:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:50:11: ( ';' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:50:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:51:6: ( 'then' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:51:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:52:6: ( 'true' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:52:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:53:5: ( 'var' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:53:7: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:54:6: ( 'void' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:54:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:55:7: ( 'while' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:55:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:236:3: ( '//' ( . )* '\\n' )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:236:7: '//' ( . )* '\\n'
			{
			match("//"); 

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:236:12: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\n') ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:236:12: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match('\n'); 
			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:241:3: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:241:7: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:241:7: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:246:3: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:246:7: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:246:14: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:250:3: ( ( DIGIT )+ )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:250:7: ( DIGIT )+
			{
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:250:7: ( DIGIT )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:254:3: ( APOSTROF SINGLECHAR APOSTROF )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:254:7: APOSTROF SINGLECHAR APOSTROF
			{
			mAPOSTROF(); 

			mSINGLECHAR(); 

			mAPOSTROF(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:257:23: ( ( '0' .. '9' ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:258:23: ( ( 'a' .. 'z' ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:259:23: ( ( 'A' .. 'Z' ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPPER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:260:23: ( ( LOWER | UPPER ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:261:23: ( ( ' ' | '-' ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:
			{
			if ( input.LA(1)==' '||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	// $ANTLR start "SINGLECHAR"
	public final void mSINGLECHAR() throws RecognitionException {
		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:262:23: ( ( LETTER | SYMBOL | DIGIT ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:
			{
			if ( input.LA(1)==' '||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLECHAR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:8: ( AND | APOSTROF | BECOMES | BOOLEAN | CHAR | COLON | COMMA | CONST | DIV | DO | ELSE | ENDDO | ENDIF | EQ | FALSE | GE | GT | IDESTBLOCK | IF | INTEGER | LCURLY | LE | LPAREN | LT | MINUS | MINUSU | MOD | MULT | NEQ | NOT | OR | PLUS | PLUSU | PRINT | PROGRAM | RCURLY | READ | RPAREN | SEMICOLON | THEN | TRUE | VAR | VOID | WHILE | COMMENT | WS | IDENTIFIER | NUMBER | CHARACTER )
		int alt5=49;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:14: APOSTROF
				{
				mAPOSTROF(); 

				}
				break;
			case 3 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:23: BECOMES
				{
				mBECOMES(); 

				}
				break;
			case 4 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:31: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 5 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:39: CHAR
				{
				mCHAR(); 

				}
				break;
			case 6 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:44: COLON
				{
				mCOLON(); 

				}
				break;
			case 7 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:50: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 8 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:56: CONST
				{
				mCONST(); 

				}
				break;
			case 9 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:62: DIV
				{
				mDIV(); 

				}
				break;
			case 10 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:66: DO
				{
				mDO(); 

				}
				break;
			case 11 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:69: ELSE
				{
				mELSE(); 

				}
				break;
			case 12 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:74: ENDDO
				{
				mENDDO(); 

				}
				break;
			case 13 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:80: ENDIF
				{
				mENDIF(); 

				}
				break;
			case 14 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:86: EQ
				{
				mEQ(); 

				}
				break;
			case 15 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:89: FALSE
				{
				mFALSE(); 

				}
				break;
			case 16 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:95: GE
				{
				mGE(); 

				}
				break;
			case 17 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:98: GT
				{
				mGT(); 

				}
				break;
			case 18 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:101: IDESTBLOCK
				{
				mIDESTBLOCK(); 

				}
				break;
			case 19 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:112: IF
				{
				mIF(); 

				}
				break;
			case 20 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:115: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 21 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:123: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 22 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:130: LE
				{
				mLE(); 

				}
				break;
			case 23 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:133: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 24 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:140: LT
				{
				mLT(); 

				}
				break;
			case 25 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:143: MINUS
				{
				mMINUS(); 

				}
				break;
			case 26 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:149: MINUSU
				{
				mMINUSU(); 

				}
				break;
			case 27 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:156: MOD
				{
				mMOD(); 

				}
				break;
			case 28 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:160: MULT
				{
				mMULT(); 

				}
				break;
			case 29 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:165: NEQ
				{
				mNEQ(); 

				}
				break;
			case 30 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:169: NOT
				{
				mNOT(); 

				}
				break;
			case 31 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:173: OR
				{
				mOR(); 

				}
				break;
			case 32 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:176: PLUS
				{
				mPLUS(); 

				}
				break;
			case 33 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:181: PLUSU
				{
				mPLUSU(); 

				}
				break;
			case 34 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:187: PRINT
				{
				mPRINT(); 

				}
				break;
			case 35 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:193: PROGRAM
				{
				mPROGRAM(); 

				}
				break;
			case 36 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:201: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 37 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:208: READ
				{
				mREAD(); 

				}
				break;
			case 38 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:213: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 39 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:220: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 40 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:230: THEN
				{
				mTHEN(); 

				}
				break;
			case 41 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:235: TRUE
				{
				mTRUE(); 

				}
				break;
			case 42 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:240: VAR
				{
				mVAR(); 

				}
				break;
			case 43 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:244: VOID
				{
				mVOID(); 

				}
				break;
			case 44 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:249: WHILE
				{
				mWHILE(); 

				}
				break;
			case 45 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:255: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 46 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:263: WS
				{
				mWS(); 

				}
				break;
			case 47 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:266: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 48 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:277: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 49 :
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:1:284: CHARACTER
				{
				mCHARACTER(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\2\uffff\1\44\1\47\2\42\1\uffff\1\54\4\42\1\uffff\1\63\1\42\1\uffff\1"+
		"\67\2\uffff\1\42\2\uffff\1\72\2\uffff\1\42\1\uffff\1\42\2\uffff\3\42\7"+
		"\uffff\3\42\2\uffff\1\106\1\42\1\110\1\111\1\42\2\uffff\1\42\1\115\2\uffff"+
		"\1\42\2\uffff\13\42\1\uffff\1\42\2\uffff\2\42\1\136\1\uffff\7\42\1\146"+
		"\2\42\1\151\1\152\1\42\1\154\2\42\1\uffff\4\42\1\163\1\164\1\165\1\uffff"+
		"\1\166\1\42\2\uffff\1\170\1\uffff\1\171\2\42\1\174\1\175\1\42\4\uffff"+
		"\1\177\2\uffff\1\u0080\1\u0081\2\uffff\1\42\3\uffff\1\u0083\1\uffff";
	static final String DFA5_eofS =
		"\u0084\uffff";
	static final String DFA5_minS =
		"\1\11\1\uffff\1\40\1\75\1\157\1\150\1\uffff\1\57\1\157\1\154\1\144\1\141"+
		"\1\uffff\1\75\1\146\1\uffff\1\75\2\uffff\1\151\2\uffff\1\75\2\uffff\1"+
		"\154\1\uffff\1\145\2\uffff\1\150\1\141\1\150\7\uffff\1\157\1\141\1\156"+
		"\2\uffff\1\60\1\163\2\60\1\154\2\uffff\1\144\1\60\2\uffff\1\156\2\uffff"+
		"\1\165\1\151\1\141\1\145\1\165\1\162\2\151\1\154\1\162\1\163\1\uffff\1"+
		"\145\2\uffff\1\163\1\145\1\60\1\uffff\1\165\1\163\1\156\1\147\1\144\1"+
		"\156\1\145\1\60\1\144\1\154\2\60\1\164\1\60\1\145\1\156\1\uffff\1\163"+
		"\1\165\1\164\1\162\3\60\1\uffff\1\60\1\145\2\uffff\1\60\1\uffff\1\60\1"+
		"\164\1\165\2\60\1\141\4\uffff\1\60\2\uffff\2\60\2\uffff\1\155\3\uffff"+
		"\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\175\1\uffff\1\172\1\75\2\157\1\uffff\1\57\1\157\1\154\1\144\1\151\1"+
		"\uffff\1\75\1\156\1\uffff\1\75\2\uffff\1\151\2\uffff\1\75\2\uffff\1\162"+
		"\1\uffff\1\145\2\uffff\1\162\1\157\1\150\7\uffff\1\157\1\141\1\156\2\uffff"+
		"\1\172\1\163\2\172\1\154\2\uffff\1\164\1\172\2\uffff\1\156\2\uffff\1\165"+
		"\1\157\1\141\1\145\1\165\1\162\2\151\1\154\1\162\1\163\1\uffff\1\145\2"+
		"\uffff\1\163\1\145\1\172\1\uffff\1\165\1\163\1\156\1\147\1\144\1\156\1"+
		"\145\1\172\1\144\1\154\2\172\1\164\1\172\1\145\1\156\1\uffff\1\163\1\165"+
		"\1\164\1\162\3\172\1\uffff\1\172\1\145\2\uffff\1\172\1\uffff\1\172\1\164"+
		"\1\165\2\172\1\141\4\uffff\1\172\2\uffff\2\172\2\uffff\1\155\3\uffff\1"+
		"\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\4\uffff\1\7\5\uffff\1\16\2\uffff\1\25\1\uffff\1\27\1\31\1"+
		"\uffff\1\33\1\34\1\uffff\1\37\1\40\1\uffff\1\44\1\uffff\1\46\1\47\3\uffff"+
		"\1\56\1\57\1\60\1\2\1\61\1\3\1\6\3\uffff\1\55\1\11\5\uffff\1\20\1\21\2"+
		"\uffff\1\26\1\30\1\uffff\1\35\1\36\13\uffff\1\12\1\uffff\1\14\1\15\3\uffff"+
		"\1\23\20\uffff\1\24\7\uffff\1\52\2\uffff\1\4\1\5\1\uffff\1\13\6\uffff"+
		"\1\45\1\50\1\51\1\53\1\uffff\1\10\1\17\2\uffff\1\41\1\42\1\uffff\1\54"+
		"\1\22\1\32\1\uffff\1\43";
	static final String DFA5_specialS =
		"\u0084\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\41\1\uffff\2\41\22\uffff\1\41\1\26\3\uffff\1\24\1\1\1\2\1\21\1\34"+
			"\1\25\1\30\1\6\1\22\1\uffff\1\7\12\43\1\3\1\35\1\20\1\14\1\15\2\uffff"+
			"\32\42\6\uffff\1\42\1\4\1\5\1\10\1\11\1\13\2\42\1\16\3\42\1\23\1\42\1"+
			"\12\1\31\1\42\1\33\1\42\1\36\1\42\1\37\1\40\3\42\1\17\1\27\1\32",
			"",
			"\1\45\14\uffff\1\45\2\uffff\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\46",
			"\1\50",
			"\1\51\6\uffff\1\52",
			"",
			"\1\53",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\61\7\uffff\1\60",
			"",
			"\1\62",
			"\1\65\7\uffff\1\64",
			"",
			"\1\66",
			"",
			"",
			"\1\70",
			"",
			"",
			"\1\71",
			"",
			"",
			"\1\73\5\uffff\1\74",
			"",
			"\1\75",
			"",
			"",
			"\1\76\11\uffff\1\77",
			"\1\100\15\uffff\1\101",
			"\1\102",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\103",
			"\1\104",
			"\1\105",
			"",
			"",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\107",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\112",
			"",
			"",
			"\1\113\17\uffff\1\114",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"",
			"",
			"\1\116",
			"",
			"",
			"\1\117",
			"\1\120\5\uffff\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"",
			"\1\133",
			"",
			"",
			"\1\134",
			"\1\135",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\147",
			"\1\150",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\153",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\155",
			"\1\156",
			"",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\167",
			"",
			"",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\172",
			"\1\173",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\1\176",
			"",
			"",
			"",
			"",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"",
			"",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			"",
			"",
			"\1\u0082",
			"",
			"",
			"",
			"\12\42\7\uffff\32\42\6\uffff\32\42",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | APOSTROF | BECOMES | BOOLEAN | CHAR | COLON | COMMA | CONST | DIV | DO | ELSE | ENDDO | ENDIF | EQ | FALSE | GE | GT | IDESTBLOCK | IF | INTEGER | LCURLY | LE | LPAREN | LT | MINUS | MINUSU | MOD | MULT | NEQ | NOT | OR | PLUS | PLUSU | PRINT | PROGRAM | RCURLY | READ | RPAREN | SEMICOLON | THEN | TRUE | VAR | VOID | WHILE | COMMENT | WS | IDENTIFIER | NUMBER | CHARACTER );";
		}
	}

}
