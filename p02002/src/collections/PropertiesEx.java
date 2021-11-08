package collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "ÇÑ±Û");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Properties sysProp = System.getProperties();
		System.out.println("java.version :"+sysProp.getProperty("java.version"));
		System.out.println("user.language :"+sysProp.getProperty("user.language"));
		sysProp.list(System.out);
	}
}
