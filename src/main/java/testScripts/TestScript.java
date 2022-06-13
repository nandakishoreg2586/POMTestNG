package testScripts;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import log4j.Log4j2;
import pages.Facebook_loginPage;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import baseTest.BaseTest;
import config.ReadConfig;

@Listeners(listeners.TestNGListerms.class)

public class TestScript extends BaseTest {

	Facebook_loginPage fblgnpg;
	

	@Test (priority = 1)
	public void hardassertPage_By() { 
		
		//Identifying web elements using the By method 
		By login_button = By.name("login");

		String ExpectedName = "Log In";
		String ActualName = driver.findElement(login_button).getText();
		assertEquals(ActualName, ExpectedName);
		
		//Assertions 
		System.out.println(driver.findElement(login_button).isDisplayed());
		System.out.println(driver.findElement(login_button).isEnabled());

		
		logger.info("Hard assert using By Annotattion");
		
	

		fblgnpg = PageFactory.initElements(driver, Facebook_loginPage.class);
		fblgnpg.hardassertPage_FindBy();
		logger.info("Hard assert using Find By Annotattion");
	}
	
	

	@Test (priority = 2)
	public void softassertPage() { 

		String SoftAssert = "LogIn";
		String ActualName;

		ActualName = driver.findElement(By.name("login")).getText();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualName, SoftAssert);
			
		logger.info("Soft assert");
		


	}
	


	
	
	@Test (enabled=false, priority = 3)
	public void assertPage() { 
		Assert.assertTrue(false);
		logger.info("assert for failure");

	}
	
	

	
	
	
	
	
	
}
