package com.nopcommerece.qa.tests;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class FiledTestCases  extends SetUp{

	
	// basic --> 
	@Test
	public void test1()
	{
		driver.get("https://practice.expandtesting.com/login");
		Assert.assertTrue(true);
		//takesScreen()----> test is passed or failed 
		
		System.out.println("helo world ");
		
	}
	@Test
	public void test2()
	{
		driver.get("https://google.com");
		
		
		Assert.assertTrue(false);
		//takesScreen()----> test is passed or failed 
		System.out.println("hello java ");
		

		
	}
	@Test
	public void test3()
	{
		driver.get("https://facebook.com");
		Assert.assertTrue(false);
		//takesScreen()----> test is passed or failed 
		System.out.println("Hello devops ");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
