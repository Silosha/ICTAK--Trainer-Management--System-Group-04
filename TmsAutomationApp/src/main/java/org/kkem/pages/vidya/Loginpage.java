package org.kkem.pages.vidya;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

		
		
		WebDriverWait wait;
		WebDriver driver;
		@FindBy(linkText = "Login") WebElement login;
		@FindBy(id = "floatingInput") WebElement id;
		@FindBy(id = "floatingPassword") WebElement password;
		@FindBy(xpath = "//button[@type='submit']") WebElement signin;
		
		public Loginpage(WebDriver driver)
		{ 
			
			
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
		}	
		
		
		public void logindetails(String username1, String password1)
		{ try{
			wait.until(ExpectedConditions.visibilityOf(login)).click();
		    wait.until(ExpectedConditions.visibilityOf(id)).sendKeys(username1);;
			wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(password1);;
			wait.until(ExpectedConditions.visibilityOf(signin)).click();
		
		}catch (Exception e) {
			
			
			
		}
		
		
		
		
		
		

	}

}
