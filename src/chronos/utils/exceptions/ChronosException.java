package chronos.utils.exceptions;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/**
 * De klasse ChronosException wordt gebruikt in de ChronosChecker
 * Deze bevat methoden voor het setten en getten van foutmeldingen
 * @author Herman Slatman & Martijn Roo
 */
public class ChronosException extends RecognitionException{
	
	/**
	 * De foutmelding die bij deze ChronosException hoort
	 */
    private String msg;
    
    /**
     * Serializer long version
     */
    public static final long serialVersionUID = 24162462L; // for Serializable

    /**
     * Constructor voor ChronosException
     * @param msg de String die de foutmelding beschrijft
     */
    public ChronosException(String msg) {
        super();
        this.msg = msg;
    }

    /**
     * Constructor voor ChronosException
     * @param tree de Tree(node) waarvoor een foutmelding gegenereerd wordt
     * @param msg de String die de foutmelding beschrijft
     */
    public ChronosException(Tree tree, String msg) {
        super();
        this.msg = tree.getText() + " (" + tree.getLine() + ":" + tree.getCharPositionInLine() + ") " + msg;
    }

    /**
     * Geeft de foutmelding van deze ChronosException terug
     * @return String met foutmelding
     */
    @Override
    public String getMessage() {
        return this.msg;
    }

}
