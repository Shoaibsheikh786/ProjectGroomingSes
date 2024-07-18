package com.nopcommerece.qa.tests;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MYlistener extends SetUp implements ITestListener{



	@Override
	public void onTestFailure(ITestResult result) {
		tkScrnshot();		
		
	}
	
	public void tkScrnshot()
	{ 
		Date d1=new Date();
	  long l=d1.getTime();
TakesScreenshot tk= (TakesScreenshot) driver;
		
		File file=tk.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File("./screenshots/"+l+"myScrnshot.png") );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	
	

}
