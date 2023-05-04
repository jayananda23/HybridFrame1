package com.demowebshop.automation.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class GetDatafromProperty
{
	@Test
	public static String getdata(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./property/propertiesData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;	
	}

}
