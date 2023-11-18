package com.sgtesting.IOPackage;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		readcontent();

	}
	private static void readcontent()
	{
		FileInputStream fin=null;
		int n=0;
		try
		{
			fin=new FileInputStream("D:\\CITY\\Example\\Test.txt");
			while(true)
			{
				n=fin.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char)n;
				System.out.println(ch);
			}
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
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
