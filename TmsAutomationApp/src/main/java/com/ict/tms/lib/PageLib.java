package com.ict.tms.lib;

import org.openqa.selenium.WebDriver;

import com.ict.tms.pages.EditProfilePage;
import com.ict.tms.pages.HeadSection;
import com.ict.tms.pages.HomePage;
import com.ict.tms.pages.LoginPage;
import com.ict.tms.pages.ProfilePage;

/**
 * @author Silosha
 */
public class PageLib {

	private WebDriver driver;
	private LoginPage loginPage;
	private ProfilePage profilePage;
	private HomePage homePage;
	private EditProfilePage editProfilePage;
	private HeadSection headSection;

	public PageLib(WebDriver driver) {
		this.driver = driver;
		initPages(this.driver);
	}

	private void initPages(WebDriver driver) {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		profilePage = new ProfilePage(driver);
		editProfilePage = new EditProfilePage(driver);
		headSection = new HeadSection(driver);
	}

	public LoginPage ofLogin() {
		return loginPage;
	}

	public ProfilePage ofProfile() {
		return profilePage;
	}
	
	public HomePage ofHome() {
		return homePage;
	}
	
	public EditProfilePage ofEditProfilePage() {
		return editProfilePage;
	}
	
	public HeadSection ofHeadSection() {
		return headSection;
	}

}
