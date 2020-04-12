package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {
	
		public static WebDriver driver;
		FileInputStream file;
	    public Properties prop;
		public void launchApp() throws IOException  {
		file=new FileInputStream("C:\\Users\\Ravali\\eclipse-project\\Flipkart\\src\\test\\resources\\ConfigurationPropery\\config.property");
		prop=new Properties();
		prop.load(file);
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravali\\eclipse-project\\Flipkart\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		}
	



}
