package com.sgtesting.HardAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameDemo {
    @Test(enabled=false)
    public void assertSameTesting()
    {
    	try
    	{
    		String s1="JavaScript";
    		String s2=new String("JavaScript");
    		Assert.assertSame(s1, s2);
    		System.out.println("This step will execute after successfull execution of assertSame");
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
    		String s1="JavaScript";
    		String s2=new String("JavaScript123");
    		Assert.assertNotSame(s1, s2);
    		System.out.println("This step will execute after successfull execution of assertNotSame");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
