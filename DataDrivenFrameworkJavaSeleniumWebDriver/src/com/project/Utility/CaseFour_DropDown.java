package com.project.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseFour_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		///Creating New Instance Of Firefox Driver		
		WebDriver driver = new FirefoxDriver(); 
	
		driver.get("https://r/commonreg/index.php");
		
		//Selecting or Deselecting value from drop down in selenium webdriver.
		Select mydrpdwn = new Select(driver.findElement(By.id("country"))); 
		mydrpdwn.selectByVisibleText("India") ;
		
		///.selectByValue("Italy");
		//.selectByIndex(0);
	Thread.sleep(10000);
	
	System.out.println("Case PASS");
	}

}
