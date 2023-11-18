package com.sgtesting.exceldemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWriteFruitNamesContentDemo {

	public static void main(String[] args) {
		readwriteContent();

	}
	private static void readwriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		
		Sheet sh2=null;
		
		Row rowsh2=null;
		
		Cell cellsh2=null;
		try
		{
			fin=new FileInputStream("D:\\Excel\\FruitNamesReadandWrite.xlsx");
			wb=new XSSFWorkbook(fin);
			
			sh2=wb.getSheet("sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("sheet2");
			}
			int rc=sh2.getPhysicalNumberOfRows();
			for(int r=0;r<20;r++)
			{
				
				rowsh2=sh2.getRow(10);
				cellsh2.setCellValue("FruiteName"+r);
				if(rowsh2==null)
				{
					rowsh2=sh2.createRow(r);
					cellsh2.setCellValue("FruiteName"+r);
				}
				int cc=rowsh2.getPhysicalNumberOfCells();
				for(int c=0;c<10;c++)
				{
					
					cellsh2=rowsh2.getCell(10);
					cellsh2.setCellValue("FruiteName"+r);
					if(cellsh2==null)
					{
						cellsh2=rowsh2.createCell(c);
						cellsh2.setCellValue("FruiteName"+r);
					}
					String data=cellsh2.getStringCellValue();
					cellsh2.setCellValue(data);
				
			}
			}
			fout=new FileOutputStream("D:\\Excel\\FruitNamesReadandWrite.xlsx");
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
				fin.close();
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
