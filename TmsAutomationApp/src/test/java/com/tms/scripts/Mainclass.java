package com.tms.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.kkem.pages.AdminApprovePage;
import org.kkem.pages.AllocationPage;
import org.kkem.pages.LoginPage;
import org.kkem.utilities.ExcelUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Mainclass {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	  ExcelUtility oexxcelutility = new ExcelUtility("E:\\TMS1\\src\\main\\resources\\tmsdata.xlsx", "tms");
		for (int rowN0 = 1; rowN0 <= oexxcelutility.getTotalRows(); rowN0++) {
			driver.navigate().to("https://trainerman\r\n" + "agement.herokua\r\n" + "pp.com/");

			Assert.assertEquals(driver.getTitle(), "Trainer Management System");
			Reporter.log("<br>teststeppass::Sucessfully validated Title of page</br>");
			String username = oexxcelutility.getExcelData(rowN0, "username");
			String pwd = oexxcelutility.getExcelData(rowN0, "Password");
			String name = oexxcelutility.getExcelData(rowN0, "name");
			String courses = oexxcelutility.getExcelData(rowN0, "courses");
			String skill = oexxcelutility.getExcelData(rowN0, "skill");
			String trainertype = oexxcelutility.getExcelData(rowN0, "trainertype");

			String course = oexxcelutility.getExcelData(rowN0, "course");
			String batch = oexxcelutility.getExcelData(rowN0, "batch");

			String time = oexxcelutility.getExcelData(rowN0, "time");
			String startdate = oexxcelutility.getExcelData(rowN0, "startdate");
			String edate = oexxcelutility.getExcelData(rowN0, "edate");
			String Venue1 = oexxcelutility.getExcelData(rowN0, "Venue1");

			LoginPage ohome = new LoginPage(driver);
			ohome.logindetails(username, pwd);
			Reporter.log("<br>teststeppass::Sucessfully validated login detailse</br>");

			AdminApprovePage oadmin = new AdminApprovePage(driver);
			oadmin.adminapproval();
			Reporter.log("<br>teststeppass::Sucessfully approved trainer</br>");

			AllocationPage oallocation = new AllocationPage(driver);
			oallocation.allocationsearchbyname(name);
			Reporter.log("<br>teststeppass::Sucessfully searched trainer by name</br>");
			oallocation.allocationsearchbycourses(courses);
			oallocation.allocationsearchbyskill(skill);
			Reporter.log("<br>teststeppass::Sucessfully searched trainer by skill</br>");
			oallocation.allocationsearchbytrainertype(trainertype);
			Reporter.log("<br>teststeppass::Sucessfully searched trainer by Trainertype</br>");
			oallocation.allocationdetails(course, batch, time, startdate, edate, Venue1);
			Reporter.log("<br>teststeppass::Sucessfully allocated trainer</br>");

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
  public void afterTest() {// driver.close();
  }

}
