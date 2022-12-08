package com.ict.tms.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ict.tms.lib.AppLib;
import com.ict.tms.lib.FlowLib;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Silosha
 *
 */
public class AbstractBaseTest {

	protected WebDriver driver;
	private Properties prop;
	private AppLib app;
	private FlowLib flow;

	private void loadProperties() {
		try {			
			if (prop == null) {
				String projectDir = System.getProperty("user.dir");
				prop = new Properties();
				FileInputStream inputStream = new FileInputStream(
						projectDir + File.separator + "src/test/resources/config.properties");
				prop.load(inputStream);
			}
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
	
	public FlowLib Flow() {		
		return flow;
	}

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void setUp(@Optional("chrome") String browser) {
		loadProperties();
		if ("chrome".equals(browser)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if ("Firefox".equalsIgnoreCase(browser)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		app = new AppLib(driver);
		flow = new FlowLib(driver);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
}
