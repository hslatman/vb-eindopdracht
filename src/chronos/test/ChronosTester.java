package chronos.test;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import chronos.Chronos;
import chronos.ChronosChecker;
import chronos.ChronosJAMAdministrator;
import chronos.ChronosJAMGenerator;
import chronos.ChronosLexer;
import chronos.ChronosParser;
import chronos.ChronosTAMGenerator;
import chronos.utils.error.ChronosCheckerErrorReporter;
import chronos.utils.error.ChronosParserErrorReporter;
import chronos.utils.error.IChronosErrorReporter;
import chronos.utils.logging.ChronosLogFactory;

/**
 * De klasse ChronosTester wordt gebruikt om ChronosTestCases te draaien. Per test stage
 * worden er Chronos programma's ingeladen om te testen. Na elke stage wordt vergeleken of het aantal
 * succesvolle tests overeenkomt met het totaal aantal tests. Als dit het geval is, gaat de 
 * ChronosTester verder met het testen van de volgende stage. Per ChronosTestCase wordt bekeken of er 
 * foutmeldingen zijn; deze worden in een bestand met gegenereerde output weggeschreven.
 * De ChronosTester bevat vier stages: 1 -> syntactisch, 2 -> contextueel, 3 -> TAM code, 4 -> JAM code
 * Het is van belang dat een testcase voldoet aan alle voorgaande teststages
 * @author Herman Slatmen & Martijn Roo
 */
public class ChronosTester {
	
	/**
	 * Een lijst van ChronosTestCases
	 */
	private ArrayList<ChronosTestCase> cases;
	
	/**
	 * Logger die meldingen naar System.err print
	 */
	private Logger logger;
	
    /**
     * Variabele die gebruikt wordt om de huidige
     * test stage bij te houden
     */
    private int testStage = 0;
    
    /**
     * Bevat een ChronosParserErrorReporter die gebruikt wordt om fouten
     * tijdens het syntactisch checken op te slaan en op te vragen
     */
    private ChronosParserErrorReporter cper = new ChronosParserErrorReporter();
    
    /**
     * Bevat een ChronosCheckerErrorReporter die gebruikt wordt om fouten
     * tijdens het semantisch checken op te slaan en op te vragen
     */
    private ChronosCheckerErrorReporter ccer = new ChronosCheckerErrorReporter();
	
    
    /**
     * Constructor voor de ChronosTester. Zal instantievariabelen van de logger en cases initialiseren
     * Zal daarnaast voor de correcte test stage ChronosTestCases toevoegen en daarna draaien. 
     * Als voor een bepaalde test stage het aantal succesvolle ChronosTestCases niet overeenkomt
     * met het totale aantal ChronosTestCases voor die stage, zal de volgende test stage niet
     * gestart worden. Als alle ChronosTestCases succesvol waren in de stage, zal de volgende test
     * stage gestart worden, met zijn eigen ChronosTestCases.
     */
	public ChronosTester(){

		logger = ChronosLogFactory.getInstance();
		
		cases = new ArrayList<ChronosTestCase>();
		prepareTests("1_syntactic"); //first, the syntactic tests are added

		for (ChronosTestCase ctc : cases){
			runTestCase(ctc, testStage, false);
			File f = processOutput(ctc, cper);
			ctc.setGeneratedOutput(f); 
		}
				
		int numberOfSucces = checkTestCases(cases);
		
		if (numberOfSucces == cases.size()){
			
			testStage++;
			
			cases = new ArrayList<ChronosTestCase>(); //wipe the old list
			prepareTests("2_contextual");
			
			for (ChronosTestCase ctc : cases){
				runTestCase(ctc, testStage, false);
				File f = processOutput(ctc, ccer);
				ctc.setGeneratedOutput(f); 
			}
			
			numberOfSucces = checkTestCases(cases);
			
		} else {
			logger.info("errors found during syntactic checking!");
		}
		
		if (numberOfSucces == cases.size()){

			testStage++;
			
			cases = new ArrayList<ChronosTestCase>(); //wipe the old list
			prepareTests("3_tamcode");

			for (ChronosTestCase ctc : cases){
				
	    		try {
	    			System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(ctc.getTestFile().getPath() + ".tasm")), true));
	    		} catch (FileNotFoundException e) {
	    			logger.warning(e.getMessage());
	    		}
				
				runTestCase(ctc, testStage, false);
				ctc.setGeneratedOutput(new File(ctc.getTestFile().getPath() + ".tasm"));
			}
			
			numberOfSucces = checkTestCases(cases);
			
		} else {
			logger.info("errors found during semantic checking!");
		}
		
		if (numberOfSucces == cases.size()){

			testStage++;
			
			cases = new ArrayList<ChronosTestCase>(); //wipe the old list
			prepareTests("4_jamcode");
			
			for (ChronosTestCase ctc : cases){
				
	    		try {
	    			System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(ctc.getTestFile().getPath() + ".jasm")), true));
	    		} catch (FileNotFoundException e) {
	    			logger.warning(e.getMessage());
	    		}
				
	    		boolean jasmin = true; //boolean voor jasmin code generatie
	    		
				runTestCase(ctc, testStage, jasmin);
				ctc.setGeneratedOutput(new File(ctc.getTestFile().getPath() + ".jasm"));
			}
			
			numberOfSucces = checkTestCases(cases);
			
			
		} else {
			logger.info("errors found during TAM code generation!");
		}
		
		
		if (numberOfSucces == cases.size()){
			logger.info("all test stages succesfully completed!");
			logger.info("Chronos compiler seems to be working just fine :-)");
		} else {
			logger.info("errors found during JAM code generation!");
		}
		
	}
	
	/**
	 * De methode prepareTests prepareert de ChronosTestCases voor
	 * een bepaalde pass (of: test stage). De methode zal voor een bepaalde
	 * test stage alle onderliggende folders scannen en deze folders doorgeven
	 * aan de addTests methode
	 * @param pass String-representatie van de test stage
	 */
	private void prepareTests(String pass){
		
		File file = new File("test" + File.separator + pass);
		
		String[] directories = file.list(new FilenameFilter(){
			
			@Override
			public boolean accept(File dir, String name){
				return new File(dir, name).isDirectory();
			}
			
		});
		
		for (String tf : directories){
			
			String s = file.getAbsolutePath() + File.separator + tf;
			addTests(new File(s));
		}
		
		logger.info(cases.size() + " ChronosTestCases added for teststage: " + pass);
	}
	
	/**
	 * De methode addTests voegt ChronosTestCases toe aan de ArrayList<ChronosTestCase> cases.
	 * Welke testcases toegevoegd worden hangt af van het argument dat gespecificeerd wordt bij 
	 * aanroep van de methode. Het argument dient een folder te zijn. Vervolgens worden voor alle
	 * bestanden die eindigen op .era (Chronos extensie), ChronosTestCases toegevoegd met 
	 * bijbehorende verwachte uitkomst. Als deze verwachte uitkomst niet aanwezig is, wordt een 
	 * foutmelding gelogd
	 * @param f1 File die een folder beschrijft waaronder Chronos test programma's opgeslagen liggen
	 */
	private void addTests(File f1){
		File folder = f1;
		File[] listTests = folder.listFiles();
		for (File f : listTests){
			if ( f.isFile() ){
				String fname = f.getName().toString().toLowerCase();
				if (fname.endsWith(".era")){
					File xoutFile = new File(f.getPath()+".xout");
					ChronosTestCase ctc = new ChronosTestCase(f);
					if (xoutFile.exists()){
						//found corresponding xout file...
						ctc.setExpectedOutput(xoutFile);
						cases.add(ctc);
					} else {
						logger.info("No corresponding expected output found for " + ctc);
					}		
				} 
			}
		}
	}
	
	/**
	 * De methode runTestCase draait een ChronosTestCase. Voor deze ChronosTestCase
	 * worden afhankelijk van de test stage de lexer/parser (1), de lexer/parser en checker (2)
	 * of de lexer/parser, checker en TAM generator (3) uitgevoerd. 
	 * @param ctc de ChronosTestCase die gedraaid dient te worden
	 * @param stage int die een test stage beschrijft: 1 -> syntax, 2 -> syntax & context,
	 * 											3 -> syntax, context & code generatie
	 */
	private void runTestCase(ChronosTestCase ctc, int stage, boolean jasmin){
		try {
			InputStream in = new FileInputStream(ctc.getTestFile());
            ChronosLexer lexer = new ChronosLexer(new ANTLRInputStream(in));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ChronosParser parser = new ChronosParser(tokens);
            
            cper = new ChronosParserErrorReporter();
            ccer = new  ChronosCheckerErrorReporter();
            
            parser.setErrorReporter(cper);
            
            ChronosParser.program_return result = parser.program();
            CommonTree tree = (CommonTree) result.getTree();
            
            if (stage >= 1) {
                CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
                ChronosChecker checker = new ChronosChecker(nodes);
                checker.setErrorReporter(ccer);
                checker.program();
            }

            if (stage >= 2 && !jasmin) {
            	CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            	ChronosTAMGenerator generator = new ChronosTAMGenerator(nodes);
            	generator.program();
            }
            
            if (stage >= 3 && jasmin){
            	
            	CommonTreeNodeStream nodes1 = new CommonTreeNodeStream(tree);
            	ChronosJAMAdministrator administrator = new ChronosJAMAdministrator(nodes1);
            	administrator.program(); //administrator
            	
            	CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
            	ChronosJAMGenerator generator = new ChronosJAMGenerator(nodes);
            	
            	
    			String fname = Chronos.getJAMFileName(ctc.getTestFile().getPath());
            	generator.setClassName(fname);
            	
            	generator.setNumberOfConsts(administrator.getConstCount());
            	generator.setNumberOfVars(administrator.getVarCount());
            	generator.setStackSize(administrator.getMaxStackSize());
            	generator.setReadFound(administrator.containsRead());
            	
            	generator.printJAMHeader(fname);
            	
            	generator.program();
            }
            
            
		} catch (FileNotFoundException e) {
			logger.severe(e.getMessage());
		} catch (IOException e) {
			logger.severe(e.getMessage());
		} catch (RecognitionException e) {
			System.err.println("afgevangen" + e);
			logger.severe(e.getMessage());
		}
	}
	
	/**
	 * De methode processOutput kan de output van een klasse die de IChronosErrorReporter
	 * implementeert verwerken. Hierbij wordt een bestand geschreven in dezelfde folder als
	 * het Chronos programma dat getest wordt. Dit bestand zal de .gout extensie hebben.
	 * @param ctc de ChronosTestCase die verwerkt dient te worden
	 * @param er de klasse IChronosErrorReporter die de fouten van de parser of checker bevat
	 * @return File die de gegenereerde output bevat
	 */
    private File processOutput(ChronosTestCase ctc, IChronosErrorReporter er){
    	File file = new File(ctc.getTestFile().getPath() + ".gout");
    	
		if (!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				logger.warning(e.getMessage());
			}
		} 
		
		 BufferedWriter output = null;
		 
		 try {
			 output = new BufferedWriter(new FileWriter(file));
		 } catch (IOException e1) {
			 logger.warning(e1.getMessage());
		 }
		 
		for (Map.Entry<String, String> entry: er.getErrors().entrySet()){
	       	try {
	       		if ( er instanceof ChronosParserErrorReporter ){
	       			output.write(entry.getKey()+ " "+entry.getValue()+ "\r\n");
	       		} else {
	       			output.write(entry.getKey()+"\r\n");
	       		}
				
			} catch (IOException e) {
				logger.warning(e.getMessage());
			}
		}
		
		try {
			output.close();
		} catch (IOException e) {
			logger.warning(e.getMessage());
		}
    	
    	return file;
    }
	
	/**
	 * De methode checkTestCases zal voor een ArrayList van ChronosTestCases 
	 * checken of deze succesvol uitgevoerd is. Daarbij wordt het aantal correct uitgevoerde
	 * ChronosTestCases bijgehouden
	 * @param ctcs ArrayList<ChronosTestCase> met de tests die gecheckt dienen te worden
	 * @return het aantal tests dat succesvol was
	 */
	private int checkTestCases(ArrayList<ChronosTestCase> ctcs){
		int count = 0;
		for (ChronosTestCase ctc : ctcs){
			if (ctc.isSucces()){
				count++;
				logger.info(ctc + " succesful");
			} else {
				//loop over errors:
				logger.info(ctc + " was not succesful");
			}
		}
		return count;
	}
	
	/**
	 * De main-methode van de ChronosTester maakt een nieuwe ChronosTester aan
	 * Deze zal alle tests die beschikbaar zijn in de 'tests' folder prepareren
	 * en daarna alle tests uitvoeren. 
	 * @param args standaard commandline opties; ChronosTester heeft geen argumenten nodig
	 */
	public static void main(String[] args){
		new ChronosTester();
		System.exit(1);
	}
	
}
