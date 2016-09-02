package com.project.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseTwo_TimeOut {

	public static void main(String[] args) throws InterruptedException {
		
		///Creating New Instance Of Firefox Driver		
		WebDriver driver = new FirefoxDriver(); 

		driver.get("http://www.dubaiworld.ae");
		
		//Timeout method 1: Applying Implicit wait in webdriver
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	
	//Typing text in text box or text area. 
	String KeyWord = "new";
	WebElement SearchBox = driver.findElement(By.id("searchfield"));
	SearchBox.sendKeys("new");
	SearchBox.submit();
	Thread.sleep(10000);
	//driver.findElement(By.id("submitbutton")).click();
	
	//TimeOut Method 2 : Explicit wait

//	 WebDriverWait wait = new WebDriverWait(driver, 15); 
//	  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("container"), "abcabcabc" )); 
//	System.out.println("test successfully ");
	//"Dr Soon Young Chang"

	
	//Verify the result
	//String Current_result = driver.findElement(By.className("pagetitle")).toString();
	String Current_result = driver.findElement(By.id("post-365")).toString();
	String actual_result = "Search Results for \""+ KeyWord+"\"";
	System.out.println("actual_result --> "+actual_result);
	System.out.println("Current_result --> "+Current_result);
	
	if (Current_result.equals(actual_result))
	{
		System.out.println("Case PASS");
	}
	else
	{
		System.out.println("Case FAIL");
	}
	
	Thread.sleep(10000);
	}

}
