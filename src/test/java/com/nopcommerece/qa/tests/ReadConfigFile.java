package com.nopcommerece.qa.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadConfigFile {
	
	WebDriver driver;
	
	@Test
	public void test1() throws IOException
	{
		File file=new File("./config.properties");
		FileInputStream fis=new FileInputStream(file);
		
		
		Properties pr=new Properties();
		pr.load(fis);
		
		String str=pr.getProperty("browser");
		System.out.println(str);
		
		String url=pr.getProperty("url");
       
		if(str.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(str.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Browser not found");
		}
		
		driver.get(url);
		
	}

}
