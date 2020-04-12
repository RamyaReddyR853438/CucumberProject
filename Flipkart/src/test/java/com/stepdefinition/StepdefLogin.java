package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;
import com.pages.Loginpage;
import com.seleniumutility.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefLogin extends Library{
	
		Library baseclass;
		Loginpage  login;




		@Given("^I launch Chrome Browser$")
		public void chromeBrowser() throws IOException {
		baseclass=new Library();
		baseclass.launchApp();
		System.out.println("chrome Browser is launched");
		}


		@When("^enter \"([^\"]*)\" and \"([^\"]*)\" in the field$")
		public void login(String userid, String password) throws IOException {
		login = new  Loginpage(driver);

		login.loginToApp_username(userid);
		login.loginToApp_password(password);
		System.out.println("login is successful");
		}


		@Then("^click submit button$")
		public void loginToApp_signin() {
		login = new  Loginpage(driver);
		login.loginToApp_signin();
		
		

		} 
		@Then("^Takes Screenshot$")
		public void Takessnapshot() throws IOException, InterruptedException {
		TestUtil util=new TestUtil(driver);
		util.to_take_screenshot("C:/Users/Ravali/eclipse-project/Flipkart/src/test/resources/Screenshot/Login.png");
		
		}
		
		
		}



