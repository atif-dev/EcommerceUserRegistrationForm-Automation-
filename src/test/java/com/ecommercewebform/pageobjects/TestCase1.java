package com.ecommercewebform.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
	
	WebDriver ldriver;
	
	public TestCase1(WebDriver rdriver) {
		ldriver  = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	@CacheLookup
	WebElement lnkSignIn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='email_create']")
	@CacheLookup
	WebElement lnkEmail;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Create an account']")
	@CacheLookup
	WebElement btnRegister;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	@CacheLookup
	WebElement emailField;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"id_country\"]")
	@CacheLookup
	WebElement countryDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"submitAccount\"]/span")
	@CacheLookup
	WebElement btnRegister2;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/p")
	@CacheLookup
	WebElement errorMessage;
	
	
	
	
	@FindBy(how = How.ID, using = "customer_firstname")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"customer_lastname\"]")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"passwd\"]")
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"days\"]")
	@CacheLookup
	WebElement dobDropDown1;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"months\"]")
	@CacheLookup
	WebElement dobDropDown2;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"years\"]")
	@CacheLookup
	WebElement dobDropDown3;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"newsletter\"]")
	@CacheLookup
	WebElement checkNewsLetter;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"optin\"]")
	@CacheLookup
	WebElement checkSpecialOffer;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"company\"]")
	@CacheLookup
	WebElement company;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"address1\"]")
	@CacheLookup
	WebElement address;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	@CacheLookup
	WebElement cityName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"id_state\"]")
	@CacheLookup
	WebElement state;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"postcode\"]")
	@CacheLookup
	WebElement postalCode;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone_mobile\"]")
	@CacheLookup
	WebElement mobNo;
	
	
	public void clickLinkSignIn() {
		lnkSignIn.click();
	}
	
	public void InputEmailAddress(String email) {
		lnkEmail.sendKeys(email);
	}
	
	public void clickRegister() {
		btnRegister.click();
	}
	
	public void clearEmail() {
		emailField.clear();
	}
	
	public void removeCountry() {
		Select rm = new Select(countryDropDown);
		rm.selectByIndex(0);//index start from zero
	}
	
	public void clickRegister2() {
		btnRegister2.click();
	}
	
	public String getErrorMessage() {
		return errorMessage.getText();
	}
	
	
	
	
	public void inputFirstName(String fname) {
		 firstName.sendKeys(fname);
		
	}
	
	public void inputLastName(String lname) {
		 lastName.sendKeys(lname);
		
	}
	
	public void InputPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void selectDate() {
		Select dob1 = new Select(dobDropDown1);
		dob1.selectByIndex(1);//index start from zero
	}
	
	public void selectMonth() {
		Select dob2 = new Select(dobDropDown2);
		dob2.selectByIndex(1);//index start from zero
	}
	
	public void selectYear() {
		Select dob3 = new Select(dobDropDown3);
		dob3.selectByIndex(1);//index start from zero
	}
	
	public void checkNewsLetter() {
		checkNewsLetter.click();
	}
	
	public void checkSpecialOffer() {
		checkSpecialOffer.click();
	}
	
	public void InputCompany(String cname) {
		company.sendKeys(cname);
	}
	
	public void InputAddress(String Address) {
		address.sendKeys(Address);
	}
	
	public void inputCityName(String cName) {
		 cityName.sendKeys(cName);
		
	}
	
	public void selectState() {
		Select State = new Select(state);
		State.selectByIndex(1);//index start from zero
	}
	
	public void selectCountry() {
		Select rm = new Select(countryDropDown);
		rm.selectByIndex(1);//index start from zero
	}
	
	public void inputPostalCode(String pcode) {
		 postalCode.sendKeys(pcode);
		
	}
	
	public void inputMobileNo(String mobno) {
		 mobNo.sendKeys(mobno);
		
	}
	
	
}
