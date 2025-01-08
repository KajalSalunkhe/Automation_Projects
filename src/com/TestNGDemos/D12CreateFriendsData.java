package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12CreateFriendsData {
//	String fPath = "C:\\\\Users\\\\KAJAL\\\\OneDrive\\\\Desktop\\\\Kajal_SeleniumWebDriverDemos\\\\FirstSeleniumProject\\FriendsData.xlsx";
	String fPath = System.getProperty("user.dir") + "\\ExcelFiles\\FriendsData.xlsx";
	//System.getProperty("user.dir") - Will give you the path of your folder of project
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	@Test
	public void createData() {
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Kajal");

		//row = sheet.createRow(0);		
		//Don't create any row twice, otherwise it will delete the previous data
		cell = row.createCell(1);
		cell.setCellValue("Salunkhe");

		row = sheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("Chetan");

		cell = row.createCell(1);
		cell.setCellValue("Vekariya");

		sheet.createRow(2).createCell(0).setCellValue("Swathi");
		sheet.getRow(2).createCell(1).setCellValue("Acharya");
	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet();
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
