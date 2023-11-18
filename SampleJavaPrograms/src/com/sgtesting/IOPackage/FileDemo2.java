package com.sgtesting.IOPackage;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		//createFile();
		//renameFile();
		//deleteFile();
		//fileCollections();
		fileCollections1();
	}
	private static void createFile()
	{
		try
		{
			String path="D:\\Example\\Test\\Sample.txt";
			File f1=new File(path);
			f1.createNewFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void renameFile()
	{
		File f1=new File("D:\\Example\\Test\\Sample.txt");
		File f2=new File("D:\\Example\\Test\\SampleNew.txt");
		f1.renameTo(f2);
	}
	private static void deleteFile()
	{
		File f2=new File("D:\\Example\\Test\\SampleNew.txt");
		boolean status=f2.delete();
		System.out.println("Is file deleted ? :"+status);
	}
	private static void fileCollections()
	{
		try
		{
			File f1=new File("D:\\Example\\Test");
			File f2[]=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isFile()==true)
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
	
	
	private static void fileCollections1()
	{
		try
		{
			File f1=new File("D:\\Example\\Test");
			File f2[]=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isFile()==true  && f2[i].getName().endsWith(".xlsx"))
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
