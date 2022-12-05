package com.ict.tms.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {

	private WebDriver driver;
	private PageLib pageLib;
	private FlowLib flow;

	public AppLib(WebDriver driver) {
		this.driver = driver;

		this.pageLib = new PageLib(this.driver);
		this.flow = new FlowLib(this.driver);
	}

	public PageLib Page() {
		return pageLib;
	}

	public FlowLib Flow() {
		return flow;
	}
}
