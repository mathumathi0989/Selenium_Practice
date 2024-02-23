package com.seleniumDec;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class javaPracticeFeb {

	
	public static void main(String[] args) throws Exception {
		
		FileInputStream inputStream = new FileInputStream("C:\\Users\\mathu\\Documents\\GitHub\\SeleniumPOMPractice\\seleniumDec\\dummySheets.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println("Row count is " +rowCount);
		
		for(int i=0; i<=rowCount; i++) {
			
		int cellCount =	sheet.getRow(i).getLastCellNum();
			for(int j=0; j<cellCount; j++) {
				XSSFCell cell = sheet.getRow(i).getCell(j);
				if (cell.getCellType() == CellType.STRING) {
            String stringCellValue = cell.getStringCellValue();
            System.out.print(stringCellValue  + "|");
        } else if (cell.getCellType() == CellType.NUMERIC) {
            int numericCellValue = (int) cell.getNumericCellValue();
            System.out.print(numericCellValue + "|");
        }

            }
		System.out.println();
		}
			
			
		}
		
	}

