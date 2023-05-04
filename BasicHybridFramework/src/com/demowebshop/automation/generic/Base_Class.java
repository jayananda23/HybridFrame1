package com.demowebshop.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Class 
{
	public WebDriver driver;
	@Parameters({"key","value","url","time"})
	@BeforeMethod
	public void openapp(String key,String value,String url,long time)
	{
		System.setProperty(key,value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
