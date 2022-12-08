package com.ict.tms.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderElements {
	
	private WebDriver driver;
	
	@FindBy(linkText = "Logout") 
	WebElement logout;
	
	public HeaderElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}
}
