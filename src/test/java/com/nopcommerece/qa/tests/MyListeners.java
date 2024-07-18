package com.nopcommerece.qa.tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyListeners implements IRetryAnalyzer {
  //how many we want to execute a filed test 
	
	int count=0;  //how many times we have execute
	int retryCount=3;  //max .
	@Override
	public boolean retry(ITestResult result) {
		if(count<retryCount)
		{
			count++;
			return true;
		}
		return false;
	}
	
	

}
