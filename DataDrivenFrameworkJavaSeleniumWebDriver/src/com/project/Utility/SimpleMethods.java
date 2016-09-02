package com.project.Utility;

import com.stta.TestSuiteBase.SuiteBase;

public class SimpleMethods extends SuiteBase {
	
	public static void DataEnter1(String Fname,String Lname,String Em,String Pass) throws InterruptedException{
		
	
driver.get("https://accounts.google.com/SignUp?continue");
	
	Thread.sleep(1000);
	
	Thread.sleep(1000);
	Go("//*[@id='FirstName']").sendKeys(Fname);
	Thread.sleep(1000);
	Go("//*[@id='LastName']").sendKeys(Lname);
	Thread.sleep(1000);
	Go("//*[@id='GmailAddress']").sendKeys(Em);
	Thread.sleep(1000);
	Go("//*[@id='Passwd']").sendKeys(Pass);
	Thread.sleep(2000);
}
	public static void DataEnter2(String password,String number,String email) throws InterruptedException
	{
	driver.get("https://accounts.google.com/SignUp?continue");
	Thread.sleep(1000);
	Go("//*[@id='PasswdAgain']").sendKeys(password);
	Thread.sleep(1000);
	Go("//*[@id='RecoveryPhoneNumber']").sendKeys(number);
	Thread.sleep(1000);
	Go("//*[@id='RecoveryEmailAddress']").sendKeys(email);
	Thread.sleep(1000);
	}

}
