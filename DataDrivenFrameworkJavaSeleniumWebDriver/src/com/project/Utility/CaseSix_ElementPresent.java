package com.project.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseSix_ElementPresent {

	public static void main(String[] args) throws InterruptedException {
		
		///Creating New Instance Of Firefox Driver		
		WebDriver driver = new FirefoxDriver(); 

		driver.get("http://www.dubaiworld.ae");
		
		//Verify Element Present in Selenium WebDriver
		Boolean iselementpresent = driver.findElements(By.tagName("p")).size()!= 0;
	if (iselementpresent)
	{
		System.out.println("Case PASS");
	}
	else
	{
		System.out.println("Case Fail");
	}
	Thread.sleep(10000);
	}

}
