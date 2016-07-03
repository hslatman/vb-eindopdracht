package chronos;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import chronos.tam.Assembler;
import chronos.utils.error.ChronosCheckerErrorReporter;
import chronos.utils.error.ChronosParserErrorReporter;
import chronos.utils.exceptions.ChronosException;
import chronos.utils.logging.ChronosLogFactory;


/**
 * Hoofdklasse van de compiler voor Chronos. Deze klasse bevat de main-methode van de compiler.
 * De klasse dient aangeroepen te worden met commandline opties, waarbij het laatste 
 * commandline argument het bestand dat gecompileerd dient te worden dient te zijn.
 * Overige commandline opties zijn -nofile, -jasm en -logfile.
 * 
 * Deze klasse is sterk gebaseerd op de klassen zoals die tijdens
 * het practicum beschikbaar waren
 * @author Herman Slatman & Martijn Roo
 */
public class Chronos {
	
	/**
	 * Bevat de geldige commandline opties voor de compiler voor Chronos
	 * 
	 */
    private static final Set<Option> options = EnumSet.noneOf(Option.class);
    
    /**
     * Bevat de inputFile die door de compiler verwerkt moet worden
     */
    private static String inputFile;
    
    /**
     * Bevat de Logger die door de compiler gebruikt kan worden om foutmeldingen te printen
     */
    private static Logger logger;
    

	/**
	 * Mainmethode om de compiler te starten. Deze methode zal de aanwezige commandline 
	 * opties parsen en een logger aanmaken. Daarna begint het lexen en parsen van de inputFile.
	 * Als de compiler foutloos door het parsen komt, zal de ChronosChecker starten. Wanneer ook deze
	 * fase foutloos doorlopen wordt, zal de compiler code gaan genereren. Dit zal standaard TAM code zijn
	 * die naar een bestand geprint wordt. Met de optie -nofile wordt afgedwongen dat de output op de 
	 * console geprint wordt. Met de optie -jasm zal de output Jasmin code zijn, standaard naar een bestand,
	 * maar in combinatie met -nofile naar de console. De optie -logfile zorgt ervoor dat er debug
	 * informatie naar het bestand chronos-debug.log wordt geschreven
	 * @param args de commandline argumenten om de compiler aan te roepen
	 * 			toegestane argumenten: -nofile, -jasm, -logfile
	 * 			laatste argument dient het te compileren bestand te zijn.
	 */
	public static void main(String[] args) {
		
		parseOptions(args);
		
		if (options.contains(Option.LOGFILE)){
			logger = ChronosLogFactory.getWritingInstance();
		} else {
			logger = ChronosLogFactory.getInstance();
		}
		
		try {
            InputStream in = inputFile == null ? System.in : new FileInputStream(inputFile);
            logger.info("ChronosLexer started");
            ChronosLexer lexer = new ChronosLexer(new ANTLRInputStream(in));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            logger.info("ChronosLexer finished");
            ChronosParser parser = new ChronosParser(tokens);
            
            ChronosParserErrorReporter rpt = new ChronosParserErrorReporter();
            parser.setErrorReporter(rpt);
            
            logger.info("ChronosParser started");
            ChronosParser.program_return result = parser.program();
            CommonTree tree = (CommonTree) result.getTree();
            
            if (!rpt.getErrors().isEmpty()){     
            	logger.info("ChronosParser finished: parsing errors found:");
            	for (Map.Entry<String, String> entry : rpt.getErrors().entrySet()){
            		logger.warning("Parsing error: " + entry.getKey() + " " + entry.getValue());
            	}
            } else {
            	logger.info("ChronosParser finished: no parsing errors found");
            }

            ChronosCheckerErrorReporter ccer = new ChronosCheckerErrorReporter();
            if (rpt.getErrors().isEmpty()) {      // check the AST
            	logger.info("ChronosChecker started");
                CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
                ChronosChecker checker = new ChronosChecker(nodes);
                
                checker.setErrorReporter(ccer);
                
                checker.program();
                
                if (!ccer.getErrors().isEmpty()){
                    logger.info("ChronosChecker finished: checking errors found:");
                	for (Map.Entry<String, String> entry : ccer.getErrors().entrySet()){
                		System.err.println("error: " + entry);
                		logger.warning(entry.getKey() + " " + entry.getValue());
                	}
                } else {
                	logger.info("ChronosChecker finished: no checking errors found");
                }
                
            } else {
            	if(!rpt.getErrors().isEmpty()){
            		logger.info("ChronosChecker was not started because errors were found during parsing!");
            	}
            }
            
            if ( !options.contains(Option.JASM) && ccer.getErrors().isEmpty() && rpt.getErrors().isEmpty() ) {
            	logger.info("ChronosTAMGenerator started");

            	CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            	ChronosTAMGenerator generator = new ChronosTAMGenerator(nodes);
            	
            	if (!options.contains(Option.NOFILE)){
            		try {
            			System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(inputFile + ".tasm")), true));
            		} catch (FileNotFoundException e) {
            			logger.warning(e.getMessage());
            		}
            		
                	System.out.println("; source file: " + inputFile);
                	System.out.println("; output file: " + inputFile + ".tasm");
                	System.out.println("; creation date: " + new Date());
                	System.out.println();
            	}
            	
            	generator.program();
            	logger.info("ChronosTAMGenerator finished compiling " + inputFile);
            	
            	//start assembling the file using TAM.Assembler stuff...
            	if(!options.contains(Option.NOFILE)){
            		logger.info("Chronos started compiling the TAM assembly to TAM bytecode");
            		String[] clOptions = {inputFile + ".tasm", inputFile + ".tam"};
            		Assembler.main(clOptions);
            		logger.info("Chronos finished compiling the TAM bytecode");
            	}
            	
            } else if ( options.contains(Option.JASM) && ccer.getErrors().isEmpty() && rpt.getErrors().isEmpty() ){	
            	logger.info("ChronosJAMGenerator started");
            	
            	CommonTreeNodeStream nodes1 = new CommonTreeNodeStream(tree);
            	ChronosJAMAdministrator administrator = new ChronosJAMAdministrator(nodes1);
            	administrator.program(); //administrator
            	
            	logger.info("# of constants defined: " + administrator.getConstCount());
            	logger.info("# of variables defined: " + administrator.getVarCount());
            	logger.info("determined max. stack size: " + administrator.getMaxStackSize());
            	
            	CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            	ChronosJAMGenerator generator = new ChronosJAMGenerator(nodes);
            	
    			String fname = getJAMFileName(inputFile);
    			
    			int endPath = inputFile.lastIndexOf(File.separator);
    			
    			String path = "";
    			
    			if ( endPath == -1 ){
    				endPath = 0;
    				path = inputFile.substring(0,endPath) + fname + ".jasm";
    			} else {
    				path = inputFile.substring(0,inputFile.lastIndexOf(File.separator)) + File.separator + fname + ".jasm";
    			}
            	
            	if (!options.contains(Option.NOFILE)){
            		try {
            			System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(path)), true));
            		} catch (FileNotFoundException e) {
            			logger.warning(e.getMessage());
            		}
            	}
            	
            	printJAMHeader(generator, inputFile);
            	generator.setClassName(fname);
            	
            	generator.setNumberOfConsts(administrator.getConstCount());
            	generator.setNumberOfVars(administrator.getVarCount());
            	generator.setStackSize(administrator.getMaxStackSize());
            	generator.setReadFound(administrator.containsRead());

            	generator.program();
            	
            } else {
            	if(!ccer.getErrors().isEmpty() ){
            		logger.info("Chronos didn't start compiling because errors were found during checking!");
            	}
            }
            
        } catch (ChronosException e) {
            logger.severe("ERROR: ChronosException thrown by compiler: " + e.getMessage());
        } catch (RecognitionException e) {
            logger.severe("ERROR: recognition exception thrown by compiler: " + e.getMessage());
            logger.severe("ERROR: recognition exception thrown by compiler: " + e);
        } catch (Exception e) {
            e.printStackTrace();
            logger.severe("ERROR: uncaught exception thrown by compiler: " + e.getMessage());
        }
		
	}
	
	/**
	 * Bepaalt een geschikte bestandsnaam (exclusief extensie) voor een Jasmin bestand
	 * @param s String die inputFile beschrijft
	 * @return String die een geschikte bestandsnaam is voor Jasmin (en Java)
	 */
	public static String getJAMFileName(String s){
		int sStart = s.lastIndexOf(File.separator)+1;
		
		if (sStart == -1){
			sStart = 0;
		}
		
		int sEnd = 0;
		
		if (sStart + (s.substring(sStart)).indexOf(".") > sStart){
			sEnd = sStart + (s.substring(sStart)).indexOf(".");
		} else {
			sEnd = sStart + (s.substring(sStart)).length();
		}
		
		String fname = s.substring(sStart, sEnd);
		fname = fname.substring(0,1).toUpperCase() + fname.substring(1);
		return fname;
	}
	
	/**
	 * Print een header voor Jasmin code. Deze bevat enige informatie over het bestand
	 * dat gecompileerd is en wanneer. Ook het output bestand wordt erin beschreven
	 * @param g ChronosJAMGenerator waarvoor deze header geschreven dient te worden
	 * @param s String die een bestandsnaam bevat voor een te compileren Chronos programma
	 */
	private static void printJAMHeader(ChronosJAMGenerator g, String s){
		
		String fname = getJAMFileName(s);
		
		if (!options.contains(Option.NOFILE)){
	    	System.out.println("; source file: " + s);
	    	
	    	
	    	int start = s.lastIndexOf(File.separator);
	    	
	    	String outputFile = "";
	    	
	    	if ( start == -1) {
	    		start = 0;
	    		outputFile = fname + ".jasm";
	    	} else {
	    		outputFile = s.substring(0,s.lastIndexOf(File.separator)) + File.separator + fname + ".jasm";
	    	}
	    	
	    	System.out.println("; output file: " + outputFile);
	    	System.out.println("; creation date: " + new Date());
	    	System.out.println();
		}
		
		g.printJAMHeader(fname);
		
	}
	
	/**
	 * De methode getOption parsed een argument
	 * @param text de tekst die een argument kan bevatten
	 * @return  Option </i> die een optie voorstelt
	 * @throws IllegalArgumentException
	 */
    private static Option getOption(String text) throws IllegalArgumentException {
        if (!text.startsWith(OPTION_PREFIX)) {
            return null;
        }
        String stripped = text.substring(OPTION_PREFIX.length());
        for (Option option: Option.values()) {
            if (option.getText().equals(stripped)) {
                return option;
            }
        }
        throw new IllegalArgumentException(String.format("Illegal option value '%s'", text));
    }
    
    /**
     * Parsed alle argumenten
     * @param args de argumenten die geparsed moeten worden
     */
    private static void parseOptions(String[] args) {
        if (args.length == 0) {
            System.err.println(USAGE_MESSAGE);
            System.exit(1);
        }
        for (int i=0; i<args.length; i++) {
            try {
                Option option = getOption(args[i]);
                if (option == null) {
                    if (i < args.length - 1) {
                        System.err.println("Input file name '%s' should be last argument");
                        System.exit(1);
                    } else {
                        inputFile = args[i];
                    }
                } else {
                    options.add(option);
                }
            } catch (IllegalArgumentException exc) {
                System.err.println(exc.getMessage());
                System.err.println(USAGE_MESSAGE);
                System.exit(1);
            }
        }
    }
	
    /**
     * Beschrijft hoe de Chronos compiler aangeroepen dient te worden
     */
    private static final String USAGE_MESSAGE;

    static {
        StringBuilder message = new StringBuilder("Usage:");
        for (Option option: Option.values()) {
            message.append(" [");
            message.append(option.getText());
            message.append("]");
        }
        message.append(" [filename]");
        USAGE_MESSAGE = message.toString();
    }
	
    /**
     * De geschikte opties voor de Chronos compiler
     * @author Herman Slatman & Martijn Roo
     */
    private static enum Option {
        LOGFILE,
        JASM,
        NOFILE;

        private Option() {
            this.text = name().toLowerCase();
        }

        /** Returns the option text of this option. */
        public String getText() {
            return this.text;
        }

        private final String text;
    }
    
    private static final String OPTION_PREFIX = "-";

}
