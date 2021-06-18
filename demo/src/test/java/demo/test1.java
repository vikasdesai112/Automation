package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.loginpage.homepage;
import pom.loginpage.loginpage;

public class test1 {
	private WebDriver driver;
	private homepage y;
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver","F:\\vikas\\velocity\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		loginpage x = new loginpage(driver);
		x.sendusername();
		x.sendpassword();
		x.loginbutton();
		
	}
	
	@Test
	public void test1()
	{
		System.out.println("verify task link");
		 y =  new homepage(driver);
		y.taskbutton();
		
		String url= driver.getCurrentUrl();
		
		Assert.assertEquals("http://localhost/tasks/otasklist.do", url);
		
	
	}
	
	@Test(invocationCount = 3)
	
	public void test2()
	{
		System.out.println("verify report link");
		y.reportbutton();
		String url= driver.getCurrentUrl();
		Boolean t = url.equals("http://localhost/reports/reports.do");
		SoftAssert x = new SoftAssert();
		
		x.assertTrue(t);
		
		
		
	}
	
	@AfterMethod
	public void aftermethod()
	{
		y.logout();
	}
	
	@AfterClass
	public void exit()
	{
		driver.quit();
	}
	
}
