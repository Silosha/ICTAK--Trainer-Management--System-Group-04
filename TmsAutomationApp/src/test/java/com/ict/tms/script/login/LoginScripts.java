package com.ict.tms.script.login;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ict.tms.config.AbstractBaseTest;
import com.ict.tms.pages.LoginPage;

/**
 * 
 * @author Silosha
 *
 */
public class LoginScripts extends AbstractBaseTest {
	
	private LoginPage login() {
		return App().Page().ofLogin();
	}
	
	@Test(dataProvider = "loginCredentials", dataProviderClass = com.ict.tms.config.TmsTestDataProvider.class)
	public void verifyValidLogin(String email, String pwd, String url) {
		
		Flow().navigateTo(url);
		
		login().sendEmailAddress(email);
		
		login().sendPassword(pwd);
		
		login().clickLogin();		
		
		WebDriverWait wait = Flow().ofWebDriverWait(10L);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("app-admindash")));
		
		String expected = "https://trainermanagement.herokuapp.com/profile";
		String currentUrl = Flow().getCurrentUrl();
		
		AssertJUnit.assertEquals(expected, currentUrl);
	}

}
