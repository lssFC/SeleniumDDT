package com.project.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseSeven_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		///Creating New Instance Of Firefox Driver		
		WebDriver driver = new FirefoxDriver(); 

		driver.get("http://www..com/");
		Thread.sleep(10000);
		//Another command of maximizing window
		driver.manage().window().maximize();
		Thread.sleep(10000);
		Actions actions = new Actions(driver);
		WebElement moveonmenu = driver.findElement(By.id("product")); 
		actions.moveToElement(moveonmenu); 
		actions.perform(); 
		
		//lets see submenu
		// Actions actions2 = new Actions(driver);
	//	 WebElement moveonsubmenu = driver.findElement(By.xpath("//*[@id='gbq2']")); 
	//	actions.moveToElement(moveonsubmenu); 
	//	actions.perform(); 
		
		
	Thread.sleep(10000);
	}

}
