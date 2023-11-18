package com.sgtesting.exceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CityNamesDemo {

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
    		sh=wb.createSheet("sheet1");
    		//Row 1
    		//int k=1;
    		for(int r=1;r<=20;r++)
    		{
    			row=sh.createRow(r);
    			cell=row.createCell(r);
    			cell.setCellValue("CityName"+r);
    			//k++;
    		}
    		fout=new FileOutputStream("D:\\EXCEL\\CityDemo.xlsx");
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
