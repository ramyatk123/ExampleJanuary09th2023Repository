package com.sgtesting.InheritanceAssignment;
class superclass4
{
	void show(int a)
	{
		System.out.println("It is a super class method:"+a);
	}
}
class subclass4 extends superclass4
{
	subclass4(int b)
	{
		super.show(b);
	}
	void show(int a)
	{
		System.out.println("It is a sub class method "+a);
	}
}
class subclass5 extends subclass4
{
	subclass5(int c,int d)
	{
		super(c);
		super.show(d);
	}
	void show(int a)
	{
		System.out.println("It is a sub class 2 method "+a);
	}
}
public class Program8 {

	public static void main(String[] args) {
		subclass5 o=new subclass5(10,20);
		o.show(30);

	}

}
