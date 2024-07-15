package com.nopcommerce.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	//input[@id='SearchProductName']
	
@FindBy(xpath="//input[@id='SearchProductName']")
	WebElement SearchProducts;        //missing is driver
	
	
	//driver.findElement(By.xpath("//button[@id='search-products']")).click();

   @FindBy(xpath="//a[@class='btn btn-primary']")
  private WebElement addNew;
   public void clickOnAddNew()
   {
	   addNew.click();
	   
	  //  
	  //1.  dont wirte the assertions
	  //2. dont hardcode the values 
   }
   
   @FindBy(xpath="/html/body/div[3]/div[1]/div[1]")
  private  WebElement notf;
   
   @FindBy(xpath="//input[@id='Name']")
   WebElement productName;
   
  public void enterdataInproductName(String s)
  {
	  productName.sendKeys(s);
  }
   
   
	
	public ProductsPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	/** serach the product */
	@FindBy(xpath="//button[@id='search-products']")
	WebElement searchBtn;
	
	
	public void serachProduct(String s)
	{
		SearchProducts.sendKeys(s);
	}
	
@FindBy(xpath="//button[@name='save']")
WebElement save;

public void savaThedata()
{
	save.click();
}
	

	public void clickOnSearch()
	{
		searchBtn.click();
		
		
	}
	
	public boolean productAdded()
	{
		return notf.isDisplayed();
	}
	
	
	//WebElemetn serachProd= driver.findBy(xpath"//input[@id='SearchProductName']").click();

}
