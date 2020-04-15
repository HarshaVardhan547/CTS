package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyWishList_page 
{
  WebDriver dr;
//Identifying the Locators
  By continueshop=By.xpath("//*[@id=\"shopping-cart-items\"]/div/a");
  By wishlist=By.linkText("My Wish List");

  //Pointing to the Current Driver
  public MyWishList_page(WebDriver dr)
  {
	  this.dr=dr;
  }
//Clicking on the WishList Icon
  public void WishList()
  {
	 dr.findElement(wishlist).click();
  }
//Clicking on the Continue shopping button
  public void ContinueShop() throws InterruptedException
  {
	  Thread.sleep(900);
	  dr.findElement(continueshop).click();
  }
 }
  

