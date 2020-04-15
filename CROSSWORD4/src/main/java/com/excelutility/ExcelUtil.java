package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelUtil {
	
		WebDriver driver;
		
		public ExcelUtil(WebDriver driver)
		{
			//Pointing to the current Driver
			this.driver = driver;
		}
		
		//To Read and return Username
		public String excel_username(int a) throws IOException 
		{
	            //Locating the Path of the File
				FileInputStream fil = new FileInputStream(new File("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CROSSWORD\\src\\test\\resources\\TestData\\excelutility.xlsx"));
				//Locating the Workbook
				XSSFWorkbook workbook = new XSSFWorkbook(fil);
				//Locating the Sheet in a workbook
				XSSFSheet sheet = workbook.getSheet("Sheet1");
				//Identifying the number of rows
				int count = sheet.getLastRowNum();
				//Printing the count of the rows
				System.out.println(count);

				//Locating the row value
				XSSFRow row = sheet.getRow(a);
				//Locating the Cell Value
				XSSFCell cell = row.getCell(0);
				//Ientifying the Username Cell Value
				String un = cell.getStringCellValue();

				//Return the username
				return un;
			}

			// TO read and return password
			public String excel_password(int b) throws IOException
			{
	             //Locating the path of the File
				FileInputStream fil = new FileInputStream(new File("C:\\Users\\harsha vardhan\\Desktop\\selenium\\CROSSWORD\\src\\test\\resources\\TestData\\excelutility.xlsx"));
				//Locating the workbook
				XSSFWorkbook workbook = new XSSFWorkbook(fil);
				//Locating the Sheet
				XSSFSheet sheet = workbook.getSheet("Sheet1");
				//Identfying the count of the rows
				int count = sheet.getLastRowNum();
				//Printing the count of the rows
				System.out.println(count);

				//Locating the row value
				XSSFRow row = sheet.getRow(b);
				
				//Locating the Cell Value
				XSSFCell cell1 = row.getCell(1);
				//Idenifying the Password Cell value
				String pwd = cell1.getStringCellValue();

				//Return the password
				return pwd;
			}

		}




