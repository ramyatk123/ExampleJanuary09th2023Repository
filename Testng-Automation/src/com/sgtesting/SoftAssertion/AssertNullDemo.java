package com.sgtesting.SoftAssertion;

import java.io.File;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {
    SoftAssert soft=new SoftAssert();
    @Test(enabled=false)
    public void assertNullTesting()
    {
    	try
    	{
    		File f1=null;
    		soft.assertNull(f1);
    		System.out.println("This step will execute after successfull execution of assertNull");
    		soft.assertAll();
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
    		File f1=null;
    		f1=new File("D:\\Example");
    		soft.assertNotNull(f1);
    		System.out.println("This step will execute after successfull execution of assertNotNull");
    		soft.assertNotNull(f1);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
