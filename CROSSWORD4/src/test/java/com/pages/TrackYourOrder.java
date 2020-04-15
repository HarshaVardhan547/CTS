package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackYourOrder {
	WebDriver driver;
	 //Identifying the Locators
	@FindBy(linkText="Track Your Order")
	WebElement trackyourorder;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/form/p[1]/input")
	WebElement ordernumber;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/form/p[3]/input")
	WebElement submitbtn;
	
	//Pointing to the Current Driver
	public TrackYourOrder(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	this.driver=driver;
	}
	//Clicking on TrackYourOrder
	public void ClickTrackYourOrder()
	{
		
		trackyourorder.click();
	
	}
	//Entering the Order Number
	public void EntOrderNumber(String OdNum)
	{
		ordernumber.sendKeys(OdNum);
	}
	//Clicking on the submit button
	public void ClickSubmit()
	{
		submitbtn.click();
	}
	

}
