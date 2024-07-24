package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Remote {
	
	
	WebDriver driver;
	DesiredCapabilities dc;
	
	@BeforeMethod()
	public void setUp() throws MalformedURLException
	{
		
		dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		
		driver=new RemoteWebDriver(new URL("http://192.168.56.1:4444"),dc);
		
	 
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	@Test
	public void test1()
	{
	
		driver.get("https://www.x.com");
		System.out.println(driver.getTitle());
		
	}
	@Test
	public void test2()
	{
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}
	@Test
	public void test3()
	{
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
	}

}
