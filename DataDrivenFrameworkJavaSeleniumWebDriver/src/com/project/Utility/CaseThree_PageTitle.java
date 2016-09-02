package com.project.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseThree_PageTitle {

	public static void main(String[] args) throws InterruptedException {
		
		///Creating New Instance Of Firefox Driver		
		WebDriver driver = new FirefoxDriver(); 
		String actual_URL = "http://www..ae/";
		driver.get("http://www..ae");
		
		String current_URL = driver.getCurrentUrl();
		System.out.println("Actual URL :" + actual_URL);
		System.out.println("Current URL :" + current_URL );
		
		if (current_URL.equals(actual_URL))
		{
			System.out.println("Case PASS");
		}
		else
		{
			System.out.println("Case FAIL");
		}
		
		//PageTitle
	
	String PageTitle = driver.getTitle();
	System.out.println("Page Title: -->"+PageTitle);
	Thread.sleep(10000);
	}

}
