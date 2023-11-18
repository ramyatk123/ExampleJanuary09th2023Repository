package com.sgtesting.AbstractClass;

abstract class multilevel
{
	multilevel(int a)
	{
		System.out.println("It is a parameter constructor :"+a);
	}
	multilevel(String s)
	{
		System.out.println("It is a parameter 2 constructor :"+s);
	}
	multilevel(int b,String c)
	{
		System.out.println("It is a parameter 3 constructor :");
	}
}
class subclass7 extends multilevel
{
	subclass7(int a)
	{
		super(a);
	}
	subclass7(String s)
	{
		super(s);
	}
	subclass7(int b,String c)
	{
		super(b,c);
	}
	void display()
	{
		System.out.println("sub class display method");
	}
}
class subclass8 extends subclass7
{
	subclass8(int a)
	{
		super(a);
	}
	subclass8(String s)
	{
		super(s);
	}
	subclass8(int b,String c)
	{
		super(b,c);
	}
	void display()
	{
		System.out.println("sub class display 2 method");
	}
}
public class Program6 {

	public static void main(String[] args) {
		subclass8 x=new subclass8(20);
		subclass8 x1=new subclass8("Ramya");
		subclass8 x2=new subclass8("Gowda");
		x.display();
		x1.display();

	}

}
