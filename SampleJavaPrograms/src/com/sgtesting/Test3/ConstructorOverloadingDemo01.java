package com.sgtesting.Test3;
class Test04
{
	Test04(String s)
	{
		System.out.println("String param is a datatype constructor");
	}
	Test04(int a)
	{
		System.out.println("int param is a datatype constructor");
	}
}
class Test05 extends Test04
{
	Test05(String str)
	{
		super(str);
	}
	Test05(int val)
	{
		super(val);
	}
}
class Test06 extends Test05
{
	Test06(String str1)
	{
		super(str1);
	}
	Test06(int val1)
	{
		super(val1);
	}
}
public class ConstructorOverloadingDemo01 {

	public static void main(String[] args) {
		Test05 a=new Test05("Testing");
		Test06 b=new Test06(25);

	}

}
