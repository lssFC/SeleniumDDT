package com.project.BusinessLogics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.Utility.UtilityMethods;

public class ExtractBestSellers extends BaseInitBusinessLogics{

	@BeforeTest
	public void testCheckTestCase(){
		
		if(UtilityMethods.CheckTestCaseForExecution(blogics, this.getClass().getSimpleName())){
			
			System.out.println("Execution mode of "+this.getClass().getSimpleName()+" Test Case is set to Yes");

			
		}else{
			
			throw new SkipException("Execution mode of "+this.getClass().getSimpleName()+" Test Case is set to No");
		}
		
	}
	
	
	@Test
	public void testExtractBestSellers() throws InterruptedException{
		
		driver.get(sitedata.getProperty("useURL"));
		WebElement bestSeller = verifyXpath("tbl_bestseller");
			
		List<WebElement> bestSellerValues = bestSeller.findElements(By.tagName("a"));
		
		for(int count=0;count<bestSellerValues.size();count++){
			
			bestSellerValues.get(count).click();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			bestSeller = verifyXpath("tbl_bestseller");
			bestSellerValues = bestSeller.findElements(By.tagName("a"));
			
		}
		
	}
}
