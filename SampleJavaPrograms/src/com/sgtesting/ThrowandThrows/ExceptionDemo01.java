package com.sgtesting.ThrowandThrows;

class StringTest
{
	static int getcharactercount(String str)throws Exception
	{
		if(str==null)
		{
			throw new Exception("you have provided null value,please provide valid string as a input");
			
		}
		return str.length();
	}
}
public class ExceptionDemo01 {

	public static void main(String[] args) {
		try
		{
			int val1=StringTest.getcharactercount("RamyaGowda");
			System.out.println(val1);
			int val2=StringTest.getcharactercount(null);
			System.out.println(val2);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
