package com.sgtesting.SoftAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsameDemo {
     SoftAssert soft=new SoftAssert();
     @Test(enabled=false)
     public void assertSameTesting()
     {
    	 try
    	 {
    		 String s1="Testing";
    		 String s2=new String ("Testing");
    		 soft.assertSame(s1, s2);
    		 System.out.println("This step will execute after succesfull execution of assertSame");
    		 soft.assertAll();
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     @Test
     public void assertNotSameTesting()
     {
    	 try
    	 {
    		 String s1="Testing";
    		 String s2=new String("Testing New");
    		 soft.assertNotSame(s1,s2);
    		 System.out.println("This step will execute after successfull execution of assertNotSame");
    		 soft.assertAll();
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
}
