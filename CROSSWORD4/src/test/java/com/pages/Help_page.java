package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Help_page {

	WebDriver driver;
	LoginCrossWord mylogin;
	//Pointing to the Current Driver
	public Help_page(WebDriver driver)
	{
		this.driver=driver;
	}
	  //Identifying the Locators

	 By Help=By.linkText("Help");
	 By Faqs=By.xpath("//*[@id=\"content-slot\"]/div[2]/div/div/div/div/div[1]/a");
	//Clicking on the Help Icon
	 public void Help()
	 {
		 driver.findElement(Help).click();
	 }
	//Clicking on the Faq button
	 public void Faqs() throws InterruptedException
	 {
		 Thread.sleep(800);
		 driver.findElement(Faqs).click();
	 }
	 
	 
	 

	

}
