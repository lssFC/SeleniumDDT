package com.project.Utility;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LogsAndReportingwithALlsure {

	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	@Test
	public void VerifyReport()
	{
		report = new ExtentReports("D:\\FC\\HTMLReport.html");
		logger = report.startTest("Verify HTMLreport");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\[name]\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.findElement(By.id("FirstName")).sendKeys("Test");
	    logger.log(LogStatus.INFO, "Field 1 Added");
	    
	    driver.findElement(By.id("LastName")).sendKeys("1");
	    logger.log(LogStatus.INFO, "Field 2  Added");
	    
	    driver.findElement(By.id("GmailAddress")).sendKeys("Test1@gmail.com");
	    logger.log(LogStatus.INFO, "Field 3  Added");
	    
	    logger.log(LogStatus.PASS, "Case PAss");
	    
	    report.endTest(logger);
	    report.flush();
	    
		
		
		
	}
	
}
