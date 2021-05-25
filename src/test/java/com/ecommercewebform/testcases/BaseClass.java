package com.ecommercewebform.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.ecommercewebform.pageobjects.TestCase1;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public static WebDriver driver;
	String actualLimitError;
	
	@Test
	public void main() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(3000);
		
		TestCase1 tc = new TestCase1(driver);
		tc.clickLinkSignIn();
		
		
		
		String email=randomString()+"@gmail.com";
		tc.InputEmailAddress(email);
		Thread.sleep(2000);
		
	}
	
	public String randomString()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(6);
		return(generatedstring);
	}
	
	@AfterClass
	public void tearDown()
	{
		
		driver.quit();
	}
	
	
}
