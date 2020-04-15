package com.stepdefination;

import com.baseclass.Library;
import com.pages.LoginCrossWord;
import com.pages.Stationary_page;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stationary_stepdef extends Library
{SeleUtil util;
LoginCrossWord Login;
	Stationary_page sp;
	//Launching the browser and login into the website	
	@Given("^I logged in to the website$")
	public void i_logged_in_to_the_website() throws Throwable 
	{
		loginpage();
		Login= new LoginCrossWord(driver);
	Login.login();
	Login.EnterEmail("harsha@gmail.com");
	Login.EnterPassword("harsha123");
	Login.ClickLogin();

util=new SeleUtil(driver);
//Taking the ScreenShot
util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\homepage5.png");
	}
	//Calling Stationary() from Stationary_page
	@When("^I click on Stationary button$")
	public void i_click_on_Stationary_button() throws Throwable 
	{
	   sp=new Stationary_page(driver);
	   sp.Stationary();
	   Thread.sleep(900);
	}

	@Then("^I landed on stationary page$")
	public void i_landed_on_stationary_page() throws Throwable 
	{
		 util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\\\Users\\\\harsha vardhan\\\\Desktop\\\\selenium\\\\CTSPROJECT\\\\src\\\\test\\\\resources\\\\ScreenShot\\\\Stationary.png");
	}
}
