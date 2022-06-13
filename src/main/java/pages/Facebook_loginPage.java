package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePage.BasePage;

public class Facebook_loginPage {

		final WebDriver driver;
		
		public Facebook_loginPage( WebDriver driver)
			{
			this.driver=driver;
			}
		
		
		//Find By method to identify web elements in a page 
			@FindBy(name = "login")
			WebElement login_button;
		
		@Test
		public void hardassertPage_FindBy() {
			
			System.out.println("FindBy Annotation");

			String ExpectedName = "Log In";
			String ActualName =	login_button.getText();

			assertEquals(ActualName, ExpectedName);
			
		}
		

}
