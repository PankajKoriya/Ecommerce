package com.ecommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
		public void readConfigFile()
		{
			File file = new File("./ConfigDataProvider/Config.properties");
			try
			{
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();  
			pro.load(fis);
			}
			catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
		public String getValue(String keyToSearch)
		{
			return pro.getProperty(keyToSearch);
		}
		

}
