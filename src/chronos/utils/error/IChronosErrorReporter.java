package chronos.utils.error;

import java.util.HashMap;

/**
 * De Interface IChronosErrorReporter beschrijft hoe ErrorReporters voor Chronos eruit moeten zien
 * @author Herman Slatman & Martijn Roo
 */
public interface IChronosErrorReporter {
	public void addError(String hdr, String msg);
	public HashMap<String, String> getErrors();
}
