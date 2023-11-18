package com.sgtesting.HardAssertion;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullDemo {
    @Test(enabled=false)
    public void assertNullTesting()
    {
    	try
    	{
    		File obj=null;
    		Assert.assertNull(obj);
    		System.out.println("This step will execute after successfull execution of assertNull");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    @Test
    public void assertNotNullTesting()
    {
    	try
    	{
    		File obj=null;
    		obj=new File("D:\\Example");
    		Assert.assertNotNull(obj);
    		System.out.println("This step will execute after successfull execution of assertNotNull");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
