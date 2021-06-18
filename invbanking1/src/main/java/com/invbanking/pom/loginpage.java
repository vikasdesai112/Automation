package com.invbanking.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginpage {
	

	@FindBy (xpath="//input[@name='uid']")
	private WebElement userid;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@name='btnLogin']")
	private WebElement submit;
	
	@FindBy (xpath="/html/body/div[3]/div/ul/li[10]")
	private WebElement logout;
	

	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void senduserid()
	{
		userid.sendKeys("mngr332313");
	}
	
	public void sendpassword()
	{
		password.sendKeys("yhUgEqa");
	}
	
	public void clicksubmit()
	{
		submit.click();
	}

	public void logout()
	{
		logout.click();
	}
	
	

}
