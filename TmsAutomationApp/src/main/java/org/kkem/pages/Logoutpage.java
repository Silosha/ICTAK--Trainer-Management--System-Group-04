package org.kkem.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logoutpage {

	WebDriver driver;
	WebDriverWait wait;
	@FindBy(linkText = "Logout") WebElement logout;
	
	public Logoutpage() {
		
	PageFactory.initElements(driver, this);	
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
	}
	
	public void logoutbutton()
	{
		wait.until(ExpectedConditions.visibilityOf(logout)).click();
	}
	
	
		

	

}
