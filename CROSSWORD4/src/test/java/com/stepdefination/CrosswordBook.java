package com.stepdefination;

import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Book_page;
import com.pages.LoginCrossWord;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class  CrosswordBook extends Library{
	Logger LOG = Logger.getLogger("devpinoyLogger");
	SeleUtil util;
	
	//Launching the browser and login into the website	
	@Given("^I logged on the Website$")
	public void i_logged_on_the_Website() throws Throwable {
	
		loginpage();
		LoginCrossWord lp= new LoginCrossWord(driver);
		Thread.sleep(900);
		lp.login();
		
		lp.EnterEmail("harsha@gmail.com");
		lp.EnterPassword("harsha123");
		lp.ClickLogin();   
	    LOG.info("login page is opened");
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\homepage6.png");
  		
	}
//Calling books_button() from bookspage
	@When("^I click on books$")
	public void i_click_on_books() throws Throwable {
		Book_page bp= new Book_page(driver);
		Thread.sleep(900);
		bp.books_button();
		LOG.info("book page is cliked");
	}
	//Calling quick_view() from bookspage
	@Then("^I select required book$")
	public void i_click_on_quickview() throws Throwable {
		Book_page bp= new Book_page(driver);
		Thread.sleep(900);
		bp.quick_view();
		LOG.info("book is selected");
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\bookselected.png");
  	
	}


}






