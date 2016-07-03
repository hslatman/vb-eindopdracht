package chronos.utils.error;

import java.util.HashMap;

/**
 * De klasse ChronosCheckerErrorReporter implementeert de Interface IChronosErrorReporter
 * Deze klasse wordt gebruikt door ChronosChecker om foutmeldingen op te slaan en op te vragen
 * Deze foutmeldingen worden gebruikt door de compiler om te checken of deze moet doorgaan
 * met het genereren van code
 * @author Herman Slatman & Martijn Roo
 */
public class ChronosCheckerErrorReporter implements IChronosErrorReporter {

	/**
	 * Houdt de fouten van de ChronosChecker bij
	 */
	HashMap<String, String> errors = new HashMap<String, String>();

	/**
	 * Geeft de fouten van de ChronosChecker terug
	 * @return HashMap<String, String> die de fouten van de ChronosParser beschrijft
	 */
	@Override
	public HashMap<String, String> getErrors() {
		return errors;
	}

	/**
	 * Voegt een fout toe aan de map van fouten van de ChronosChecker
	 */
	@Override
	public void addError(String hdr, String msg) {
		errors.put(hdr, msg);
	}

}
