package chronos.test;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import chronos.utils.logging.ChronosLogFactory;

/**
 * De klasse ChronosTestCase beschrijft een enkele testcase voor de Chronos compiler
 * Deze bevat een Chronos test programma, een verwachte uitkomst en een gegenereerde
 * uitkomst. De verwachte en gegenereerde uitkomst worden vergeleken om te checken
 * of de testcase correct doorlopen is
 * @author Herman Slatman & Martijn Roo
 *
 */
public class ChronosTestCase {
	
	/**
	 * Het Chronos programma waarvoor getest wordt
	 */
	private File testFile;
	
	/**
	 * De verwachte output voor deze ChronosTestCase
	 */
	private File xout;
	
	/**
	 * De gegenereerde output voor deze ChronosTestCase
	 */
	private File gout;
	
	/**
	 * Een ChronosTestCase wordt aangemaakt met het te testen Chronos programma
	 * @param f
	 */
	public ChronosTestCase(File f){
		testFile = f;
	}
	
	/**
	 * Geeft het te testen Chronos programma terug
	 * @return File met het Chronos test programma
	 */
	public File getTestFile(){
		return testFile;
	}
	
	/**
	 * Geeft het verwachte resultaat voor deze ChronosTestCase
	 * @return File met het verwachte resultaat
	 */
	public File getExpectedOutput(){
		return xout;
	}
	
	/**
	 * Set het verwachte resultaat voor deze ChronosTestCase
	 * @param f File met het verwachte resultaat
	 */
	public void setExpectedOutput(File f){
		xout = f;
	}
	
	/**
	 * Set de gegenereerde ouput voor deze ChronosTestCase
	 * @param f File met de gegenereerde output
	 */
	public void setGeneratedOutput(File f){
		gout = f;
	}
	
	/**
	 * Geeft aan of deze ChronosTestCase succesvol was. Succesvol houdt in dat de gegenereerde output 
	 * overeenkomt met de verwachte output die eerder geset waren. Hiervoor worden de beide bestanden
	 * in het geheel ingelezen en met elkaar vergeleken
	 * @return boolean die aangeeft dat deze ChronosTestCase succesvol was
	 */
	public boolean isSucces(){
		boolean res = false;
		try {
			if (gout != null){
				res = this.readFile(xout.getPath(), Charset.defaultCharset()).equals(this.readFile(gout.getPath(), Charset.defaultCharset())); //&& errors.isEmpty(); //wellicht niet nodig?
			} else {
				ChronosLogFactory.getInstance().info("No generated output found for " + this);
			}
		} catch (IOException e) {
			ChronosLogFactory.getInstance().warning(e.getMessage() + " ioexception");
		}
		return res;
	}
	
	/**
	 * Geeft een tekstuele representatie van deze ChronosTestCase
	 */
	public String toString(){
		return "<" +testFile.getParentFile().getParentFile().getName() + File.separator + testFile.getParentFile().getName() + ": " + testFile.getName()+">";
	}
	
	/**
	 * Hulpmethode voor het inlezen van een bestand met een bepaalde codering.
	 * Gebruikt functies uit Java 7
	 * @param path het pad naar het bestand dat ingelezen dient te worden
	 * @param encoding de encoding die gelezen moet worden
	 * @return String met de inhoud van het bestand
	 * @throws IOException
	 */
	private String readFile(String path, Charset encoding) throws IOException {
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return encoding.decode(ByteBuffer.wrap(encoded)).toString();
	}

}
