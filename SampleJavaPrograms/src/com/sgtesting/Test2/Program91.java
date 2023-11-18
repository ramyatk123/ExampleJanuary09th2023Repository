package com.sgtesting.Test2;
class superclass16
{
	int a;
	void fact()
	{
		System.out.println("It is a super class :"+a);
	}
}
class subclass23 extends superclass16
{
	int a;
	subclass23(int b,int kk)
	{
		super.a=b;
		a=kk;
	}
	void show()
	{
		System.out.println("It is a sub class :"+a);
	}
}
class subclass18 extends subclass23
{
	int a;
	subclass18(int kk1,int kk2,int kk3)
	{
		super(kk1,kk2);
		a=kk3;
	}
	void display()
	{
		System.out.println("It is a sub class :"+a);
	}
}
public class Program91 {

	public static void main(String[] args) {
		subclass18 x=new subclass18(10,20,30);
		x.fact();
		x.show();
		x.display();

	}

}
