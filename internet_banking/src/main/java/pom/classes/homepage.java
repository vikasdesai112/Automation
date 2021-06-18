package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	@FindBy (xpath="//a[@class='orders-nav-item']")
	private WebElement order;
	
	@FindBy (xpath="//div[@class='avatar']")
	private WebElement userid;
	
	@FindBy (xpath="//a[@target='_self']")
	private WebElement logout;
	
	@FindBy (xpath="//li[@data-balloon=\'Watchlist 4\']")
	private WebElement watch4;
	
	@FindBy (xpath="(//span[@class='nice-name'])[2]")
	private WebElement titan;
	
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void orderpage()
	{
		order.click();
	}
	
	public void userid()
	{
		userid.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	
	public void watch4()
	{
		watch4.click();
	}
	
	public String titan()
	{
		String y=titan.getText();
		return y;
		
	}

}
