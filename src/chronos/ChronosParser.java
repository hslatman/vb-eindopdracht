// $ANTLR 3.5 C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g 2013-07-07 14:30:10

  package chronos;
  import chronos.utils.error.IChronosErrorReporter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ChronosParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ChronosParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChronosParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ChronosParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g"; }


	  
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
	    


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:113:1: program : decl_stat_blocks EOF -> ^( PROGRAM decl_stat_blocks ) ;
	public final ChronosParser.program_return program() throws RecognitionException {
		ChronosParser.program_return retval = new ChronosParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope decl_stat_blocks1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_decl_stat_blocks=new RewriteRuleSubtreeStream(adaptor,"rule decl_stat_blocks");

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:114:5: ( decl_stat_blocks EOF -> ^( PROGRAM decl_stat_blocks ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:114:9: decl_stat_blocks EOF
			{
			pushFollow(FOLLOW_decl_stat_blocks_in_program805);
			decl_stat_blocks1=decl_stat_blocks();
			state._fsp--;

			stream_decl_stat_blocks.add(decl_stat_blocks1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program807);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: decl_stat_blocks
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 115:13: -> ^( PROGRAM decl_stat_blocks )
			{
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:115:15: ^( PROGRAM decl_stat_blocks )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_decl_stat_blocks.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class decl_stat_blocks_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl_stat_blocks"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:118:1: decl_stat_blocks : ( ( declaration SEMICOLON !)* expression SEMICOLON !)+ ;
	public final ChronosParser.decl_stat_blocks_return decl_stat_blocks() throws RecognitionException {
		ChronosParser.decl_stat_blocks_return retval = new ChronosParser.decl_stat_blocks_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON4=null;
		Token SEMICOLON6=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope expression5 =null;

		Object SEMICOLON4_tree=null;
		Object SEMICOLON6_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:119:5: ( ( ( declaration SEMICOLON !)* expression SEMICOLON !)+ )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:119:9: ( ( declaration SEMICOLON !)* expression SEMICOLON !)+
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:119:9: ( ( declaration SEMICOLON !)* expression SEMICOLON !)+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CHARACTER||LA2_0==CONST||LA2_0==FALSE||LA2_0==IDENTIFIER||LA2_0==IF||LA2_0==LCURLY||LA2_0==LPAREN||LA2_0==MINUS||(LA2_0 >= NOT && LA2_0 <= NUMBER)||LA2_0==PLUS||LA2_0==PRINT||LA2_0==READ||LA2_0==TRUE||LA2_0==VAR||LA2_0==WHILE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:119:10: ( declaration SEMICOLON !)* expression SEMICOLON !
					{
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:119:10: ( declaration SEMICOLON !)*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==CONST||LA1_0==VAR) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:119:11: declaration SEMICOLON !
							{
							pushFollow(FOLLOW_declaration_in_decl_stat_blocks847);
							declaration3=declaration();
							state._fsp--;

							adaptor.addChild(root_0, declaration3.getTree());

							SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_stat_blocks849); 
							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_expression_in_decl_stat_blocks854);
					expression5=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression5.getTree());

					SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_stat_blocks856); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl_stat_blocks"


	public static class indent_decl_stat_blocks_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "indent_decl_stat_blocks"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:122:1: indent_decl_stat_blocks : LCURLY decl_stat_blocks RCURLY -> ^( IDESTBLOCK decl_stat_blocks ) ;
	public final ChronosParser.indent_decl_stat_blocks_return indent_decl_stat_blocks() throws RecognitionException {
		ChronosParser.indent_decl_stat_blocks_return retval = new ChronosParser.indent_decl_stat_blocks_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY7=null;
		Token RCURLY9=null;
		ParserRuleReturnScope decl_stat_blocks8 =null;

		Object LCURLY7_tree=null;
		Object RCURLY9_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_decl_stat_blocks=new RewriteRuleSubtreeStream(adaptor,"rule decl_stat_blocks");

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:123:5: ( LCURLY decl_stat_blocks RCURLY -> ^( IDESTBLOCK decl_stat_blocks ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:123:9: LCURLY decl_stat_blocks RCURLY
			{
			LCURLY7=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_indent_decl_stat_blocks878);  
			stream_LCURLY.add(LCURLY7);

			pushFollow(FOLLOW_decl_stat_blocks_in_indent_decl_stat_blocks880);
			decl_stat_blocks8=decl_stat_blocks();
			state._fsp--;

			stream_decl_stat_blocks.add(decl_stat_blocks8.getTree());
			RCURLY9=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_indent_decl_stat_blocks882);  
			stream_RCURLY.add(RCURLY9);

			// AST REWRITE
			// elements: decl_stat_blocks
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 124:11: -> ^( IDESTBLOCK decl_stat_blocks )
			{
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:124:14: ^( IDESTBLOCK decl_stat_blocks )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDESTBLOCK, "IDESTBLOCK"), root_1);
				adaptor.addChild(root_1, stream_decl_stat_blocks.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indent_decl_stat_blocks"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:127:1: declaration : ( constant_declaration | variable_declaration );
	public final ChronosParser.declaration_return declaration() throws RecognitionException {
		ChronosParser.declaration_return retval = new ChronosParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constant_declaration10 =null;
		ParserRuleReturnScope variable_declaration11 =null;


		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:128:5: ( constant_declaration | variable_declaration )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CONST) ) {
				alt3=1;
			}
			else if ( (LA3_0==VAR) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:128:9: constant_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_declaration_in_declaration919);
					constant_declaration10=constant_declaration();
					state._fsp--;

					adaptor.addChild(root_0, constant_declaration10.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:129:9: variable_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_declaration_in_declaration929);
					variable_declaration11=variable_declaration();
					state._fsp--;

					adaptor.addChild(root_0, variable_declaration11.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class constant_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant_declaration"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:132:1: constant_declaration : CONST ^ IDENTIFIER BECOMES ! expression ;
	public final ChronosParser.constant_declaration_return constant_declaration() throws RecognitionException {
		ChronosParser.constant_declaration_return retval = new ChronosParser.constant_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONST12=null;
		Token IDENTIFIER13=null;
		Token BECOMES14=null;
		ParserRuleReturnScope expression15 =null;

		Object CONST12_tree=null;
		Object IDENTIFIER13_tree=null;
		Object BECOMES14_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:133:5: ( CONST ^ IDENTIFIER BECOMES ! expression )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:133:9: CONST ^ IDENTIFIER BECOMES ! expression
			{
			root_0 = (Object)adaptor.nil();


			CONST12=(Token)match(input,CONST,FOLLOW_CONST_in_constant_declaration948); 
			CONST12_tree = (Object)adaptor.create(CONST12);
			root_0 = (Object)adaptor.becomeRoot(CONST12_tree, root_0);

			IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration951); 
			IDENTIFIER13_tree = (Object)adaptor.create(IDENTIFIER13);
			adaptor.addChild(root_0, IDENTIFIER13_tree);

			BECOMES14=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_constant_declaration953); 
			pushFollow(FOLLOW_expression_in_constant_declaration956);
			expression15=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression15.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_declaration"


	public static class variable_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable_declaration"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:136:1: variable_declaration : VAR ^ IDENTIFIER COLON ! type ;
	public final ChronosParser.variable_declaration_return variable_declaration() throws RecognitionException {
		ChronosParser.variable_declaration_return retval = new ChronosParser.variable_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR16=null;
		Token IDENTIFIER17=null;
		Token COLON18=null;
		ParserRuleReturnScope type19 =null;

		Object VAR16_tree=null;
		Object IDENTIFIER17_tree=null;
		Object COLON18_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:137:5: ( VAR ^ IDENTIFIER COLON ! type )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:137:9: VAR ^ IDENTIFIER COLON ! type
			{
			root_0 = (Object)adaptor.nil();


			VAR16=(Token)match(input,VAR,FOLLOW_VAR_in_variable_declaration977); 
			VAR16_tree = (Object)adaptor.create(VAR16);
			root_0 = (Object)adaptor.becomeRoot(VAR16_tree, root_0);

			IDENTIFIER17=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration980); 
			IDENTIFIER17_tree = (Object)adaptor.create(IDENTIFIER17);
			adaptor.addChild(root_0, IDENTIFIER17_tree);

			COLON18=(Token)match(input,COLON,FOLLOW_COLON_in_variable_declaration982); 
			pushFollow(FOLLOW_type_in_variable_declaration985);
			type19=type();
			state._fsp--;

			adaptor.addChild(root_0, type19.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_declaration"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:140:1: type : ( INTEGER | CHAR | BOOLEAN );
	public final ChronosParser.type_return type() throws RecognitionException {
		ChronosParser.type_return retval = new ChronosParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set20=null;

		Object set20_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:141:5: ( INTEGER | CHAR | BOOLEAN )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:
			{
			root_0 = (Object)adaptor.nil();


			set20=input.LT(1);
			if ( (input.LA(1) >= BOOLEAN && input.LA(1) <= CHAR)||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set20));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:146:1: expression : ( assign_statement | while_statement );
	public final ChronosParser.expression_return expression() throws RecognitionException {
		ChronosParser.expression_return retval = new ChronosParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assign_statement21 =null;
		ParserRuleReturnScope while_statement22 =null;


		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:147:5: ( assign_statement | while_statement )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==CHARACTER||LA4_0==FALSE||LA4_0==IDENTIFIER||LA4_0==IF||LA4_0==LCURLY||LA4_0==LPAREN||LA4_0==MINUS||(LA4_0 >= NOT && LA4_0 <= NUMBER)||LA4_0==PLUS||LA4_0==PRINT||LA4_0==READ||LA4_0==TRUE) ) {
				alt4=1;
			}
			else if ( (LA4_0==WHILE) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:147:9: assign_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assign_statement_in_expression1048);
					assign_statement21=assign_statement();
					state._fsp--;

					adaptor.addChild(root_0, assign_statement21.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:148:9: while_statement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_statement_in_expression1058);
					while_statement22=while_statement();
					state._fsp--;

					adaptor.addChild(root_0, while_statement22.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class assign_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign_statement"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:151:1: assign_statement : expror ( BECOMES ^ assign_statement )? ;
	public final ChronosParser.assign_statement_return assign_statement() throws RecognitionException {
		ChronosParser.assign_statement_return retval = new ChronosParser.assign_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES24=null;
		ParserRuleReturnScope expror23 =null;
		ParserRuleReturnScope assign_statement25 =null;

		Object BECOMES24_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:152:3: ( expror ( BECOMES ^ assign_statement )? )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:152:6: expror ( BECOMES ^ assign_statement )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expror_in_assign_statement1074);
			expror23=expror();
			state._fsp--;

			adaptor.addChild(root_0, expror23.getTree());

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:152:13: ( BECOMES ^ assign_statement )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==BECOMES) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:152:14: BECOMES ^ assign_statement
					{
					BECOMES24=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assign_statement1077); 
					BECOMES24_tree = (Object)adaptor.create(BECOMES24);
					root_0 = (Object)adaptor.becomeRoot(BECOMES24_tree, root_0);

					pushFollow(FOLLOW_assign_statement_in_assign_statement1080);
					assign_statement25=assign_statement();
					state._fsp--;

					adaptor.addChild(root_0, assign_statement25.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign_statement"


	public static class expror_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expror"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:155:1: expror : exprand ( OR ^ exprand )* ;
	public final ChronosParser.expror_return expror() throws RecognitionException {
		ChronosParser.expror_return retval = new ChronosParser.expror_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR27=null;
		ParserRuleReturnScope exprand26 =null;
		ParserRuleReturnScope exprand28 =null;

		Object OR27_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:156:3: ( exprand ( OR ^ exprand )* )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:156:6: exprand ( OR ^ exprand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprand_in_expror1097);
			exprand26=exprand();
			state._fsp--;

			adaptor.addChild(root_0, exprand26.getTree());

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:156:14: ( OR ^ exprand )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:156:15: OR ^ exprand
					{
					OR27=(Token)match(input,OR,FOLLOW_OR_in_expror1100); 
					OR27_tree = (Object)adaptor.create(OR27);
					root_0 = (Object)adaptor.becomeRoot(OR27_tree, root_0);

					pushFollow(FOLLOW_exprand_in_expror1103);
					exprand28=exprand();
					state._fsp--;

					adaptor.addChild(root_0, exprand28.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expror"


	public static class exprand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprand"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:159:1: exprand : exprrel ( AND ^ exprrel )* ;
	public final ChronosParser.exprand_return exprand() throws RecognitionException {
		ChronosParser.exprand_return retval = new ChronosParser.exprand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND30=null;
		ParserRuleReturnScope exprrel29 =null;
		ParserRuleReturnScope exprrel31 =null;

		Object AND30_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:160:3: ( exprrel ( AND ^ exprrel )* )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:160:7: exprrel ( AND ^ exprrel )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprrel_in_exprand1122);
			exprrel29=exprrel();
			state._fsp--;

			adaptor.addChild(root_0, exprrel29.getTree());

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:160:15: ( AND ^ exprrel )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==AND) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:160:16: AND ^ exprrel
					{
					AND30=(Token)match(input,AND,FOLLOW_AND_in_exprand1125); 
					AND30_tree = (Object)adaptor.create(AND30);
					root_0 = (Object)adaptor.becomeRoot(AND30_tree, root_0);

					pushFollow(FOLLOW_exprrel_in_exprand1128);
					exprrel31=exprrel();
					state._fsp--;

					adaptor.addChild(root_0, exprrel31.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprand"


	public static class exprrel_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprrel"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:163:1: exprrel : exprplusminus ( ( GT ^| GE ^| LT ^| LE ^| EQ ^| NEQ ^) exprplusminus )* ;
	public final ChronosParser.exprrel_return exprrel() throws RecognitionException {
		ChronosParser.exprrel_return retval = new ChronosParser.exprrel_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GT33=null;
		Token GE34=null;
		Token LT35=null;
		Token LE36=null;
		Token EQ37=null;
		Token NEQ38=null;
		ParserRuleReturnScope exprplusminus32 =null;
		ParserRuleReturnScope exprplusminus39 =null;

		Object GT33_tree=null;
		Object GE34_tree=null;
		Object LT35_tree=null;
		Object LE36_tree=null;
		Object EQ37_tree=null;
		Object NEQ38_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:3: ( exprplusminus ( ( GT ^| GE ^| LT ^| LE ^| EQ ^| NEQ ^) exprplusminus )* )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:5: exprplusminus ( ( GT ^| GE ^| LT ^| LE ^| EQ ^| NEQ ^) exprplusminus )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprplusminus_in_exprrel1147);
			exprplusminus32=exprplusminus();
			state._fsp--;

			adaptor.addChild(root_0, exprplusminus32.getTree());

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:19: ( ( GT ^| GE ^| LT ^| LE ^| EQ ^| NEQ ^) exprplusminus )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==EQ||(LA9_0 >= GE && LA9_0 <= GT)||LA9_0==LE||LA9_0==LT||LA9_0==NEQ) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:20: ( GT ^| GE ^| LT ^| LE ^| EQ ^| NEQ ^) exprplusminus
					{
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:20: ( GT ^| GE ^| LT ^| LE ^| EQ ^| NEQ ^)
					int alt8=6;
					switch ( input.LA(1) ) {
					case GT:
						{
						alt8=1;
						}
						break;
					case GE:
						{
						alt8=2;
						}
						break;
					case LT:
						{
						alt8=3;
						}
						break;
					case LE:
						{
						alt8=4;
						}
						break;
					case EQ:
						{
						alt8=5;
						}
						break;
					case NEQ:
						{
						alt8=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:21: GT ^
							{
							GT33=(Token)match(input,GT,FOLLOW_GT_in_exprrel1151); 
							GT33_tree = (Object)adaptor.create(GT33);
							root_0 = (Object)adaptor.becomeRoot(GT33_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:27: GE ^
							{
							GE34=(Token)match(input,GE,FOLLOW_GE_in_exprrel1156); 
							GE34_tree = (Object)adaptor.create(GE34);
							root_0 = (Object)adaptor.becomeRoot(GE34_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:33: LT ^
							{
							LT35=(Token)match(input,LT,FOLLOW_LT_in_exprrel1161); 
							LT35_tree = (Object)adaptor.create(LT35);
							root_0 = (Object)adaptor.becomeRoot(LT35_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:39: LE ^
							{
							LE36=(Token)match(input,LE,FOLLOW_LE_in_exprrel1166); 
							LE36_tree = (Object)adaptor.create(LE36);
							root_0 = (Object)adaptor.becomeRoot(LE36_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:45: EQ ^
							{
							EQ37=(Token)match(input,EQ,FOLLOW_EQ_in_exprrel1171); 
							EQ37_tree = (Object)adaptor.create(EQ37);
							root_0 = (Object)adaptor.becomeRoot(EQ37_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:164:51: NEQ ^
							{
							NEQ38=(Token)match(input,NEQ,FOLLOW_NEQ_in_exprrel1176); 
							NEQ38_tree = (Object)adaptor.create(NEQ38);
							root_0 = (Object)adaptor.becomeRoot(NEQ38_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_exprplusminus_in_exprrel1180);
					exprplusminus39=exprplusminus();
					state._fsp--;

					adaptor.addChild(root_0, exprplusminus39.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprrel"


	public static class exprplusminus_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprplusminus"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:167:1: exprplusminus : exprmultdiv ( ( PLUS ^| MINUS ^) exprmultdiv )* ;
	public final ChronosParser.exprplusminus_return exprplusminus() throws RecognitionException {
		ChronosParser.exprplusminus_return retval = new ChronosParser.exprplusminus_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS41=null;
		Token MINUS42=null;
		ParserRuleReturnScope exprmultdiv40 =null;
		ParserRuleReturnScope exprmultdiv43 =null;

		Object PLUS41_tree=null;
		Object MINUS42_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:168:5: ( exprmultdiv ( ( PLUS ^| MINUS ^) exprmultdiv )* )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:168:9: exprmultdiv ( ( PLUS ^| MINUS ^) exprmultdiv )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprmultdiv_in_exprplusminus1203);
			exprmultdiv40=exprmultdiv();
			state._fsp--;

			adaptor.addChild(root_0, exprmultdiv40.getTree());

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:168:21: ( ( PLUS ^| MINUS ^) exprmultdiv )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==MINUS||LA11_0==PLUS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:168:22: ( PLUS ^| MINUS ^) exprmultdiv
					{
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:168:22: ( PLUS ^| MINUS ^)
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==PLUS) ) {
						alt10=1;
					}
					else if ( (LA10_0==MINUS) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:168:23: PLUS ^
							{
							PLUS41=(Token)match(input,PLUS,FOLLOW_PLUS_in_exprplusminus1207); 
							PLUS41_tree = (Object)adaptor.create(PLUS41);
							root_0 = (Object)adaptor.becomeRoot(PLUS41_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:168:31: MINUS ^
							{
							MINUS42=(Token)match(input,MINUS,FOLLOW_MINUS_in_exprplusminus1212); 
							MINUS42_tree = (Object)adaptor.create(MINUS42);
							root_0 = (Object)adaptor.becomeRoot(MINUS42_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_exprmultdiv_in_exprplusminus1216);
					exprmultdiv43=exprmultdiv();
					state._fsp--;

					adaptor.addChild(root_0, exprmultdiv43.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprplusminus"


	public static class exprmultdiv_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprmultdiv"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:171:1: exprmultdiv : exprunary ( ( MOD ^| MULT ^| DIV ^) exprunary )* ;
	public final ChronosParser.exprmultdiv_return exprmultdiv() throws RecognitionException {
		ChronosParser.exprmultdiv_return retval = new ChronosParser.exprmultdiv_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MOD45=null;
		Token MULT46=null;
		Token DIV47=null;
		ParserRuleReturnScope exprunary44 =null;
		ParserRuleReturnScope exprunary48 =null;

		Object MOD45_tree=null;
		Object MULT46_tree=null;
		Object DIV47_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:172:3: ( exprunary ( ( MOD ^| MULT ^| DIV ^) exprunary )* )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:172:5: exprunary ( ( MOD ^| MULT ^| DIV ^) exprunary )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprunary_in_exprmultdiv1233);
			exprunary44=exprunary();
			state._fsp--;

			adaptor.addChild(root_0, exprunary44.getTree());

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:172:15: ( ( MOD ^| MULT ^| DIV ^) exprunary )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIV||(LA13_0 >= MOD && LA13_0 <= MULT)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:172:16: ( MOD ^| MULT ^| DIV ^) exprunary
					{
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:172:16: ( MOD ^| MULT ^| DIV ^)
					int alt12=3;
					switch ( input.LA(1) ) {
					case MOD:
						{
						alt12=1;
						}
						break;
					case MULT:
						{
						alt12=2;
						}
						break;
					case DIV:
						{
						alt12=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:172:17: MOD ^
							{
							MOD45=(Token)match(input,MOD,FOLLOW_MOD_in_exprmultdiv1237); 
							MOD45_tree = (Object)adaptor.create(MOD45);
							root_0 = (Object)adaptor.becomeRoot(MOD45_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:172:24: MULT ^
							{
							MULT46=(Token)match(input,MULT,FOLLOW_MULT_in_exprmultdiv1242); 
							MULT46_tree = (Object)adaptor.create(MULT46);
							root_0 = (Object)adaptor.becomeRoot(MULT46_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:172:32: DIV ^
							{
							DIV47=(Token)match(input,DIV,FOLLOW_DIV_in_exprmultdiv1247); 
							DIV47_tree = (Object)adaptor.create(DIV47);
							root_0 = (Object)adaptor.becomeRoot(DIV47_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_exprunary_in_exprmultdiv1251);
					exprunary48=exprunary();
					state._fsp--;

					adaptor.addChild(root_0, exprunary48.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprmultdiv"


	public static class exprunary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprunary"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:175:1: exprunary : ( operand | NOT ^ operand | PLUS operand -> ^( PLUSU operand ) | MINUS operand -> ^( MINUSU operand ) );
	public final ChronosParser.exprunary_return exprunary() throws RecognitionException {
		ChronosParser.exprunary_return retval = new ChronosParser.exprunary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT50=null;
		Token PLUS52=null;
		Token MINUS54=null;
		ParserRuleReturnScope operand49 =null;
		ParserRuleReturnScope operand51 =null;
		ParserRuleReturnScope operand53 =null;
		ParserRuleReturnScope operand55 =null;

		Object NOT50_tree=null;
		Object PLUS52_tree=null;
		Object MINUS54_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:176:3: ( operand | NOT ^ operand | PLUS operand -> ^( PLUSU operand ) | MINUS operand -> ^( MINUSU operand ) )
			int alt14=4;
			switch ( input.LA(1) ) {
			case CHARACTER:
			case FALSE:
			case IDENTIFIER:
			case IF:
			case LCURLY:
			case LPAREN:
			case NUMBER:
			case PRINT:
			case READ:
			case TRUE:
				{
				alt14=1;
				}
				break;
			case NOT:
				{
				alt14=2;
				}
				break;
			case PLUS:
				{
				alt14=3;
				}
				break;
			case MINUS:
				{
				alt14=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:176:7: operand
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operand_in_exprunary1270);
					operand49=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand49.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:177:7: NOT ^ operand
					{
					root_0 = (Object)adaptor.nil();


					NOT50=(Token)match(input,NOT,FOLLOW_NOT_in_exprunary1278); 
					NOT50_tree = (Object)adaptor.create(NOT50);
					root_0 = (Object)adaptor.becomeRoot(NOT50_tree, root_0);

					pushFollow(FOLLOW_operand_in_exprunary1281);
					operand51=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand51.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:178:7: PLUS operand
					{
					PLUS52=(Token)match(input,PLUS,FOLLOW_PLUS_in_exprunary1289);  
					stream_PLUS.add(PLUS52);

					pushFollow(FOLLOW_operand_in_exprunary1291);
					operand53=operand();
					state._fsp--;

					stream_operand.add(operand53.getTree());
					// AST REWRITE
					// elements: operand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 179:7: -> ^( PLUSU operand )
					{
						// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:179:10: ^( PLUSU operand )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUSU, "PLUSU"), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:180:7: MINUS operand
					{
					MINUS54=(Token)match(input,MINUS,FOLLOW_MINUS_in_exprunary1313);  
					stream_MINUS.add(MINUS54);

					pushFollow(FOLLOW_operand_in_exprunary1315);
					operand55=operand();
					state._fsp--;

					stream_operand.add(operand55.getTree());
					// AST REWRITE
					// elements: operand
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 181:7: -> ^( MINUSU operand )
					{
						// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:181:10: ^( MINUSU operand )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUSU, "MINUSU"), root_1);
						adaptor.addChild(root_1, stream_operand.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprunary"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:184:1: operand : ( TRUE | FALSE | NUMBER | CHARACTER | IDENTIFIER | LPAREN ! expression RPAREN !| indent_decl_stat_blocks | read | print | exprif );
	public final ChronosParser.operand_return operand() throws RecognitionException {
		ChronosParser.operand_return retval = new ChronosParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TRUE56=null;
		Token FALSE57=null;
		Token NUMBER58=null;
		Token CHARACTER59=null;
		Token IDENTIFIER60=null;
		Token LPAREN61=null;
		Token RPAREN63=null;
		ParserRuleReturnScope expression62 =null;
		ParserRuleReturnScope indent_decl_stat_blocks64 =null;
		ParserRuleReturnScope read65 =null;
		ParserRuleReturnScope print66 =null;
		ParserRuleReturnScope exprif67 =null;

		Object TRUE56_tree=null;
		Object FALSE57_tree=null;
		Object NUMBER58_tree=null;
		Object CHARACTER59_tree=null;
		Object IDENTIFIER60_tree=null;
		Object LPAREN61_tree=null;
		Object RPAREN63_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:185:3: ( TRUE | FALSE | NUMBER | CHARACTER | IDENTIFIER | LPAREN ! expression RPAREN !| indent_decl_stat_blocks | read | print | exprif )
			int alt15=10;
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
			case LPAREN:
				{
				alt15=6;
				}
				break;
			case LCURLY:
				{
				alt15=7;
				}
				break;
			case READ:
				{
				alt15=8;
				}
				break;
			case PRINT:
				{
				alt15=9;
				}
				break;
			case IF:
				{
				alt15=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:185:7: TRUE
					{
					root_0 = (Object)adaptor.nil();


					TRUE56=(Token)match(input,TRUE,FOLLOW_TRUE_in_operand1344); 
					TRUE56_tree = (Object)adaptor.create(TRUE56);
					adaptor.addChild(root_0, TRUE56_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:186:7: FALSE
					{
					root_0 = (Object)adaptor.nil();


					FALSE57=(Token)match(input,FALSE,FOLLOW_FALSE_in_operand1352); 
					FALSE57_tree = (Object)adaptor.create(FALSE57);
					adaptor.addChild(root_0, FALSE57_tree);

					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:187:7: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER58=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1360); 
					NUMBER58_tree = (Object)adaptor.create(NUMBER58);
					adaptor.addChild(root_0, NUMBER58_tree);

					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:188:7: CHARACTER
					{
					root_0 = (Object)adaptor.nil();


					CHARACTER59=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_operand1368); 
					CHARACTER59_tree = (Object)adaptor.create(CHARACTER59);
					adaptor.addChild(root_0, CHARACTER59_tree);

					}
					break;
				case 5 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:189:7: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1376); 
					IDENTIFIER60_tree = (Object)adaptor.create(IDENTIFIER60);
					adaptor.addChild(root_0, IDENTIFIER60_tree);

					}
					break;
				case 6 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:190:7: LPAREN ! expression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN61=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1384); 
					pushFollow(FOLLOW_expression_in_operand1387);
					expression62=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression62.getTree());

					RPAREN63=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1389); 
					}
					break;
				case 7 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:191:7: indent_decl_stat_blocks
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_indent_decl_stat_blocks_in_operand1398);
					indent_decl_stat_blocks64=indent_decl_stat_blocks();
					state._fsp--;

					adaptor.addChild(root_0, indent_decl_stat_blocks64.getTree());

					}
					break;
				case 8 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:192:7: read
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_read_in_operand1406);
					read65=read();
					state._fsp--;

					adaptor.addChild(root_0, read65.getTree());

					}
					break;
				case 9 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:193:7: print
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_in_operand1414);
					print66=print();
					state._fsp--;

					adaptor.addChild(root_0, print66.getTree());

					}
					break;
				case 10 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:194:7: exprif
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exprif_in_operand1422);
					exprif67=exprif();
					state._fsp--;

					adaptor.addChild(root_0, exprif67.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class read_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "read"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:197:1: read : READ ^ LPAREN ! varlist RPAREN !;
	public final ChronosParser.read_return read() throws RecognitionException {
		ChronosParser.read_return retval = new ChronosParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token READ68=null;
		Token LPAREN69=null;
		Token RPAREN71=null;
		ParserRuleReturnScope varlist70 =null;

		Object READ68_tree=null;
		Object LPAREN69_tree=null;
		Object RPAREN71_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:198:3: ( READ ^ LPAREN ! varlist RPAREN !)
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:198:7: READ ^ LPAREN ! varlist RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			READ68=(Token)match(input,READ,FOLLOW_READ_in_read1439); 
			READ68_tree = (Object)adaptor.create(READ68);
			root_0 = (Object)adaptor.becomeRoot(READ68_tree, root_0);

			LPAREN69=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read1442); 
			pushFollow(FOLLOW_varlist_in_read1445);
			varlist70=varlist();
			state._fsp--;

			adaptor.addChild(root_0, varlist70.getTree());

			RPAREN71=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read1447); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read"


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:201:1: print : PRINT ^ LPAREN ! exprlist RPAREN !;
	public final ChronosParser.print_return print() throws RecognitionException {
		ChronosParser.print_return retval = new ChronosParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT72=null;
		Token LPAREN73=null;
		Token RPAREN75=null;
		ParserRuleReturnScope exprlist74 =null;

		Object PRINT72_tree=null;
		Object LPAREN73_tree=null;
		Object RPAREN75_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:202:3: ( PRINT ^ LPAREN ! exprlist RPAREN !)
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:202:7: PRINT ^ LPAREN ! exprlist RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT72=(Token)match(input,PRINT,FOLLOW_PRINT_in_print1467); 
			PRINT72_tree = (Object)adaptor.create(PRINT72);
			root_0 = (Object)adaptor.becomeRoot(PRINT72_tree, root_0);

			LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print1470); 
			pushFollow(FOLLOW_exprlist_in_print1473);
			exprlist74=exprlist();
			state._fsp--;

			adaptor.addChild(root_0, exprlist74.getTree());

			RPAREN75=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print1475); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"


	public static class varlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "varlist"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:205:1: varlist : IDENTIFIER ( COMMA ! IDENTIFIER )* ;
	public final ChronosParser.varlist_return varlist() throws RecognitionException {
		ChronosParser.varlist_return retval = new ChronosParser.varlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER76=null;
		Token COMMA77=null;
		Token IDENTIFIER78=null;

		Object IDENTIFIER76_tree=null;
		Object COMMA77_tree=null;
		Object IDENTIFIER78_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:206:3: ( IDENTIFIER ( COMMA ! IDENTIFIER )* )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:206:7: IDENTIFIER ( COMMA ! IDENTIFIER )*
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1493); 
			IDENTIFIER76_tree = (Object)adaptor.create(IDENTIFIER76);
			adaptor.addChild(root_0, IDENTIFIER76_tree);

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:206:18: ( COMMA ! IDENTIFIER )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:206:19: COMMA ! IDENTIFIER
					{
					COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_varlist1496); 
					IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varlist1499); 
					IDENTIFIER78_tree = (Object)adaptor.create(IDENTIFIER78);
					adaptor.addChild(root_0, IDENTIFIER78_tree);

					}
					break;

				default :
					break loop16;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varlist"


	public static class exprlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprlist"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:209:1: exprlist : expression ( COMMA ! expression )* ;
	public final ChronosParser.exprlist_return exprlist() throws RecognitionException {
		ChronosParser.exprlist_return retval = new ChronosParser.exprlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA80=null;
		ParserRuleReturnScope expression79 =null;
		ParserRuleReturnScope expression81 =null;

		Object COMMA80_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:210:3: ( expression ( COMMA ! expression )* )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:210:7: expression ( COMMA ! expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_exprlist1518);
			expression79=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression79.getTree());

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:210:18: ( COMMA ! expression )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==COMMA) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:210:19: COMMA ! expression
					{
					COMMA80=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprlist1521); 
					pushFollow(FOLLOW_expression_in_exprlist1524);
					expression81=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression81.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprlist"


	public static class exprif_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprif"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:213:1: exprif : IF ^ decl_stat_blocks exprthen ENDIF !;
	public final ChronosParser.exprif_return exprif() throws RecognitionException {
		ChronosParser.exprif_return retval = new ChronosParser.exprif_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF82=null;
		Token ENDIF85=null;
		ParserRuleReturnScope decl_stat_blocks83 =null;
		ParserRuleReturnScope exprthen84 =null;

		Object IF82_tree=null;
		Object ENDIF85_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:214:3: ( IF ^ decl_stat_blocks exprthen ENDIF !)
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:214:7: IF ^ decl_stat_blocks exprthen ENDIF !
			{
			root_0 = (Object)adaptor.nil();


			IF82=(Token)match(input,IF,FOLLOW_IF_in_exprif1541); 
			IF82_tree = (Object)adaptor.create(IF82);
			root_0 = (Object)adaptor.becomeRoot(IF82_tree, root_0);

			pushFollow(FOLLOW_decl_stat_blocks_in_exprif1544);
			decl_stat_blocks83=decl_stat_blocks();
			state._fsp--;

			adaptor.addChild(root_0, decl_stat_blocks83.getTree());

			pushFollow(FOLLOW_exprthen_in_exprif1546);
			exprthen84=exprthen();
			state._fsp--;

			adaptor.addChild(root_0, exprthen84.getTree());

			ENDIF85=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_exprif1548); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprif"


	public static class exprthen_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprthen"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:217:1: exprthen : THEN ^ decl_stat_blocks ( exprelse )? ;
	public final ChronosParser.exprthen_return exprthen() throws RecognitionException {
		ChronosParser.exprthen_return retval = new ChronosParser.exprthen_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token THEN86=null;
		ParserRuleReturnScope decl_stat_blocks87 =null;
		ParserRuleReturnScope exprelse88 =null;

		Object THEN86_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:218:3: ( THEN ^ decl_stat_blocks ( exprelse )? )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:218:7: THEN ^ decl_stat_blocks ( exprelse )?
			{
			root_0 = (Object)adaptor.nil();


			THEN86=(Token)match(input,THEN,FOLLOW_THEN_in_exprthen1566); 
			THEN86_tree = (Object)adaptor.create(THEN86);
			root_0 = (Object)adaptor.becomeRoot(THEN86_tree, root_0);

			pushFollow(FOLLOW_decl_stat_blocks_in_exprthen1569);
			decl_stat_blocks87=decl_stat_blocks();
			state._fsp--;

			adaptor.addChild(root_0, decl_stat_blocks87.getTree());

			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:218:30: ( exprelse )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ELSE) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:218:31: exprelse
					{
					pushFollow(FOLLOW_exprelse_in_exprthen1572);
					exprelse88=exprelse();
					state._fsp--;

					adaptor.addChild(root_0, exprelse88.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprthen"


	public static class exprelse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprelse"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:221:1: exprelse : ELSE ^ decl_stat_blocks ;
	public final ChronosParser.exprelse_return exprelse() throws RecognitionException {
		ChronosParser.exprelse_return retval = new ChronosParser.exprelse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE89=null;
		ParserRuleReturnScope decl_stat_blocks90 =null;

		Object ELSE89_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:222:3: ( ELSE ^ decl_stat_blocks )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:222:7: ELSE ^ decl_stat_blocks
			{
			root_0 = (Object)adaptor.nil();


			ELSE89=(Token)match(input,ELSE,FOLLOW_ELSE_in_exprelse1589); 
			ELSE89_tree = (Object)adaptor.create(ELSE89);
			root_0 = (Object)adaptor.becomeRoot(ELSE89_tree, root_0);

			pushFollow(FOLLOW_decl_stat_blocks_in_exprelse1592);
			decl_stat_blocks90=decl_stat_blocks();
			state._fsp--;

			adaptor.addChild(root_0, decl_stat_blocks90.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprelse"


	public static class while_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while_statement"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:225:1: while_statement : WHILE ^ decl_stat_blocks exprdo ENDDO !;
	public final ChronosParser.while_statement_return while_statement() throws RecognitionException {
		ChronosParser.while_statement_return retval = new ChronosParser.while_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE91=null;
		Token ENDDO94=null;
		ParserRuleReturnScope decl_stat_blocks92 =null;
		ParserRuleReturnScope exprdo93 =null;

		Object WHILE91_tree=null;
		Object ENDDO94_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:226:5: ( WHILE ^ decl_stat_blocks exprdo ENDDO !)
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:226:9: WHILE ^ decl_stat_blocks exprdo ENDDO !
			{
			root_0 = (Object)adaptor.nil();


			WHILE91=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_statement1611); 
			WHILE91_tree = (Object)adaptor.create(WHILE91);
			root_0 = (Object)adaptor.becomeRoot(WHILE91_tree, root_0);

			pushFollow(FOLLOW_decl_stat_blocks_in_while_statement1614);
			decl_stat_blocks92=decl_stat_blocks();
			state._fsp--;

			adaptor.addChild(root_0, decl_stat_blocks92.getTree());

			pushFollow(FOLLOW_exprdo_in_while_statement1616);
			exprdo93=exprdo();
			state._fsp--;

			adaptor.addChild(root_0, exprdo93.getTree());

			ENDDO94=(Token)match(input,ENDDO,FOLLOW_ENDDO_in_while_statement1618); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while_statement"


	public static class exprdo_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprdo"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:229:1: exprdo : DO ^ decl_stat_blocks ;
	public final ChronosParser.exprdo_return exprdo() throws RecognitionException {
		ChronosParser.exprdo_return retval = new ChronosParser.exprdo_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DO95=null;
		ParserRuleReturnScope decl_stat_blocks96 =null;

		Object DO95_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:230:5: ( DO ^ decl_stat_blocks )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\Chronos.g:230:9: DO ^ decl_stat_blocks
			{
			root_0 = (Object)adaptor.nil();


			DO95=(Token)match(input,DO,FOLLOW_DO_in_exprdo1642); 
			DO95_tree = (Object)adaptor.create(DO95);
			root_0 = (Object)adaptor.becomeRoot(DO95_tree, root_0);

			pushFollow(FOLLOW_decl_stat_blocks_in_exprdo1645);
			decl_stat_blocks96=decl_stat_blocks();
			state._fsp--;

			adaptor.addChild(root_0, decl_stat_blocks96.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprdo"

	// Delegated rules



	public static final BitSet FOLLOW_decl_stat_blocks_in_program805 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_decl_stat_blocks847 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_decl_stat_blocks849 = new BitSet(new long[]{0x02A0958515202200L});
	public static final BitSet FOLLOW_expression_in_decl_stat_blocks854 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_decl_stat_blocks856 = new BitSet(new long[]{0x02A0958515202202L});
	public static final BitSet FOLLOW_LCURLY_in_indent_decl_stat_blocks878 = new BitSet(new long[]{0x02A0958515202200L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_indent_decl_stat_blocks880 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_RCURLY_in_indent_decl_stat_blocks882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_declaration929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration948 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration951 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BECOMES_in_constant_declaration953 = new BitSet(new long[]{0x0220958515200200L});
	public static final BitSet FOLLOW_expression_in_constant_declaration956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_variable_declaration977 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration980 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COLON_in_variable_declaration982 = new BitSet(new long[]{0x0000000008000180L});
	public static final BitSet FOLLOW_type_in_variable_declaration985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_statement_in_expression1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_expression1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expror_in_assign_statement1074 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_BECOMES_in_assign_statement1077 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_assign_statement_in_assign_statement1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprand_in_expror1097 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_OR_in_expror1100 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_exprand_in_expror1103 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_exprrel_in_exprand1122 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_exprand1125 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_exprrel_in_exprand1128 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_exprplusminus_in_exprrel1147 = new BitSet(new long[]{0x0000004220D00002L});
	public static final BitSet FOLLOW_GT_in_exprrel1151 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_GE_in_exprrel1156 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_LT_in_exprrel1161 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_LE_in_exprrel1166 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_EQ_in_exprrel1171 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_NEQ_in_exprrel1176 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_exprplusminus_in_exprrel1180 = new BitSet(new long[]{0x0000004220D00002L});
	public static final BitSet FOLLOW_exprmultdiv_in_exprplusminus1203 = new BitSet(new long[]{0x0000040400000002L});
	public static final BitSet FOLLOW_PLUS_in_exprplusminus1207 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_MINUS_in_exprplusminus1212 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_exprmultdiv_in_exprplusminus1216 = new BitSet(new long[]{0x0000040400000002L});
	public static final BitSet FOLLOW_exprunary_in_exprmultdiv1233 = new BitSet(new long[]{0x0000003000008002L});
	public static final BitSet FOLLOW_MOD_in_exprmultdiv1237 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_MULT_in_exprmultdiv1242 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_DIV_in_exprmultdiv1247 = new BitSet(new long[]{0x0020958515200200L});
	public static final BitSet FOLLOW_exprunary_in_exprmultdiv1251 = new BitSet(new long[]{0x0000003000008002L});
	public static final BitSet FOLLOW_operand_in_exprunary1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_exprunary1278 = new BitSet(new long[]{0x0020910115200200L});
	public static final BitSet FOLLOW_operand_in_exprunary1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_exprunary1289 = new BitSet(new long[]{0x0020910115200200L});
	public static final BitSet FOLLOW_operand_in_exprunary1291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_exprunary1313 = new BitSet(new long[]{0x0020910115200200L});
	public static final BitSet FOLLOW_operand_in_exprunary1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operand1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_operand1368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1384 = new BitSet(new long[]{0x0220958515200200L});
	public static final BitSet FOLLOW_expression_in_operand1387 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indent_decl_stat_blocks_in_operand1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_operand1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_operand1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprif_in_operand1422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read1439 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_read1442 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_varlist_in_read1445 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print1467 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_LPAREN_in_print1470 = new BitSet(new long[]{0x0220958515200200L});
	public static final BitSet FOLLOW_exprlist_in_print1473 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_print1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1493 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_varlist1496 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_varlist1499 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_expression_in_exprlist1518 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_exprlist1521 = new BitSet(new long[]{0x0220958515200200L});
	public static final BitSet FOLLOW_expression_in_exprlist1524 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_IF_in_exprif1541 = new BitSet(new long[]{0x02A0958515202200L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprif1544 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_exprthen_in_exprif1546 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ENDIF_in_exprif1548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THEN_in_exprthen1566 = new BitSet(new long[]{0x02A0958515202200L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprthen1569 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_exprelse_in_exprthen1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_exprelse1589 = new BitSet(new long[]{0x02A0958515202200L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprelse1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement1611 = new BitSet(new long[]{0x02A0958515202200L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_while_statement1614 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_exprdo_in_while_statement1616 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDDO_in_while_statement1618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_exprdo1642 = new BitSet(new long[]{0x02A0958515202200L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprdo1645 = new BitSet(new long[]{0x0000000000000002L});
}
