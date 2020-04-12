package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;
import com.pages.DisplayProductpage;
import com.pages.Loginpage;
import com.pages.Offerzonepage;
import com.pages.Selectionpage;
import com.seleniumutility.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefDisplayProduct extends Library {
	Library baseclass;
	Selectionpage Select;
	Loginpage login;
	Offerzonepage Offer;
	DisplayProductpage Select1;
	


	@Given("^I launch Chrome browser$")
    public void chromeBrowser() throws IOException {
	baseclass=new Library();
	baseclass.launchApp();
	System.out.println("chrome Browser is launched");
	}


	@When("^Enter  \"([^\"]*)\" and \"([^\"]*)\" in the field$")
    public void login(String userid, String password) throws IOException {
	login = new  Loginpage(driver);

	login.loginToApp_username(userid);
	login.loginToApp_password(password);
	System.out.println("login is successful");
	}
	
    
	@Then("^click on Submit Button$")
    public void loginToApp_signin() throws IOException {
		login = new  Loginpage(driver);
		login.loginToApp_signin();
	}
	
	@Then("^Go to Offerzone$")
	public void Offer_Selection() throws IOException { 
		Offer = new  Offerzonepage(driver);
		Offer.Offerzonepage_Offer();
	}
				
	
	
	@Then("^Select the type of item from fashion and deals$") 
    public void Displayproductpage_Product()  throws IOException, InterruptedException { 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit. SECONDS);
	    Select1 = new   DisplayProductpage(driver);
        Select1.Displayproductpage_Product() ;
       
      
    			}
	@Then("^takes Screenshot$")
	public void takes_a_screenshot() throws IOException, InterruptedException {
		TestUtil util=new TestUtil(driver);
		 WebDriverWait wait=new WebDriverWait(driver,20);
        
		util.to_take_screenshot("C:/Users/Ravali/eclipse-project/Flipkart/src/test/resources/Screenshot/DisplayProduct.png");
    	
	}
		
	}
	
	
	
	





