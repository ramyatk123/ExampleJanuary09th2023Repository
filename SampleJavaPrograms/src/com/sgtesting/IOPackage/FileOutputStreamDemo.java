package com.sgtesting.IOPackage;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		writecontent();

	}
	private static void writecontent()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("D:\\CITY\\Example\\Test.txt",true);
			String str=" Bangalore is a capital city of karnataka ";
			str=str + " It is called as garden city of india.";
			byte b[]=str.getBytes();
			fout.write(b);
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
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
