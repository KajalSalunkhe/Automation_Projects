package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D14ReadData {
	String fPath = System.getProperty("user.dir") + "\\ExcelFiles\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	@Test(enabled = false)
	public void readData() {
		row = sheet.getRow(0);
		cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());

		row = sheet.getRow(0);
		cell = row.getCell(1);
		System.out.println(cell.getStringCellValue());

		row = sheet.getRow(0);
		cell = row.getCell(2);
		System.out.println(cell.getStringCellValue());
	}


	@Test
	public void readAllData()
	{
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i = 0; i < rows; i++)		//Rows
		{
			row = sheet.getRow(i);
			for(int j = 0; j < cells; j++)	//Cells
			{
				cell = row.getCell(j);
				System.out.print(cell.getStringCellValue() + "\t");
			}
			System.out.println();
		}
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		//As we are not creating a new workbook rather we are reading an existing workbook
		sheet = wb.getSheet("Login Data");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
