package com.stepdefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.LoginCrossWord;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination extends Library {
	SeleUtil util;
	LoginCrossWord login;
	Logger LOG=LogManager.getLogger(LoginCrossWord.class.getName());
	//Calling loginpage() from library
	@Given("^I want to launch the website$")
	public void i_want_to_launch_the_website() throws IOException {
	  
		loginpage();
	  LOG.info("browser is launched and url is opened"); 
	}

	@When("^website is launched$")
	public void website_is_launched() 
	{
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\WebsiteLunched1.png");
		LOG.info("ScreenShot took Successfully");
	}
	//Calling login() from LoginCrossWord page
	@Then("^Click on the login button$")
	public void click_on_the_login_button()
	{
		login=new LoginCrossWord(driver);
		login.login();
		LOG.info("Login button is clicked");
	}
	
	@Then("^login page is opened$")
	public void login_page_is_opened()
	{
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\LoginPageOpened1.png");
		LOG.info("login page is opened");
	}
	//Calling EnterEmail(),EnterPassword() from LoginCrossWord page
	@Then("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String email, String pwd)
	{
		login=new LoginCrossWord(driver);
		login.EnterEmail(email);
		login.EnterPassword(pwd);	  
		LOG.info("email and password are entered");
	}

	//Calling ClickLogin() from LoginCrossWord page
	@Then("^The login button is clicked$")
	public void the_login_button_is_clicked()
	{
		login=new LoginCrossWord(driver);
		login.ClickLogin();
		LOG.info("login button is clicked successfully");
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\loginsuccessful.png");
    
	}
	
}
