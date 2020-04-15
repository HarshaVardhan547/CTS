package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(   features = "C:\\Users\\harsha vardhan\\Desktop\\selenium\\CROSSWORD\\src\\test\\resources\\Features\\CrossWord.feature",
  glue = "com.stepdefination",
  plugin = {"pretty","html:target/cucumber-html-report",
		             "json:target/cucumber-json-report",
		             "junit:target/cucumber-junit-report",
		             "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"},
 tags = {"@acc01,@acc02,@acc03,@acc04,@acc05,@acc06,@acc07,@acc08,@acc09,@acc10,@acc11"},
 monochrome = true
)
public class CrossWordTestRunner

{
	@AfterClass
	public static void extentreport()
	{
		Reporter.loadXMLConfig("src\\test\\resources\\Reports\\extend-config.xml");
		Reporter.setSystemInfo("user",System.getProperty("user.name"));
		Reporter.setSystemInfo("os","Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
	
}
