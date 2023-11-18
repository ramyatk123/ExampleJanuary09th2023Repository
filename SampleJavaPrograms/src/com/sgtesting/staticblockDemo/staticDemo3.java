package com.sgtesting.staticblockDemo;
class Demo4
{
	Demo4 (String s)
	{
		System.out.println("It is a parametarized constuctor");
	}
	static
	{
		System.out.println("It is a static block");
	}
}
public class staticDemo3 {

	public static void main(String[] args) {
		Demo4 obj1=new Demo4("Testing");

	}

}
