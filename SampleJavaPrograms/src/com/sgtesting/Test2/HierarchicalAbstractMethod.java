package com.sgtesting.Test2;
abstract class superclass01
{
	superclass01(int a)
	{
		System.out.println("It is a super class");
	}
}
class subclass04 extends superclass01
{
	subclass04(int a)
	{
		super(a);
	}
	void display()
	{
		System.out.println("It is a sub class");
	}
}
class subclass05 extends subclass04
{
	subclass05(int b)
	{
		super(b);
	}
	void display1()
	{
		System.out.println("It is a sub class");
	}
}
public class HierarchicalAbstractMethod {

	public static void main(String[] args) {
		subclass05 x=new subclass05(20);
		x.display();
		x.display1();

	}

}
