package chronos.utils.symbols;

/**
 * De klasse ChronosIdentifierEntry bevat informatie over een Identifier
 * die in de ChronosSymbolTable gedeclareerd is.
 * @author Herman Slatman & Martijn Roo
 */
public class ChronosIdentifierEntry {

    private int level;
    private String type;
    private boolean isConstant;
    private Object value;
	private String address;
	private boolean isRead;

	/**
	 * Constructor voor ChronosIdentifierEntry</i>
	 */
    public ChronosIdentifierEntry(){
    	isConstant = false;
    	isRead = false;
    	address = "";
    	type = "";
    }
	
    /**
     * Geeft het adres van deze ChronosIdentifierEntry</i>
     * @return this.address
     */
	public String getAddress(){
		return this.address;
	}
	
	/**
	 * Set het adres van deze ChronosIdentifierEntry</i>
	 * @param address het adres dat geset moet worden
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	 * Set het level waarop deze ChronosIdentifierEntry</i> gedeclareerd moet worden
	 * @param level het level waarop deze ChronosIdentifierEntry</i> gedeclareerd moet worden
	 */
	public void setLevel(int level) {
		this.level = level;	
	}
	
	/**
	 * Geeft het level waarop deze ChronosIdentifierEntry</i> gedeclareerd is
	 * @return this.level
	 */
    public int getLevel() {
       	return this.level;
    }
    
    /**
     * Set het type van deze ChronosIdentifierEntry
     * @param type String-representatie van het type dat geset dient te worden
     */
    public void setType(String type){
    	this.type = type;
    }
    
    /**
     * Geeft het type van deze ChronosIdentifierEntry
     * @return String die een tekstuele weergave van het type is
     */
    public String getType(){
    	return this.type;
    }

    /**
     * Gebruikt om deze ChronosIdentifierEntry als constante aan te duiden
     */
    public void setConstant(){
    	isConstant = true;
    }
    
    /**
     * Geeft aan of deze ChronosIdentifierEntry constant is
     * @return boolean die aangeeft of deze Identifier als constante is gedeclareerd
     */
	public boolean isConstant() {
		return this.isConstant;
	}
    
    /**
     * Kent een waarde toe aan deze ChronosIdentifierEntry
     * Deze waarde wordt gebruikt als een dummy waarde
     * @param o een Object dat als waarde toegekend wordt
     */
    public void setValue(Object o){
    	this.value = o;
    }
    
    /**
     * Geeft de waarde van deze ChronosIdentifierEntry terug
     * @return Object dat de waarde van deze ChronosIdentifierEntry beschrijft
     */
    public Object getValue(){
    	return this.value;
    }
    
    /**
     * Geeft aan of deze ChronosIdentifierEntry gelezen is
     * @return boolean die aangeeft of deze Identifier gelezen is
     */
    public boolean isRead(){
    	return isRead;
    }
    
    /**
     * Set deze ChronosIdentifierEntry op de status 'gelezen'
     */
    public void setRead(){
    	this.isRead = true;
    }
	
    /**
     * Geeft een tekstuele representatie van deze ChronosIdentifierEntry
     */
    public String toString(){
    	return isConstant ? "const " + type : "var " + type;
    }
	
}
