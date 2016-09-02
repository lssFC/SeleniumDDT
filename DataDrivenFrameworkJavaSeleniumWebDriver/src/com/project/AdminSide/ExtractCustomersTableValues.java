package com.project.AdminSide;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.Utility.UtilityMethods;

public class ExtractCustomersTableValues extends BaseInitAdminSide{

	@BeforeTest
	public void testCheckTestCase(){
		
		if(UtilityMethods.CheckTestCaseForExecution(admin, this.getClass().getSimpleName())){
			
			System.out.println("Execution mode of "+this.getClass().getSimpleName()+" Test Case is set to Yes");

			
		}else{
			
			throw new SkipException("Execution mode of "+this.getClass().getSimpleName()+" Test Case is set to No");
		}
		
	}
	
	
	@Test
	public void testExtractCustomersTableValues() throws InterruptedException{
		
		UtilityMethods.AdminSignIn("compucrack", "compucrack");
		
		WebElement customerTable = verifyXpath("tbl_customersValue");
		List<WebElement> customerTableRows = customerTable.findElements(By.tagName("tr"));
		
		for(int row=0;row<customerTableRows.size();row++){
			
			List<WebElement> customerTableCols = customerTableRows.get(row).findElements(By.tagName("td"));
			
			for(int col=0;col<customerTableCols.size();col++){
				
				System.out.print(customerTableCols.get(col).getText()+"   ");
			}
			System.out.println();
		}
		
		Thread.sleep(3000);
		UtilityMethods.AdminSignOut();
	}
}
