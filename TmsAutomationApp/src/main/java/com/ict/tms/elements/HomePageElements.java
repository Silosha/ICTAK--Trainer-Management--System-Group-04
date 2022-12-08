package com.ict.tms.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {

	private WebDriver driver;

	@FindBy(linkText = "Login")
	private WebElement login;

	public HomePageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public WebElement loginLink() {
		return login;
	}
}
