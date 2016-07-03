package chronos.utils.logging;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * De klasse ChronosLogFormatter beschrijft het formaat voor de 
 * Logger die aangemaakt wordt via de ChronosLogFactory.getInstance() methode
 * @author Herman Slatman & Martijn Roo
 */
public class ChronosLogFormatter extends Formatter {
	
	/**
	 * Formaat voor datum en tijd
	 */
	private static final DateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS");
	
	/**
	 * Bouwt een string op voor een record
	 * @param record het log-record dat geprint dient te worden
	 */
	@Override
	public String format(LogRecord record) {
		StringBuilder builder = new StringBuilder(1000);
		builder.append(df.format(new Date(record.getMillis()))).append(" - ");
        builder.append("[").append(record.getLevel()).append("]");
		builder.append("[").append(record.getSourceClassName()).append(".");
        builder.append(record.getSourceMethodName()).append("] - ");
		builder.append(formatMessage(record));
		builder.append("\n");
		return builder.toString();
	}
	
}
