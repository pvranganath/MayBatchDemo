package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.BaseTest;
import com.orangehrm.utils.ReadFile;


public class LoginTests extends BaseTest{
	String configFile="E:\\FEB\\hrmgt\\src\\test\\resources\\Config.properties";
	@Test
	public void verifyLogin() throws Exception {
		logger=extent.createTest("verifyLogin");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.doLogin(ReadFile.ReadFileData(configFile).getProperty("username"), ReadFile.ReadFileData(configFile).getProperty("password"));
		Assert.assertTrue(true);
                // This is from Tech robots
		
		
	}
	
	@Test
	public void m1() throws Exception {
		logger=extent.createTest("m1");
		Assert.assertTrue(false);
		
		
	}
	@Test
	public void m2() throws Exception {
		logger=extent.createTest("m2");
		throw new SkipException("test");
		
		
	}
	@Test
	public void m3() throws Exception {
		logger=extent.createTest("m3");
		Assert.assertTrue(false);
		
		
	}
	@Test
	public void m4() throws Exception {
		logger=extent.createTest("m4");
		Assert.assertTrue(true);
		
		
	}
	@Test
	public void m5() throws Exception {
		logger=extent.createTest("m5");
		Assert.assertTrue(true);
		
		
	}
	
	
}
