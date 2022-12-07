package org.kkem.tmstests;

import java.io.IOException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.kkem.excelutilities.Excelutility1;
import org.kkem.pages.Loginpage;
import org.kkem.pages.Myallocdetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TmsMain1 {
	
	WebDriver driver;
	
	public void validations() throws IOException  {
		
		Excelutility1 oexcelutility = new Excelutility1("D:\\eclipse_projects_vol2\\Ictak.tmsdemo\\data", "tms");
		for (int rowNO = 1; rowNO<= oexcelutility.getTotalRows(); rowNO++) {
			
			driver.navigate().to("https://trainermanagement.herokuapp.com/");
			
			String username = oexcelutility.getExcelData(rowNO, "mail id");
			String pass = oexcelutility.getExcelData(rowNO, "password");
			
			Loginpage otrainer = new Loginpage(driver);
			otrainer.logindetails(username, pass);
			
			Myallocdetails myalloc = new Myallocdetails(driver);
			myalloc.Courseinformation(driver);
			
			
      }
	}
	
	@BeforeTest
	public void beforetest() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse_projects_vol2\\Ictak.tmsdemo\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterTest
	public void aftertest() {
		
		//driver.close();
	}
	

	
	
}
