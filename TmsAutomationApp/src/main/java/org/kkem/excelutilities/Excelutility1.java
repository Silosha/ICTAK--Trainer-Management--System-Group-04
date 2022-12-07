package org.kkem.excelutilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility1 {
	
	
	FileInputStream ofile;
	XSSFWorkbook oworkbook;
	XSSFSheet osheet;
	XSSFRow orow;
	XSSFCell ocell;
	
	public Excelutility1(String fileName,String sheetName) throws IOException
	{
	this.ofile=new FileInputStream(fileName);
	this.oworkbook= new XSSFWorkbook(ofile);
	this.osheet=oworkbook.getSheet(sheetName);
	}
	
	public String getExcelData(int rowN0, String colName) {
		// TODO Auto-generated method stub
		String content=null;
		int colNo=0;
		try
		{	
			orow=osheet.getRow(0);
			for(int i=0;i<=orow.getLastCellNum();i++)
			{
				if(orow.getCell(i).getStringCellValue().equalsIgnoreCase(colName))
				{
					colNo=i;
					break;
				}
			}
			this.orow=osheet.getRow(rowN0);
		 this.ocell=orow.getCell(colNo);

		content=ocell.getStringCellValue();

		
		System.out.println("Value from excel is::"+content);

	}catch (Exception e) {
		e.printStackTrace();
	}
return content;

	}
	public int getTotalRows()
	{
		return osheet.getLastRowNum();}
	}
	 
	
	
	
		
	
	
	


