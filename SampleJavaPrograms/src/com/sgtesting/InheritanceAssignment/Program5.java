package com.sgtesting.InheritanceAssignment;
class Test1
{
	Test1(String s)
	{
		System.out.println("String param datatype constructor");
	}
	Test1(int a)
	{
		System.out.println("int param datatype constructor");
	}
}
class Test2 extends Test1
{
	Test2(String str)
	{
		super(str);
	}

	Test2(int val)
	{
		super(val);
	}
}
class Test3 extends Test2
{
	Test3(String str1)
	{
		super(str1);
	}
	Test3(int val1)
	{
		super(val1);
	}
}
public class Program5 {

	public static void main(String[] args) {
		Test3 obj1=new Test3("Testing");
		Test3 obj2=new Test3(24);

	}

}
