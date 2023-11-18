package com.sgtesting.staticblockDemo;
class Demo5
{
	static
	{
		System.out.println("It is a first static block");
	}
	static 
	{
		System.out.println("It is a second static block");
	}
	static
	{
		System.out.println("It is a third static block");
	}
}
public class staticDemo4 {

	public static void main(String[] args) {
		Demo5 obj1=new Demo5();
	}

}
