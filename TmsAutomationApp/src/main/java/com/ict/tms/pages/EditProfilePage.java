package com.ict.tms.pages;

import org.openqa.selenium.WebDriver;

import com.ict.tms.elements.EditProfileElements;

/**
 * @author Silosha
 */
public class EditProfilePage {

	private WebDriver driver;
	private EditProfileElements editProfileElements;

	public EditProfilePage(WebDriver driver) {
		this.driver = driver;
		this.editProfileElements = new EditProfileElements(this.driver);
	}

	private EditProfileElements ofEditProfileElements() {
		return editProfileElements;
	}

	public void sendName(String name) {
		ofEditProfileElements().getName().sendKeys(name);
	}
	
	public void sendPhone(String phone) {
		ofEditProfileElements().getPhone().sendKeys(phone);
	}
	
	public void sendAddress(String address) {
		ofEditProfileElements().getAddress().sendKeys(address);
	}
	
	public void sendEmail(String email) {
		ofEditProfileElements().getEmail().sendKeys(email);
	}
	
	public void sendQualification(String qualification) {
		ofEditProfileElements().getQualification().sendKeys(qualification);
	}
	
	public void sendCompany(String company) {
		ofEditProfileElements().getCompany().sendKeys(company);
	}
	
	public void sendDesignation(String designation) {
		ofEditProfileElements().getDesignation().sendKeys(designation);
	}
	
	public void sendSkillSets(String skillSets) {
		ofEditProfileElements().getSkillSets().sendKeys(skillSets);
	}
	
	public void sendProfileImage(String image) {
		ofEditProfileElements().getProfileImage().sendKeys(image);
	}
	
	public void clickEditButton() {
		ofEditProfileElements().getEditButton().click();
	}

}
