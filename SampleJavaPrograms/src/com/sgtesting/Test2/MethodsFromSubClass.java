package com.sgtesting.Test2;
abstract class superclass11
{
	abstract void display4();
	abstract void display5();
	abstract void display6();
}
class subclass01 extends superclass11
{
	void display4()
	{
		System.out.println("It is a abstract class :1");
	}
	void display5()
	{
		System.out.println("It is a abstract class :2");
	}
	void display6()
	{
		System.out.println("It is a abstract class :3");
	}
}
class subclass02 extends subclass01
{
	void display4()
	{
		System.out.println("It is a abstract class :4");
	}
	void display5()
	{
		System.out.println("It is a abstract class :5");
	}
	void display6()
	{
		System.out.println("It is a abstract class :6");
	}
}
class subclass03 extends subclass02
{
	void display4()
	{
		System.out.println("It is a abstract class :7"); 
	}
	void display5()
	{
		System.out.println("It is a abstract class :8");
	}
	void display6()
	{
		System.out.println("It is a abstract class :9");
	}
}
public class MethodsFromSubClass {

	public static void main(String[] args) {
		subclass01 a=new subclass01();
		a.display4();
		a.display5();
		a.display6();
		
		subclass02 b=new subclass02();
		b.display4();
		b.display5();
		b.display6();
		
		subclass03 c=new subclass03();
		c.display4();
		c.display5();
		c.display6();
		


	}

}
