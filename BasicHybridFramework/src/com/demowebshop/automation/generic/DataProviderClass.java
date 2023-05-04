package com.demowebshop.automation.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name="usercred")
	/*public String[][] getdata()
	{
		//String[][] arr= {{"username","password"},{"password","username"}};
		object
		return arr;
	}*/
	
	public Object[][] getdata() throws EncryptedDocumentException, IOException
	{
		Object[][] arr= Exceldata.getdata("Sheet2");
		return arr;
	}
}
