package com.stepdefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.LoginCrossWord;
import com.pages.TrackYourOrder;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrackTourOrderStepDef extends Library{
	LoginCrossWord login;
	TrackYourOrder track;
	SeleUtil util;
	Logger LOG=LogManager.getLogger(LoginCrossWord.class.getName());
	//Launching the browser and login into the website
	@Given("^I want to get into the homepage$")
	public void i_want_to_get_into_the_homepage() throws IOException 
	{
	loginpage();
	login= new LoginCrossWord(driver);
login.login();
login.EnterEmail("harsha@gmail.com");
login.EnterPassword("harsha123");
login.ClickLogin();
LOG.info("Browser is opened and login successfully in website");
track=new TrackYourOrder(driver);
track.ClickTrackYourOrder();
util=new SeleUtil(driver);
//Taking the ScreenShot
util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\homepage4.png");


	}
	//Calling ClickTrackYourOrder() from TrackYourOrder page
	@When("^homepage is launched and i click on track your order$")
	public void homepage_is_launched_and_i_click_on_track_your_order() 
	{
		track=new TrackYourOrder(driver);
		track.ClickTrackYourOrder();
		LOG.info("Clicked on track your order");
	}
	//Calling EntOrderNumber() from TrackYourOrder page
	@Then("^I enter product number \"([^\"]*)\"$")
	public void i_enter_product_number(String OdNum)
	{track=new TrackYourOrder(driver);
		track.EntOrderNumber(OdNum);
		LOG.info("order number is entered");
	}
	//Calling ClickSubmit() from TrackYourOrder page
	@Then("^I click on track button$")
	public void i_click_on_track_button()
	{track=new TrackYourOrder(driver);
		track.ClickSubmit();
		LOG.info("track button is clicked");
	}

	@Then("^I receive feedback that Invalid order number or email$")
	public void I_receive_feedback_that_Invalid_order_number_or_email() 
	{
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\TrackingOrder.png");
		LOG.info("Screenshot taken Successfully");
	}


}
