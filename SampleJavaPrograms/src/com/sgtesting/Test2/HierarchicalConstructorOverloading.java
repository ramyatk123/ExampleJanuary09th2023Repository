package com.sgtesting.Test2;
class superclass15
{
	superclass15(String p)
	{
		System.out.println("It is a constructor overloading :"+p);
	}
	superclass15(int l)
	{
		System.out.println("It is a constructor overloading :"+l);
	}
}
class subclass16 extends superclass15
{
	subclass16(String p1)
	{
		super(p1);
	}
	subclass16(int l1)
	{
		super(l1);
	}
	void display()
	{
		System.out.println("It is a sub class");
	}
}
class subclass17 extends superclass15
{
	subclass17(String p2)
	{
		super(p2);
	}
	subclass17(int l2)
	{
		super(l2);
	}
	void display()
	{
		System.out.println("It is a sub class");
	}
}
public class HierarchicalConstructorOverloading {

	public static void main(String[] args) {
		subclass16 a=new subclass16("Ramya");
		subclass16 b=new subclass16(19);
		a.display();
		System.out.println("+++++++++");
		
		subclass17 c=new subclass17("Gowda");
		subclass17 d=new subclass17(20);

	}

}
