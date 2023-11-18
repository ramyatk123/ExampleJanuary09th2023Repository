package com.sgtesting.HardAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {
   @Test(enabled=false)
   public void assertEqualsTesting()
   {
	   try
	   {
		   String s1="JavaScript";
		   String s2=new String("JavaScript");
		   Assert.assertEquals(s1,s2);
		   System.out.println("This step will execute after successfull execution of assertEquals");
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   @Test
   public void assertNotEqualsTesting()
   {
	   try
	   {
		   String s1="JavaScript";
		   String s2=new String("JavaScript");
		   Assert.assertNotEquals(s1, s2);
		   System.out.println("This step will execute after successfull execution of arretNotEquals");
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}
