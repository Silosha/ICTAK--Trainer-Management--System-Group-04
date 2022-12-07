package com.ict.tms.script.login;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ict.tms.config.AbstractBaseTest;
import com.ict.tms.pages.LoginPage;
import com.ict.tms.util.ExcelUtil;

/**
 * 
 * @author Silosha
 *
 */
public class LoginScripts extends AbstractBaseTest {
	
	private LoginPage login() {
		return App().Page().login();
	}
	
	@Test
	public void verifyValidLogin() {
		
		String emailId = ExcelUtil.getCellData(0, 0);
		String password = ExcelUtil.getCellData(0, 1);
		
		App().Flow().navigateTo("https://trainermanagement.herokuapp.com/");
		
		login().sendEmailAddress(emailId);
		
		login().sendPassword(password);
		
		login().clickLogin();		
		
		WebDriverWait wait = App().Flow().ofWebDriverWait(10L);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("app-admindash")));
		// actual url
		String expected = "https://trainermanagement.herokuapp.com/profile";
		String currentUrl = App().Flow().getCurrentUrl();
		
		Assert.assertEquals(expected, currentUrl);
	}

}
