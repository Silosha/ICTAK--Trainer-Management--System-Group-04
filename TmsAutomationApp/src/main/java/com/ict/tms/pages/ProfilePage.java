package com.ict.tms.pages;

import org.openqa.selenium.WebDriver;

import com.ict.tms.elements.ProfilePageElements;

/**
 * @author Silosha
 */
public class ProfilePage {
	
	private WebDriver webDriver;
	private ProfilePageElements profilePageElements;
	
	public ProfilePage(WebDriver webDriver) {
		this.webDriver = webDriver;		
		this.profilePageElements = new ProfilePageElements(this.webDriver);
	}
	
	private ProfilePageElements ofProfilePageElements() {
		return profilePageElements;
	}
	
	public String getTrainerName() {
		return ofProfilePageElements().getName().getText();
	}
	
	public String getTrainerEmail() {
		return ofProfilePageElements().getEmail().getText();
	}
	
	public String getTrainerAddress() {
		return ofProfilePageElements().getAddress().getText();
	}
	
	public String getTrainerPhone() {
		return ofProfilePageElements().getPhone().getText();
	}
	
	public String getTraineCompany() {
		return ofProfilePageElements().getCompany().getText();
	}
	
	public String getTrainerQualification() {
		return ofProfilePageElements().getQualification().getText();
	}
	
	public String getTrainerDesignation() {
		return ofProfilePageElements().getDesignation().getText();
	}
	
	public String getTrainerSkillsets() {
		return ofProfilePageElements().getSkillSets().getText();
	}
	
	public String getTrainerProfileImage() {
		return ofProfilePageElements().getProfileImage().getText();
	}
	
	public void clickEditProfileButton() {
		ofProfilePageElements().getEditProfileButton().click();
	}
	
	public boolean isEditProfileButtonVisible() {
		return ofProfilePageElements().getEditProfileButton().isDisplayed();
	}
}
