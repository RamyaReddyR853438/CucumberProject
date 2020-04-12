package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;

public class Selectionpage extends Library {
	
	WebDriver driver;
	@FindBy(xpath="//body/div/div/div[@class='t-0M7P _2doH3V']/div[@class='_3e7xtJ']/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]\r\n")
	WebElement Viewall;
	
	
	public Selectionpage(WebDriver driver) {
		this.driver=driver;
			PageFactory.initElements(driver, this);

		}
	
	
	
	public void Selectionpage_viewall() {
		Actions action=new Actions(driver);
		if(Viewall.isDisplayed())
		action.moveToElement(Viewall).build().perform();
	Viewall.click();
		//driver.close();
	} 
	
	
	
		
		
	}




	
	



