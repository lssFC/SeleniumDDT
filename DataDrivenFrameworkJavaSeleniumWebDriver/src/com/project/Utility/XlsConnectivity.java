package com.project.Utility;

import com..xlsConnectivity.XLSDatatable_Connectivity;

public class XlsConnectivity {

	public static void main(String[] args) {

		XLSDatatable_Connectivity data = new XLSDatatable_Connectivity(System.getProperty("user.dir")+"//src//unicodetechnologies//XLSFiles//TestSuite.xlsx");
		System.out.println(data.totalRow("TestSuite"));
		System.out.println(data.totalColumn("TestSuite"));
		System.out.println(data.getData("TestSuite", 1, 3));
		System.out.println(data.getData("TestSuite", "Execution", 4));
	}

}
