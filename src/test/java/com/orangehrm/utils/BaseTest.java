package com.orangehrm.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.orangehrm.constants.CommonConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends BaseExtentReports {
	public WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		String configFile = "E:\\FEB\\hrmgt\\src\\test\\resources\\Config.properties";

		if (ReadFile.ReadFileData(configFile).getProperty("browser").equalsIgnoreCase(CommonConstants.CHROME_TEXT)) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (ReadFile.ReadFileData(configFile).getProperty("browser")
				.equalsIgnoreCase(CommonConstants.FIREFOX_TEXT)) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(ReadFile.ReadFileData(configFile).getProperty("URL"));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
