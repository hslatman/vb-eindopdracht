package chronos.utils.logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * De klasse ChronosLogFactory wordt gebruikt om een logger voor Chronos aan te maken
 * Er zijn opties om een 'normale' logger te instantiëren, maar ook om een logger die naar
 * een bestand schrijft is een optie
 * @author Herman Slatman & Martijn Roo
 */
public class ChronosLogFactory {
	
	/**
	 * De logger instantie
	 */
	private static Logger logger;
	
	/**
	 * Maakt een logger aan en geeft deze terug
	 * @return Logger voor Chronos
	 */
	public static Logger getInstance(){
		if (logger == null){
			prepareLogger();
		}
		return logger;
	}
	
	/**
	 * Maakt een logger aan, zorgt dat deze schrijft, en geeft deze terug
	 * @return Logger voor Chronos; schrijft naar bestand
	 */
	public static Logger getWritingInstance(){
		if (logger == null){
			prepareLogger();
			enableOutputToFile();
		}
		return logger;
	}
	
	/**
	 * Zorgt ervoor dat er naar een bestand geschreven wordt
	 * Dit bestand is chronos-debug.log; deze komt op de root level van het project
	 */
	private static void enableOutputToFile(){
		ChronosLogFormatter clf = new ChronosLogFormatter();
		try {
			FileHandler fh = new FileHandler("chronos-debug.log", true);
			fh.setFormatter(clf);
			
			logger.removeHandler(logger.getHandlers()[0]);
			
			logger.addHandler(fh);
		} catch (SecurityException e) {
			logger.warning(e.getMessage());
		} catch (IOException e) {
			logger.warning(e.getMessage());
		}
	}
	
	/**
	 * Prepareert een Logger voor Chronos. Er wordt een ChronosLogFormatter aangemaakt
	 * om de Logger een duidelijker output formaat te laten genereren
	 */
	private static void prepareLogger(){
		logger = Logger.getLogger("ChronosLogger");
		logger.setLevel(Level.ALL);
		
		logger.setUseParentHandlers(false);
		ChronosLogFormatter clf = new ChronosLogFormatter();
		ConsoleHandler ch = new ConsoleHandler();
		
		ch.setFormatter(clf);
		logger.addHandler(ch);
				
		logger.log(Level.INFO, logger.getName() + " succesfully started");
	}
	
}
