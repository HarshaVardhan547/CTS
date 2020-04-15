package com.stepdefination;

import com.baseclass.Library;
import com.pages.LoginCrossWord;
import com.pages.Register_page;
import com.seleniumutility.SeleUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class register_stepdef  extends Library
{SeleUtil util;
LoginCrossWord Login;

	Register_page rp;
	//Calling loginpage() method from Library
	@Given("^I launched website$")
	public void i_launched_website() throws Throwable 
	{
		loginpage();

util=new SeleUtil(driver);
//Taking the ScreenShot
util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\homepage5.png");
}
	//Calling MyAccount() from Register_page
	@Given("^I click on the my account button$")
	public void i_click_on_the_my_account_button() throws Throwable 
	{
	   rp=new Register_page(driver);
	   rp.MyAccount();
	}
	//Calling name() from Register_page
	@When("^I enter my name$")
	public void i_enter_my_name() throws Throwable 
	{
		rp=new Register_page(driver);
		rp.name("sai");
	}
	//Calling email() from Register_page
	@When("^I enter my email$")
	public void i_enter_my_email() throws Throwable 
	{
		rp=new Register_page(driver);
		rp.email("alurisai@gmail.com");
	}
	//Calling password() from Register_page
	@When("^I enter my password$")
	public void i_enter_my_password() throws Throwable 
	{
		rp=new Register_page(driver);
		rp.password("sudhr@123");
	}
	//Calling cnfm_pwd() from Register_page
	@When("^I re_enter my password$")
	public void i_re_enter_my_password() throws Throwable 
	{
		rp=new Register_page(driver);
		rp.cnfm_pwd("sudhr@123");
	}
	//Calling dob() from Register_page
	@When("^I enter my date of birth$")
	public void i_enter_my_date_of_birth() throws Throwable 
	{
		rp=new Register_page(driver);
		rp.dob("10/01/1998");
	}
	//Calling gender() from Register_page
	@When("^I click on my gender$")
	public void i_click_on_my_gender() throws Throwable 
	{
		rp=new Register_page(driver);
		rp.gender();
	}
	//Calling reg_btn() from Register_page
	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable 
	{
		rp=new Register_page(driver);
		rp.reg_btn();
		util=new SeleUtil(driver);
		//Taking the ScreenShot
		util.ScreenShot("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ScreenShot\\register.png");
	
	}
}
