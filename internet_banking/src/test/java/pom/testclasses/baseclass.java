package pom.testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class baseclass {
	
	
	public String url="http://demo.guru99.com/V1/index.php";
	public static WebDriver driver;
	

	@BeforeTest
	public void setup()
	{			
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	


}
