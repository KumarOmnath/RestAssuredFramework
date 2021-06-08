package commonUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;

public class ConfigRead implements IConst {
	public static String getPropertyValue(String propertyName){
		String propertyValue="";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_PATH));
			propertyValue = prop.getProperty(propertyName);
		} catch (Exception e) {
		} 
		return propertyValue;
	}
	
	

	
	/**
	 * Read all logs & in run timr=e generate logs report
	 */

	public static void allConsoleLog() throws FileNotFoundException {
		System.setOut(new PrintStream(new FileOutputStream(All_Console_Logs_file_Path)));
	}
		
		
	
}
