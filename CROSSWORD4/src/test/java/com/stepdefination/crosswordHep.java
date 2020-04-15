package com.stepdefination;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Help_page;
import com.pages.LoginCrossWord;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class crosswordHep extends Library{
	Logger LOG = Logger.getLogger("devpinoyLogger");
	Help_page hp;
	SeleUtil util;
	//Launching the browser and login into the website	
	@Given("^I am logged in to the website$")
	public void i_am_logged_in_to_the_website() throws Throwable {
		loginpage();
		LoginCrossWord lp= new LoginCrossWord(driver);
		lp.login();
		lp.EnterEmail("harsha@gmail.com");
		lp.EnterPassword("harsha123");
		lp.ClickLogin();
	    Thread.sleep(900);
	    LOG.info("loginpage is opened");
	    
	}
	//Calling Help() from Help_page
	@When("^I have clicked on to the Help$")
	public void i_have_clicked_on_to_the_Help() throws Throwable {
	 hp= new Help_page(driver);
		hp.Help();
		LOG.info("Help button clicked");
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\helppage.png");
  	
	}
	//Calling Faqs() from Help_page
	@Then("^I click on faqs that i want$")
	public void i_click_on_faqs_that_i_want() throws Throwable {
		hp=new Help_page(driver);
		hp.Faqs();
		LOG.info("faqs have clicked");
		util=new SeleUtil(driver);
		
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\faq.png");
  
	}
}
