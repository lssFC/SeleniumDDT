package com.project.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaseOne_GetText {

	public static void main(String[] args) throws InterruptedException {
		

		///Creating New Instance Of Firefox Driver		
		WebDriver driver = new FirefoxDriver(); 

		// Command To Open URL In Browser 
		driver.get("https://sup394144"); 
		
		// GetText Method
		String Maintext = driver.findElement(By.tagName("h1")).getText(); 
		System.out.println(Maintext);
		Thread.sleep(10000);
		
		System.out.println("Header text:"+Maintext);
		Thread.sleep(10000);
		
		System.out.println("Header text:"+Maintext);
		
		  
	}

}
