package com.stepdefination;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.LoginCrossWord;
import com.pages.Mycart_page;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrosswordMycart extends Library {
	SeleUtil util;
	Logger LOG = Logger.getLogger("devpinoyLogger");
	//Launching the browser and login into the website
	@Given("^I logged on to the Website$")
	public void i_logged_on_to_the_Website() throws Throwable {
		loginpage();
		LoginCrossWord lp= new LoginCrossWord(driver);
		lp.login();
		
		lp.EnterEmail("harsha@gmail.com");
		lp.EnterPassword("harsha123");
		lp.ClickLogin();
  Thread.sleep(900);
	    LOG.info("login page is opened");
	   
	}
	//Calling Mycart_button() from Mycart_page
	@When("^I clicked on mycart$")
	public void i_clicked_on_mycart() throws Throwable
	{
		Mycart_page Mp= new Mycart_page(driver);
		
		Mp.Mycart_button();
		LOG.info("mycart is clicked");
	
		
	   
	}
	//Calling continueshop() from Mycart_page
	@Then("^I select continue shopping$")
	public void i_select_continue_shopping() throws Throwable {
		Mycart_page Mp= new Mycart_page(driver);
		Mp.continueshop();
		LOG.info("continue shopping clicked");
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\continueshopping2.png");

	}
	
}
