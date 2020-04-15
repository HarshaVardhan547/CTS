package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mycart_page
{
	WebDriver driver;
	LoginCrossWord mylogin;
	
	//Pointing to the Current Driver
	public Mycart_page(WebDriver driver)
	{
		this.driver=driver;
	}
  
 
	//Clicking on the Mycart button
  public void Mycart_button() 
  {
	  driver.findElement(By.linkText("MY CART")).click();
	  
  }
//Clicking on the continue shopping button
  public void continueshop()
  {
	  driver.findElement(By.xpath("//*[@id=\"shopping-cart-items\"]/div/div/a")).click();
  }
	
		

	}


