package com.ict.tms.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author Silosha
 *
 */
public class ExcelUtil {

	private XSSFWorkbook excelBook;

	private XSSFSheet excelSheet;
	
	public ExcelUtil(String excelFilePath) {
		initWorkBook(excelFilePath);
	}
	
	private void initWorkBook(String excelFilePath) {
		String absPath = System.getProperty("user.dir") + File.separator + excelFilePath;
		try (FileInputStream excelFile = new FileInputStream(absPath)) {
			excelBook = new XSSFWorkbook(excelFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getCellData(int sheetIndex, int rowNum, int colNum) {
		String cellValue = "";
		DataFormatter dataFormater = new DataFormatter();
		try {
			excelSheet = excelBook.getSheetAt(sheetIndex);
			cellValue = dataFormater.formatCellValue(excelSheet.getRow(rowNum).getCell(colNum));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cellValue;
	}
	
	public String getCellData(int sheetIndex, int rowNum, String colName) {
		String cellValue = "";
		DataFormatter dataFormater = new DataFormatter();		
		try {			
			excelSheet = excelBook.getSheetAt(sheetIndex);			
			int colNum = -1;
			XSSFRow row = excelSheet.getRow(0);
            for(int i = 0; i < row.getLastCellNum(); i++)
            {
                if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
                    colNum = i;
            }
			cellValue = dataFormater.formatCellValue(excelSheet.getRow(rowNum).getCell(colNum));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cellValue;
	}

}
