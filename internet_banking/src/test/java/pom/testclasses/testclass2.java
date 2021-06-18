package pom.testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pom.classes.homepage;
import pom.classes.loginpage;


public class testclass2  {
	public WebDriver driver;
	
	@BeforeSuite
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\vikas\\velocity\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
	}
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{		
	
	
	loginpage x = new loginpage(driver);
	x.senduserid();
	x.sendpassword();
	x.clicklogin();
	Thread.sleep(5000);
	x.sendpin(driver);
	x.submit();
		
	}
	
	
	@Test
	public void test() throws InterruptedException
	{
		homepage z =new homepage(driver);
		Thread.sleep(5000);
		z.watch4();
		Thread.sleep(5000);
		String x = z.titan();
		Boolean v = x.equals("TITAN JUN 1640 CE");
		Assert.assertTrue(v);
		
	}
	

}
