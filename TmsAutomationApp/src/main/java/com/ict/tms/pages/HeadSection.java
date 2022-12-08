package com.ict.tms.pages;

import org.openqa.selenium.WebDriver;

import com.ict.tms.elements.HeaderElements;

public class HeadSection {

	private WebDriver driver;
	private HeaderElements headerElements; 
	
	public HeadSection(WebDriver driver) {
		this.driver = driver;
		headerElements = new HeaderElements(this.driver);
	}
	
	private HeaderElements ofHeaderElements() {
		return headerElements;
	}
	
	public void clickogout() {
		ofHeaderElements().getLogout().click();
	}
	
}
