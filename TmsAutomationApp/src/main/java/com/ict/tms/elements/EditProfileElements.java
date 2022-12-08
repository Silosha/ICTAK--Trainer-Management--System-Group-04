
package com.ict.tms.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Silosha
 */
public class EditProfileElements {

	private WebDriver driver;

	@FindBy(id = "trainerName")
	private WebElement name;
	
	@FindBy(id = "phoneNo")
	private WebElement phone;
	
	@FindBy(id = "emailId")
	private WebElement email;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "qualification")
	private WebElement qualification;
	
	@FindBy(id = "company")
	private WebElement company;
	
	@FindBy(id = "designation")
	private WebElement designation;
	
	@FindBy(id = "skillSets")
	private WebElement skillSets;
	
	@FindBy(id = "profileImgUpload")
	private WebElement profileImage;
	
	@FindBy(id = "btnEdit")
	private WebElement editButton;

	public EditProfileElements(WebDriver webDriver) {
		this.driver = webDriver;
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
	
	public WebElement getEditButton() {
		return editButton;
	}
}
