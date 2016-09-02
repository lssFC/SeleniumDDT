package com.project.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.Zip;
import org.testng.annotations.Test;

import com.stta.TestSuiteBase.SuiteBase;


public class CreateZIP extends SuiteBase{

	public static void ZIPFile(String ZipPath) throws InterruptedException {
		Zip zip = new Zip();
    try {
        zip.zip(new File(ZipPath), new File(ZipPath+".zip"));
    Thread.sleep(10000);
    } catch (IOException e) {
        e.printStackTrace();
    }
        
    Add_Log.info("ZIP CREATED successfully.");
	}
	
}
  

