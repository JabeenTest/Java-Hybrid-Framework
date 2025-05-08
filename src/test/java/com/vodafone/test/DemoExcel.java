package com.vodafone.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("TestExcel/Testdata.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheet("invalidLoginTest");

		String cellvalue = sheet.getRow(0).getCell(0).getStringCellValue();

		System.out.println(cellvalue);

	}

}
