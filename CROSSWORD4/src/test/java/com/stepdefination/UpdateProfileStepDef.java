package com.stepdefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.LoginCrossWord;
import com.pages.UpdateProfile;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdateProfileStepDef extends Library {
UpdateProfile updateprofile;
LoginCrossWord Login;
SeleUtil util;
Logger LOG=LogManager.getLogger(LoginCrossWord.class.getName());
//Launching the browser and login into the website
	@Given("^I want to launch the homepage$")
	public void i_want_to_launch_the_homepage() throws IOException  {
		loginpage();
		Login= new LoginCrossWord(driver);
	Login.login();
	Login.EnterEmail("harsha@gmail.com");
	Login.EnterPassword("harsha123");
	Login.ClickLogin();
	LOG.info("Browser is opened and login successfully in website");
	util=new SeleUtil(driver);
	//Taking the ScreenShot	
	util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\homepage3.png");

	}
	//Calling MyAccount() from UpdateProfile
	@When("^homepage is launched and i click on Myaccount button$")
	public void homepage_is_launched_and_i_click_on_Myaccount_button() throws InterruptedException
	{
		updateprofile= new UpdateProfile(driver);
Thread.sleep(700);
		updateprofile.MyAccount();
		LOG.info("MyAccount is clicked");
		
	}
	//Calling UpdateProfileBtn() from UpdateProfile
	@Then("^I click on update profile$")
	public void i_click_on_update_profile()
	{
		updateprofile= new UpdateProfile(driver);

		updateprofile.UpdateProfileBtn();
		LOG.info("Update Profile is selected");
		
	}
	
	
	//Calling Mobile(), landline() from UpdateProfile
	@Then("^I update my details mobile number \"([^\"]*)\" and landline \"([^\"]*)\"$")
	public void i_update_my_details_mobile_number_and_landline(String number, String landline) 
	{
		updateprofile= new UpdateProfile(driver);

		updateprofile.Mobile(number);
		updateprofile.landline(landline);
		LOG.info("Mobile number and landline are entered");
		
	}
	//Calling Update() from UpdateProfile
	@Then("^I click the update button$")
	public void i_click_the_update_button()
	{
		updateprofile= new UpdateProfile(driver);
		updateprofile.Update();
		LOG.info("Update button is clicked");
		
	}

	@Then("^I recceive feedback that Your Profile is successfully updated$")
	public void i_recceive_feedback_that_Your_Profile_is_successfully_updated() 
	{util=new SeleUtil(driver);
	//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\ProfileUpdate.png");
		LOG.info("Screenshot taken Successfully");
	}

}
