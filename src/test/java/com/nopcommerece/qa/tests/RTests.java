package com.nopcommerece.qa.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RTests {
	
	// i want to execute multiple times , failed times
	
	@Test(retryAnalyzer=MyListeners.class)
	public void test1()
	{
		System.out.println("Hello world");
		Assert.assertTrue(false);
	}
	
	

}
