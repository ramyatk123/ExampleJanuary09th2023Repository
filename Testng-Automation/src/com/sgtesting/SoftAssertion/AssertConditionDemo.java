package com.sgtesting.SoftAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConditionDemo {
     SoftAssert soft=new SoftAssert();
     @Test(enabled=false)
     public void assertTrueTesting()
     {
    	 try
    	 {
    		 int x=25;
    		 int y=50;
    		 soft.assertTrue(x<=y);
    		 System.out.println("This step will execute after successfull execution of assertTrue");
    		 soft.assertAll();
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     @Test
     public void assertFalseTesting()
     {
    	 try
    	 {
    		 int x=25;
    		 int y=50;
    		 soft.assertFalse(x>=y);
    		 System.out.println("This step will execute after successfull execution of assertNotTrue");
    		 soft.assertAll();
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
}
