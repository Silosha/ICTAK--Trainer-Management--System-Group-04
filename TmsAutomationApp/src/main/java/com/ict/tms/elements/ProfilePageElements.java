package com.ict.tms.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Silosha
 */
public class ProfilePageElements {

	private WebDriver driver;
	
	private WebElement name;
	private WebElement phone;
	private WebElement email;
	private WebElement address;
	private WebElement qualification;
	private WebElement company;
	private WebElement designation;
	private WebElement skillSets;
	private WebElement profileImage;	
	private WebElement editProfileButton;

	public ProfilePageElements(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(this.driver, this);
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getQualification() {
		return qualification;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getDesignation() {
		return designation;
	}

	public WebElement getSkillSets() {
		return skillSets;
	}

	public WebElement getProfileImage() {
		return profileImage;
	}

	public WebElement getEditProfileButton() {
		return editProfileButton;
	}
}
