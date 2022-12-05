package com.ict.tms.lib;

import org.openqa.selenium.WebDriver;

import com.ict.tms.pages.LoginPage;
import com.ict.tms.pages.ProfilePage;

public class PageLib {

	private WebDriver driver;
	private LoginPage loginPage;
	private ProfilePage profilePage;

	public PageLib(WebDriver driver) {
		this.driver = driver;

		initPages(this.driver);
	}

	private void initPages(WebDriver driver) {
		loginPage = new LoginPage(driver);
		profilePage = new ProfilePage(driver);
	}

	public LoginPage login() {
		return loginPage;
	}

	public ProfilePage profile() {
		return profilePage;
	}

}
