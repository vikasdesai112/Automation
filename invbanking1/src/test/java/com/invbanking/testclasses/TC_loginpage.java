package com.invbanking.testclasses;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.invbanking.pom.loginpage;

public class TC_loginpage extends baseclass {


	@Test
	public void logintest()
	{
		
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "GTPL Bank Manager HomePage");
		System.out.println(" Login Test is pass");
	}
	
	@AfterMethod
	public void logout()
	{
		loginpage r=new loginpage(driver);
		r.logout();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	
}
