package chronos.utils.symbols;

import java.util.HashMap;
import java.util.Iterator;

/**
 * De klasse ChronosSymbolTable houdt bij welke ChronosIdentifierEntrys er op welk level gedeclareerd zijn
 * Verder zijn er methoden om ChronosIdentifierEntrys op te vragen en deze toe te voegen. 
 * Klasse is gebaseerd op de ontwikkelde SymbolTable tijdens het practicum
 * @author Herman Slatman & Martijn Roo
 */
public class ChronosSymbolTable {

	/**
	 * Houdt het level van de ChronosSymbolTable bij
	 */
	private int level;
	
	/**
	 * Beschrijft de eigenlijke mapping van levels naar ChronosIdentifierEntry
	 */
	private HashMap<Integer, HashMap<String, ChronosIdentifierEntry>> symboltable;
	
	/**
	 * Constructor voor ChronosSymbolTable
	 * Zorgt ervoor dat deze correct geïnitaliseerd wordt
	 */
	public ChronosSymbolTable() {
		level = -1;
		symboltable = new HashMap<Integer, HashMap<String,  ChronosIdentifierEntry>>();
	}

	/**
	 * Opent een nieuwe scope
	 */
	public void openScope() {
		level++;
		symboltable.put(level, new HashMap<String,  ChronosIdentifierEntry>());
	}

	/**
	 * Sluite de huidige scope. Verwijdert de ChronosIdentifierEntrys die op het huidige
	 * level gedeclareerd waren
	 */
	public void closeScope() {
		if(level > -1){
			symboltable.remove(level);
			level--;
		}
	}
	
	/**
	 * Geeft het aantal ChronosIdentifierEntrys terug dat op het huidige level gedeclareerd is
	 * @return aantal ChronosIdentifierEntrys op het huidige level
	 */
	public int getCurrentScopeSize(){
		return symboltable.get(level).size();
	}

	/** 
	 * Geeft het huidige level terug
	 */
	public int currentLevel() {
		return level;
	}

	/**
	 * Voegt een ChronosIdentifierEntry toe aan de symboltable
	 * op het huidige level.
	 * @param id String-representatie van de ChronosIdentifierEntry
	 * @param entry de ChronosIdentifierEntry die toegevoegd dient te worden
	 */
	public void enter(String id,  ChronosIdentifierEntry entry){
		HashMap<String,  ChronosIdentifierEntry> mapOfIdentifiers = symboltable.get(level);
		if (level < 0){
			//throw new SymbolTableException("Level Too Deep!");
			System.err.println("symboltable too deep...");
		}  else {
			entry.setLevel(level);
			mapOfIdentifiers.put(id, entry);
		}
	}

	/**
	 * Geeft de ChronosIdentifierEntry dat bij het id hoort
	 * @param id de String-representatie van de Identifier
	 */
	public  ChronosIdentifierEntry retrieve(String id) {
		ChronosIdentifierEntry res = null;
		for(int i = level; i >= 0; i--){
			HashMap<String,  ChronosIdentifierEntry> mapOfIdentifiers = symboltable.get(i);
			if(mapOfIdentifiers.containsKey(id)){
				res = ( ChronosIdentifierEntry) mapOfIdentifiers.get(id);
				break;
			}
		}
		return res;
	}
	
	/**
	 * Geeft de ChronosSymbolTable weer als string
	 * Zal per level de gedeclareerde ChronosIdentifierEntrys laten zien
	 */
	public String toString(){
		String res = "IDs on levels:\n";
		for(int i = level; i >= 0; i--){
			res += "level " + i + " => [";
			HashMap<String,  ChronosIdentifierEntry> levelMap = symboltable.get(i);
				Iterator<String> it = levelMap.keySet().iterator();
				while (it.hasNext()){
					String ident = (String) it.next();
					ChronosIdentifierEntry entry = levelMap.get(ident);
					if (it.hasNext()){
						res += ident + ": " + entry + ", ";
					} else {
						res += ident + ": " + entry;
					}
				}
			res += "]\n";
		}
		return res;
	}
}
