package com.sgtesting.LegacyClasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		 writeContent();
       // readContent();
	}
    private static void writeContent()
    {
    	FileOutputStream fout=null;
    	Properties prop=null;
    	try
    	{
    		fout=new FileOutputStream("D:\\CITY\\Example\\Sample.Properties");
    		prop=new Properties();
    		prop.setProperty("Username","admin");
    		prop.setProperty("Password","Manager");
    		prop.setProperty("Pin","2023");
    		prop.store(fout,"It is for testing purpose");
    		
    	}
        catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			prop.clear();
    			fout.close();
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
    private static void readContent()
    {
    	FileInputStream fin=null;
    	Properties prop=null;
    	try
    	{
    		fin=new FileInputStream("D:\\CITY\\Example\\Sample.Properties");
    		prop=new Properties();
    		String user=prop.getProperty("Username");
    		System.out.println(user);
    		String pwd=prop.getProperty("Password");
    		System.out.println(pwd);
    		String pin=prop.getProperty("pin");
    		System.out.println(pin);
    		System.out.println("+++++++++++");
    		Enumeration obj=prop.elements();
    		while(obj.hasMoreElements())
    		{
    			System.out.println(obj.nextElement());
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
    				prop.clear();
    				prop.clone();
    				
    			}
    			catch(Exception e)
    			{
    				e.printStackTrace();
    			}
    	}
    }
}
