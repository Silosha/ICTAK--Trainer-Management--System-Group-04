package com.ict.tms.sneha;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriverWait wait;
	@FindBy(linkText="Login") WebElement login1;
	@FindBy(id="floatingInput") WebElement id1;
	@FindBy(id="floatingPassword") WebElement password;
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement button1;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.wait=new WebDriverWait(driver, 30);

	}
	public  void logindetails2(String username,String Password)
	{
		try {

		wait.until(ExpectedConditions.visibilityOf(login1)).click();
		wait.until(ExpectedConditions.visibilityOf(id1)).sendKeys(username);
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(Password);
		wait.until(ExpectedConditions.visibilityOf(button1)).click();
}catch (Exception e) {
	// TODO: handle exception
}
}}