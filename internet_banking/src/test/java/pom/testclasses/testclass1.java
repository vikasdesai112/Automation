package pom.testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.classes.homepage;
import pom.classes.loginpage;

public class testclass1 extends baseclass{
	homepage z;
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass() throws InterruptedException {
	
		
		loginpage x = new loginpage(driver);
		x.senduserid();
		x.sendpassword();
		x.clicklogin();
		Thread.sleep(5000);
		x.sendpin(driver);
		x.submit();
	}
	
	
	@Test
	public void test1() throws InterruptedException
	{
	
		z =new homepage(driver);
		Thread.sleep(5000);
		z.orderpage();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(url, "https://kite.zerodha.com/orders");
		
		
	}
	
	
	
	@AfterSuite
	public void aftersuite()
	{
		z.userid();
		z.logout();
		
	}

}
