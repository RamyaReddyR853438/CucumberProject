package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;
import com.pages.Loginpage;
import com.pages.Offerzonepage;
import com.pages.Selectionpage;
import com.seleniumutility.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefSelection extends Library{
	Library baseclass;
	Selectionpage Select;
	Loginpage login;
	Offerzonepage Offer;
	


	@Given("^I launch chrome browser$")
    public void chromeBrowser() throws IOException {
	baseclass=new Library();
	baseclass.launchApp();
	System.out.println("chrome Browser is launched");
	}


	@When("^Now enter  \"([^\"]*)\" and \"([^\"]*)\" in the field$")
    public void login(String userid, String password) throws IOException {
	login = new  Loginpage(driver);

	login.loginToApp_username(userid);
	login.loginToApp_password(password);
	System.out.println("login is successful");
	}
	
    
	@Then("^click on Submit button$")
    public void loginToApp_signin() throws IOException {
		login = new  Loginpage(driver);
		login.loginToApp_signin();
	}
	
	@Then("^Go to offerzone$")
	public void Offer_Selection() throws IOException { 
		
		Offer = new  Offerzonepage(driver);
		Offer.Offerzonepage_Offer();
				}
	

    
	@Then("^click on viewall$")
    public void Selectionpage_viewall() throws IOException {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
    	Select = new  Selectionpage(driver);
		Select.Selectionpage_viewall();
	
    }  
	@Then("^takes screenshot$")
  public void takes_a_screenshot() throws IOException {
	  TestUtil util=new TestUtil(driver);
		WebDriverWait wait=new WebDriverWait(driver,20);
		util.to_take_screenshot("C:/Users/Ravali/eclipse-project/Flipkart/src/test/resources/Screenshot/Selectionpage.png");
  	
  }
  }
	
	
	

