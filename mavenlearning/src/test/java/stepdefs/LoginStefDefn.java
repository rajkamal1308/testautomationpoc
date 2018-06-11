package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStefDefn {

		
	WebDriver driver = new ChromeDriver();
	 
	@Given("^user has launched the google$")
	public void user_launched_google() throws InterruptedException
	{
		  driver.get("http://www.google.com/xhtml");
		  Thread.sleep(5000);  // Let the user actually see something! 
	}
	
	@When("^searches for stuff$")
	public void search_stuff() throws InterruptedException
	{
		 WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ChromeDriver");
		  searchBox.submit();
		  Thread.sleep(5000);  // Let the user actually see something!
	}
	
	@Then("^the result should be shown$")
	public void result_shown()
	{
		  driver.quit();	
	}
	
	
	 
	
}
