package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/resources/FlipkartFeature/Flipkarttestcase.feature",
glue= {"com.stepdefinition"},
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
tags = {"@tc_01_login, @tc_02_Search,"
		+ " @tc_03_Selection, @tc_04_Display,"},
monochrome=true
)


public class TestRunner {
	
	   @AfterClass
	    public static void  extendReport()
	   {
	       Reporter.loadXMLConfig("C:\\Users\\Ravali\\eclipse-project\\Flipkart\\ExtentReports.xml");
	       Reporter.setSystemInfo("user", System.getProperty("user.name"));
	       Reporter.setSystemInfo("os", "Windows");
	       Reporter.setTestRunnerOutput("Sample test runner output message");
	   }
	}



	



