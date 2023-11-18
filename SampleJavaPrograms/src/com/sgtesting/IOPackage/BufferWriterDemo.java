package com.sgtesting.IOPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterDemo {

	public static void main(String[] args) {
		writeContent();

	}
	private static void writeContent()
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter("D:\\CITY\\Example\\Test4.txt",true));
			bw.write("Java is supports oops concept");
			bw.newLine();
			bw.write("Java Language can be used in selenium automation");
			bw.newLine();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
