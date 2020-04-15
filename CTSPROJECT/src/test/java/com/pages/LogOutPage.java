package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	LoginCrossWord login;
	WebDriver driver;
	
	 //Identifying the Locators
	@FindBy(partialLinkText="Logout")
	WebElement logout;
	
	//Pointing to the Current Driver
	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
			
	//Clicking on the Logout Icon
	public void ClickLogout() throws Throwable
	{
				logout.click();

}

}
