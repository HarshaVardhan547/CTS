package com.stepdefination;

import com.baseclass.Library;
import com.pages.LoginCrossWord;
import com.pages.MyWishList_page;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mywishlist_stepdef extends Library
{SeleUtil util;
LoginCrossWord Login;
	MyWishList_page wp;
	//Launching the browser and login into the website
	@Given("^I logged into the website$")
	public void i_logged_into_the_website() throws Throwable 
	{
		loginpage();
		Login= new LoginCrossWord(driver);
		Login.login();
		Login.EnterEmail("harsha@gmail.com");
		Login.EnterPassword("harsha123");
		Login.ClickLogin();
	}
	//Calling WishList() from MyWishList_page
	@When("^I clicked on the my wishlist option$")
	public void i_clicked_on_the_my_wishlist_option() throws Throwable 
	{
	    wp=new MyWishList_page(driver);
	    Thread.sleep(900);
		wp.WishList();
	}

	@When("^If my wishlist page is empty$")
	public void if_my_wishlist_page_is_empty() throws Throwable 
	{
		SeleUtil su= new SeleUtil(driver);
		//Taking the ScreenShot
		   su.ScreenShot("C:\\Users\\lenovo\\eclipse-workspace\\CrosswordCucumberFramework\\src\\test\\resources\\screenshots\\mywishlistpage.png");
	}
	//Calling ContinueShop() from MyWishList_page
	@Then("^I have to click the continue shopping option$")
	public void i_have_to_click_the_continue_shopping_option() throws Throwable 
	{  wp=new MyWishList_page(driver);
    Thread.sleep(900);
	
	   wp.ContinueShop();
	   util=new SeleUtil(driver);
	 //Taking the ScreenShot
	   util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\continueshopping.png");
}
}
