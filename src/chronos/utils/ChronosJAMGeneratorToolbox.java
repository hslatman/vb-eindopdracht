package chronos.utils;

import java.util.HashMap;
import java.util.logging.Logger;

import org.antlr.runtime.tree.CommonTree;

import chronos.utils.logging.ChronosLogFactory;
import chronos.utils.symbols.ChronosIdentifierEntry;
import chronos.utils.symbols.ChronosSymbolTable;

/**
 * De klasse ChronosJAMGeneratorToolbox</i> bevat (hulp)methoden die gebruikt kunnen worden
 * door de ChronosJAMGenerator</i>. Zo zijn er bijvoorbeeld methoden om constanten en 
 * variabelen te declareren. Daarnaast bevat deze klasse alle methoden om de juiste Jasmin-code (Java Assembly)
 * voor elk statement te genereren.
 * @author Herman Slatman & Martijn Roo
 */
public class ChronosJAMGeneratorToolbox {

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
	 * Bevat de grootte van de stack. Dit wordt in een Jasmin programma gebruikt
	 * om de maximale stack te bepalen
	 */
	private int stackSize = 0;
	
	/**
	 * Bevat het aantal lokale variabelen voor het programma. Dit wordt in een Jasmin
	 * programma gebruikt om het minimum aantal lokale vrije variabelen correct
	 * te kunnen toewijzen
	 */
	private int localSize = 0;
	
	/**
	 * De naam van de klasse waarnaar geschreven gaat worden. Dit wordt gebruikt om
	 * een aanroep naar readint() te kunnen doen, die in dezelfde klasse wordt gemaakt
	 */
	private String className = "";
	
	/**
	 * Wordt gebruikt om te bepalen of de readint() functie gegenereerd dient te worden
	 * Dit hoeft enkel te gebeuren wanneer er een read statement gevonden is
	 */
	private boolean readFound = false;
	
	/**
	 * Wordt gebruikt om labels bij te houden van (geneste) if statements
	 */
	private HashMap<Integer, Integer> ifLabelMatrix = new HashMap<Integer, Integer>();
	
	/**
	 * Constructor van de ChronosJAMGeneratorToolbox
	 * Zorgt ervoor dat de ChronosSymbolTable correct geïnitaliseerd wordt
	 */
	public ChronosJAMGeneratorToolbox(){
		table = new ChronosSymbolTable();
		table.openScope(); //create the first level...IMPORTANT!
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
    	table.closeScope();
    }
    
    /**
     * Print de header van een Jasmin file. Source, Class en Super worden correct ingesteld
     * Daarnaast wordt de standaard constructor in Jasmin code gegenereerd, zodat de klasse
     * correct aangeroepen geïnstantieerd kan worden
     * @param fname de bestandsnaam van het Jasmin bestand, bijvoorbeeld 'Basic'
     */
    public void printJAMHeader(String fname){
		space();
		printNoTab(".source " + fname + ".jasm");
    	printNoTab(".class public " + fname);
    	printNoTab(".super java/lang/Object");
    	space();
    	printNoTab("; standard class initializer");
    	printNoTab(".method public <init>()V");
    	print("aload_0");
    	print("invokenonvirtual java/lang/Object/<init>()V");		   
    	print("return");
    	printNoTab(".end method");
    	space();
    }

    /**
     * Print de start van een programma. Het Jasmin programma bevat natuurlijk als eerste een Main methode
     * die gedraaid wordt zodra de klasse aangeroepen wordt. Daarnaast wordt het aantal lokale variabelen, 
     * de maximale stackhoogte en het printen van de readmethode ingesteld
     * @param numberOfVars aantal variabelen dat gedefineerd gaat worden in het programma
     * @param numberOfConsts aantal constanten dat gedefinieerd gaat worden in het programma
     * @param stackSize de maximale hoogte van de stack
     * @param readFound boolean die aangeeft of de readint() functie geprint dient te worden
     * @param className de naam van de klasse die gegenereerd wordt
     */
	public void printProgramStart(int numberOfVars, int numberOfConsts, int stackSize, boolean readFound, String className) {
		
		this.localSize = numberOfVars + numberOfConsts;  //+2 for reading
		this.stackSize = stackSize;
		this.readFound = readFound;
		this.className = className;
		
		printNoTab(".method public static main([Ljava/lang/String;)V");
		print(".limit locals " + Integer.toString(this.localSize));
		print(".limit stack " + Integer.toString(this.stackSize));
		space();
		printComment("'start' of generated code");
		space();
	}

	/**
	 * Print een label. Zal eerst voor leesbaarheid een witregel printen
	 * @param string het label dat geprint dient te worden.
	 */
	private void printLabel(String string) {
		space();
		System.out.println(string + ":");		
	}
	
	/**
	 * Hulpmethode om een programmaregel zonder indent te printen
	 * @param string
	 */
	private void printNoTab(String string){
		System.out.println(string);
	}
	
	/**
	 * Hulpmethode voor het printen van witregels t.b.v. de leesbaarheid
	 */
	private void space(){
		System.out.println();
	}

	/**
	 * Print het einde van het programma. Er wordt een return statement geprint
	 * Daarnaast wordt er gecheckt of de readint() functie geprint dient te worden
	 * Deze wordt geprint in een eigen (statische) methode definitie
	 */
	public void printProgramEnd() {
		space();
		print("return", "'end' of generated code");
		printNoTab(".end method");
		
		if ( this.readFound ) {
			prepareReadInt(); //print the code for the read function at the end of the file
		}
	}
	
	/**
	 * Print een commando naar de uitvoer. Checkt eerst of er ook een label geprint
	 * dient te worden, en zal dit doen als dit het geval is. Daarna wordt het label 
	 * opnieuw op leeg gezet, zodat er een nieuw label geprint kan worden
	 * @param command het commando dat geprint dient te worden
	 */
	private void print(String command){
		if(!gotoLabel.equals("")){
			printLabel(gotoLabel);
			gotoLabel = "";
		}
		System.out.println("\t" + command);
	}
	
	/**
	 * Hulpmethode voor het printen van commentaar
	 * Zal eerst een witregel printen t.b.v. de leesbaarheid
	 * @param comment het commentaar dat geprint dient te worden
	 */
	private void printComment(String comment){
		space();
		print("; " + comment);
	}
	
	/**
	 * Hulpmethode om een commando en commentaar gelijktijdig te printen
	 * Commentaar zal boven het commando geprint worden
	 * @param command het commando dat geprint dient te worden
	 * @param comment het commentaar dat geprint dient te worden
	 */
	private void print(String command, String comment){
		printComment(comment);
		print(command);
	}
	
	/**
	 * Methode om het poppen van de stack te kunnen printen
	 * @param string beschrijving waarom het poppen gebeurt
	 * @param i het aantal pops dat uitgevoerd dient te worden
	 */
	public void printClean(String string, int i) {
		printComment("pop " + i + ((i == 1) ? " value" : " values")  + " from the stack for cleaning up " + string);
		for (int k = 0; k < i; k++){
			print("pop");
		}
	}
	
	/**
	 * De methode getValue zal er voor zorgen dat er een waarde uit het geheugen op de stack
	 * geladen wordt. Daarbij wordt gekeken of het een karakter is of niet. 
	 * @param id de CommonTree die bij de Identifier hoort
	 * @param print boolean om aan te geven of het statement inderdaad geprint dient te worden
	 * @return String die een (dummy) waarde bevat van de Identifier behorende bij id
	 */
	public String getValue(CommonTree id, boolean print) {
		ChronosIdentifierEntry entry = table.retrieve(id.getText());	
		if( print ){
			if ( entry.getType().equals("char") ){
				print("iload " + entry.getAddress(), "loading of variable/constant character");
			} else {
				print("iload " + entry.getAddress(), "loading of a variable/constant");
			}
		}
		return entry.getValue().toString();
	}
	
	/**
	 * De methode assignValue zal er voor zorgen dat de statements die nodig zijn voor het
	 * toewijzen van waarden aan variabelen of constanten correct geprint worden. Er wordt eerst bekeken
	 * of een Identifier een karakter is, en daarop wordt geswitcht welke statements er
	 * geprint dienen te worden
	 * @param id de CommonTree die bij de Identifier hoort
	 * @param value de waarde die aan deze Identifier toegekend wordt. Dit is in de meeste
	 * gevallen een dummy waarde
	 */
	public void assignValue(CommonTree id, String value) {
		ChronosIdentifierEntry entry = table.retrieve(id.getText());
		if(!entry.getType().equals("char")){
			print("istore " + entry.getAddress()); //store it in the address of entry
			print("iload " + entry.getAddress()); //load the value on the stack again, may be used again
		} else {
			print("istore " + entry.getAddress()); //store it in the address of entry
			print("iload " + entry.getAddress()); //load the value on the stack again, may be used again
		}
		entry.setValue(value);
	}

	/**
	 * Methode voor het daadwerkelijk declareren van een constante. Het type wordt bepaald,
	 * en aan de hand daarvan wordt het correcte statement geprint
	 * @param id de CommonTree die bij de Identifier hoort
	 * @param value de waarde die aan deze constante Identifier toekend wordt
	 */
	public void putConst(CommonTree id, String value)  {
		ChronosIdentifierEntry cid = table.retrieve(id.getText());
		cid.setValue(value);
		String type = "int";
		try { //store the definite value of a constant; may depend on variables
			Integer.parseInt(value);
			print("istore " + cid.getAddress());
		} catch (NumberFormatException e) {
			type = "char";
			print("istore " + cid.getAddress());
		}
		cid.setType(type);
	}
	
	/**
	 * Maakt een adres aan voor een constante. Deze wordt ook in de ChronosSymbolTable geplaatst
	 * @param id de CommonTree die bij de Identifier hoort
	 */
	public void pushConst(CommonTree id) {
		ChronosIdentifierEntry cid = new ChronosIdentifierEntry();
		cid.setConstant();
		cid.setAddress(Integer.toString(addressPointer)); //reserve a spot for the constant
		addressPointer++;
		table.enter(id.getText(), cid);
	}
	
	/**
	 * Methode voor het daadwerkelijk declareren van een variabele. Het type wordt bepaald,
	 * en aan de hand daarvan wordt het correcte statement geprint. Daarnaast wordt de Identifier
	 * in de ChronosSymbolTable geladen voor administratie
	 * @param id de CommonTree die bij de Identifier hoort
	 * @param type het type van de Identifier
	 */
	public void putVar(CommonTree id, String type) {
		Object init = null;
		if (type.equals("bool")){
			init = "0";
		} else if (type.equals("int")){
			init = 0;
		} else if (type.equals("char")){
			init = 'a';
		}
		ChronosIdentifierEntry cid = new ChronosIdentifierEntry();
		cid.setAddress(Integer.toString(addressPointer));
		cid.setValue(init);
		cid.setType(type);
		table.enter(id.getText(), cid);
		if (!type.equals("char")){
			print("ldc " + cid.getValue().toString());
			print("istore " + cid.getAddress());
		} else {
			print("ldc 97"); //store the init ascii waarde 97, de waarde van a
			print("istore " + cid.getAddress());
		}
		addressPointer++;
	}

	/**
	 * Methode die gebruikt wordt om een nummer op de stack te laden
	 * @param value tekstuele representatie van het te laden getal
	 */
	public void printNumber(String value) {
		print("ldc " + value);
	}
	
	/**
	 * Methode die gebruikt wordt om 'true' op de stack te laden
	 * Deze wordt intern gerepresenteerd door de integer literal 1
	 */
	public void printTrue(){
		print("ldc " + Integer.toString(1));
	}
	
	/**
	 * Methode die gebruikt wordt om 'false' op de stack te laden
	 * Deze wordt intern gerepresenteerd door de integer literal 0
	 */
	public void printFalse(){
		print("ldc " + Integer.toString(0));
	}

	/**
	 * Methode voor het printen van een karakter
	 * @param value String van lengte drie, met enkele quotes erom, bijvoorbeeld: 'c'
	 */
	public void printChar(String value) {
		print("ldc " + getASCII(value));
	}
	
	/**
	 * Geeft de ASCII waarde van een String.
	 * @param value een character in de vorm van een String: 'c'
	 * @return String-representatie van de ASCII waarde van de value
	 */
	private String getASCII(String value){
		return Integer.toString((int)value.charAt(1));
	}

	/**
	 * Print het print statement om karakters en getallen te kunnen printen. Er wordt eerst gekeken of er een karakter
	 * of getal geprint dient te worden. Daarop wordt de juiste functie aangeroepen in het resulteren Java programma
	 * @param value de tekstuele representatie van een karakter of getal dat geprint dient te worden
	 */
	public void printPrint(String value) {
		if(!value.equals("")) {
			try {
				Integer.parseInt(value);
				print("dup"); //duplicate the value, so that it can be assigned when needed
				print("getstatic java/lang/System/out Ljava/io/PrintStream;", "push reference to system.out on stack");
				print("swap");
				print("invokevirtual java/io/PrintStream/println(I)V", "print the output"); //print the integer
				space();
			} catch (NumberFormatException e) {
				print("dup"); //duplicate the value, so that it can be assigned when needed
				print("i2c"); //create a char from the integer
				print("invokestatic java/lang/String/valueOf(C)Ljava/lang/String;"); //create a string from the character
				print("getstatic java/lang/System/out Ljava/io/PrintStream;", "push reference to system.out on stack");
				print("swap");
				print("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V", "print the output"); //print the string
				space();
			}
		} else {
			logger.info("expression == null..."); //should never be called, ideally....
		}
	}

	/**
	 * Print het read statement om karakters en getallen te kunnen inlezen. Er wordt bekeken of er een karakter
	 * of integer ingelezen dient te worden. In het geval van een karakter wordt er een integer ingelezen.
	 * In het geval van een integer wordt de aangepaste readint() functie aangeroepen, waarmee
	 * integers die uit meer dan een enkele digit bestaan, ingelezen kunnen worden.
	 * @param id de CommonTree die behoort tot de Identifier die ingelezen moet worden
	 */
	public void printRead(CommonTree id) {
		ChronosIdentifierEntry entry = table.retrieve(id.getText());
		String address = entry.getAddress();
		if(entry.getType().equals("char")) { //we have a type char (not a constant, if checking went correct....)
			print("getstatic java/lang/System/in Ljava/io/InputStream;");
			print("invokevirtual java/io/InputStream/read()I");
		    print("istore " + address);
		    print("iload " + address);	
			
		} else {			
			print("invokestatic "+className+".readint()I"); //call our custom readint function; it's in prepareReadInt()
		    print("istore " + address);
		    print("iload " + address);	
		}
	}

	/**
	 * Print het 'add' statement
	 */
	public void printAdd() {
		print("iadd");
	}

	/**
	 * Print het 'sub' statement
	 */
	public void printMinus() {
		print("isub");
	}

	/**
	 * Print het 'mult' statement
	 */
	public void printMult() {
		print("imul");	
	}

	/**
	 * Print het 'div' statement
	 */
	public void printDiv() {
		print("idiv");
	}

	/**
	 * Print het 'mod' statement
	 */
	public void printMod() {
		print("irem");
	}

	/**
	 * Print het 'not' statement
	 * printNot loads constant 1 on the stack, xors the top 2 values, resulting in the NOT operation
	 */
	public void printNot() {
		printComment("processing the NOT operation");
		print("iconst_1");
		print("ixor");
	}

	/**
	 * Print het 'minusu' statement
	 */
	public void printUMinus() {
		print("ineg");
	}

	/**
	 * Print het 'or' statement
	 */
	public void printOr() {
		print("ior");
	}

	/**
	 * Print het 'and' statement
	 */
	public void printAnd() {
		print("iand");
	}

	/**
	 * Print het 'lt' statement
	 */
	public void printLT() {
		printBinaryOperator("less-than statement","lt");
	}

	/**
	 * Print het 'le' statement
	 */
	public void printLE() {
		printBinaryOperator("less-equals statement","le");
	}

	/**
	 * Print het 'gt' statement
	 */
	public void printGT() {
		printBinaryOperator("greater-than statement","gt");		
	}

	/**
	 * Print het 'ge' statement
	 */
	public void printGE() {
		printBinaryOperator("greater-equals statement","ge");
	}

	/**
	 * Print het 'eq' statement
	 */
	public void printEQ() {
		printBinaryOperator("equals statement","eq");
	}

	/**
	 * Print het 'neq' statement
	 */
	public void printNEQ() {
		printBinaryOperator("not-equals statement","ne");
	}
	
	/**
	 * Hulpmethode voor het printen van de zes binaire operaties die uitegevoerd kunnen worden
	 * Er worden twee labels aangemaakt en deze worden toegewezen, zodat de flow
	 * van het programma correct verloopt
	 * @param comment het commentaar dat de binaire operatie beschrijft
	 * @param operation de operatie die bij de binaire operatie hoort
	 */
	private void printBinaryOperator(String comment, String operation){
		String[] labels = prepareLabelNumbers(); //labels[2]
		printComment(comment);
		print("if_icmp"+operation.toLowerCase()+" Label"+operation.toUpperCase()+labels[0]);
		print("iconst_0");
		print("goto Label"+operation.toUpperCase()+labels[1]);
		printLabel("Label"+operation.toUpperCase()+labels[0]);
		print("iconst_1");
		printLabel("Label"+operation.toUpperCase()+labels[1]);
	}
	
	/**
	 * Hulpmethode om labelnummers te genereren. Zorgt ervoor dat labelnummers
	 * altijd uniek zijn op elke plek dat deze gebruikt worden
	 * @return String[] die twee labelnummers bevat
	 */
	private String[] prepareLabelNumbers(){
		String l1 = Integer.toString(labelIterator++);
		String l2 = Integer.toString(labelIterator++);
		return new String[]{l1,l2};
	}
	
	/**
	 * Hulpmethode die een public static functie readint() print
	 * De functie readint() wordt gebruikt om integers te printen die meer dan een enkele
	 * digit lang zijn. Hiervoor wordt er van links naar rechts geïtereerd over de 
	 * ingelezen digits. Uiteindelijk wordt het resultaat opgeleverd. De readint() functie 
	 * wordt enkel naar het Jasmin bestand geprint indien dit nodig is; d.w.z: wanneer er
	 * gelezen wordt in het bronprogramma
	 * 
	 * de readint() functie is grotendeels overgenomen van:
	 * http://www.ceng.metu.edu.tr/courses/ceng444/link/f3jasmintutorial.html
	 * 
	 * Er is een aanpassing gedaan door ook de carriage return (ASCII 13) toe te voegen
	 */
	private void prepareReadInt(){
		print("");
		printNoTab("; int readint() function");
		printNoTab(".method public static readint()I"); //declaration of the method
		
		print(".limit locals 2");
		print(".limit stack 10");

		print("ldc 0");
		print("istore 0"); //preparing the helper variable; set it to 0.
		
		printLabel("LabelRead0");
		print("getstatic java/lang/System/in Ljava/io/InputStream;");
		print("invokevirtual java/io/InputStream/read()I"); //read the integer
		print("istore 1");
		
		print("iload 1");
		print("ldc 10"); //ASCII 10 is NL
		print("isub");
		print("ifeq LabelRead1");
		
		print("iload 1");
		print("ldc 13"); //ASCII 13 is carriage return [not in the source above, DEBUG much......]
		print("isub");
		print("ifeq LabelRead1");
		
		print("iload 1");
		print("ldc 32"); //ASCII 32 is space
		print("isub");
		print("ifeq LabelRead1");
		
		print("iload 1");
		print("ldc 48"); //no (checked) delimiters, ASCII 48 is 0, we have to subtract this
		print("isub");
		print("ldc 10");
		print("iload 0");
		print("imul");
		print("iadd");	
		print("istore 0");
		
		print("goto LabelRead0"); //go back to read more digits 
		printLabel("LabelRead1");
		print("; local variable 0 holds the read integer");
		print("iload 0");

		print("ireturn"); //return the result
		print("");
		printNoTab(".end method");
	}

	/**
	 * Print het begin van het if-statement. Zorgt ervoor dat er een label wordt aangemaakt
	 * in de ifLabelMatrix die gebruikt wordt om het correcte label te printen bij de then en
	 * else statements
	 */
	public void printIf() {
		int currentScope = table.currentLevel();
		Integer prevLabelOnScope = ifLabelMatrix.get(currentScope);
		if(prevLabelOnScope == null) {
			prevLabelOnScope = 0;
		}
		ifLabelMatrix.put(currentScope, prevLabelOnScope + 1);
		String jumpLabel = Integer.toString(currentScope) + Integer.toString(prevLabelOnScope + 1);
		print("ifeq ELSE" + jumpLabel);
	}

	/**
	 * Print het endif-statement. Het label wordt bepaald aan de hand van de ifLabelMatrix
	 */
	public void printEndIf() {
		int currentScope = table.currentLevel();
		Integer prevLabelOnScope = ifLabelMatrix.get(currentScope);
		String jumpLabel = Integer.toString(currentScope) + Integer.toString(prevLabelOnScope);
		if (!gotoLabel.equals("")){
			print("goto ENDIF" + jumpLabel);
		}
		gotoLabel = "ENDIF" + jumpLabel;
	}
	
	/**
	 * Print het (optionele) else-statement. Het label wordt bepaald aan de hand van de ifLabelMatrix
	 */
	public void printIfElse() {
		int currentScope = table.currentLevel();
		Integer prevLabelOnScope = ifLabelMatrix.get(currentScope);
		String jumpLabel = Integer.toString(currentScope) + Integer.toString(prevLabelOnScope);
		print("goto ENDIF"+jumpLabel);
		gotoLabel = "ELSE" + jumpLabel;
	}

	/**
	 * Print het begin van een while-statement. Geeft een array met twee Objecten
	 * terug die gebruikt wordt als administratie voor het while-statement
	 * @return Object[] met twee elementen
	 * 				res[0] = labelIterator
	 * 				res[1] = gotoLabel
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
	 * Print de vergelijking waaraan voldaan moet worden om naar het einde van
	 * het while-statement te springen
	 * @param whileInfo Object[] dat administratie bevat voor het while-statement
	 */
	public void printWhileDo(Object[] whileInfo) {
		print("ifeq ENDWHILE" + whileInfo[0]);
	}

	/**
	 * Print het goto statement waar naartoe teruggekeerd dient te worden
	 * om de while-loop te vervolgen
	 * @param whileInfo Object[] dat administratie bevat voor het while-statement
	 */
	public void printWhileEnd(Object[] whileInfo) {
		//whileInfo[0] = label#, whileInfo[1] = label
		print("goto " + whileInfo[1]);
		gotoLabel = "ENDWHILE" + whileInfo[0];
	}
	
	/**
	 * Print het laden van een 0 op het moment dat er geen else is in een if-statement
	 * Dit is nodig om een consistente stackhoogte te garanderen. Jasmin is hier namelijk
	 * nogal kieskeurig in.
	 */
	public void printNoElse(){
		print("ldc 0");
		int currentScope = table.currentLevel();
		Integer prevLabelOnScope = ifLabelMatrix.get(currentScope);
		String jumpLabel = Integer.toString(currentScope) + Integer.toString(prevLabelOnScope);
		print("goto ENDIF"+jumpLabel);
	}

}
