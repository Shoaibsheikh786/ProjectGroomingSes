package com.nopcommerece.qa.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakScrnShotss {
	
	@Test
	public void tksCrn() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//1. typeCasting from driver to TakesScrreenshot
		
            TakesScreenshot tk=(TakesScreenshot)driver;
           File file= tk.getScreenshotAs(OutputType.FILE);
           
           FileUtils.copyFile(file, new File("./myScrnShot9.png"));
	}

}
