package com.demowebshop.automation.testscripts;

import org.testng.annotations.Test;

import com.demowebshop.automation.generic.Base_Class;
import com.demowebshop.automation.generic.DataProviderClass;

import pom_Scripts.Pom_login;

public class TS_login extends Base_Class
{
	@Test(dataProvider = "usercred",dataProviderClass = DataProviderClass.class)
	public void loginScript(String user,String pass) throws InterruptedException
	{
	
		Pom_login pmc=new Pom_login(driver);
		pmc.login().click();
		Thread.sleep(2000);
		pmc.username().sendKeys(user);
		Thread.sleep(2000);
		pmc.password().sendKeys(pass);
		Thread.sleep(2000);
		pmc.cbox().click();
		Thread.sleep(2000);
		pmc.login_button().click();
		Thread.sleep(1500);	
		
		
	}
}
