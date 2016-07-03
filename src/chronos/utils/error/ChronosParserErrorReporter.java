package chronos.utils.error;

import java.util.HashMap;

/**
 * De klasse ChronosParserErrorReporter implementeert de Interface IChronosErrorReporter
 * Deze klasse wordt gebruikt door ChronosParser om foutmeldingen op te slaan en op te vragen
 * Deze foutmeldingen worden gebruikt door de compiler om te checken of deze moet doorgaan
 * met het type checken van de code
 * @author Herman Slatman & Martijn Roo
 */
public class ChronosParserErrorReporter implements IChronosErrorReporter {

	/**
	 * Houdt de fouten van de ChronosParser bij
	 */
	HashMap<String, String> errors = new HashMap<String, String>();

	/**
	 * Geeft de fouten van de ChronosParser terug
	 * @return HashMap<String, String> die de fouten van de ChronosParser beschrijft
	 */
	@Override
	public HashMap<String, String> getErrors() {
		return errors;
	}

	/**
	 * Voegt een fout toe aan de map van fouten van de ChronosParser
	 */
	@Override
	public void addError(String hdr, String msg) {
		errors.put(hdr, msg);
	}

}
