package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Stationary_page 
{
  WebDriver dr;
  //Identifying the Locators
  By stationary = By.xpath("//*[@id=\"nav-menu-915599\"]/ul/li[3]/a");
//Pointing to the Current Driver
  public Stationary_page(WebDriver dr)
  {
	  this.dr=dr;
  }
//Clicking on the Stationary Icon
  public void Stationary()
  {
	  dr.findElement(stationary).click();
  }
  
}
