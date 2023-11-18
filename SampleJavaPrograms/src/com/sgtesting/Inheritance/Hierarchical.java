package com.sgtesting.Inheritance;
class Maths1
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result:"+(x+y));
	}
}
class Maths21 extends Maths
{
	void substraction(int a,int b)
	{
		System.out.println("Substraction Result:"+(a-b));
	}
}
class Maths3 extends Maths2
{
	void division(int x,int y)
	{
		System.out.println("Division Result:"+(x/y));
	}
}
public class Hierarchical {

	public static void main(String[] args) {
	Maths21 obj1=new Maths21();
	obj1.addition(66,23);
	obj1.substraction(75,13);
	
	Maths3 obj2=new Maths3();
	obj2.addition(12,74);
	obj2.division(88,5);
	}

}
