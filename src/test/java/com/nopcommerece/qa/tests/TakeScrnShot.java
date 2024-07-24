package com.nopcommerece.qa.tests;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScrnShot {
	
	
	WebDriver driver;
	@Test
	public void test1() throws IOException
	{  
		int a;   //ram --> ram is volatile 
	 driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		//1. interface --> TakesScreenshot ,
		//Typecasting ;
		
		tkScrnshot();
		driver.findElement(By.xpath("//a[@class='btn btn-sut d-lg-inline-block my-2 my-md-0 ms-md-3']")).click();
		
		tkScrnshot();
	
	}
	public void tkScrnshot() throws IOException
	{ 
		Date d1=new Date();
	  long l=d1.getTime();
      TakesScreenshot tk= (TakesScreenshot) driver;
		
		File file=tk.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("./screenshots/"+l+"myScrnshot.png") );
	}
	
	
	//basic --> little adv, ---> take screeen only for the failed test cases 
	
	
	
	
	


}
