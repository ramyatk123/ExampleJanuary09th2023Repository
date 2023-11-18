package com.sgtesting.exceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FruitsDemo {

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
	    		for(int r=0;r<20;r++)
	    		{
	    			row=sh.createRow(r);
	    			cell=row.createCell(0);
	    			cell.setCellValue("FruiteName"+r);
	    		}
	    		fout=new FileOutputStream("D:\\EXCEL\\FruitsDemo.xlsx");
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
