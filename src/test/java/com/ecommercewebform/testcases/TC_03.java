package com.ecommercewebform.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommercewebform.pageobjects.TestCase1;

public class TC_03 extends BaseClass {
	
	public static Logger logger;
	
	@Test
	public static void TC3() throws InterruptedException {
		
		logger = Logger.getLogger("webForm");
		PropertyConfigurator.configure("Log4j.properties");
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		TestCase1 tc3 = new TestCase1(driver);
		tc3.clickRegister();
		Thread.sleep(3000);
		
		tc3.clearEmail();
		Thread.sleep(1000);
		
		tc3.removeCountry();
		tc3.clickRegister2();
		Thread.sleep(3000);
		
		String actualError = "There are 10 errors";
		String expectedError = tc3.getErrorMessage();
		if(actualError.equals(expectedError)) {
			logger.info("Actual Error matched with Expected Error");
			logger.info("Test Case passed");
		}else {
			logger.info("Test case failed");
			Assert.assertTrue(false);
		}
	
		
	}
	
	

}
