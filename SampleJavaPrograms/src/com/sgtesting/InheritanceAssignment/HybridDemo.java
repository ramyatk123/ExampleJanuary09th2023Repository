package com.sgtesting.InheritanceAssignment;
class Demo
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result:"+(x+y));
	}
}
class Demo2 extends Demo
{
	void substraction(int a,int b)
	{
		System.out.println("Substarction Result:"+(a-b));
	}
}
class Demo3 extends Demo2
{
	void multiplication(int a,int b)
	{
		System.out.println("Multiplication Result:"+(a*b));
	}
}

class Demo4 extends Demo
{
	void division(int x,int y)
	{
		System.out.println("Division Result:"+(x/y));
	}
}
public class HybridDemo {

	public static void main(String[] args) {
		Demo3 obj2=new Demo3();
		obj2.addition(33,9);
		obj2.substraction(45,12);
		obj2.multiplication(75,5);
		
		Demo4 obj3=new Demo4();
		obj3.addition(10,5);
		obj3.division(55,5);
	}

}
