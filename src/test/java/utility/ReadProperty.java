package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {

	private static Properties key;
	static {
try {
	FileInputStream file=new FileInputStream("facebook.properties");
	 key=new Properties();
	key.load(file);
}
	catch(Exception e){
		e.printStackTrace();
	}
		
	}
	public static String getProperty(String keyName) {
		return key.getProperty(keyName);
	}
}

