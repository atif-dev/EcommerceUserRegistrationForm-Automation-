package com.ecommercewebform.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestCase2 {

	WebDriver ldriver;
	public TestCase2(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"create_account_error\"]/ol/li")
	@CacheLookup
	WebElement lnkInvalidText;
	
	public String getInvalidEmailText () {
		return lnkInvalidText.getText();
		
	}
	
}
