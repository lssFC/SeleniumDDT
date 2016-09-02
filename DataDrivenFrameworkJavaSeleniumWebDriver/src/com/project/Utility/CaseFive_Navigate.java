package com.project.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseFive_Navigate {

	public static void main(String[] args) throws InterruptedException {
		
		///Creating New Instance Of Firefox Driver		
		WebDriver driver = new FirefoxDriver(); 

		driver.get("https://in..com/");
		Thread.sleep(2000);
		//Timeout method 1: Applying Implicit wait in webdriver
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	WebElement element = driver.findElement(By.id("login-email"));
    	element.sendKeys("@gmail.com");
    	 element = driver.findElement(By.id("login-password"));
    	element.sendKeys("test123");
    	 element = driver.findElement(By.name("submit"));
    	element.click();   	
    	
		Thread.sleep(10000);
		for (int r = 0 ;r<100; r++)
		{
		
		driver.findElement(By.xpath("//*[contains(text(), 'Endorse')]")).click();
		Thread.sleep(3000);
	}
	}

}
