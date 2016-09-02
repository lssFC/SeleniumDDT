package com.project.ParentClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.com//project.xlsConnectivity.XLSDatatable_Connectivity;

//1. Define and initialize two properties file
//2. Object of WebDriver
//3. Launch Browser
//4. Define Timeout
//5. Maximize Browser Window
//6. Initialize XLS Files
//7. Define Logs

public class BaseInit {

	public static WebDriver driver = null;
	public static Properties sitedata = null;
	public static Properties storage = null;
	public static XLSDatatable_Connectivity suite= null;
	public static XLSDatatable_Connectivity user= null;
	public static XLSDatatable_Connectivity admin= null;
	public static XLSDatatable_Connectivity blogics= null;
	public static Logger lg = null;
	
	
	public void StartUp() throws IOException{
		
		if(driver==null){
			
		lg = Logger.getLogger("devpinoyLogger");	
		lg.debug("Properties file are loading now......");
		
		sitedata = new Properties();
	//	
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"//src//com//project//PropertiesData//SiteData.properties");

		sitedata.load(fi);
		
		
		storage = new Properties();
		fi = new FileInputStream(System.getProperty("user.dir")+"//src//com//project//PropertiesData//ObjectStorage.properties");

		storage.load(fi);
		lg.debug("Properties files loaded Successfully...");
		
		lg.debug("Browser is about to load...");
		if(sitedata.getProperty("browser").equalsIgnoreCase("firefox")){
			// set something on the profile...
			
			DesiredCapabilities dc=DesiredCapabilities.firefox();
			FirefoxProfile profile = new FirefoxProfile();
			// set something on the profile...
			profile.setAcceptUntrustedCertificates(false);
			profile.setAssumeUntrustedCertificateIssuer(true);
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.helperApps.alwaysAsk.force", false);
			profile.setPreference("browser.download.manager.showWhenStarting",false); profile.setPreference("browser.download.dir", "C:\Downloads"); profile.setPreference("browser.download.downloadDir","C:\Downloads"); profile.setPreference("browser.download.defaultFolder","C:\Downloads"); profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/anytext ,text/plain,text/html,application/plain" );
			dc.setCapability(FirefoxDriver.PROFILE, profile);
			//for remote webdriver
			//WebDriver driver = new RemoteWebDriver(dc);
			driver = new FirefoxDriver(fp);
		}else if(sitedata.getProperty("browser").equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\Testing-Tools\\Selenium\\WebDriver\\Drivers\\newFiles\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			// set some options
			DesiredCapabilities dc = DesiredCapabilities.chrome();
			dc.setCapability(ChromeOptions.CAPABILITY, options);
			//WebDriver driver = new RemoteWebDriver(dc);
			driver = new ChromeDriver();
		}else if(sitedata.getProperty("browser").equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", "D:\\Software\\Testing-Tools\\Selenium\\WebDriver\\Drivers\\newFiles\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}
		lg.debug("Browser loaded successfully....");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		suite = new XLSDatatable_Connectivity(System.getProperty("user.dir")+"//src//com//project//XLSFiles//TestSuite.xlsx");
		user = new XLSDatatable_Connectivity(System.getProperty("user.dir")+"//src//com//project//XLSFiles//UserSide.xlsx");
		admin = new XLSDatatable_Connectivity(System.getProperty("user.dir")+"//src//com//project//XLSFiles//AdminSide.xlsx");
		blogics = new XLSDatatable_Connectivity(System.getProperty("user.dir")+"//src//com//project//XLSFiles//BusinessLogics.xlsx");
		
		}
	}
	
	public static WebElement verifyXpath(String xpathVar){
		
		try{
			
			return driver.findElement(By.xpath(storage.getProperty(xpathVar)));
			
		}catch(Throwable t){
			
			System.out.println("Xpath Not Found");
			return null;
		}
		
		
	}
	
	
	
}
