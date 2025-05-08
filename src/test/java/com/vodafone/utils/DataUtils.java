package com.vodafone.utils;

import org.testng.annotations.DataProvider;

//Contains all data Provider
public class DataUtils {
	@DataProvider
	public Object[][] invalidloginData() {
		
	 Object[][] data= new Object[2][3];
	
	data[0][0]= "Jhon";
	data[0][1]= "Jhon123";
	data[0][2]= "Invalid credentials";
	
	data[1][0]= "Saul";
	data[1][1]= "Saul123";
	data[1][2]= "Invalid credentials";
	
	return data;

	}

}
