package chronos.utils;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeRuleReturnScope;

import chronos.utils.exceptions.ChronosException;
import chronos.utils.symbols.ChronosIdentifierEntry;
import chronos.utils.symbols.ChronosSymbolTable;

/**
 * De klasse ChronosCheckerToolbox</i> bevat (hulp)methoden die gebruikt kunnen worden
 * door de ChronosChecker</i>. Zo zijn er bijvoorbeeld methoden om constanten en 
 * variabelen te declareren en om types van expressies te testen.
 * @author Herman Slatman & Martijn Roo
 */
public class ChronosCheckerToolbox {

	/**
	 * Een ChronosSymbolTable houdt ChronosIdentifierEntry's bij die informatie over Identifiers bevatten
	 */
	private ChronosSymbolTable table;
	
	/**
	 * Constructor voor ChronosCheckerToolbox</i>
	 */
	public ChronosCheckerToolbox(){
		table = new ChronosSymbolTable();
		table.openScope(); //create the first level...IMPORTANT!
	}
	

	/**
	 * Geeft aan of een Identifier gedeclareerd is in de ChronosSymbolTable</>
	 * @param id de Identifier waarvoor gecheckt moet worden
	 * @return table.retrieve(id) != null
	 */
	public boolean isDeclared(String id){
		return table.retrieve(id) != null;
	}
	
	/**
	 * Methode om String-representatie van de ChronosSymbolTable</i> op 
	 * te vragen
	 * @return table.toString()
	 */
	public String printSymbolTable(){
		return table.toString();
	}
	
	/**
	 * Methode die als doorgeefluik functioneert voor table.openScope()
	 */
	public void tbOpenScope(){
		table.openScope();
	}
	
	/**
	 * Methode die als doorgeefluik functioneert voor table.closeScope()
	 */
	public void tbCloseScope(){
		table.closeScope();
	}
	
	/**
	 * Geeft een String-representatie van het type van de CommonTree</i> ct
	 * @param ct de CommonTree</i> waarvan het type opgevraagd dient te worden
	 * @return "" || type van de ChronosIdentifierEntry</i> die correspondeert met ct.getText() 
	 * @throws ChronosException wanneer de opgevraagde Identifier niet gedeclareerd is
	 */
    public String getType(CommonTree ct) throws ChronosException{
    	String res = "no_type";
    	if ( isDeclared(ct.getText())){
    		res = table.retrieve(ct.getText()).getType();
    	} else {
    		throw new ChronosException("[OPERAND " + createErrorMessage(ct) + "] ERROR: identifier " +  ct.getText() + " was not declared before!");
    	}
    	return res;
    }

    /**
     * Plaatst een 'const' in de ChronosSymbolTable</i>
     * @param id de Identifier die bij de 'const' hoort
     * @param idType het type van de Identifier
     * @throws ChronosException wanneer er al een Identifier id bestaat in de ChronosSymbolTable</i>
     */
	public void putConst(CommonTree id, String idType) throws ChronosException {
		//logger.info("const " + id.getText() + " " + idType);
		if ( !isDeclared(id.getText()) ){
			ChronosIdentifierEntry cid = new ChronosIdentifierEntry();
			cid.setType(idType);
			cid.setConstant();
			table.enter(id.getText(), cid);
		} else {
			throw new ChronosException("[CONST. DECLARATION " + createErrorMessage(id) + "] ERROR: identifier " +  id.getText() + " was already declared!");
		}
		
	}

	/**
	 * Zal een 'var' in de ChronosSymbolTable</i> plaatsen
	 * @param id de Identifier die bij de 'var' hoort
	 * @param idType het type van de Identifier
	 * @throws ChronosException wanneer er al een Identifier id bestaat in de ChronosSymbolTable</i>
	 */
	public void putVar(CommonTree id, String idType) throws ChronosException {
		if ( !isDeclared(id.getText()) ){
			ChronosIdentifierEntry cid = new ChronosIdentifierEntry();
			cid.setType(idType);
			table.enter(id.getText(), cid);
		} else {
			throw new ChronosException("[VAR. DECLARATION " + createErrorMessage(id) + "] ERROR: identifier " +  id.getText() + " was already declared!");
		}
	}
	
	/**
	 * Checkt of er niet geprobeerd wordt om een void type te printen
	 * @param type dat gecheckt moet worden of het void is
	 * @param e1 TreeRuleReturnScope</i> waarvan het type opgevraagd wordt
	 * @throws ChronosException wanneer er geprobeerd wordt om een void type te printen
	 */
	public void checkPrintVoid(String type, TreeRuleReturnScope e1) throws ChronosException{
		if ( "void".equals(type) ){
			 throw new ChronosException("[PRINT " + createErrorMessage(e1) + "] ERROR: can't print void type!");
		}
	}
	
	/**
	 * Checkt of een toewijzing correct is; d.w.z. of de types aan beide kanten van de toewijzing kloppen
	 * @param id de CommonTree</i> waarvoor het type gecheckt moet worden
	 * @param type Het type dat gecheckt dient te worden
	 * @return String die een representatie van het type voorstelt (voor multiple assignment)
	 * @throws ChronosException wanneer de Identifier niet bestaat, er een illegaal type wordt toegewezen of als een constante een waarde krijgt toegewezen
	 */
	public String checkBecomes(CommonTree id, String type) throws ChronosException {
		String res = "";
		if ( isDeclared(id.getText()) ){
			ChronosIdentifierEntry entry = table.retrieve(id.getText());
			if (!entry.isConstant()){
				String idt = entry.getType();
				if ( idt.equals(type) ){
					res = idt;
				} else {
					String invalid = type;
					if (invalid.equals("")){
						invalid = "<invalid>";
					}					
					throw new ChronosException("[BECOMES " + createErrorMessage(id) + "] ERROR: illegal assignment of type "+invalid +" to " + idt + " "+ id.getText()+"!");
				}
			} else {
				throw new ChronosException("[BECOMES " + createErrorMessage(id) + "] ERROR: illegal assignment to const "+  id.getText()+"!");
			}
		} else {
			throw new ChronosException("[BECOMES " + createErrorMessage(id) + "] ERROR: " + id.getText() + " was not declared before!");
		}
		return res;
	}
	
	/**
	 * Set de Identifier op read, return het type van de Identifier
	 * @param id de CommonTree</i> waarvan de isRead geset moet worden
	 * @return de String-representatie van de gelezen Identfier
	 * @throws ChronosException wanneer de Identifier niet gevonden kon worden in de ChronosSymbolTable</i>
	 */
	public String getReadType(CommonTree id) throws ChronosException {
		String res = "";
		if ( isDeclared(id.getText()) ){
			ChronosIdentifierEntry cid = table.retrieve(id.getText());
			cid.setRead();
			res = cid.getType();
		} else {
			throw new ChronosException("[READ " + createErrorMessage(id) + "] ERROR: could not resolve the identifier " + id.getText() + " for reading!");
		}
		return res;
	}
	
	/**
	 * Geeft aan of de Identifier gedeclareerd is in de ChronosSymbolTable</i>
	 * @param id de Identifier die gecheckt moet worden
	 * @return table.retrieve(id) != null
	 * @throws ChronosException wanneer de Identifier niet gedeclareerd was
	 */
	public boolean checkRead(CommonTree id) throws ChronosException{
		boolean res = false;
		if ( isDeclared(id.getText()) ){
			if ( !table.retrieve(id.getText()).isConstant() ){
				res = true;
			} else {
				throw new ChronosException("[READ " + createErrorMessage(id) + "] ERROR: cannot read constant: " + id.getText() + "!");
			}
		} else {
			throw new ChronosException("[READ " + createErrorMessage(id) + "] ERROR: identifier: " +  id.getText() + " was not declared before!");
		}
		return res;
	}
	
	/**
	 * Controleert of het type van de TreeRuleReturnScope 'bool' is
	 * @param type het type waarvoor gecheckt moet worden of het een 'bool' type is
	 * @param ex de TreeRuleReturnScope</i> die bij het type hoort
	 * @return type
	 * @throws ChronosException wanneer type geen 'bool' is
	 */
	public String checkBool(String type, TreeRuleReturnScope ex) throws ChronosException{
		String res = type;
		if (!type.equals("bool")){
			throw new ChronosException("[CHECKBOOL " + createErrorMessage(ex) + "] ERROR: illegal type found where bool was expected!");
		} 
		return res;
	}
	
	/**
	 * Controleert of het type van de TreeRuleReturnScope 'int' is 
	 * @param type het type waarvoor gecheckt moet worden of het een 'int' is
	 * @param ex de TreeRuleReturnScope</i> die bij het type hoort
	 * @return type
	 * @throws ChronosException wanneer type geen 'int' is
	 */
	public String checkInt(String type, TreeRuleReturnScope ex) throws ChronosException{
		String res = type;
		if (!type.equals("int")){
			throw new ChronosException("[CHECKINT " + createErrorMessage(ex) + "] ERROR: illegal type found where int was expected!");
		}
		return res;
	}
	
	/**
	 * Vergelijkt de typen van twee verschillende TreeRuleReturnScopes
	 * @param type1 het type van de eerste TreeRuleReturnScope
	 * @param ex1 de eerste TreeRuleReturnScope
	 * @param type2 het type van de tweede TreeRuleReturnScope
	 * @param ex2 de tweede TreeRuleReturnScope
	 * @return type1
	 * @throws ChronosException wanneer de types niet met elkaar overeenkomen
	 */
	public String compareTypes(String type1, TreeRuleReturnScope ex1, String type2, TreeRuleReturnScope ex2) throws ChronosException{
		String res = type1;
		if (!type1.equals(type2)){
			throw new ChronosException("[CHECKBIN " + createErrorMessage(ex1) + "] ERROR: type mismatch: "+ type1 +" cannot be compared to " + type2 +"!");
		}
		return res;
	}
	
	/**
	 * Maakt beschrijvingen van een CommonTree voor foutmeldingen voor de ChronosCheckerErrorReporter
	 * @param ct de CommonTree node waarvoor een foutmelding gemaakt dient te worden
	 * @return String die een representatie van de CommonTree beschrijft waar een fout is gevonden
	 */
    private String createErrorMessage(CommonTree ct){
        CommonTree t = ((CommonTree)ct);
        String res = new String();
        if(t != null) {
        	res = "(" + t.getText() + " -> " + t.getLine() + ":" + t.getCharPositionInLine() + ")";
        }
        return res;
    }
    
    /**
     * Maakt beschrijvingen van een CommonTree voor foutmeldingen voor de ChronosCheckerErrorReporter
     * @param trrs de TreeRuleReturnScope waarvoor een foutmelding gemaakt dient te worden
     * @return String die een representatie van de TreeRuleReturnScope beschrijft waar een fout is gevonden
     */
    private String createErrorMessage(TreeRuleReturnScope trrs){
       return createErrorMessage((CommonTree)trrs.getTree());
    }
    
}
