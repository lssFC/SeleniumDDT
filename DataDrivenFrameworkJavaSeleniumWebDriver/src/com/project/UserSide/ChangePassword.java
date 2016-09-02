package com.project.UserSide;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.Utility.UtilityMethods;

public class ChangePassword extends BaseInitUserSide{

	@BeforeTest
	public void testCheckTestCase(){
		
		if(UtilityMethods.CheckTestCaseForExecution(user, this.getClass().getSimpleName())){
			
			System.out.println("Execution mode of "+this.getClass().getSimpleName()+" Test Case is set to Yes");

			
		}else{
			
			throw new SkipException("Execution mode of "+this.getClass().getSimpleName()+" Test Case is set to No");
		}
		
	}
	
	
	@Test
	public void testChangePassword() throws InterruptedException{
		
		UtilityMethods.SignIn("info@.in", "");
		verifyXpath("btn_myAccount").click();
		verifyXpath("lnk_ChangePwd").click();
		verifyXpath("ip_currentPwd").sendKeys("");
		verifyXpath("ip_newPwd").sendKeys("123");
		verifyXpath("ip_confirmPwd").sendKeys("123");
		verifyXpath("btn_continue_pwd").click();
		
		UtilityMethods.SignOut();
		
		Thread.sleep(2000);
		
		UtilityMethods.SignIn("info@.in", "kk");

		verifyXpath("btn_myAccount").click();
		verifyXpath("lnk_ChangePwd").click();
		verifyXpath("ip_currentPwd").sendKeys("123");
		verifyXpath("ip_newPwd").sendKeys("");
		verifyXpath("ip_confirmPwd").sendKeys("");
		verifyXpath("btn_continue_pwd").click();
		
		UtilityMethods.SignOut();
		
		
	}
}
