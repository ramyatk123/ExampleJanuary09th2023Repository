package com.sgtesting.AbstractClass;
abstract class superclass
{
	abstract void display();
	abstract void display1();
	abstract void display2();
}
class subclass1 extends superclass
{
	void display()
	{
		System.out.println("It is a abstract class :1");
	}
	void display1()
	{
		System.out.println("It is a abstract class :2");
	}
	void display2()
	{
		System.out.println("It is a abstract class :3");
	}
}
class subclass2 extends superclass
{
	void display()
	{
		System.out.println("It is a abstract class :4");
	}
	void display1()
	{
		System.out.println("It is a abstract class :5");
	}
	void display2()
	{
		System.out.println("It is a abstract class :6");
	}
}
class subclass3 extends subclass2
{
	void display()
	{
		System.out.println("It is a abstract class :7");
	}
	void display1()
	{
		System.out.println("It is a abstract class :8");
	}
	void display2()
	{
		System.out.println("It is a abstract class :9");
	}
}
public class Program4 {

	public static void main(String[] args) {
		subclass1 o1=new subclass1();
		o1.display();
		o1.display1();
		o1.display2();
		
		subclass2 o2=new subclass2();
		o2.display();
		o2.display1();
		o2.display2();
		
		subclass3 o3=new subclass3();
		o3.display();
		o3.display1();
		o3.display2();

	}

}
