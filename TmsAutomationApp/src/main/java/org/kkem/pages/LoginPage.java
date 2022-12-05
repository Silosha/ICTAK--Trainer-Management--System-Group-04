package org.kkem.pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriverWait wait;
	@FindBy(linkText="Login") WebElement login;
	@FindBy(id="floatingInput") WebElement id;
	@FindBy(id="floatingPassword") WebElement password1;
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement button;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	//	this.wait=new WebDriverWait(driver, 30);
		this.wait =new WebDriverWait(driver, Duration.ofSeconds(30));

	}
	public  void logindetails(String username,String Password)
	{try {
		wait.until(ExpectedConditions.visibilityOf(login)).click();
		wait.until(ExpectedConditions.visibilityOf(id)).sendKeys(username);
		wait.until(ExpectedConditions.visibilityOf(password1)).sendKeys(Password);
		wait.until(ExpectedConditions.visibilityOf(button)).click();

	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
