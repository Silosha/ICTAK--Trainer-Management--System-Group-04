package com.ict.tms.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author Silosha
 *
 */
public class ExcelUtil {
	
	private static XSSFWorkbook excelBook;
	
	private static XSSFSheet excelSheet;
	
	public static String getCellData(int rowNum, int colNum) {
		
		String cellValue = null;
		DataFormatter dataFormater = new DataFormatter();
		
		try (FileInputStream excelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/testData.xlsx")){
		
			excelBook = new XSSFWorkbook(excelFile);
			
			excelSheet = excelBook.getSheetAt(0);
			
			cellValue = dataFormater.formatCellValue(excelSheet.getRow(rowNum).getCell(colNum));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cellValue;
		
	}
	

}
