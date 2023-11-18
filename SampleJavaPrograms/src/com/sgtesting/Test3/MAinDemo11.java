package com.sgtesting.Test3;
class superclass005
{
	void show(int a)
	{
		System.out.println("It is a super class :"+a);
	}
}
class subclass004 extends superclass005
{
	subclass004(int b)
	{
		super.show(b);
	}
	void show(int a)
	{
		System.out.println("It is a sub class :"+a);
	}
}
 class subclass03 extends subclass004
 {
	 subclass03(int c,int d)
	 {
		 super(c);
		 super.show(d);
	 }
	 void display(int a)
	 {
		 System.out.println("It is a sub class 2 :"+a);
	 }
 }
public class MAinDemo11 {

	public static void main(String[] args) {
		subclass03 x=new subclass03(10,20);
		x.show(30);

	}

}
