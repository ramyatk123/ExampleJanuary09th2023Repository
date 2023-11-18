package com.sgtesting.IOPackage;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		writeContent();
		writeContent2();

	}
    private static void writeContent()
    {
    	FileReader fr=null;
    	FileWriter fw=null;
    	int n=0;
    	try
    	{
    		fr=new FileReader("D:\\CITY\\Example\\Test.txt");
    		fw=new FileWriter("D:\\CITY\\Example\\Test.txt");
    		while(true)
    		{
    			n=fr.read();
    			if(n==-1)
    			{
    				break;
    			}
    			fw.write(n);
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
    			fr.close();
    			fw.close();
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
private static void writeContent2()
{
	FileWriter fw=null;
	try
	{
		fw=new FileWriter("D:\\CITY\\Example\\Test6.txt");
		String str="Bangalore is a capital city of karnataka";
		str=str+"It is called as garden city if India";
		char ch[]=str.toCharArray();
		fw.write(ch);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
}
