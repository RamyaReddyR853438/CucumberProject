package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;
import com.pages.Loginpage;
import com.pages.Offerzonepage;
import com.seleniumutility.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefOfferzone extends Library{
	Library baseclass;
	Offerzonepage Offer;
	Loginpage login;
	



	@Given("^I launch chrome Browser$")
    public void chromeBrowser() throws IOException {
	baseclass=new Library();
	baseclass.launchApp();
	

	System.out.println("chrome Browser is launched");
	}


	@When("^I enter  \"([^\"]*)\" and \"([^\"]*)\" in the field$")
    public void login(String userid, String password) throws IOException {
	login = new  Loginpage(driver);

	login.loginToApp_username(userid);
	login.loginToApp_password(password);
	System.out.println("login is successful");
	}
	
	@Then("^click on submit button$")
	public void loginToApp_signin() throws IOException {
		login = new  Loginpage(driver);
		login.loginToApp_signin();
	}


	@Then("^click on offerzone$")
    public void login_offer() throws IOException, InterruptedException { 
	//Thread.sleep(3000);
	Offer = new  Offerzonepage(driver);
	Offer.Offerzonepage_Offer();
	
	}
	
	
	@Then("^Takes screenshot$")
	public void takes_a_screenshot() throws IOException, InterruptedException {
	
		TestUtil util=new TestUtil(driver);
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		util.to_take_screenshot("C:/Users/Ravali/eclipse-project/Flipkart/src/test/resources/Screenshot/Offerpage.png");
	}
	
	
}
















