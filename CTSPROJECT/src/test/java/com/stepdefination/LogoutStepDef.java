package com.stepdefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.excelutility.ExcelUtil;
import com.pages.LogOutPage;
import com.pages.LoginCrossWord;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutStepDef extends Library
{
	LoginCrossWord login;
	SeleUtil util;
	LogOutPage logoutpage;
	

	Logger LOG=LogManager.getLogger(LoginCrossWord.class.getName());
	
	//Launching the browser and login into the website	
	@Given("^I want to launch the website page$")
	public void i_want_to_launch_the_website_page() throws IOException
	{loginpage();
	login= new LoginCrossWord(driver);
login.login();
ExcelUtil excel=new ExcelUtil(driver);
login.EnterEmail(excel.excel_username(1));
login.EnterPassword(excel.excel_password(1));
login.ClickLogin();
LOG.info("Browser is opened and login successfully in website");

	}

	@When("^Homepage is launched$")
	public void homepage_is_launched()
	{util=new SeleUtil(driver);
	//Taking the ScreenShot
	util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\HomePage2.png");
	
	LOG.info("Screenshot taken Successfully");
	}
	//Calling ClickLogout() from LogOutPage
	@When("^I click on logout button$")
	public void i_click_on_logout_button() throws Throwable
	{
		logoutpage=new LogOutPage(driver);
		Thread.sleep(900);
		logoutpage.ClickLogout();
		LOG.info("Logout button is clicked");
	}

	@Then("^I receive feedback that I am logged out$")
	public void i_receive_feedback_that_I_am_logged_out() 
	{
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\LoggedOut.png");
		LOG.info("Screenshot taken Successfully");
	}


}
