package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
		WebDriver driver;
		 WebElement login;
		@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
		WebElement email;
		@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
		WebElement Password;
		@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
		WebElement signin;



		public Loginpage(WebDriver driver) {

		PageFactory.initElements(driver, this);

		}
		
		

		public void loginToApp_username(String userid) {
		email.sendKeys(userid);


		}
		public void loginToApp_password(String pass) {
		Password.sendKeys(pass);
		}
		
		public void loginToApp_signin() {
        signin.click();
		}
}


