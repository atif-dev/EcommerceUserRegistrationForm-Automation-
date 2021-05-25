package com.ecommercewebform.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommercewebform.pageobjects.TestCase1;

public class TC_01 extends BaseClass {
	
	public static Logger logger;
	
	@Test
	public void TC1() throws InterruptedException {
		
		logger = Logger.getLogger("webForm");
		PropertyConfigurator.configure("Log4j.properties");
		
		TestCase1 tc1 = new TestCase1(driver);
		tc1.clickRegister();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.name("customer_firstname")));//need to wait for First Name field otherwise will get error, unable to find Element
		
		tc1.inputFirstName(randomString());
		Thread.sleep(1000);
		
		tc1.inputLastName(randomString());
		Thread.sleep(1000);
		
		String pass = randomString();
		tc1.InputPassword(pass);
		Thread.sleep(1000);
		
		tc1.selectDate();
		Thread.sleep(1000);
		
		tc1.selectMonth();
		Thread.sleep(1000);
		
		tc1.selectYear();
		Thread.sleep(1000);
		
		tc1.checkNewsLetter();
		tc1.checkSpecialOffer();
		
		tc1.InputCompany("hsjdsjdas");
		Thread.sleep(1000);
		
		tc1.InputAddress("hsdjhsdjhasd");
		Thread.sleep(1000);
		
		tc1.inputCityName("dhsjdhsjhds");
		Thread.sleep(1000);
		
		tc1.selectState();
		Thread.sleep(1000);
		
		tc1.inputPostalCode("10000");
		Thread.sleep(1000);
		
		tc1.selectCountry();
		Thread.sleep(1000);
		
		tc1.inputMobileNo("564564564564546454");
		tc1.clickRegister2();
		
		Thread.sleep(4000);
		
		String expectedTitle = "My account - My Store";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)){
			logger.info("Test case passed");
			Assert.assertTrue(true);
		}else {
			logger.info("Test case failed");
			Assert.assertTrue(false);
			
		}
		
		/*
		 * We can validate user logged in state: 
		 * 	By profile name 
		 * 	By logged in Page Title
		 * 	Or any web element that is related to user after logged in
		 */
		
	}

}
