package com.sgtesting.InheritanceAssignment;
class superclass6
{
	int a;
	void fact()
	{
		System.out.println("It is a super class  "+a);
	}
}
class subclass7 extends superclass6
{
	int a;
	subclass7(int kk,int b)
	{
		super.a=kk;
		a=b;
	}
	void show()
	{
		System.out.println("It is a sub class:"+a);
	}
}
class subclass8 extends subclass7
{
	int a;
	subclass8(int kk1,int kk2,int kk3)
	{
		super(kk1,kk2);
		a=kk3;
	}

	void display()
	{
		System.out.println("It is a last sub class:"+a);
	}
}
public class Program9 {

	public static void main(String[] args) {
		subclass8 o=new subclass8(20,60,90);
		o.fact();
		o.show();
		o.display();
	}

}
