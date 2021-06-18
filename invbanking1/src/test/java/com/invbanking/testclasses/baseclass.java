package com.invbanking.testclasses;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.invbanking.pom.loginpage;


public class baseclass {
	
	public String url="http://demo.guru99.com/V1/index.php";
	public  static WebDriver driver;
	static ExtentHtmlReporter reporter;
	
	
	
	@BeforeTest
	@Parameters("Browser")
	public void setup(String Browser) throws Exception
	{		
		reporter = new ExtentHtmlReporter("test-output//ExtendReport//Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Launching the chrome driver");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		}
		else
		{
			System.out.println("Launching the firefox driver");
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//test//resources//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	}
	
	@BeforeClass
	public void login()
	{
		
		loginpage r = new loginpage(driver);
		r.senduserid();
		r.sendpassword();
		r.clicksubmit();
	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}

	
	

}
