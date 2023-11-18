package com.sgtesting.AbstractClass;

abstract class SuperStatic
{
	static void display()
	{
		System.out.println("Abstract class static method");
	}
	void fact()
	{
		System.out.println("Abstract class Instance method");
	}
}
class SubClass20 extends SuperStatic
{
	void display1()
	{
		System.out.println("subclass 1 method");
	}
}
class SubClass10 extends SubClass20
{
	void fact1()
	{
		System.out.println("subclass 2 method");
	}
}

public class Program7 {

	public static void main(String[] args) {
		SubClass10 o=new SubClass10();
		SuperStatic.display();
		o.fact();
		o.display1();
		o.fact1();
	}

}
