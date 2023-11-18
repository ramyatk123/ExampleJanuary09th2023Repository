package com.sgtesting.pojo.testcases;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleDemo {
    public static void main(String[] args)
    {
    //	jsonObject();
    	jsonArrayObject();
    }
    private static void jsonObject()
    {
    	// Login obj=new Login("Thanu","welcome123");
    	Login obj=new Login();
    	obj.setUserName("Thanu");
    	obj.setPassword("welcome123");
    	try
    	{
    		ObjectMapper objJson=new ObjectMapper();
    		String textContent=objJson.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    		System.out.println(textContent);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
     private static void jsonArrayObject()
     {
    	 Login[] obj= {
    			 new Login("Kiran","kiran123"),
    			 new Login("Bhavya","bhavya123"),
    			 new Login("Divya","divya123")
    	 };
    	 try
    	 {
    		 ObjectMapper objJson=new ObjectMapper();
    		 String textContent=objJson.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    		 System.out.println(textContent);
    		 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
}
