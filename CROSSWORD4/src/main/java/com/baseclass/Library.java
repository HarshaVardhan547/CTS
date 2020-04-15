package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library
{
	
	public WebDriver driver;
	Properties prop;
	public void loginpage() throws IOException
	
	{
		FileInputStream objfile=new FileInputStream(new File("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CTSPROJECT\\src\\test\\resources\\ConfigurationProperty\\config.property"));
		prop=new Properties();
		prop.load(objfile);
		String browser=prop.getProperty("browser");

		if(browser.equals("chrome")) 
		
		{
			System.setProperty("webdriver.chrome.driver","C:/Users/harsha vardhan/Desktop/selenium/chromedriver.exe");
			driver=new ChromeDriver();		
			//driver.get("www.google.com");

		}
		
		else if(browser.equals("firefox"))
		
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\harsha vardhan\\Desktop\\selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.get("www.google.com");
		}
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String a=prop.getProperty("url");
		System.out.println(a);
		driver.get(a);
		

	}	
	/*public void quit()
	
	{
		driver.close();
	}
*/









}
