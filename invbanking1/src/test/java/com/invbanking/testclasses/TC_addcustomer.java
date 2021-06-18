package com.invbanking.testclasses;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.invbanking.pom.addnewcustomer;
import com.invbanking.pom.loginpage;

public class TC_addcustomer extends baseclass{

	
	@Test
	public void addcustomer() throws InterruptedException
	{
		
	addnewcustomer add1= new addnewcustomer(driver);
		add1.clickAddNewCustomer();
		add1.custName("vikas");
		add1.custdob("26","12", "1995");
		add1.custaddress("pune");
		add1.custcity("Pune");
		add1.custstate("MH");
		add1.custpinno("411030");
		add1.custtelephoneno("89655654476");
		
		String email = randomestring()+"@gmail.com";
		add1.custemailid(email);
		add1.custsubmit();
		
		boolean res=driver.getPageSource().contains("Access denied for user");
		
		Assert.assertTrue(res);
		
		System.out.println("Add customer test is pass");
	}
	
	
	public String randomestring()
	{
		String str = RandomStringUtils.randomAlphabetic(8);
		return(str);
	}
}
