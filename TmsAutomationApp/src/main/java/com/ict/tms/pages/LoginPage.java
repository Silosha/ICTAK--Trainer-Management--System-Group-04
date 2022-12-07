package com.ict.tms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ict.tms.elements.LoginPageElements;

/**
 * @author Silosha
 */
public class LoginPage {

	private WebDriver webDriver;

	private LoginPageElements loginPageElements;

	public LoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		loginPageElements = new LoginPageElements(this.webDriver);
	}

	private LoginPageElements ofLoginPageElements() {
		return loginPageElements;
	}	

	public void sendEmailAddress(String emailId) {
		ofLoginPageElements().getEmailAddress().sendKeys(emailId);
	}

	public void sendPassword(String pwd) {
		ofLoginPageElements().getPassword().sendKeys(pwd);
	}

	public void clickLogin() {
		ofLoginPageElements().getLoginButton().click();
	}

}
