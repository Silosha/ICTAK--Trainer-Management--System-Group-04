package com.ict.tms.pages;

import org.openqa.selenium.WebDriver;

import com.ict.tms.elements.HomePageElements;

public class HomePage {

	private WebDriver driver;
	private HomePageElements homePageElements;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		homePageElements = new HomePageElements(this.driver);
	}

	private HomePageElements ofHomePageElements() {
		return homePageElements;
	}

	public void clickLoginLink() {
		ofHomePageElements().loginLink().click();
	}
}
