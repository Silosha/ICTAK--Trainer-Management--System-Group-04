package com.ict.tms.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

	private WebDriver driver;

	@FindBy(id = "floatingInput")
	private WebElement emailAddress;

	@FindBy(id = "floatingPassword")
	private WebElement password;

	@FindBy(css = "button[type = \"submit\"]")
	private WebElement loginButton;

	public LoginPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
