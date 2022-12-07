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
	
	public String getTrainerName() {
		return profilePageElements.getName().getText();
	}
	
	public String getTrainerEmail() {
		return profilePageElements.getEmail().getText();
	}
	
	public String getTrainerAddress() {
		return profilePageElements.getAddress().getText();
	}
	
	public String getTrainerPhone() {
		return profilePageElements.getPhone().getText();
	}
	
	public String getTraineCompany() {
		return profilePageElements.getCompany().getText();
	}
	
	public String getTrainerQualification() {
		return profilePageElements.getQualification().getText();
	}
	
	public String getTrainerDesignation() {
		return profilePageElements.getDesignation().getText();
	}
	
	public String getTrainerSkillsets() {
		return profilePageElements.getSkillSets().getText();
	}
	
	public String getTrainerProfileImage() {
		return profilePageElements.getProfileImage().getText();
	}
	
	public void clickEditProfileButton() {
		profilePageElements.getEditProfileButton().click();
	}
}
