package com.sgtesting.IOPackage;

import java.io.File;

public class Assignment2Demo {

	public static void main(String[] args) {
	   //createFile();
	   filecollections();
	}
	private static void createFile()
	{
		try
		{
		   String path="D:\\ExampleNew\\TestNew\\sample.txt";
		   File f1=new File(path);
		   f1.createNewFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void filecollections()
	{
		try
		{
			File f1=new File("D:\\ExampleNew\\TestNew");
			File f2[]=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isFile()==true && f2[i].getName().endsWith(".xlsx"))
				{
					f2[i].delete();
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
