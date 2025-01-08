package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
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

public class D13CreateLoginData {
	String fPath = System.getProperty("user.dir") + "\\ExcelFiles\\LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 0;
	@Test(dataProvider = "getLoginDetails")
	public void createLoginData(String un, String ps) {
		row = sheet.createRow(index);
		cell = row.createCell(0);
		cell.setCellValue(un);

		cell = row.createCell(1);
		cell.setCellValue(ps);

		cell = row.createCell(2);
		cell.setCellValue("Not Run");

		index++;
	}

	@DataProvider
	public Object[][] getLoginDetails() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "chetan", "chetan123" },
			new Object[] { "sourabh", "sourabh123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "akshay", "akshay123" },
		};
	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Login Data");

		sheet.createRow(index).createCell(0).setCellValue("User Name");
		sheet.getRow(index).createCell(1).setCellValue("Password");
		sheet.getRow(index).createCell(2).setCellValue("Result");

		index++;
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
