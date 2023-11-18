package com.sgtesting.Test3;
class superclass
{
	int a;
	void fact()
	{
		System.out.println("It is a super class :"+a);
	}
}
class subclass extends superclass
{
	int a;
	subclass(int b,int kk)
	{
		super.a=b;
		a=kk;
	}
	void show()
	{
		System.out.println("It is a sub class :"+a);
	}
}
class subclass02 extends subclass
{
	int a;
	subclass02(int mm1,int mm2,int mm3)
	{
		super(mm1,mm2);
		a=mm3;
	}
	void display()
	{
		System.out.println("It is a sub class :"+a);
	}
}
public class MainDemo10 {

	public static void main(String[] args) {
		subclass02 o=new subclass02(10,20,30);
		o.fact();
		o.show();
		o.display();
	}

}
