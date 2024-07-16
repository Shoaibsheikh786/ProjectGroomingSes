package com.nopcommerece.qa.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nopcommerce.qa.pages.ProductsPage;

public class ProductTest {
	
	// locating the element , actions , assertions 
		static WebDriver driver;
		ProductsPage pp;
		
		@BeforeTest
		public void setUp() throws InterruptedException
		{
			driver=new FirefoxDriver();
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[normalize-space()='Catalog']")).click();
			driver.findElement(By.xpath("//p[normalize-space()='Products']")).click();
			pp=new ProductsPage(driver);
		}
		
		@Test(enabled=false)
		public void testSerachFunct()
		{
			
			//dont hardcode the values 
			//dont write the dependent test cases 
			pp.serachProduct("shoaib");
			pp.clickOnSearch();
			
		}
		
		@Test
		public void addNewData()
		{
		
			pp.clickOnAddNew();
			pp.enterdataInproductName("computer");
			pp.savaThedata();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Assert.assertTrue(pp.productAdded());
		}
		
		//@Test--> which is searching the product 
		// @TEst--> verify the price of that product
		
		//
		
		
	
	

}
