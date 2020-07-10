package com.ecommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public void getDataFromExcel()
	{
		File file = new File("./ExcelDataProvider/ExcelDataProvider.xlsx");
		try
		{
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getStringData(int index, int rownum, int cellnum)
	{
		return wb.getSheetAt(index).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	public double getIntdata(int index, int rownum, int cellnum)
	{
		return wb.getSheetAt(index).getRow(rownum).getCell(cellnum).getNumericCellValue();
	}

}
