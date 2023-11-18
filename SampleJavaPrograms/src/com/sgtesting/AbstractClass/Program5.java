package com.sgtesting.AbstractClass;
abstract class Hierarchical
{
	Hierarchical(int a)
	{
		System.out.println("It is a Parameterized constructor");
	}
}
class subclass extends Hierarchical
{
	subclass(int a)
	{
		super(a);
	}
	void display()
	{
		System.out.println("It is a subclass ");
	}
}
class subclass6 extends subclass
{
	subclass6(int b)
	{
		super(b);
	}
	void display1()
	{
		System.out.println("It is a sub class 2");
	}
}
public class Program5 {

	public static void main(String[] args) {
		subclass6 x=new subclass6(20);
		x.display();
		x.display1();

	}

}
