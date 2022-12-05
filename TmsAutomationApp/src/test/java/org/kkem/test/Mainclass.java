package org.kkem.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.kkem.excelutilities.ExcelUtilities;
import org.kkem.pageclass.ViewalPage;
import org.kkem.pageclass.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Mainclass {

	WebDriver driver;

	@Test

	public void f() throws IOException {

		ExcelUtilities oexxcelutility = new ExcelUtilities("C:\\Users\\Hp\\Desktop\\TMS.xlsx", "Sheet1");
		for (int rowN0 = 1; rowN0 <= oexxcelutility.getTotalRows(); rowN0++) {
			driver.navigate().to("https://trainerman\r\n" + "agement.herokua\r\n" + "pp.com/");
			Assert.assertEquals(driver.getTitle(), "Trainer Management System");
			Reporter.log("<br>teststeppass::Sucessfully validated Title of page</br>");
			String username = oexxcelutility.getExcelData(rowN0, "username");
			String pwd = oexxcelutility.getExcelData(rowN0, "Password");
			String fname = oexxcelutility.getExcelData(rowN0, "fname");

			LoginPage ologin = new LoginPage(driver);
			ologin.logindetails2(username, pwd);
			Reporter.log("<br>teststeppass::Sucessfully validated login page</br>");

			ViewalPage oview = new ViewalPage(driver);
			oview.trainerdetails2(fname);
			Reporter.log("<br>teststeppass::Sucessfully validated trainer detailse</br>");

		}
	}

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
