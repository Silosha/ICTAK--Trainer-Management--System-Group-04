package com.ict.tms.lib;

import org.openqa.selenium.WebDriver;

/**
 * @author Silosha
 */
public class AppLib {

	private WebDriver driver;
	private PageLib pageLib;

	public AppLib(WebDriver driver) {
		this.driver = driver;
		this.pageLib = new PageLib(this.driver);
	}

	public PageLib Page() {
		return pageLib;
	}

}
