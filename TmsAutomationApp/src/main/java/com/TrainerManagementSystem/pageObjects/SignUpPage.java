package com.TrainerManagementSystem.pageObjects;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
WebDriver localdriver;
	
	public SignUpPage(WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@CacheLookup
	@FindBy(how=How.ID,using="name")
	WebElement Name;
	
	@CacheLookup
	@FindBy(how=How.ID,using="email")
	WebElement Email;
	
	@CacheLookup
	@FindBy(how=How.ID,using="phone")
	WebElement Mobileno;
	
	@CacheLookup
	@FindBy(how=How.ID,using="address")
	WebElement Address;
	
	@CacheLookup
	@FindBy(how=How.ID,using="h_qualification")
	WebElement Qualification;
	
	@CacheLookup
	@FindBy(how=How.ID,using="skillSet")
	WebElement SkillSet;
	
	@CacheLookup
	@FindBy(how=How.ID,using="company_name")
	WebElement Companyname;
	
	@CacheLookup
	@FindBy(how=How.ID,using="designation")
	WebElement CurrentDesignation;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//input[@type=\"file\"]")
	WebElement PhotoUpload;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//span[text()=\"Choose Courses\"]")
	WebElement courses;
	
	@CacheLookup
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@CacheLookup
	@FindBy(how=How.ID,using="re_password")
	WebElement Repassword;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Sign Up')]")
	WebElement SubmitBtn;
	
	@CacheLookup
	@FindBy(how=How.XPATH,using="//*[@id=\"navbarNav\"]/ul/li[3]/a")
	WebElement SignUp;
	
	public void SignUp() {
		
		SignUp.click();
	}
	
	public void TrainerName(String name) {
		Name.sendKeys(name);
	}
	
	public void TrainerEmail(String email) {
		Email.sendKeys(email);
	}
	
	public void TrainerMobileNo(String mobileno) {
		Mobileno.sendKeys(mobileno);
	}
	
	public void TrainerAddress(String address) {
		Address.sendKeys(address);
	}
	
	public void TrainerQualification(String qualification) {
		Qualification.sendKeys(qualification);
	}
	
	public void TrainerSkillSet(String skillset) {
		SkillSet.sendKeys(skillset);
	}
	
	public void TrainerCompanyName(String companyname) {
		Companyname.sendKeys(companyname);
	}
	
	public void TrainerCurrentDesignation(String currentdesignation) {
		JavascriptExecutor js = (JavascriptExecutor) localdriver;
		js.executeScript("arguments[0].scrollIntoView();", CurrentDesignation);
		CurrentDesignation.sendKeys(currentdesignation);
	}
	
	public void TrainerPhotoUpload(String photopath) {
		JavascriptExecutor js = (JavascriptExecutor) localdriver;
		js.executeScript("arguments[0].scrollIntoView();", PhotoUpload);
		PhotoUpload.sendKeys(photopath);
	}
	
	public void TrainerCourses(String crse) throws InterruptedException {
		
		
		courses.click();
		Thread.sleep(3000);
		List<WebElement> course=localdriver.findElements(By.xpath("//ul[@Class='item2']/li"));
		course.size();
		for(WebElement ctype: course) {
			if(ctype.getText().equals(crse)) {
			ctype.click();
			break;
			}
		}	
		
	}
	
	public void TrainerPassword(String pwd) {
		Actions act=new Actions(localdriver);
		act.doubleClick(password).perform();
		password.sendKeys(pwd);
	}
	
	public void TrainerRetypepassword(String repwd) {
		Repassword.sendKeys(repwd);
		
		
	}
	
	public void Submit() throws InterruptedException {
		boolean st=SubmitBtn.isEnabled();
		if(st==true) {
		JavascriptExecutor js = (JavascriptExecutor) localdriver;
		js.executeScript("arguments[0].click();", SubmitBtn);
		/*SubmitBtn.click();*/
		}
		
	}
	
	public boolean isAlertPresent() {
		try {
			Alert alert=localdriver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
	}

}
