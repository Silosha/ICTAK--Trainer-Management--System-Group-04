package org.kkem.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchfilter {
	WebDriverWait wait;
	JavascriptExecutor js;
	@FindBy(linkText = "Allocate")
	WebElement allocate;
	@FindBy(xpath = "//input[@placeholder=\\\"Type to search\\\"]")
	WebElement search;
	public Searchfilter(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 60);
	}
	public void allocationsearchbyname(String fname) {
		try {
			wait.until(ExpectedConditions.visibilityOf(allocate)).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(search)).sendKeys(fname);
			Thread.sleep(2000);
			
}catch (Exception e) {
	// TODO: handle exception
}}}
