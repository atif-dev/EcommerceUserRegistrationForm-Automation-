package com.ecommercewebform.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.ecommercewebform.pageobjects.TestCase1;
import com.ecommercewebform.pageobjects.TestCase2;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_02 {
	
	public static Logger logger;
	WebDriver driver;
	
	@Test
	public void TC2() throws InterruptedException {
		
		logger = Logger.getLogger("webForm");
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		TestCase1 tc2 = new TestCase1(driver);
		tc2.clickLinkSignIn();
		
		tc2.InputEmailAddress("123.gmail.com");
		tc2.clickRegister();
		
		Thread.sleep(3000);//error message take time to appear
			
		TestCase2 tc2b = new TestCase2(driver);
		String text =  tc2b.getInvalidEmailText();
		
		
		String actualError = "Invalid email address.";
		if(actualError.equals(text)) {
			logger.info("Error message is displayed. Test case is validated");
			Assert.assertTrue(true);
		}else {
			logger.info("Test case is not validated");
			Assert.assertTrue(false);
		}
		
			
	}
	
	@AfterClass
	public void tearDown()
	{
		
		driver.quit();
	}

}
