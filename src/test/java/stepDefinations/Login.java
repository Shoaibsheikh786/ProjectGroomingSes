package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	
	@Before(order=2)
	public void beforeStes()
	{
		System.out.println("Before scenario 2");
	}
	@Before(order=1)
	public void beforeStepa()
	{
		System.out.println("Before scenario 1");
	}
	
	@After(order=1)
	public void afterScenario()
	{  
		
		System.out.println("Driver close 1");
	}
	@After(order=2)
	public void afterScenarios()
	{
		System.out.println("Driver closed 2");
	}
	
    @BeforeStep()
    public void beforeStep()
    {
      System.out.println("Hello step");	
    }
	@When("user enters url {string}")
	public void user_enters_url(String url) {
		driver.get(url);
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(string);
	}
	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
	}

	@Then("user is able to see logout button")
	public void user_is_able_to_see_logout_button() {
	}
	@Given("open the chrome")
	public void openBroswer()
	{
		driver=new ChromeDriver();
	}
	



}
