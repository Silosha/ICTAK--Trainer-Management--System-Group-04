package org.kkem.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllocationPage {
	WebDriverWait wait;
	JavascriptExecutor js;
	@FindBy(linkText = "Allocate")
	WebElement allocate;
	@FindBy(xpath = "//input[@placeholder=\\\"Type to search\\\"]")
	WebElement search;
	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement approve;
	@FindBy(id = "courseid")
	WebElement courseid;
	@FindBy(id = "batchid")
	WebElement batchid;
	@FindBy(id = "scheduletime")
	WebElement stime;
	@FindBy(id = "startdate")
	WebElement sdate;
	@FindBy(id = "enddate")
	WebElement enddate;
	@FindBy(id = "venue")
	WebElement venue;
	@FindBy(xpath = "//button[@type=\\\"submit\\\"]")
	WebElement button;

	public AllocationPage(WebDriver driver)
     {
		
		PageFactory.initElements(driver, this);
		this.wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;

	}

	public void allocationsearchbyname(String name) {
		try {
			wait.until(ExpectedConditions.visibilityOf(allocate)).click();
			wait.until(ExpectedConditions.visibilityOf(search)).sendKeys(name);
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void allocationsearchbyskill(String skill) {
		try {
			// wait.until(ExpectedConditions.visibilityOf(allocate)).click();
			wait.until(ExpectedConditions.visibilityOf(search)).sendKeys(skill);
			Thread.sleep(2000);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void allocationsearchbytrainertype(String trainertype) {
		try {
			// wait.until(ExpectedConditions.visibilityOf(allocate)).click();
			wait.until(ExpectedConditions.visibilityOf(search)).sendKeys(trainertype);
			Thread.sleep(2000);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void allocationsearchbycourses(String courses) {
		try {
			// wait.until(ExpectedConditions.visibilityOf(allocate)).click();
			wait.until(ExpectedConditions.visibilityOf(search)).sendKeys(courses);
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void allocationdetails(String course, String batch, String time, String startdate, String edate,
			String Venue1) {
		try {
			wait.until(ExpectedConditions.visibilityOf((approve)));
			js.executeScript("arguments[0].scrollIntoView();", approve);
			approve.click();
			Thread.sleep(1000);
			Select ocourse = new Select(wait.until(ExpectedConditions.visibilityOf((courseid))));
			ocourse.selectByVisibleText(course);
			Thread.sleep(1000);
			Select obatch = new Select(wait.until(ExpectedConditions.visibilityOf((batchid))));
			obatch.selectByVisibleText(batch);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(stime)).sendKeys(time);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(sdate)).sendKeys(startdate);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(enddate)).sendKeys(edate);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(venue)).sendKeys(Venue1);
			Thread.sleep(1000);

			wait.until(ExpectedConditions.visibilityOf(button));
			js.executeScript("arguments[0].click();", button);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
