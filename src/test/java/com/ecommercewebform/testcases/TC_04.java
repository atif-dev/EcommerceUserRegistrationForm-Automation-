package com.ecommercewebform.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommercewebform.pageobjects.TestCase4;

public class TC_04 extends BaseClass {
	
	public static Logger logger;
	
	@Test
	public static void TC4() throws InterruptedException {
		
		logger = Logger.getLogger("webForm");
		PropertyConfigurator.configure("Log4j.properties");
		
		TestCase4 tc4 = new TestCase4(driver);
		tc4.clickRegister();
		Thread.sleep(3000);
		
		String number = "12345";
		String alphabets = "ABCDEF";
		String expectedError = "There are 8 errors";//that need to be appear.City name can't be as number
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.name("customer_firstname")));
		
		tc4.inputFirstName(number);
		Thread.sleep(1000);
		tc4.inputLastName(number);
		Thread.sleep(1000);
		tc4.inputCityName(number);
		Thread.sleep(1000);
		
		tc4.inputPostalCode(alphabets);
		Thread.sleep(1000);
		tc4.inputMobileNo(alphabets);
		Thread.sleep(1000);
		
		tc4.clickRegister2();
		Thread.sleep(3000);
		
		String actualError = tc4.getErrorMessage();
		if(actualError.equals(expectedError)) {
			logger.info("Test Case passed");
			Assert.assertTrue(true);
		}else {
			logger.info("Test Case failed");
			Assert.assertTrue(false);
		}
		
	}
	
	

}
