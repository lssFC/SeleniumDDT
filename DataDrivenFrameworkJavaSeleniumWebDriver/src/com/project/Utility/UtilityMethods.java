package com.project.Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.project.ParentClass.BaseInit;
import com.unicodetechnologies.xlsConnectivity.XLSDatatable_Connectivity;

public class UtilityMethods extends BaseInit{

	
	public static void SignIn(String username, String password) throws InterruptedException{
		
		driver.get(sitedata.getProperty("useURL"));
		//driver.findElement(By.xpath(storage.getProperty("lnk_login"))).click();
		verifyXpath("lnk_login").click();
		verifyXpath("ip_emailAddress").sendKeys(username);
		verifyXpath("ip_password").sendKeys(password);
		verifyXpath("btn_SignIn").click();
		
		

	}
	
	public static void AdminSignIn(String username, String password){
		
		driver.get(sitedata.getProperty("adminURL"));
		verifyXpath("ip_admin_username").sendKeys(username);
		verifyXpath("ip_admin_password").sendKeys(password);
		verifyXpath("ip_admin_password").sendKeys(Keys.ENTER);

		
		
	}
	public static void SignOut(){
		
		verifyXpath("btn_logof").click();
		verifyXpath("btn_continue").click();
	}
	public static void AdminSignOut(){
		
		verifyXpath("btn_admin_logoff").click();

	}
	
	public static boolean CheckTestSuiteForExecution(XLSDatatable_Connectivity suite, String TestSuiteName){
		
		
		int cols = suite.totalColumn("TestSuite");
		int rows = suite.totalRow("TestSuite");
		
		for(int row=2;row<=rows;row++){
			
			if(suite.getData("TestSuite", "TestSuiteID", row).equalsIgnoreCase(TestSuiteName)){
				
				if(suite.getData("TestSuite", "Execution", row).equalsIgnoreCase("Y"))
					
					return true;
				else
					return false;
			}
		}
		return false;
		
	}
	
public static boolean CheckTestCaseForExecution(XLSDatatable_Connectivity xlsTestCase, String TestCaseName){
		
		
		int cols = xlsTestCase.totalColumn("TestScripts");
		int rows = xlsTestCase.totalRow("TestScripts");
		
		for(int row=2;row<=rows;row++){
			
			if(xlsTestCase.getData("TestScripts", "TestCaseID", row).equalsIgnoreCase(TestCaseName)){
				
				if(xlsTestCase.getData("TestScripts", "Execution", row).equalsIgnoreCase("Y"))
					
					return true;
				else
					return false;
			}
		}
		return false;
		
	}

	public static Object[][] getDataFromXLS(XLSDatatable_Connectivity data, String sheetName){
		
		int cols = data.totalColumn(sheetName);
		int rows = data.totalRow(sheetName);
		
		Object[][] myData = new Object[rows-1][cols];
		
		for(int row=2;row<=rows;row++){
			
			for(int col=0;col<cols;col++){
				
				myData[row-2][col] = data.getData(sheetName, col, row);
			}
		}
		
		return myData;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
