package com.project.UserSide;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

import com.project.ParentClass.BaseInit;
import com.project.Utility.UtilityMethods;

public class BaseInitUserSide extends BaseInit{

	@BeforeSuite
	public void testCheckTestSuite() throws IOException{
		
		StartUp();
		if(UtilityMethods.CheckTestSuiteForExecution(suite, "UserSide")){
			
			System.out.println("Execution mode of UserSide Test Suite is set to Yes");
			
		}else{
			
			throw new SkipException("Execution mode of UserSide Test Suite is set to Yes");
		}
		
	}
	
}
