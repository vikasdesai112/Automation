package com.invbanking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class addnewcustomer {
	
	WebDriver driver;
		
		public addnewcustomer(WebDriver driver) {
		
			PageFactory.initElements(driver, this);
		}
		
		

		@FindBy(xpath="//a[text()='New Customer']")
		WebElement lnkAddNewCustomer;

		@FindBy(xpath="//input[@name='name']")
		WebElement txtCustomerName;
	
		@FindBy(xpath="//input[@name='dob']")
		WebElement txtdob;

	
		@FindBy(xpath="//textarea[@name='addr']")
		WebElement txtaddress;

		
		@FindBy(xpath="//input[@name='city']")
		WebElement txtcity;

	
		@FindBy(xpath="//input[@name='state']")
		WebElement txtstate;

	
		@FindBy(xpath="//input[@name='pinno']")
		WebElement txtpinno;

	
		@FindBy(xpath="//input[@name='telephoneno']")
		WebElement txttelephoneno;

		
		@FindBy(xpath="//input[@name='emailid']")
		WebElement txtemailid;

		@FindBy(xpath="//input[@value='Submit']")
		WebElement btnSubmit;
	
		
		
		
		
		public void clickAddNewCustomer() {
			lnkAddNewCustomer.click();
				
		}

		public void custName(String cname) {
			txtCustomerName.sendKeys(cname);
			
		}

		public void custdob(String mm,String dd,String yy) {
			txtdob.sendKeys(mm);
			txtdob.sendKeys(dd);
			txtdob.sendKeys(yy);
			
		}

		public void custaddress(String caddress) {
			txtaddress.sendKeys(caddress);
		}

		public void custcity(String ccity) {
			txtcity.sendKeys(ccity);
		}

		public void custstate(String cstate) {
			txtstate.sendKeys(cstate);
		}

		public void custpinno(String cpinno) {
			txtpinno.sendKeys(String.valueOf(cpinno));
		}

		public void custtelephoneno(String ctelephoneno) {
			txttelephoneno.sendKeys(ctelephoneno);
		}

		public void custemailid(String cemailid) {
			txtemailid.sendKeys(cemailid);
		}

		public void custsubmit() {
			btnSubmit.click();
		}
		
		
	}

