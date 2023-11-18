package com.sgtesting.exceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelContentDemo {

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
    		sh=wb.createSheet("Information");
    		//Row 1
    		row=sh.createRow(0);
    		cell=row.createCell(0);
    		cell.setCellValue("UserName");
    		cell=row.createCell(1);
    		cell.setCellValue("Password");
    		
    		//Row 2
    		row=sh.createRow(1);
    		cell=row.createCell(0);
    		cell.setCellValue("Sweety");
    		cell=row.createCell(1);
    		cell.setCellValue("SweetySweety123");
    		fout=new FileOutputStream("D:\\EXCEL\\Tracker.xlsx");
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
