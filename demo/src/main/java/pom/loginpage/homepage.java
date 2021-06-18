package pom.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	@FindBy (xpath="//a[@class='content tasks']")
	private WebElement taskbutton;
	
	@FindBy (xpath="//a[@class='content reports']")
	private WebElement report;
	
	@FindBy (xpath="//a[@id='logoutLink']")
	private WebElement logout;
	
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void taskbutton()
	{
		taskbutton.click();
	}
	
	public void reportbutton()
	{
		report.click();
	}
	
	public void logout()
	{
		logout.click();
	}

}
