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

	public WebDriver getDriver() {
		return driver;
	}

	public EditProfileElements getEditProfileElements() {
		return editProfileElements;
	}

	public void sendName(String name) {
		getEditProfileElements().getName().sendKeys(name);
	}
	
	public void sendPhone(String phone) {
		getEditProfileElements().getPhone().sendKeys(phone);
	}
	
	public void sendAddress(String address) {
		getEditProfileElements().getAddress().sendKeys(address);
	}
	
	public void sendEmail(String email) {
		getEditProfileElements().getEmail().sendKeys(email);
	}
	
	public void sendQualification(String qualification) {
		getEditProfileElements().getQualification().sendKeys(qualification);
	}
	
	public void sendCompany(String company) {
		getEditProfileElements().getCompany().sendKeys(company);
	}
	
	public void sendDesignation(String designation) {
		getEditProfileElements().getDesignation().sendKeys(designation);
	}
	
	public void sendSkillSets(String skillSets) {
		getEditProfileElements().getSkillSets().sendKeys(skillSets);
	}
	
	public void clickEditButton() {
		getEditProfileElements().getEditButton().click();
	}

}
