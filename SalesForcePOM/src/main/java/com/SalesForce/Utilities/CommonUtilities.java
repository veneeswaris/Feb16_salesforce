package com.SalesForce.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	
	public static String getApplicationProperty(String key)
	{
		Properties properties=new Properties();
		String filePath=Constants.APPLICATION_PROPERTIES_PATH;
		FileInputStream fileInput = null;
		try {
			 fileInput=new FileInputStream(filePath);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.load(fileInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=properties.getProperty(key);
		return value;
		
		
	}

}
