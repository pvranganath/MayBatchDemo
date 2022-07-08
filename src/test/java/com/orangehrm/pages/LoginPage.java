package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	
   

	public LoginPage(WebDriver driver) {
		
		
		 PageFactory.initElements(driver,this);
		
		
	}
    
    
	public void doLogin(String username,String pwd) {
		
		userName.sendKeys(username);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	
	
	
	
	
}
