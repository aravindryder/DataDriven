package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Driven1 {
	
	public static void particular_Data() throws IOException {

		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\Data_Driven\\Excel\\MIni Project in Test Cases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);				//--------> UpCasting
		Sheet sheetAt = w.getSheetAt(0);
		
		Row row = sheetAt.getRow(6);
		Cell cell = row.getCell(5);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		} else if (cellType.equals(CellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int numeric = (int) numericCellValue;				//--------> NarrowCasting
			System.out.println(numeric);
		} 
	}

	public static void particular_row() throws IOException {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\Data_Driven\\Excel\\MIni Project in Test Cases.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(1);
		
		Row row = sheetAt.getRow(1);
		for (Cell cell2 : row) {
			
			System.out.println(cell2);
		}
	}

	public static void particular_cell() throws IOException {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\Data_Driven\\Excel\\MIni Project in Test Cases.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(1);
		int rows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(5);
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			} else if (cellType.equals(CellType.NUMERIC)) {
				
				double numericCellValue = cell.getNumericCellValue();
				
				int numeric = (int) numericCellValue;				
				System.out.println(numeric);
			} 
			
		}
	}
	
	public static void get_allData() throws IOException {

		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\Data_Driven\\Excel\\MIni Project in Test Cases.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(1);
		
		int rows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < rows; i++) {
		
			Row row = sheetAt.getRow(i);
			
			int cells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < cells; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
				} else if (cellType.equals(CellType.NUMERIC)) {
					
					double numericCellValue = cell.getNumericCellValue();
					
					int numeric = (int) numericCellValue;				
					System.out.println(numeric);
				} 
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("\n");
		particular_Data();
		System.out.println("\n\t********************\n");
		particular_cell();
		System.out.println("\n\t********************\n");
		particular_row();
		System.out.println("\n\t********************\n");
		get_allData();
	}
}