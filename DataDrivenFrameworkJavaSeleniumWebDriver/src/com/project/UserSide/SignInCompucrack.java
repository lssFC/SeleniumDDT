package com.project.UserSide;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.Utility.UtilityMethods;

public class SignInCompucrack extends BaseInitUserSide{

	@BeforeTest
	public void testCheckTestCase(){
		
		if(UtilityMethods.CheckTestCaseForExecution(user, this.getClass().getSimpleName())){
			
			System.out.println("Execution mode of "+this.getClass().getSimpleName()+" Test Case is set to Yes");

			
		}else{
			
			throw new SkipException("Execution mode of "+this.getClass().getSimpleName()+" Test Case is set to No");
		}
		
	}
	
	
	@Test(dataProvider="getTestData")
	public void testSignInCompucrack(String username, String password) throws InterruptedException{
		
		driver.get(sitedata.getProperty("useURL"));
		UtilityMethods.SignIn(username, password);
		Thread.sleep(3000);
		
		UtilityMethods.SignOut();
	}
	
	@DataProvider
	public Object[][] getTestData(){
		
		return UtilityMethods.getDataFromXLS(user, "SignInCck");
	}
	
}
