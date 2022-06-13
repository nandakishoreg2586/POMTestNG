package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {
	
	public static String getProperties(String propertykey) throws IOException
	{
		Properties prop = new Properties();
		String path = System.getProperty("user.dir");
		InputStream input = new FileInputStream(path+"/src/main/resources/config.properties");
		prop.load(input);
		String property = prop.getProperty(propertykey);
		input.close();
		
		//Reading from XMl file
		//prop.loadFromXML(input);
		
//		prop.put("NewProp", "NewProp");
//	    FileOutputStream outputStrem = new FileOutputStream(path+"/src/main/resources/config.properties");
//	    prop.store(outputStrem, "New property added");
	
		
		return property;		
	}

//	
//	public static void main(String[] args) throws IOException {
//		System.out.println(ReadConfig.getProperties("url"));
//		
//	}
	
}
 