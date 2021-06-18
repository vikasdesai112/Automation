package pom.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement userid;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;

	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void senduserid()
	{
		userid.sendKeys("");
	}
	
	public void sendpassword()
	{
		password.sendKeys("");
	}
	
	public void clicklogin()
	{
		login.click();
	}
	
	public void sendpin(WebDriver driver) 
	{
		WebDriverWait wait = new WebDriverWait(driver,15);
		WebElement pin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pin']")));
		
		pin.sendKeys("");
	}
	
	public void submit()
	{
		submit.click();
	}

}
