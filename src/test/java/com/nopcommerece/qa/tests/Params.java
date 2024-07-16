package com.nopcommerece.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params {
	
	@Parameters({"user"})
	@Test
	public void test1(String browser)
	{
		if(browser.equals("chrome"))
		{
			WebDriver driver=new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			 WebDriver driver=new FirefoxDriver();
		}
		else
			System.out.println("browser not found");
				 
			 
				
	
				
	}

}
