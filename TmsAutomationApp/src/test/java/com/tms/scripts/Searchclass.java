package com.tms.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.kkem.excelutilities.ExcelUtility1;
import org.kkem.tmspagelevel.LoginPageone;
import org.kkem.tmspagelevel.Searchfilter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Searchclass {
	WebDriver driver;

  @Test
  public void f() throws IOException {
	  
	  ExcelUtility1 oexxcelutility = new ExcelUtility1("C:\\Users\\Hp\\Desktop\\tmsdata.xlsx", "saerch");
		for (int rowN0 = 1; rowN0 <= oexxcelutility.getTotalRows(); rowN0++) {
			driver.navigate().to("https://trainerman\r\n" + "agement.herokua\r\n" + "pp.com/");

			//Assert.assertEquals(driver.getTitle(), "Trainer Management System");
			Reporter.log("<br>teststeppass::Sucessfully validated Title of page</br>");
			String username = oexxcelutility.getExcelData(rowN0, "username");
			String password = oexxcelutility.getExcelData(rowN0, "Password");
			String fname = oexxcelutility.getExcelData(rowN0, "name1");
			
			LoginPageone ologin = new LoginPageone(driver);
			ologin.logindetails(username,password);
			Searchfilter osearch = new Searchfilter(driver);
			osearch.allocationsearchbyname(fname);
  }}
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\AutomationUtils\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
