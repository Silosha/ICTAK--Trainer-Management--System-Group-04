package com.ict.tms.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Silosha
 */
public class ProfilePageElements {

	private WebDriver driver;
	
	@FindBy(id = "trainerName")
	private WebElement name;
	
	@FindBy(id = "phoneNo")
	private WebElement phone;
	
	@FindBy(id = "emailId")
	private WebElement email;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "quali")
	private WebElement qualification;
	
	@FindBy(id = "company")
	private WebElement company;
	
	@FindBy(id = "designation")
	private WebElement designation;
	
	@FindBy(id = "skills")
	private WebElement skillSets;
	
	@FindBy(id = "profileImage")
	private WebElement profileImage;
	
	@FindBy(id = "btnEditProfile")
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
