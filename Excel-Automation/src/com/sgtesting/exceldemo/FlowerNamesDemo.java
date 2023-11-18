package com.sgtesting.exceldemo;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlowerNamesDemo {

	public static void main(String[] args) {
	writeExcelContent();

}
private static void writeExcelContent()
{
	FileOutputStream fout=null;
	Workbook wb=null;
	Sheet sh=null;
	Row row=null;
	Cell cell=null;
	try
	{
		wb=new XSSFWorkbook();
		sh=wb.createSheet("Sheet1");
		row=sh.createRow(9);
		//Row 1
		for(int r=0;r<20;r++)
		{
			
    		cell=row.createCell(r);
			cell.setCellValue("FlowersName"+r);
		}
		fout=new FileOutputStream("D:\\EXCEL\\Flowersdemo.xlsx");
		wb.write(fout);
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			fout.close();
			wb.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
}

