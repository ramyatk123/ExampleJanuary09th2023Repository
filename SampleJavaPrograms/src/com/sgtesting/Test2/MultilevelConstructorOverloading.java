package com.sgtesting.Test2;
class Test6
{
	Test6(String s)
	{
		System.out.println("String param datatype constructor");
	}
	Test6(int a)
	{
		System.out.println("int param datatype constructor");
	}
}
class Test7 extends Test6
{
	Test7(String str)
	{
		super(str);
	}
	Test7(int val)
	{
		super(val);
	}
}
class Test9 extends Test6
{
	Test9(String str1)
	{
		super(str1);
	}
	Test9(int val1)
	{
		super(val1);
	}
}
public class MultilevelConstructorOverloading {

	public static void main(String[] args) {
		Test9 o1=new Test9("Testing");
		Test9 o2=new Test9(25);

	}

}
