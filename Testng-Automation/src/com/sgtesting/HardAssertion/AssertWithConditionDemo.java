package com.sgtesting.HardAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertWithConditionDemo {
    @Test(enabled=false)
    public void assertTrueTesting()
    {
    	try
    	{
    		int x=25;
    		int y=50;
    		Assert.assertTrue(x<=y);
    		System.out.println("This step will execute after successfull execution of assertTrue");
    		
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
		   Assert.assertFalse(x>=y);
		   System.out.println("This step will execute after successfull execution of assertFalse");
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}
