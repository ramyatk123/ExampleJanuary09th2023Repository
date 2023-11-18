package com.sgtesting.AbstractClass;
abstract class Demo16
{
	static
	{
		System.out.println("It is a static block");
	}
}
	class static1 extends Demo16
	{
		void display()
		{
		System.out.println("It is a sub class");
	}
}
public class Program2 {

	public static void main(String[] args) {
		static1 a=new static1(); 
		a.display();

	}

}
