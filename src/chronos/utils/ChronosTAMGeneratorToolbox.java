package chronos.utils;

import java.util.HashMap;
import java.util.logging.Logger;

import org.antlr.runtime.tree.CommonTree;

import chronos.utils.logging.ChronosLogFactory;
import chronos.utils.symbols.ChronosIdentifierEntry;
import chronos.utils.symbols.ChronosSymbolTable;

/**
 * De klasse ChronosTAMGeneratorToolbox</i> bevat (hulp)methoden die gebruikt kunnen worden
 * door de ChronosTAMGenerator</i>. Zo zijn er bijvoorbeeld methoden om constanten en 
 * variabelen te declareren. Daarnaast bevat deze klasse alle methoden om de juiste TAM-code
 * voor elk statement te genereren.
 * @author Herman Slatman & Martijn Roo
 */
public class ChronosTAMGeneratorToolbox {

	/**
	 * Logger kan berichten en foutmeldingen weergeven
	 */
	private Logger logger = ChronosLogFactory.getInstance();
	
	/**
	 * De ChronosSymbolTable houdt informatie over Identifiers bij
	 */
	private ChronosSymbolTable table;
	
	
	/**
	 * Wordt gebruikt wanneer een label geprint dient te worden
	 */
	private String gotoLabel = "";
	
	/**
	 * Wordt gebruikt om labels een unieke naam te kunnen geven
	 */
	private int labelIterator = 0;
	
	/**
	 * Wordt gebruikt om Identifiers een uniek adres te kunnen toekennen
	 */
	private int addressPointer = 0;
	
	/**
	 * Wordt gebruikt om labels bij te houden van (geneste) if statements
	 */
	private HashMap<Integer, Integer> ifLabelMatrix = new HashMap<Integer, Integer>();
	
	/**
	 * Constructor van de ChronosTAMGeneratorToolbox
	 * Zorgt ervoor dat de ChronosSymbolTable correct geïnitaliseerd wordt
	 */
	public ChronosTAMGeneratorToolbox(){
		table = new ChronosSymbolTable();
		table.openScope(); //create the first level...IMPORTANT!
	}
	
	/**
	 * Deze methode wordt gebruikt om een commando, argument en commentaar te printen
	 * Roept de versie met vier labels aan, zodat de output in correct formaat geprint wordt
	 * Zorgt er daarnaast voor dat het gotoLabel gereset wordt
	 * @param command het commando dat geprint dient te worden
	 * @param argument het argument dat bij het argument hoort
	 * @param comment het commentaar dat voor deze regel geprint dient te worden
	 */
    private void print(String command, String argument, String comment){
        print(gotoLabel, command, argument, comment);  //call the 4 parameter version to print it to output for real. gotoLabel is used in the process
        gotoLabel = ""; //gotoLabel has to be reset, after it has been used in the previous print statement
    }
    
    /**
     * Deze methode wordt gebruikt om een label, commando, argument en commentaar te printen
     * Zorgt ervoor dat het label correct geformatteerd wordt. Daarnaast worden de overige argumenten ook
     * correct op de output gezet, zodat de code er gestructureerd uitziet.
     * @param label het label dat geprint moet worden
	 * @param command het commando dat geprint dient te worden
	 * @param argument het argument dat bij het argument hoort
	 * @param comment het commentaar dat voor deze regel geprint dient te worden
     */
    private void print(String label, String command, String argument, String comment) {
        if(label != null && !label.isEmpty()) {
            label = label + ":";  //prepare the label
        }
        System.out.format("%-10s %-12s %-14s ; %s\n", label, command, argument, comment);  //print label, command, argument and comment, nicely formatted
    }
    
    /**
     * Hulpmethode voor het aanroepen van TAM routine (CALL)
     * @param command het commando (of TAM routine) die aangeroepen dient te worden
     * @param comment het commentaar dat er bij hoort
     */
	private void printCallRoutine(String command, String comment){
		print("CALL", command, comment);
	}
	
	/**
	 * Hulpmethode voor het aanroepen van een TAM routine
	 * Roept @link printCallRoutine() aan om een TAM routine te printen
     * @param command het commando (of TAM routine) die aangeroepen dient te worden
     * @param comment het commentaar dat er bij hoort
	 */
	private void printTAMRoutine(String command, String comment){
		printCallRoutine(command, comment);
	}
    
	/**
	 * Opent een scope in de ChronosSymbolTable
	 */
    public void tbOpenScope(){
    	table.openScope();
    }
    
    /**
     * Sluit een scope in de ChronosSymbolTable
     * Daarnaast worden er zoveel adressen vrijgegeven als dat er zich in de huidige scope van de ChronosSymbolTable bevinden
     * @param popSize de grootte van de argumenten die gepopt dienen te worden
     */
    public void tbCloseScope(int popSize){
    	int sizeToPop = table.getCurrentScopeSize();
    	addressPointer = addressPointer - sizeToPop; //correctly update the addressPointer (local variables should be gone now)
    	print("POP("+Integer.toString(popSize)+")", Integer.toString(sizeToPop), "pop " + sizeToPop + " local variables on closing a scope");
    	table.closeScope();
    }
    
    /**
     * Print het einde van een TAM programma
     * Zorgt ervoor dat de laatste variabelen gepopt worden, zodat het programma correct kan stoppen
     */
    public void printEnd(){
		print("POP(0)", Integer.toString(addressPointer), "free " + addressPointer + " variables at end of program");
		print("HALT", "", "ends the program");
    }
    
    /**
     * Print een statement om variabelen te poppen bij terugkomst van een functie
     * @param returnFrom de functie waarvandaan teruggekeerd wordt
     * @param size het aantal variabelen dat gepopt dient te worden
     */
	public void printClean(String returnFrom, int size) {
		print("POP(0)", Integer.toString(size), "pop the resulting value of " + returnFrom);
	}

	/**
	 * Print de 'not' TAM routine
	 * !
	 */
	public void printNot(){
		printTAMRoutine("not", "negate the statement");
	}
	
	/**
	 * Print het UMINUS statement
	 * Het UMINUS statement zorgt voor een vermenigvuldiging van de top van de stack met -1
	 * -
	 */
	public void printUMinus(){
		print("LOADL", "-1", "load literal value -1 ");
		printTAMRoutine("mult", "multiply top of the stack with -1");
	}
	
	/**
	 * Print de 'add' TAM routine
	 * +
	 */
	public void printAdd(){
		printTAMRoutine("add", "add up the entries on the top of the stack");
	}
	
	/**
	 * Print de 'sub' TAM routine
	 * -
	 */
	public void printSub(){
		printTAMRoutine("sub", "subtract the top entries of the stack from eachother");
	}
	
	/**
	 * Print de 'or' TAM routine
	 * ||
	 */
	public void printOr(){
		printTAMRoutine("or", "or the values on the top of the stack with eachother");
	}
	
	/**
	 * Print de 'and' TAM routine
	 * &&
	 */
	public void printAnd(){
		printTAMRoutine("and", "and the values on the top of the stack with eachother");
	}
	
	/**
	 * Print de 'lt' TAM routine
	 * <
	 */
	public void printLT(){
		printTAMRoutine("lt", "less than statement");
	}
	
	/**
	 * Print de 'le' TAM routine
	 * <=
	 */
	public void printLE(){
		printTAMRoutine("le", "less or equal statement");
	}
	
	/**
	 * Print de 'gt' TAM routine
	 * >
	 */
	public void printGT(){
		printTAMRoutine("gt", "greater than statement");
	}
	
	/**
	 * Print de 'ge' TAM routine
	 * >=
	 */
	public void printGE(){
		printTAMRoutine("ge", "greater or equal statement");
	}
	
	/**
	 * Print de 'eq' TAM routine; pusht eerst de integer literal 1, als indicatie van de lengte van de arugmenten
	 * ==
	 */
	public void printEQ(){
		print("LOADL", "1", "load literal value 1 ");
		printTAMRoutine("eq", "equals statement");
	}
	
	/**
	 * Print de 'ne' TAM routine; pusht eerst de integer literal 1, als indicatie van de lengte van de arguementen
	 * !=
	 */
	public void printNEQ(){
		print("LOADL", "1", "load literal value 1 ");
		printTAMRoutine("ne", "not equals statement");
	}
	
	/**
	 * Print de 'mult' TAM routine
	 * *
	 */
	public void printMult(){
		printTAMRoutine("mult", "multiplication of the top entries on the stack");
	}
	
	/**
	 * Print de 'div' TAM routine
	 * /
	 */
	public void printDiv(){
		printTAMRoutine("div", "division of the top entries on the stack"); //add check for zero division?
	}
	
	/**
	 * Print de 'mod' TAM routine
	 * %
	 */
	public void printMod(){
		printTAMRoutine("mod", "modulus of the two top entries on the stack");
	}
	
	/**
	 * Print de waarde van de 'true' bool die op de stack geladen dient te worden
	 * Wordt intern gerepresenteerd door 1
	 */
	public void printTrue(){
		print("LOADL", "1", "load literal value 1");
	}
	
	/**
	 * Print de waarde van de 'false' bool die op de stack geladen dient te worden
	 * Wordt intern gerepresenteerd doo 0
	 */
	public void printFalse(){
		print("LOADL", "0", "load literal value 0");
	}
	
	/**
	 * Print de waarde van een getal die op de stack geladen dient te worden
	 * @param value de tekstuele weergave van het getal dat geladen moet worden
	 */
	public void printNumber(String value){
		print("LOADL", value, "load literal value " + value);
	}
	
	/**
	 * Print een karakter dat op de stack geladen dient te worden
	 * Dit karakter dient als integer literal in de vorm van ASCII waarde geladen te worden
	 * @param value de tekstuele weergave van het karakter dat geladen moet worden
	 */
	public void printChar(String value){
		print("LOADL", getASCII(value), "load literal value " + getASCII(value) + " representing " + value);
	}
	
	/**
	 * Hulpmethode die de ASCII waarde van een String oplevert
	 * @param value een String van lengte drie, bijvoorbeeld 'c'
	 * @return de ASCII waarde van het karakter op positie 1 van de String value
	 */
	private String getASCII(String value){
		return Integer.toString((int)value.charAt(1));
	}
	
	/**
	 * Print het printstatement. Dit bestaat uit een putint/put gevolgd door een puteol
	 * Bepaalt eerst of er een karakter of getal geprint dient te worden, en zal daarop de correcte statements printen
	 * @param value de waarde die geprint dient te worden
	 * 			Deze value is een dummy waarde, maar wordt wel daadwerkelijk gebruikt om te bepalen wat er geprint
	 * 			dient te worden
	 */
	public void printPrint(String value){
		if(!value.equals("")) {
			try {
				Integer.parseInt(value);
				print("LOADA", -1+"[ST]", "load address of int on top of stack");
				print("LOADI(1)", "", "get the int on the stack, again, for printing");
				printTAMRoutine("putint", "print the integer value of ");
				printTAMRoutine("puteol", "put a newline");
			} catch (NumberFormatException e) {
				print("LOADA", -1+"[ST]", "load address of char on top of stack"); //check this...
				print("LOADI(1)", "", "get the char on the stack, again, for printing");
				printTAMRoutine("put", "print the character " );
				printTAMRoutine("puteol", "put a newline");
			}
		} else {
			logger.info("expression == null..."); //should never be called, ideally....
		}
	}
	
	/**
	 * Print het read statement. Dit kan een get of getint zijn; dat hangt af van het type van de Identifier
	 * @param id CommonTree die behoort tot een Identifier in de ChronosSymbolTable
	 */
	public void printRead(CommonTree id) {
		ChronosIdentifierEntry entry = table.retrieve(id.getText());
		print("LOADA", entry.getAddress()+"[SB]", "load the address of " + id);
		if(entry.getType().equals("char")) { //we have a type char (not a constant, if checking went correct....)
			printTAMRoutine("get", "get a character value for " + id);
		} else {
			printTAMRoutine("getint", "read a numeric value for " + id);
		}	
	}

	/**
	 * Print het begin van het if-statement. Er wordt een label gegenereerd dat gebruikt wordt om de bijbehorende 
	 * then en (en optionele) else correct te kunnen instellen. De ifLabelMatrix wordt gebruikt om geneste
	 * if-statements correct uit te kunnen voeren. In de ifLabelMatrix wordt het gegenereerde label opgeslagen.
	 */
	public void printIf() {
		int currentScope = table.currentLevel();
		Integer prevLabelOnScope = ifLabelMatrix.get(currentScope);
		if(prevLabelOnScope == null) {
			prevLabelOnScope = 0;
		}
		ifLabelMatrix.put(currentScope, prevLabelOnScope + 1);
		String jumpLabel = Integer.toString(currentScope) + Integer.toString(prevLabelOnScope + 1);
		print("JUMPIF(0)", "ELSE" + jumpLabel + "[CB]", "jump to the else clause");
	}

	/**
	 * Print de end-if. Er wordt gebruikgemaakt van de ifLabelMatrix om het correcte label te kunnen 
	 * plaatsen als gotoLabel
	 */
	public void printEndIf() {
		int currentScope = table.currentLevel();
		Integer prevLabelOnScope = ifLabelMatrix.get(currentScope);
		String jumpLabel = Integer.toString(currentScope) + Integer.toString(prevLabelOnScope);
		
		if (!gotoLabel.equals("")){
			print("JUMP", "ENDIF" + jumpLabel + "[CB]","jump to the end");
		}
		gotoLabel = "ENDIF" + jumpLabel;
	}
	
	/**
	 * Print het (optionele) else deel van een if-statement. De ifLabelMatrix wordt gebruikt om het
	 * correcte label te kunnen zetten dat bij dit if-statement hoort.
	 */
	public void printIfElse() {
		int currentScope = table.currentLevel();
		Integer prevLabelOnScope = ifLabelMatrix.get(currentScope);
		String jumpLabel = Integer.toString(currentScope) + Integer.toString(prevLabelOnScope);
		
		print("JUMP", "ENDIF" + jumpLabel + "[CB]", "jump past the else clause");
		gotoLabel = "ELSE" + jumpLabel;
	}
	
	/**
	 * Print de start van een while-statement. Zal een array van type Object opleveren die twee elementen bevat
	 * @return Object[] dat informatie over dit while-statement bevat
	 * 				res[0] bevat een getal: de labelIterator
	 * 				res[1] bevat het gotoLabel waar executie van het programma moet vervolgen
	 */
	public Object[] printWhile() {
		Object[] res = new Object[2];

		if (gotoLabel.equals("")){ //set het label
			gotoLabel = "WHILE" + labelIterator;
		}
		
		res[0] = labelIterator; //label#
		res[1] = gotoLabel; //label
		
		labelIterator++;
		return res;
	}

	/**
	 * Print het einde van het while-statement. 
	 * @param whileInfo bevat de informatie die nodig is om het while-statement correct te kunnen genereren
	 */
	public void printWhileEnd(Object[] whileInfo) {
		//whileInfo[0] = label#, whileInfo[1] = label
		print("JUMP", whileInfo[1] + "[CB]", "jump to the while");
		gotoLabel = "ENDWHILE" + whileInfo[0];
	}

	/**
	 * Print de conditie waarvoor getest dient te worden en waarnaar toe executie van het while-statement moet 
	 * gaan als deze conditie klopt. Dit zorgt ervoor dat het while-statement kan stoppen
	 * @param whileInfo
	 */
	public void printWhileDo(Object[] whileInfo) {
		print("JUMPIF(0)", "ENDWHILE" + whileInfo[0] + "[CB]", "jump past the while body");
	}
	
	/**
	 * Zorgt ervoor dat variabelen die binnen een while-loop gedeclareerd worden correct
	 * worden opgeschoond
	 */
	public void printWhileEndDo() {
		int sizeToPop = table.getCurrentScopeSize();
		print("POP(0)", Integer.toString(sizeToPop), "clean the ids that were inside the while loop ");
	}
	
	/**
	 * Print het statment om een waarde van een geheugenadres in te laden
	 * Dit is in de huidge compiler hetzelfde voor constanten als variabelen
	 * @param id een CommonTree id die correspondeert met een ChronosIdentifierEntry in de ChronosSymbolTable
	 * @return String die een waarde voorstelt voor deze Identifier
	 */
	public String getValue(CommonTree id) {
		ChronosIdentifierEntry entry = table.retrieve(id.getText());
		if (entry.isConstant()){
			print("LOAD(1)", entry.getAddress()+"[SB]", "load the constant " + id.getText());
		} else {
			print("LOAD(1)", entry.getAddress()+"[SB]", "load the variable " + id.getText());
		}
		return entry.getValue().toString();
	}
	
	/**
	 * print het statement om een waarde toe te wijzen aan een variabele of constante
	 * @param id een CommonTree id die correspondeert met een ChronosIdentifierEntry in de ChronosSymbolTable 
	 * 			die een waarde dient te krijgen
	 * @param value de waarde die toegekend moet worden aan de identifier
	 * 			functioneert meer als dummy waarde
	 */
	public void assignValue(CommonTree id, String value){
		ChronosIdentifierEntry entry = table.retrieve(id.getText());
		print("STORE(1)", entry.getAddress()+"[SB]", "store in variable " + id);
		print("LOAD(1)", entry.getAddress()+"[SB]","load the variable " + id + " on the stack"); //for multiple assignment!
		entry.setValue(value);
	}
    
	/**
	 * Maakt het aanmaken van een constante definitief
	 * @param id een CommonTree id die correspondeert met een ChronosIdentifierEntry in de ChronosSymbolTable 
	 * 			deze id representeert een constante
	 * @param value de waarde die toekend wordt aan de constante
	 */
	public void putConst(CommonTree id, String value) {
		ChronosIdentifierEntry cid = table.retrieve(id.getText());
		cid.setValue(value);
		print("STORE(1)", cid.getAddress()+"[SB]", "store in variable " + id);
	}
	
	/**
	 * Creeërt een constante in de ChronosSymbolTable voor deze Identifier
	 * @param id een CommonTree id die waarvoor een ChronosIdentifierEntry aangemaakt dient te worden in de ChronosSymbolTable
	 */
	public void pushConst(CommonTree id) {
		ChronosIdentifierEntry cid = new ChronosIdentifierEntry();
		cid.setConstant();
		cid.setAddress(Integer.toString(addressPointer));
		print("PUSH", Integer.toString(1), "push constant " + id.getText() + " on the stack - constants need to be here too :-("); //remove if no constant with variables in it
		addressPointer++;
		table.enter(id.getText(), cid);
	}
	
	/**
	 * Creeërt een variabele in de ChronosSymbolTable voor deze Identifier
	 * @param id een CommonTree id die waarvoor een ChronosIdentifierEntry aangemaakt dient te worden in de ChronosSymbolTable
	 * @param type het type van de variabele dat aangemaakt dient te worden
	 */
	public void putVar(CommonTree id, String type) {
		Object init = null;
		if (type.equals("bool")){
			init = "0";
		} else if (type.equals("int")){
			init = 0;
		} else if (type.equals("char")){
			init = 'a'; //dient een char te blijven, anders 97 geprint bij niet opnieuw een waarde geven
		}
		ChronosIdentifierEntry cid = new ChronosIdentifierEntry();
		cid.setAddress(Integer.toString(addressPointer));
		cid.setValue(init);
		cid.setType(type);
		table.enter(id.getText(), cid);
		print("PUSH", Integer.toString(1), "push variable " + id.getText() + " on the stack");
		
		if (type.equals("char")){
			print("LOADL", "97", "load init value of " + id); //wel een 97 als literal op de stack laden in dit geval
		} else {
			print("LOADL", cid.getValue().toString(), "load init value of " + id);
		}
		
		print("STORE(1)", cid.getAddress()+"[SB]", "store in variable " + id);
		addressPointer++;
	}

}
