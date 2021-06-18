package pom.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement login;
	

	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername()
	{
		username.sendKeys("admin");
	}
	
	public void sendpassword()
	{
		password.sendKeys("manager");
	}
	
	public void loginbutton()
	{
		login.click();
	}
	
	
	

}
