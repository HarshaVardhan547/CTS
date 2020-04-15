package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerCare {
	WebDriver driver;
	
	//Identifying the Locators
	@FindBy(linkText="Contact Us")
	WebElement customercare;
	@FindBy(partialLinkText="Customer Ca")	
	WebElement cc2;
	@FindBy(xpath="//*[@id=\"orderRelatedQueryLink\"]/span")
	WebElement orderrelatedquery;
	@FindBy(xpath="//*[@id=\"order_id\"]")
	WebElement orderid;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/form[1]/ul/li[2]/input")
	WebElement emailid;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/form[1]/ul/li[3]/input")
	WebElement phone;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/form[1]/ul/li[4]/input")
	WebElement Query;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/form[1]/p/button")
	WebElement nextbtn;

	//Pointing to the Current Driver
	public CustomerCare(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	//Clicking on the customercare icon
	public void ClickCustomerCare()
	{
		customercare.click();
	
		System.out.println("custklVlnvom care");
	}
	//Clicking on the OrderRelatedQuery button
	public void  OrderRelatedQuery()
	{
		orderrelatedquery.click();
		System.out.println("custom care");
		}
	//Entering the orderID
	public void EntOrderID(String ID)
	{
		orderid.sendKeys(ID);
	}
	//Entering the phone number
	public void EntPhone(String number)
	{
		phone.sendKeys(number);
	}
	//Entering the Email	
	public void EntEmail(String email)
	{
		emailid.sendKeys(email);
	}
	//Entering the Query
	public void EntQuery(String query)
	{
		Query.sendKeys(query);
	}
	//Clicking on the Next button
	public void ClickNext()
	{
		nextbtn.click();
	}
	
}
