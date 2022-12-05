package com.ict.tms.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ict.tms.lib.AppLib;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractBaseTest {

	protected WebDriver driver;
	private Properties prop;
	private AppLib app;

	private void loadProperties() {
		try {
			String projectDir = System.getProperty("user.dir");
			prop = new Properties();
			FileInputStream inputStream = new FileInputStream(
					projectDir + File.separator + "src/test/resources/config.properties");
			prop.load(inputStream);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public AppLib App() {
		return app;
	}
	
	public Properties Prop() {
		return prop;
	}

	@BeforeMethod
	public void setUp() {
		loadProperties();
		String browser = prop.getProperty("browser");

		if ("chrome".equals(browser)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		app = new AppLib(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
