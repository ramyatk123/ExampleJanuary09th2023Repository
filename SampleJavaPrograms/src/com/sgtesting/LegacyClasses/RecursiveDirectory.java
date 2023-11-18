package com.sgtesting.LegacyClasses;

import java.io.File;

public class RecursiveDirectory {

	public static void main(String[] args) {
		showFolders("D:\\ECLIPSE\\eclipse");

	}
	private static void showFolders(String path)
	{
	try
	{
		File f1=new File(path);
		File f2[]=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isDirectory()==true)
			{
				String path1=f2[i].getPath();
				System.out.println(path1);
				showFolders(path);
				
			}
		}
	}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}


