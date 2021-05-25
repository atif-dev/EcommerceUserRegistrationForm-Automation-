package com.ecommercewebform.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestCase4 {

	WebDriver ldriver;
	
	public TestCase4(WebDriver rdriver) {
		ldriver  = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Create an account']")
	@CacheLookup
	WebElement btnRegister;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"customer_firstname\"]")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"customer_lastname\"]")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	@CacheLookup
	WebElement cityName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"postcode\"]")
	@CacheLookup
	WebElement postalCode;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone_mobile\"]")
	@CacheLookup
	WebElement mobNo;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/p")
	@CacheLookup
	WebElement errorMessage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"submitAccount\"]/span")
	@CacheLookup
	WebElement btnRegister2;
	
	public void clickRegister() {
		btnRegister.click();
	}
	
	public void inputFirstName(String fname) {
		 firstName.sendKeys(fname);
		
	}
	
	public void inputLastName(String lname) {
		 lastName.sendKeys(lname);
		
	}
	
	public void inputCityName(String cname) {
		 cityName.sendKeys(cname);
		
	}
	
	public void inputPostalCode(String pcode) {
		 postalCode.sendKeys(pcode);
		
	}
	
	public void inputMobileNo(String mobno) {
		 mobNo.sendKeys(mobno);
		
	}
	
	public String getErrorMessage() {
		return errorMessage.getText();
	}
	
	public void clickRegister2() {
		btnRegister2.click();
	}
	
}
