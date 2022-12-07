package org.kkem.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myallocdetails {
		
		WebDriver driver;
		WebDriverWait wait;
		JavascriptExecutor js;
		@FindBy(linkText = "My Allocation Details") WebElement Myallocdetails;
		@FindBy(linkText = " 🚩 Course Information") WebElement courseinfo;
		@FindBy(linkText = " Start Date") WebElement startdate;
		@FindBy(linkText = "End Date	") WebElement enddate;
		@FindBy(linkText = "Time") WebElement time;
		@FindBy(linkText = "Course Name") WebElement course;
		@FindBy(linkText = "Course ID") WebElement courseid;
		@FindBy(linkText = "Batch ID") WebElement batchid;
		@FindBy(linkText = "Venue") WebElement linktext;
		@FindBy(linkText = "Schedule") WebElement schedule;
		
		
		
		
		
		
		public Myallocdetails(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
		}
		
		public void Courseinformation(WebDriver driver){
			wait.until(ExpectedConditions.visibilityOf(Myallocdetails)).click();
			WebElement startdate = driver.findElement(By.linkText("Start Date"));
			startdate.isDisplayed();
			WebElement enddate = driver.findElement(By.linkText("End Date"));
			enddate.isDisplayed();
			WebElement time = driver.findElement(By.linkText("Time"));
			time.isDisplayed();
			WebElement course = driver.findElement(By.linkText("Course Name"));
			course.isDisplayed();
			WebElement courseid = driver.findElement(By.linkText("Course ID"));
			courseid.isDisplayed();
			WebElement batchid = driver.findElement(By.linkText("Batch ID"));
			batchid.isDisplayed();
			WebElement venue = driver.findElement(By.linkText("Venue"));
			venue.isDisplayed();
			WebElement schedule = driver.findElement(By.linkText("Schedule"));
			schedule.isDisplayed();
			WebElement link = driver.findElement(By.linkText("https://meet.google.com/"));
			link.isEnabled(); 
			
			
			
			
		   
			
		}



}
