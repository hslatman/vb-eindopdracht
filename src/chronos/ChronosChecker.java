// $ANTLR 3.5 C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g 2013-07-07 14:30:09

  package chronos;
  
  import chronos.utils.error.IChronosErrorReporter;
  import chronos.utils.ChronosCheckerToolbox; 
  import chronos.utils.exceptions.ChronosException;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class ChronosChecker extends TreeParser {
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


	public ChronosChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ChronosChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ChronosChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g"; }

	    

	    private IChronosErrorReporter errorReporter = null;
	    
	    public void setErrorReporter(IChronosErrorReporter errorReporter) {
	        this.errorReporter = errorReporter;
	    }
	    
	    private ChronosCheckerToolbox toolbox = new ChronosCheckerToolbox();
	    


	public static class program_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:51:1: program : ^( PROGRAM ( decl_stat_blocks )+ ) ;
	public final ChronosChecker.program_return program() throws RecognitionException {
		ChronosChecker.program_return retval = new ChronosChecker.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree PROGRAM1=null;
		TreeRuleReturnScope decl_stat_blocks2 =null;

		CommonTree PROGRAM1_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:52:5: ( ^( PROGRAM ( decl_stat_blocks )+ ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:52:7: ^( PROGRAM ( decl_stat_blocks )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			PROGRAM1=(CommonTree)match(input,PROGRAM,FOLLOW_PROGRAM_in_program85); 
			PROGRAM1_tree = (CommonTree)adaptor.dupNode(PROGRAM1);


			root_1 = (CommonTree)adaptor.becomeRoot(PROGRAM1_tree, root_1);

			match(input, Token.DOWN, null); 
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:52:17: ( decl_stat_blocks )+
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:52:17: decl_stat_blocks
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_decl_stat_blocks_in_program87);
					decl_stat_blocks2=decl_stat_blocks();
					state._fsp--;

					adaptor.addChild(root_1, decl_stat_blocks2.getTree());

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
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class decl_stat_blocks_return extends TreeRuleReturnScope {
		public String type = "";;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl_stat_blocks"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:55:1: decl_stat_blocks returns [ String type = \"\"; ] : (d= declaration |ex= expression );
	public final ChronosChecker.decl_stat_blocks_return decl_stat_blocks() throws RecognitionException {
		ChronosChecker.decl_stat_blocks_return retval = new ChronosChecker.decl_stat_blocks_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope d =null;
		TreeRuleReturnScope ex =null;


		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:56:3: (d= declaration |ex= expression )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==CONST||LA2_0==VAR) ) {
				alt2=1;
			}
			else if ( (LA2_0==AND||LA2_0==BECOMES||LA2_0==CHARACTER||LA2_0==DIV||(LA2_0 >= EQ && LA2_0 <= IF)||LA2_0==LE||(LA2_0 >= LT && LA2_0 <= PRINT)||LA2_0==READ||LA2_0==TRUE||LA2_0==WHILE) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:56:7: d= declaration
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_declaration_in_decl_stat_blocks116);
					d=declaration();
					state._fsp--;

					adaptor.addChild(root_0, d.getTree());

					 retval.type = (d!=null?((ChronosChecker.declaration_return)d).type:null);   
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:57:7: ex= expression
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_decl_stat_blocks148);
					ex=expression();
					state._fsp--;

					adaptor.addChild(root_0, ex.getTree());

					 retval.type = (ex!=null?((ChronosChecker.expression_return)ex).type:null);  
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl_stat_blocks"


	public static class declaration_return extends TreeRuleReturnScope {
		public String type = "";;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:60:1: declaration returns [ String type = \"\";] : (cd= constant_declaration |vd= variable_declaration );
	public final ChronosChecker.declaration_return declaration() throws RecognitionException {
		ChronosChecker.declaration_return retval = new ChronosChecker.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope cd =null;
		TreeRuleReturnScope vd =null;


		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:61:5: (cd= constant_declaration |vd= variable_declaration )
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:61:9: cd= constant_declaration
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_constant_declaration_in_declaration193);
					cd=constant_declaration();
					state._fsp--;

					adaptor.addChild(root_0, cd.getTree());

					 retval.type = (cd!=null?((ChronosChecker.constant_declaration_return)cd).type:null); 
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:62:9: vd= variable_declaration
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_variable_declaration_in_declaration215);
					vd=variable_declaration();
					state._fsp--;

					adaptor.addChild(root_0, vd.getTree());

					 retval.type = (vd!=null?((ChronosChecker.variable_declaration_return)vd).type:null); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class constant_declaration_return extends TreeRuleReturnScope {
		public String type = "";;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constant_declaration"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:65:1: constant_declaration returns [ String type = \"\";] : ^( CONST id= IDENTIFIER ex= expression ) ;
	public final ChronosChecker.constant_declaration_return constant_declaration() throws RecognitionException {
		ChronosChecker.constant_declaration_return retval = new ChronosChecker.constant_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree CONST3=null;
		TreeRuleReturnScope ex =null;

		CommonTree id_tree=null;
		CommonTree CONST3_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:66:5: ( ^( CONST id= IDENTIFIER ex= expression ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:66:9: ^( CONST id= IDENTIFIER ex= expression )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			CONST3=(CommonTree)match(input,CONST,FOLLOW_CONST_in_constant_declaration252); 
			CONST3_tree = (CommonTree)adaptor.dupNode(CONST3);


			root_1 = (CommonTree)adaptor.becomeRoot(CONST3_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_declaration256); 
			id_tree = (CommonTree)adaptor.dupNode(id);


			adaptor.addChild(root_1, id_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expression_in_constant_declaration260);
			ex=expression();
			state._fsp--;

			adaptor.addChild(root_1, ex.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 toolbox.putConst(id, (ex!=null?((ChronosChecker.expression_return)ex).type:null)); retval.type = "no_type"; 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_declaration"


	public static class variable_declaration_return extends TreeRuleReturnScope {
		public String type = "";;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variable_declaration"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:69:1: variable_declaration returns [ String type = \"\";] : ^( VAR id= IDENTIFIER t= type ) ;
	public final ChronosChecker.variable_declaration_return variable_declaration() throws RecognitionException {
		ChronosChecker.variable_declaration_return retval = new ChronosChecker.variable_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree VAR4=null;
		TreeRuleReturnScope t =null;

		CommonTree id_tree=null;
		CommonTree VAR4_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:70:5: ( ^( VAR id= IDENTIFIER t= type ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:70:9: ^( VAR id= IDENTIFIER t= type )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			VAR4=(CommonTree)match(input,VAR,FOLLOW_VAR_in_variable_declaration296); 
			VAR4_tree = (CommonTree)adaptor.dupNode(VAR4);


			root_1 = (CommonTree)adaptor.becomeRoot(VAR4_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable_declaration300); 
			id_tree = (CommonTree)adaptor.dupNode(id);


			adaptor.addChild(root_1, id_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_type_in_variable_declaration304);
			t=type();
			state._fsp--;

			adaptor.addChild(root_1, t.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 toolbox.putVar(id, (t!=null?((ChronosChecker.type_return)t).type:null)); retval.type = "no_type";    
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_declaration"


	public static class expression_return extends TreeRuleReturnScope {
		public String type = "";;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:74:1: expression returns [ String type = \"\"; ] : ( ^( PLUSU expr= expression ) | ^( MINUSU expr= expression ) | ^( NOT expr= expression ) | ^( OR expr1= expression expr2= expression ) | ^( AND expr1= expression expr2= expression ) | ^( PLUS expr1= expression expr2= expression ) | ^( MINUS expr1= expression expr2= expression ) | ^( MULT expr1= expression expr2= expression ) | ^( DIV expr1= expression expr2= expression ) | ^( MOD expr1= expression expr2= expression ) | ^( BECOMES id= IDENTIFIER expr= expression ) | ^( GT expr1= expression expr2= expression ) | ^( GE expr1= expression expr2= expression ) | ^( LT expr1= expression expr2= expression ) | ^( LE expr1= expression expr2= expression ) | ^( EQ expr1= expression expr2= expression ) | ^( NEQ expr1= expression expr2= expression ) | ^( IDESTBLOCK (dsb= decl_stat_blocks )+ ) | ^( PRINT expr1= expression (expr2= expression )* ) | ^( READ id1= IDENTIFIER (id2= IDENTIFIER )* ) | ^( IF (d= decl_stat_blocks )* ext= exprthen ) | ^( WHILE (d= decl_stat_blocks )* exprdo ) |o= operand );
	public final ChronosChecker.expression_return expression() throws RecognitionException {
		ChronosChecker.expression_return retval = new ChronosChecker.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree id1=null;
		CommonTree id2=null;
		CommonTree PLUSU5=null;
		CommonTree MINUSU6=null;
		CommonTree NOT7=null;
		CommonTree OR8=null;
		CommonTree AND9=null;
		CommonTree PLUS10=null;
		CommonTree MINUS11=null;
		CommonTree MULT12=null;
		CommonTree DIV13=null;
		CommonTree MOD14=null;
		CommonTree BECOMES15=null;
		CommonTree GT16=null;
		CommonTree GE17=null;
		CommonTree LT18=null;
		CommonTree LE19=null;
		CommonTree EQ20=null;
		CommonTree NEQ21=null;
		CommonTree IDESTBLOCK22=null;
		CommonTree PRINT23=null;
		CommonTree READ24=null;
		CommonTree IF25=null;
		CommonTree WHILE26=null;
		TreeRuleReturnScope expr =null;
		TreeRuleReturnScope expr1 =null;
		TreeRuleReturnScope expr2 =null;
		TreeRuleReturnScope dsb =null;
		TreeRuleReturnScope d =null;
		TreeRuleReturnScope ext =null;
		TreeRuleReturnScope o =null;
		TreeRuleReturnScope exprdo27 =null;

		CommonTree id_tree=null;
		CommonTree id1_tree=null;
		CommonTree id2_tree=null;
		CommonTree PLUSU5_tree=null;
		CommonTree MINUSU6_tree=null;
		CommonTree NOT7_tree=null;
		CommonTree OR8_tree=null;
		CommonTree AND9_tree=null;
		CommonTree PLUS10_tree=null;
		CommonTree MINUS11_tree=null;
		CommonTree MULT12_tree=null;
		CommonTree DIV13_tree=null;
		CommonTree MOD14_tree=null;
		CommonTree BECOMES15_tree=null;
		CommonTree GT16_tree=null;
		CommonTree GE17_tree=null;
		CommonTree LT18_tree=null;
		CommonTree LE19_tree=null;
		CommonTree EQ20_tree=null;
		CommonTree NEQ21_tree=null;
		CommonTree IDESTBLOCK22_tree=null;
		CommonTree PRINT23_tree=null;
		CommonTree READ24_tree=null;
		CommonTree IF25_tree=null;
		CommonTree WHILE26_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:75:3: ( ^( PLUSU expr= expression ) | ^( MINUSU expr= expression ) | ^( NOT expr= expression ) | ^( OR expr1= expression expr2= expression ) | ^( AND expr1= expression expr2= expression ) | ^( PLUS expr1= expression expr2= expression ) | ^( MINUS expr1= expression expr2= expression ) | ^( MULT expr1= expression expr2= expression ) | ^( DIV expr1= expression expr2= expression ) | ^( MOD expr1= expression expr2= expression ) | ^( BECOMES id= IDENTIFIER expr= expression ) | ^( GT expr1= expression expr2= expression ) | ^( GE expr1= expression expr2= expression ) | ^( LT expr1= expression expr2= expression ) | ^( LE expr1= expression expr2= expression ) | ^( EQ expr1= expression expr2= expression ) | ^( NEQ expr1= expression expr2= expression ) | ^( IDESTBLOCK (dsb= decl_stat_blocks )+ ) | ^( PRINT expr1= expression (expr2= expression )* ) | ^( READ id1= IDENTIFIER (id2= IDENTIFIER )* ) | ^( IF (d= decl_stat_blocks )* ext= exprthen ) | ^( WHILE (d= decl_stat_blocks )* exprdo ) |o= operand )
			int alt9=23;
			switch ( input.LA(1) ) {
			case PLUSU:
				{
				alt9=1;
				}
				break;
			case MINUSU:
				{
				alt9=2;
				}
				break;
			case NOT:
				{
				alt9=3;
				}
				break;
			case OR:
				{
				alt9=4;
				}
				break;
			case AND:
				{
				alt9=5;
				}
				break;
			case PLUS:
				{
				alt9=6;
				}
				break;
			case MINUS:
				{
				alt9=7;
				}
				break;
			case MULT:
				{
				alt9=8;
				}
				break;
			case DIV:
				{
				alt9=9;
				}
				break;
			case MOD:
				{
				alt9=10;
				}
				break;
			case BECOMES:
				{
				alt9=11;
				}
				break;
			case GT:
				{
				alt9=12;
				}
				break;
			case GE:
				{
				alt9=13;
				}
				break;
			case LT:
				{
				alt9=14;
				}
				break;
			case LE:
				{
				alt9=15;
				}
				break;
			case EQ:
				{
				alt9=16;
				}
				break;
			case NEQ:
				{
				alt9=17;
				}
				break;
			case IDESTBLOCK:
				{
				alt9=18;
				}
				break;
			case PRINT:
				{
				alt9=19;
				}
				break;
			case READ:
				{
				alt9=20;
				}
				break;
			case IF:
				{
				alt9=21;
				}
				break;
			case WHILE:
				{
				alt9=22;
				}
				break;
			case CHARACTER:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
			case TRUE:
				{
				alt9=23;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:75:7: ^( PLUSU expr= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PLUSU5=(CommonTree)match(input,PLUSU,FOLLOW_PLUSU_in_expression348); 
					PLUSU5_tree = (CommonTree)adaptor.dupNode(PLUSU5);


					root_1 = (CommonTree)adaptor.becomeRoot(PLUSU5_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression352);
					expr=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.type = toolbox.checkInt((expr!=null?((ChronosChecker.expression_return)expr).type:null), expr);  
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:76:7: ^( MINUSU expr= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MINUSU6=(CommonTree)match(input,MINUSU,FOLLOW_MINUSU_in_expression385); 
					MINUSU6_tree = (CommonTree)adaptor.dupNode(MINUSU6);


					root_1 = (CommonTree)adaptor.becomeRoot(MINUSU6_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression389);
					expr=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.type = toolbox.checkInt((expr!=null?((ChronosChecker.expression_return)expr).type:null), expr);  
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:77:7: ^( NOT expr= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NOT7=(CommonTree)match(input,NOT,FOLLOW_NOT_in_expression421); 
					NOT7_tree = (CommonTree)adaptor.dupNode(NOT7);


					root_1 = (CommonTree)adaptor.becomeRoot(NOT7_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression425);
					expr=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.type = toolbox.checkBool((expr!=null?((ChronosChecker.expression_return)expr).type:null), expr); 
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:78:7: ^( OR expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OR8=(CommonTree)match(input,OR,FOLLOW_OR_in_expression460); 
					OR8_tree = (CommonTree)adaptor.dupNode(OR8);


					root_1 = (CommonTree)adaptor.becomeRoot(OR8_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression464);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression468);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkBool((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1); retval.type = toolbox.checkBool((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); 
					}
					break;
				case 5 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:79:7: ^( AND expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AND9=(CommonTree)match(input,AND,FOLLOW_AND_in_expression486); 
					AND9_tree = (CommonTree)adaptor.dupNode(AND9);


					root_1 = (CommonTree)adaptor.becomeRoot(AND9_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression490);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression494);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkBool((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1); retval.type = toolbox.checkBool((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); 
					}
					break;
				case 6 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:80:7: ^( PLUS expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PLUS10=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression511); 
					PLUS10_tree = (CommonTree)adaptor.dupNode(PLUS10);


					root_1 = (CommonTree)adaptor.becomeRoot(PLUS10_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression515);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression519);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkInt((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1);  retval.type = toolbox.checkInt((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); 
					}
					break;
				case 7 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:81:7: ^( MINUS expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MINUS11=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression535); 
					MINUS11_tree = (CommonTree)adaptor.dupNode(MINUS11);


					root_1 = (CommonTree)adaptor.becomeRoot(MINUS11_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression539);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression543);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkInt((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1);  retval.type = toolbox.checkInt((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); 
					}
					break;
				case 8 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:82:7: ^( MULT expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MULT12=(CommonTree)match(input,MULT,FOLLOW_MULT_in_expression558); 
					MULT12_tree = (CommonTree)adaptor.dupNode(MULT12);


					root_1 = (CommonTree)adaptor.becomeRoot(MULT12_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression562);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression566);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkInt((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1); retval.type = toolbox.checkInt((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); 
					}
					break;
				case 9 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:83:7: ^( DIV expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DIV13=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expression582); 
					DIV13_tree = (CommonTree)adaptor.dupNode(DIV13);


					root_1 = (CommonTree)adaptor.becomeRoot(DIV13_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression586);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression590);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkInt((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1); retval.type = toolbox.checkInt((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); 
					}
					break;
				case 10 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:84:7: ^( MOD expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MOD14=(CommonTree)match(input,MOD,FOLLOW_MOD_in_expression607); 
					MOD14_tree = (CommonTree)adaptor.dupNode(MOD14);


					root_1 = (CommonTree)adaptor.becomeRoot(MOD14_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression611);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression615);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkInt((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1); retval.type = toolbox.checkInt((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); 
					}
					break;
				case 11 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:85:7: ^( BECOMES id= IDENTIFIER expr= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					BECOMES15=(CommonTree)match(input,BECOMES,FOLLOW_BECOMES_in_expression632); 
					BECOMES15_tree = (CommonTree)adaptor.dupNode(BECOMES15);


					root_1 = (CommonTree)adaptor.becomeRoot(BECOMES15_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression636); 
					id_tree = (CommonTree)adaptor.dupNode(id);


					adaptor.addChild(root_1, id_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression640);
					expr=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.type = toolbox.checkBecomes(id, (expr!=null?((ChronosChecker.expression_return)expr).type:null)); 
					}
					break;
				case 12 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:86:7: ^( GT expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GT16=(CommonTree)match(input,GT,FOLLOW_GT_in_expression657); 
					GT16_tree = (CommonTree)adaptor.dupNode(GT16);


					root_1 = (CommonTree)adaptor.becomeRoot(GT16_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression661);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression665);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkInt((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1); toolbox.checkInt((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); retval.type = "bool"; 
					}
					break;
				case 13 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:87:7: ^( GE expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GE17=(CommonTree)match(input,GE,FOLLOW_GE_in_expression683); 
					GE17_tree = (CommonTree)adaptor.dupNode(GE17);


					root_1 = (CommonTree)adaptor.becomeRoot(GE17_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression687);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression691);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkInt((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1); toolbox.checkInt((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); retval.type = "bool"; 
					}
					break;
				case 14 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:88:7: ^( LT expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LT18=(CommonTree)match(input,LT,FOLLOW_LT_in_expression711); 
					LT18_tree = (CommonTree)adaptor.dupNode(LT18);


					root_1 = (CommonTree)adaptor.becomeRoot(LT18_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression715);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression719);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkInt((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1); toolbox.checkInt((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); retval.type = "bool"; 
					}
					break;
				case 15 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:89:7: ^( LE expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LE19=(CommonTree)match(input,LE,FOLLOW_LE_in_expression737); 
					LE19_tree = (CommonTree)adaptor.dupNode(LE19);


					root_1 = (CommonTree)adaptor.becomeRoot(LE19_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression741);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression745);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkInt((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1); toolbox.checkInt((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); retval.type = "bool"; 
					}
					break;
				case 16 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:90:7: ^( EQ expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EQ20=(CommonTree)match(input,EQ,FOLLOW_EQ_in_expression763); 
					EQ20_tree = (CommonTree)adaptor.dupNode(EQ20);


					root_1 = (CommonTree)adaptor.becomeRoot(EQ20_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression767);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression771);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.compareTypes((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1, (expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); retval.type = "bool"; 
					}
					break;
				case 17 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:91:7: ^( NEQ expr1= expression expr2= expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NEQ21=(CommonTree)match(input,NEQ,FOLLOW_NEQ_in_expression789); 
					NEQ21_tree = (CommonTree)adaptor.dupNode(NEQ21);


					root_1 = (CommonTree)adaptor.becomeRoot(NEQ21_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression793);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression797);
					expr2=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.compareTypes((expr1!=null?((ChronosChecker.expression_return)expr1).type:null), expr1, (expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); retval.type = "bool"; 
					}
					break;
				case 18 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:92:7: ^( IDESTBLOCK (dsb= decl_stat_blocks )+ )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IDESTBLOCK22=(CommonTree)match(input,IDESTBLOCK,FOLLOW_IDESTBLOCK_in_expression814); 
					IDESTBLOCK22_tree = (CommonTree)adaptor.dupNode(IDESTBLOCK22);


					root_1 = (CommonTree)adaptor.becomeRoot(IDESTBLOCK22_tree, root_1);

					 toolbox.tbOpenScope(); 
					match(input, Token.DOWN, null); 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:93:13: (dsb= decl_stat_blocks )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==AND||LA4_0==BECOMES||LA4_0==CHARACTER||LA4_0==CONST||LA4_0==DIV||(LA4_0 >= EQ && LA4_0 <= IF)||LA4_0==LE||(LA4_0 >= LT && LA4_0 <= PRINT)||LA4_0==READ||LA4_0==TRUE||LA4_0==VAR||LA4_0==WHILE) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:93:14: dsb= decl_stat_blocks
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_decl_stat_blocks_in_expression867);
							dsb=decl_stat_blocks();
							state._fsp--;

							adaptor.addChild(root_1, dsb.getTree());

							 retval.type = (dsb!=null?((ChronosChecker.decl_stat_blocks_return)dsb).type:null); 
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					 toolbox.tbCloseScope(); 
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 19 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:95:7: ^( PRINT expr1= expression (expr2= expression )* )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PRINT23=(CommonTree)match(input,PRINT,FOLLOW_PRINT_in_expression954); 
					PRINT23_tree = (CommonTree)adaptor.dupNode(PRINT23);


					root_1 = (CommonTree)adaptor.becomeRoot(PRINT23_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression958);
					expr1=expression();
					state._fsp--;

					adaptor.addChild(root_1, expr1.getTree());

					 retval.type = (expr1!=null?((ChronosChecker.expression_return)expr1).type:null); toolbox.checkPrintVoid(retval.type, expr1);  
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:96:13: (expr2= expression )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==AND||LA5_0==BECOMES||LA5_0==CHARACTER||LA5_0==DIV||(LA5_0 >= EQ && LA5_0 <= IF)||LA5_0==LE||(LA5_0 >= LT && LA5_0 <= PRINT)||LA5_0==READ||LA5_0==TRUE||LA5_0==WHILE) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:96:14: expr2= expression
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_expression_in_expression998);
							expr2=expression();
							state._fsp--;

							adaptor.addChild(root_1, expr2.getTree());

							 retval.type = "void"; toolbox.checkPrintVoid((expr2!=null?((ChronosChecker.expression_return)expr2).type:null), expr2); 
							}
							break;

						default :
							break loop5;
						}
					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 20 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:97:7: ^( READ id1= IDENTIFIER (id2= IDENTIFIER )* )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					READ24=(CommonTree)match(input,READ,FOLLOW_READ_in_expression1034); 
					READ24_tree = (CommonTree)adaptor.dupNode(READ24);


					root_1 = (CommonTree)adaptor.becomeRoot(READ24_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1038); 
					id1_tree = (CommonTree)adaptor.dupNode(id1);


					adaptor.addChild(root_1, id1_tree);

					 retval.type = toolbox.getReadType(id1); 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:98:13: (id2= IDENTIFIER )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==IDENTIFIER) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:98:14: id2= IDENTIFIER
							{
							_last = (CommonTree)input.LT(1);
							id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1083); 
							id2_tree = (CommonTree)adaptor.dupNode(id2);


							adaptor.addChild(root_1, id2_tree);

							 if (toolbox.checkRead(id2)) {
							                                                          retval.type = "void"; };
							                                                    
							}
							break;

						default :
							break loop6;
						}
					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 21 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:101:7: ^( IF (d= decl_stat_blocks )* ext= exprthen )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IF25=(CommonTree)match(input,IF,FOLLOW_IF_in_expression1130); 
					IF25_tree = (CommonTree)adaptor.dupNode(IF25);


					root_1 = (CommonTree)adaptor.becomeRoot(IF25_tree, root_1);

					 toolbox.tbOpenScope(); 
					match(input, Token.DOWN, null); 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:102:14: (d= decl_stat_blocks )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==AND||LA7_0==BECOMES||LA7_0==CHARACTER||LA7_0==CONST||LA7_0==DIV||(LA7_0 >= EQ && LA7_0 <= IF)||LA7_0==LE||(LA7_0 >= LT && LA7_0 <= PRINT)||LA7_0==READ||LA7_0==TRUE||LA7_0==VAR||LA7_0==WHILE) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:102:14: d= decl_stat_blocks
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_decl_stat_blocks_in_expression1189);
							d=decl_stat_blocks();
							state._fsp--;

							adaptor.addChild(root_1, d.getTree());

							}
							break;

						default :
							break loop7;
						}
					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_exprthen_in_expression1194);
					ext=exprthen();
					state._fsp--;

					adaptor.addChild(root_1, ext.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkBool((d!=null?((ChronosChecker.decl_stat_blocks_return)d).type:null), d);
					                                                      retval.type = (ext!=null?((ChronosChecker.exprthen_return)ext).type:null);
					                                                      toolbox.tbCloseScope();
					                                                    
					}
					break;
				case 22 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:106:7: ^( WHILE (d= decl_stat_blocks )* exprdo )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					WHILE26=(CommonTree)match(input,WHILE,FOLLOW_WHILE_in_expression1212); 
					WHILE26_tree = (CommonTree)adaptor.dupNode(WHILE26);


					root_1 = (CommonTree)adaptor.becomeRoot(WHILE26_tree, root_1);

					 toolbox.tbOpenScope(); 
					match(input, Token.DOWN, null); 
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:107:13: (d= decl_stat_blocks )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==AND||LA8_0==BECOMES||LA8_0==CHARACTER||LA8_0==CONST||LA8_0==DIV||(LA8_0 >= EQ && LA8_0 <= IF)||LA8_0==LE||(LA8_0 >= LT && LA8_0 <= PRINT)||LA8_0==READ||LA8_0==TRUE||LA8_0==VAR||LA8_0==WHILE) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:107:13: d= decl_stat_blocks
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_decl_stat_blocks_in_expression1267);
							d=decl_stat_blocks();
							state._fsp--;

							adaptor.addChild(root_1, d.getTree());

							}
							break;

						default :
							break loop8;
						}
					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_exprdo_in_expression1270);
					exprdo27=exprdo();
					state._fsp--;

					adaptor.addChild(root_1, exprdo27.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 toolbox.checkBool((d!=null?((ChronosChecker.decl_stat_blocks_return)d).type:null), d);
					                                                      retval.type = "void";
					                                                      toolbox.tbCloseScope();
					                                                    
					}
					break;
				case 23 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:111:7: o= operand
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operand_in_expression1296);
					o=operand();
					state._fsp--;

					adaptor.addChild(root_0, o.getTree());

					 retval.type = (o!=null?((ChronosChecker.operand_return)o).type:null); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class exprdo_return extends TreeRuleReturnScope {
		public String type = "";;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exprdo"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:114:1: exprdo returns [ String type = \"\"; ] : ^( DO (dsb= decl_stat_blocks )* ) ;
	public final ChronosChecker.exprdo_return exprdo() throws RecognitionException {
		ChronosChecker.exprdo_return retval = new ChronosChecker.exprdo_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DO28=null;
		TreeRuleReturnScope dsb =null;

		CommonTree DO28_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:115:3: ( ^( DO (dsb= decl_stat_blocks )* ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:115:7: ^( DO (dsb= decl_stat_blocks )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DO28=(CommonTree)match(input,DO,FOLLOW_DO_in_exprdo1406); 
			DO28_tree = (CommonTree)adaptor.dupNode(DO28);


			root_1 = (CommonTree)adaptor.becomeRoot(DO28_tree, root_1);

			 toolbox.tbOpenScope();  
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:116:14: (dsb= decl_stat_blocks )*
				loop10:
				while (true) {
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==AND||LA10_0==BECOMES||LA10_0==CHARACTER||LA10_0==CONST||LA10_0==DIV||(LA10_0 >= EQ && LA10_0 <= IF)||LA10_0==LE||(LA10_0 >= LT && LA10_0 <= PRINT)||LA10_0==READ||LA10_0==TRUE||LA10_0==VAR||LA10_0==WHILE) ) {
						alt10=1;
					}

					switch (alt10) {
					case 1 :
						// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:116:14: dsb= decl_stat_blocks
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_decl_stat_blocks_in_exprdo1464);
						dsb=decl_stat_blocks();
						state._fsp--;

						adaptor.addChild(root_1, dsb.getTree());

						}
						break;

					default :
						break loop10;
					}
				}

				 toolbox.tbCloseScope(); 
				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprdo"


	public static class exprthen_return extends TreeRuleReturnScope {
		public String type = "";;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exprthen"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:119:1: exprthen returns [ String type = \"\"; ] : ^( THEN (dsb= decl_stat_blocks )* (expr2= exprelse )? ) ;
	public final ChronosChecker.exprthen_return exprthen() throws RecognitionException {
		ChronosChecker.exprthen_return retval = new ChronosChecker.exprthen_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree THEN29=null;
		TreeRuleReturnScope dsb =null;
		TreeRuleReturnScope expr2 =null;

		CommonTree THEN29_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:120:3: ( ^( THEN (dsb= decl_stat_blocks )* (expr2= exprelse )? ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:120:7: ^( THEN (dsb= decl_stat_blocks )* (expr2= exprelse )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			THEN29=(CommonTree)match(input,THEN,FOLLOW_THEN_in_exprthen1510); 
			THEN29_tree = (CommonTree)adaptor.dupNode(THEN29);


			root_1 = (CommonTree)adaptor.becomeRoot(THEN29_tree, root_1);

			 toolbox.tbOpenScope(); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:121:15: (dsb= decl_stat_blocks )*
				loop11:
				while (true) {
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==AND||LA11_0==BECOMES||LA11_0==CHARACTER||LA11_0==CONST||LA11_0==DIV||(LA11_0 >= EQ && LA11_0 <= IF)||LA11_0==LE||(LA11_0 >= LT && LA11_0 <= PRINT)||LA11_0==READ||LA11_0==TRUE||LA11_0==VAR||LA11_0==WHILE) ) {
						alt11=1;
					}

					switch (alt11) {
					case 1 :
						// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:121:15: dsb= decl_stat_blocks
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_decl_stat_blocks_in_exprthen1566);
						dsb=decl_stat_blocks();
						state._fsp--;

						adaptor.addChild(root_1, dsb.getTree());

						}
						break;

					default :
						break loop11;
					}
				}

				 toolbox.tbCloseScope(); 
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:122:12: (expr2= exprelse )?
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==ELSE) ) {
					alt12=1;
				}
				switch (alt12) {
					case 1 :
						// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:122:13: expr2= exprelse
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_exprelse_in_exprthen1604);
						expr2=exprelse();
						state._fsp--;

						adaptor.addChild(root_1, expr2.getTree());

						}
						break;

				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			   try {
			                                                            retval.type = toolbox.compareTypes((dsb!=null?((ChronosChecker.decl_stat_blocks_return)dsb).type:null), dsb, (expr2!=null?((ChronosChecker.exprelse_return)expr2).type:null), expr2);
			                                                        } catch(Exception e) {
			                                                            retval.type = "void";
			                                                        }
			                                                    
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprthen"


	public static class exprelse_return extends TreeRuleReturnScope {
		public String type = "";;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exprelse"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:130:1: exprelse returns [ String type = \"\"; ] : ^( ELSE (dsb= decl_stat_blocks )* ) ;
	public final ChronosChecker.exprelse_return exprelse() throws RecognitionException {
		ChronosChecker.exprelse_return retval = new ChronosChecker.exprelse_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ELSE30=null;
		TreeRuleReturnScope dsb =null;

		CommonTree ELSE30_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:131:3: ( ^( ELSE (dsb= decl_stat_blocks )* ) )
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:131:7: ^( ELSE (dsb= decl_stat_blocks )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ELSE30=(CommonTree)match(input,ELSE,FOLLOW_ELSE_in_exprelse1651); 
			ELSE30_tree = (CommonTree)adaptor.dupNode(ELSE30);


			root_1 = (CommonTree)adaptor.becomeRoot(ELSE30_tree, root_1);

			 toolbox.tbOpenScope(); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:132:14: (dsb= decl_stat_blocks )*
				loop13:
				while (true) {
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==AND||LA13_0==BECOMES||LA13_0==CHARACTER||LA13_0==CONST||LA13_0==DIV||(LA13_0 >= EQ && LA13_0 <= IF)||LA13_0==LE||(LA13_0 >= LT && LA13_0 <= PRINT)||LA13_0==READ||LA13_0==TRUE||LA13_0==VAR||LA13_0==WHILE) ) {
						alt13=1;
					}

					switch (alt13) {
					case 1 :
						// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:132:14: dsb= decl_stat_blocks
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_decl_stat_blocks_in_exprelse1706);
						dsb=decl_stat_blocks();
						state._fsp--;

						adaptor.addChild(root_1, dsb.getTree());

						}
						break;

					default :
						break loop13;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.type = (dsb!=null?((ChronosChecker.decl_stat_blocks_return)dsb).type:null); toolbox.tbCloseScope(); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprelse"


	public static class type_return extends TreeRuleReturnScope {
		public String type = "";;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:135:1: type returns [String type = \"\";] : ( INTEGER | CHAR | BOOLEAN | VOID );
	public final ChronosChecker.type_return type() throws RecognitionException {
		ChronosChecker.type_return retval = new ChronosChecker.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree INTEGER31=null;
		CommonTree CHAR32=null;
		CommonTree BOOLEAN33=null;
		CommonTree VOID34=null;

		CommonTree INTEGER31_tree=null;
		CommonTree CHAR32_tree=null;
		CommonTree BOOLEAN33_tree=null;
		CommonTree VOID34_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:136:5: ( INTEGER | CHAR | BOOLEAN | VOID )
			int alt14=4;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt14=1;
				}
				break;
			case CHAR:
				{
				alt14=2;
				}
				break;
			case BOOLEAN:
				{
				alt14=3;
				}
				break;
			case VOID:
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:136:9: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INTEGER31=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_type1754); 
					INTEGER31_tree = (CommonTree)adaptor.dupNode(INTEGER31);


					adaptor.addChild(root_0, INTEGER31_tree);

					 retval.type = "int";  
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:137:9: CHAR
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					CHAR32=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_type1774); 
					CHAR32_tree = (CommonTree)adaptor.dupNode(CHAR32);


					adaptor.addChild(root_0, CHAR32_tree);

					 retval.type = "char"; 
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:138:9: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					BOOLEAN33=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1797); 
					BOOLEAN33_tree = (CommonTree)adaptor.dupNode(BOOLEAN33);


					adaptor.addChild(root_0, BOOLEAN33_tree);

					 retval.type = "bool"; 
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:139:9: VOID
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					VOID34=(CommonTree)match(input,VOID,FOLLOW_VOID_in_type1817); 
					VOID34_tree = (CommonTree)adaptor.dupNode(VOID34);


					adaptor.addChild(root_0, VOID34_tree);

					 retval.type = "void"; 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class operand_return extends TreeRuleReturnScope {
		public String type = "";;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:142:1: operand returns [String type = \"\";] : ( FALSE | TRUE | CHARACTER | NUMBER | ^(id= IDENTIFIER ) );
	public final ChronosChecker.operand_return operand() throws RecognitionException {
		ChronosChecker.operand_return retval = new ChronosChecker.operand_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree FALSE35=null;
		CommonTree TRUE36=null;
		CommonTree CHARACTER37=null;
		CommonTree NUMBER38=null;

		CommonTree id_tree=null;
		CommonTree FALSE35_tree=null;
		CommonTree TRUE36_tree=null;
		CommonTree CHARACTER37_tree=null;
		CommonTree NUMBER38_tree=null;

		try {
			// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:143:3: ( FALSE | TRUE | CHARACTER | NUMBER | ^(id= IDENTIFIER ) )
			int alt15=5;
			switch ( input.LA(1) ) {
			case FALSE:
				{
				alt15=1;
				}
				break;
			case TRUE:
				{
				alt15=2;
				}
				break;
			case CHARACTER:
				{
				alt15=3;
				}
				break;
			case NUMBER:
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
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:143:7: FALSE
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					FALSE35=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_operand1857); 
					FALSE35_tree = (CommonTree)adaptor.dupNode(FALSE35);


					adaptor.addChild(root_0, FALSE35_tree);

					 retval.type = "bool"; 
					}
					break;
				case 2 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:144:7: TRUE
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TRUE36=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_operand1879); 
					TRUE36_tree = (CommonTree)adaptor.dupNode(TRUE36);


					adaptor.addChild(root_0, TRUE36_tree);

					 retval.type = "bool"; 
					}
					break;
				case 3 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:145:7: CHARACTER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					CHARACTER37=(CommonTree)match(input,CHARACTER,FOLLOW_CHARACTER_in_operand1902); 
					CHARACTER37_tree = (CommonTree)adaptor.dupNode(CHARACTER37);


					adaptor.addChild(root_0, CHARACTER37_tree);

					 retval.type = "char"; 
					}
					break;
				case 4 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:146:7: NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					NUMBER38=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand1920); 
					NUMBER38_tree = (CommonTree)adaptor.dupNode(NUMBER38);


					adaptor.addChild(root_0, NUMBER38_tree);

					 retval.type = "int";  
					}
					break;
				case 5 :
					// C:\\Users\\Herman\\Development\\Java\\eclipse_workspace\\VertalerbouwEindopdracht\\src\\chronos\\ChronosChecker.g:147:7: ^(id= IDENTIFIER )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1944); 
					id_tree = (CommonTree)adaptor.dupNode(id);


					root_1 = (CommonTree)adaptor.becomeRoot(id_tree, root_1);

					 retval.type = toolbox.getType(id); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		    

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
		    

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program85 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_program87 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_declaration_in_decl_stat_blocks116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_decl_stat_blocks148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_declaration_in_declaration193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_declaration215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_constant_declaration252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant_declaration256 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_constant_declaration260 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_variable_declaration296 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variable_declaration300 = new BitSet(new long[]{0x0100000008000180L});
	public static final BitSet FOLLOW_type_in_variable_declaration304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUSU_in_expression348 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression352 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUSU_in_expression385 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression389 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expression421 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression425 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expression460 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression464 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression468 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expression486 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression490 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression494 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expression511 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression515 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression519 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expression535 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression539 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression543 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_expression558 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression562 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression566 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expression582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression586 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression590 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expression607 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression611 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_expression632 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression636 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression640 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression657 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression661 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression665 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GE_in_expression683 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression687 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression691 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression711 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression715 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression719 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_in_expression737 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression741 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression745 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expression763 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression767 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression771 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expression789 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression793 = new BitSet(new long[]{0x02209FFE27F08250L});
	public static final BitSet FOLLOW_expression_in_expression797 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDESTBLOCK_in_expression814 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression867 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_PRINT_in_expression954 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression958 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_expression_in_expression998 = new BitSet(new long[]{0x02209FFE27F08258L});
	public static final BitSet FOLLOW_READ_in_expression1034 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression1038 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression1083 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_IF_in_expression1130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1189 = new BitSet(new long[]{0x02B09FFE27F0A250L});
	public static final BitSet FOLLOW_exprthen_in_expression1194 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_expression1212 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_expression1267 = new BitSet(new long[]{0x02A09FFE27F1A250L});
	public static final BitSet FOLLOW_exprdo_in_expression1270 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expression1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_exprdo1406 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprdo1464 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_THEN_in_exprthen1510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprthen1566 = new BitSet(new long[]{0x02A09FFE27F2A258L});
	public static final BitSet FOLLOW_exprelse_in_exprthen1604 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_exprelse1651 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_stat_blocks_in_exprelse1706 = new BitSet(new long[]{0x02A09FFE27F0A258L});
	public static final BitSet FOLLOW_INTEGER_in_type1754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type1774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type1797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type1817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operand1879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_in_operand1902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1944 = new BitSet(new long[]{0x0000000000000004L});
}
