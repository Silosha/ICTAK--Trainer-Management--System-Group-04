package org.kkem.pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminApprovePage {
	WebDriverWait wait;
	WebDriver driver;
	@FindBy(id="emptype") WebElement emptype;
	@FindBy(linkText = "Approve") WebElement approve;
	public AdminApprovePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		//this.wait=new WebDriverWait(driver, 30);
		this.wait =new WebDriverWait(driver, Duration.ofSeconds(30));

	}
	public void adminapproval() {
		try {
		 Select oselect = new Select(wait.until(ExpectedConditions.visibilityOf(emptype))); 
		  oselect.selectByVisibleText("Internal");
		  wait.until(ExpectedConditions.visibilityOf(approve)).click();
	}catch (Exception e) {
		// TODO: handle exception
	}}
}
