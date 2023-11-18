package com.sgtesting.IOPackage;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
		//createFolder();
		//createNestesdFolder();
		//renameFolder();
		//deleteFolder();
		foldercollections();
	}
	private static void createFolder()
	{
		File f1=new File("D:\\Example\\Test\\Demo");
		boolean v1=f1.mkdir();
		System.out.println("Has folder created ? :"+v1);
	}
	private static void createNestesdFolder()
	{
		File f1=new File("D:\\Example\\Test\\D1\\D2\\D3\\D4\\D5");
		boolean v1=f1.mkdirs();
		System.out.println("Have nested folders created ? :"+v1);
		
	}
	private static void renameFolder()
	{
		File f1=new File("D:\\Example\\Test\\Demo");
		File f2=new File("D:\\Example\\Test\\DemoNew");
		f1.renameTo(f2);
		
	}
	private static void deleteFolder()
	{
		File f2=new File("D:\\Example\\Test\\DemoNew");
		boolean status=f2.delete();
		System.out.println("Is folder deleted ? :"+status);
		
	}
	private static void foldercollections()
	{
		try
		{
		   File f1=new File("D:\\Example\\Test");
		   File f2[]=f1.listFiles();
		   for(int i=0;i<f2.length;i++)
		   {
			   if(f2[i].isDirectory()==true)
			   {
				   String path=f2[i].getPath();
				   System.out.println(path);
			   }
		   }
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
