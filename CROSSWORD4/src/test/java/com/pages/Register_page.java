package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_page 
{
  WebDriver dr;
//Identifying the Locators
  By My_Account=By.xpath("//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[4]");
  By Name=By.id("customer_user_attributes_name");
  By Email=By.id("customer_user_attributes_email");
  By Password=By.id("customer_user_attributes_password");
  By Password_cnfm=By.id("customer_user_attributes_password_confirmation");
  By Dob=By.id("customer_user_attributes_additional_detail_dob");
  By Gender=By.id("customer_gender_male");
  By Reg_btn=By.id("customer_submit");
//Pointing to the Current Driver
  public Register_page(WebDriver dr)
  {
	  this.dr=dr;
  }
//Clicking on the My Account Icon
  public void MyAccount()
  {
	  dr.findElement(My_Account).click();
  }
//Entering the Name
  public void name(String NAME)
  {
	  dr.findElement(Name).sendKeys(NAME);
  }
//Entering the Email
  public void email(String EMAIL)
  {
	  dr.findElement(Email).sendKeys(EMAIL);
  }
//Entering the password
  public void password(String PWD)
  {
	  dr.findElement(Password).sendKeys(PWD);
  }
//Entering the password again
  public void cnfm_pwd(String PWD1)
  {
	  dr.findElement(Password_cnfm).sendKeys(PWD1);
  }
//Entering the Date of Birth
  public void dob(String DOB)
  {
	  dr.findElement(Dob).sendKeys(DOB);
  }
//Selecting the gender
  public void gender()
  {
	  dr.findElement(Gender).click();
  }
//Clicking the register button
  public void reg_btn()
  {
	  dr.findElement(Reg_btn).click();
  }
 }
