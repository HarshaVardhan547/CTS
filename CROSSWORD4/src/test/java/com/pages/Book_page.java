package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Book_page {
	WebDriver driver;
	LoginCrossWord mylogin;
	//Pointing to the current driver
	public Book_page(WebDriver driver)
	{
		this.driver=driver;
	}
	//Clicking on the books icon
	public void books_button() {
		driver.findElement(By.linkText("Books")).click();
		
	}
	//Clicking on the quickview icon
	public void quick_view()  
	{
		
		driver.findElement(By.xpath("//*[@id=\"search-result-items\"]/li/div/div[2]/span[1]/a")).click();
	
	}
}
