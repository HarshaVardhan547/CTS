package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfile {
	WebDriver driver;
	
	//Identifying the Locators
	@FindBy(xpath="//*[@id=\"ft-wrap\"]/div[1]/div/div[3]/div/ul/li[1]/a")
	WebElement myaccount;
	@FindBy(xpath="//a[text()='Update Profile']")
	WebElement updateprofile;
	@FindBy(id="customer_mobile")
	WebElement mobile;
	@FindBy(id="customer_landline")
	WebElement landline;
	@FindBy(id="customer_submit")
	WebElement update;
	
	//Pointing to the Current Driver
	public UpdateProfile(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	//Clicking on the MyAccount Icon
	public void MyAccount()
	{
		myaccount.click();
	}
	
	//Clicking on the Update Profile button
	public void UpdateProfileBtn()
	{
		updateprofile.click();
	}
	
	//Entering the mobile number
	public void Mobile(String number)
	{
		mobile.clear();
		mobile.sendKeys(number);
	}
	
	//Entering the landline number
	public void landline(String llnumber)
	{
		landline.clear();
		landline.sendKeys(llnumber);
	}
	
	//Clicking on the update button
	public void Update()
	{
		update.click();
	}
	

}
