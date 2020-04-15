package com.stepdefination;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.CustomerCare;
import com.pages.LoginCrossWord;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerCareStepDef extends Library{
	
	LoginCrossWord login;
	CustomerCare care;
	SeleUtil util;
	Logger LOG=Logger.getLogger("devpinoyLogger");
	//Launching the browser and login into the website
	@Given("^I want to launch website home page$")
	public void i_want_to_launch_website_home_page() throws IOException
	{
		loginpage();
		login= new LoginCrossWord(driver);
	login.login();
	login.EnterEmail("harsha@gmail.com");
	login.EnterPassword("harsha123");
	login.ClickLogin();
	LOG.info("Browser is opened and login successfully in website");
	util=new SeleUtil(driver);
	util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\homepage6.png");
}
	//Calling ClickCustomerCare() from CustomerCare page
	@When("^I click on coustomercare$")
	public void i_click_on_coustomercare() throws Throwable
	{
		care=new CustomerCare(driver);
		Thread.sleep(900);
		care.ClickCustomerCare();
		LOG.info("Clicked customercare button");
    }
	//Calling OrderRelatedQuery() from CustomerCare page
	@Then("^I click on order related query$")
	public void i_click_on_order_related_query() throws InterruptedException 
	{
		care=new CustomerCare(driver);
		Thread.sleep(900);
		care.OrderRelatedQuery();
		LOG.info("Selected order related query button");
    }
	//Calling EntOrderId(),EntEmail(),EntPhone(),EntQuery() from CustomerCare Page
	@Then("^I enter orderid \"([^\"]*)\" email \"([^\"]*)\" phone \"([^\"]*)\" and query \"([^\"]*)\"$")
	public void i_enter_orderid_email_phone_and_query(String ID, String email, String number, String query) 
	{
		care=new CustomerCare(driver);
		care.EntOrderID(ID);
		care.EntEmail(email);
		care.EntPhone(number);
		care.EntQuery(query);
		LOG.info("Orderid, email, number and query are typed");
    }
	//Calling ClickNext() from CustomerCare page
	@Then("^I click on next button$")
	public void i_click_on_next_button() 
	{
		care=new CustomerCare(driver);
		care.ClickNext();
			LOG.info("next button id clicked");
	}


	@Then("^I receive feedback that Successfully sent your query$")
	public void i_receive_feedback_that_Successfully_sent_your_query()  {
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\QueryRegistered.png");
		
	}


	
}
