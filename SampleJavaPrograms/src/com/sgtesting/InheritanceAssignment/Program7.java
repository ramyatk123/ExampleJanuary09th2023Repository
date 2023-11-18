package com.sgtesting.InheritanceAssignment;
class superclass
{
	superclass(String s)
	{
		System.out.println("Constructor Overloading "+s );
	}
	superclass(int a)
	{
		System.out.println("constructor Overloading "+a);
	}
}
class subclass extends superclass
{
	subclass(String s1)
	{
		super(s1);
	}
	subclass(int a1)
	{
		super(a1);
	}
	void display()
	{
		System.out.println("It is a subclass");
	}
}
class subclass2 extends superclass
{
	subclass2(String s2)
	{
		super(s2);
	}
	subclass2(int a2)
	{
		super(a2);
	}
	void display()
	{
		System.out.println("It is a subclass");
	}
}
class subclass3 extends superclass
{
	subclass3(String s4)
	{
		super(s4);
	}
	subclass3(int a4)
	{
		super(a4);
	}
	void display()
	{
		System.out.println("It is a subclass 3 Instance block");
	}
}
public class Program7 {

	public static void main(String[] args) {
		subclass obj=new subclass("Ramya");
		subclass obj1=new subclass(10);
		obj1.display();
		
		subclass2 obj2=new subclass2("Kiran");
		subclass2 obj3=new subclass2(20);
		
		subclass3 obj4=new subclass3("Gowda");
		subclass3 obj5=new subclass3(30);
	}

}
