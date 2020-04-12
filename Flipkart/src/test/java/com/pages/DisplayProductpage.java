package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;

public class DisplayProductpage extends Library {
	WebDriver driver;
	@FindBy(xpath="//body//div//div//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[4]//div[1]//a[1]//div[1]//div[1]//img[1]")
	WebElement Product;
	


public DisplayProductpage(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);

	}
public void Displayproductpage_Product() {
	Actions action=new Actions(driver);
	if(Product.isDisplayed()) {
		action.moveToElement(Product).build().perform();
		Product.click();
		//driver.close();
	} 
}
}



