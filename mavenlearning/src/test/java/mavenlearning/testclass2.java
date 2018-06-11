package mavenlearning;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testclass2 {

	@Test
	public void googletest() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","/Users/rkamal/chromedriver");
	
		
		 WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.com/xhtml");
		  Thread.sleep(5000);  // Let the user actually see something!
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ChromeDriver");
		  searchBox.submit();
		  Thread.sleep(5000);  // Let the user actually see something!
		  driver.quit();
	
	}
	
	@Test
	public void sub()
	{
	int a = 10;
	int b = 20;
	System.out.println("Sub");
	AssertJUnit.assertEquals(10,b-a);
	}
	
}
