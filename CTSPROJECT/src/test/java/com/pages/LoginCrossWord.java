package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class LoginCrossWord {
	WebDriver driver;
	//Identifying the Locators
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[2]")
	WebElement login;
	@FindBy(xpath="//*[@id='user_session_email']")
	WebElement Email;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div[3]/div[1]/form/fieldset/p[2]/input")
	WebElement Password;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div[3]/div[1]/form/fieldset/p[3]/input")
	WebElement loginbtn;
	//Pointing to the Current Driver
	public LoginCrossWord(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	//Clicking on the Login Icon
	public void login()
	{
		login.click();
	}
	//Entering the Email
	public void EnterEmail(String email)
	{
		Email.sendKeys(email);
	}
	//Entering the password
	public void EnterPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	//Clicking on the Login button
	public void ClickLogin()
	{
		loginbtn.click();
		
	}
	
}