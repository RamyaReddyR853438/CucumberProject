package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;

public class Offerzonepage extends Library {
	WebDriver driver;
	@FindBy(xpath="//span[contains(text(),'Offer Zone')]")
	WebElement Offerzone;
	

public Offerzonepage(WebDriver driver) {
this.driver=driver;
	PageFactory.initElements(driver, this);

}
public void Offerzonepage_Offer() {
	
	Actions action=new Actions(driver);
	if(Offerzone.isDisplayed()) {
		action.moveToElement(Offerzone).click().build().perform();
	 Offerzone.click();
	
	
}
}
}





	
