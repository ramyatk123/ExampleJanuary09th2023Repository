package com.sgtesting.Test2;
class superclass13
{
	void show(int a)
	{
		System.out.println("It is a super class :"+a);
	}
}
class subclass14 extends superclass13
{
	subclass14(int b)
	{
		super.show(b);
	}
	void show(int a)
	{
		System.out.println("It is a sub class :"+a);
	}
}
class subclass15 extends subclass14
{
	subclass15(int c,int d)
	{
		super(c);
		super.show(d);
	}
	void show(int a)
	{
		System.out.println("It is a sub class :"+a);
	}
}
public class Assignment81 {

	public static void main(String[] args) {
		subclass15 x=new subclass15(20,30);
		x.show(40);

	}

}
