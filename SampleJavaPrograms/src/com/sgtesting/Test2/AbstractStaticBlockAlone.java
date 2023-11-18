package com.sgtesting.Test2;
abstract class Demo27
{
	static 
	{
		System.out.println("It is a super class");
	}
}
	class static4 extends Demo27
	{
		void display()
		{
		    System.out.println("It is a sub class");
		}
	}
public class AbstractStaticBlockAlone {

	public static void main(String[] args) {
		static4 a=new static4();
		a.display();

	}

}
