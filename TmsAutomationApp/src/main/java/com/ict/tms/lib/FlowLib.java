package com.ict.tms.lib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Silosha
 */
public class FlowLib {
	
	private WebDriver driver;
	
	public FlowLib(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getWebDriver() {
		return this.driver;
	}
	
	public void navigateTo(String url) {
		this.driver.get(url);
	}
	
	public String getPageTitle() {
		return this.driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}
	
	public WebDriverWait ofWebDriverWait(long duration) {
		return new WebDriverWait(driver, Duration.ofSeconds(duration));
	}
}
