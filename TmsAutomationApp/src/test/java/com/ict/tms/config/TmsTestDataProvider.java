package com.ict.tms.config;

import org.testng.annotations.DataProvider;

public class TmsTestDataProvider {
	
	@DataProvider
	public String[][] loginCredentials(){
		return new String[][]{{"deepu@ict.com", "d33pu123", "https://trainermanagement.herokuapp.com/login"}};
	}
	
	@DataProvider
	public String[][] trainerLoginCredentials(){
		return new String[][]{{"deepu@ict.com", "d33pu123", "https://trainermanagement.herokuapp.com/"}};
	}
}
