package com.nopcommerece.qa.tests.reports;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class Reporting extends SetUp {

	@Feature("Login")
	@Description("To verify login is working properly")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void test1()
	{
		driver.get("https://www.fb.com");
		System.out.println(driver.getTitle());
		Assert.assertTrue(false);
		
	}
	@Feature("Login")
	@Description("To verify login is working properly with credents")
	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void test2()
	{
		driver.get("https://www.x.com");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true);
		
	}
	@Feature("ADD TO CART")
	@Description("verify the cart function is working properly")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void test3()
	{
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true);
		
	}
	@Test
	@Feature("ADD TO CART")
	@Description("check cart is working ")
	@Severity(SeverityLevel.BLOCKER)
	public void test4()
	{
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		Assert.assertTrue(false);
		
	}
}
