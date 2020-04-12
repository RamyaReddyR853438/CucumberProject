package com.seleniumutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.baseclass.Library;

public class TestUtil extends Library {
	 WebDriver driver;

	 public TestUtil(WebDriver driver) {
	 this.driver=driver;
	 }

	 public void to_take_screenshot(String path) {

	 TakesScreenshot screen = (TakesScreenshot)driver;
	 File src = screen.getScreenshotAs(OutputType.FILE);
	 try {
	 FileUtils.copyFile(src, new File(path));

	 } catch (IOException e) {

	 e.printStackTrace();
	 }
	 }
	 
	}

	

	
