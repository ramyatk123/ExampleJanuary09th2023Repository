package com.sgtesting.Inheritance;
class Maths
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result:"+(x+y));
	}
}
class Maths2 extends Maths
{
	void substraction(int a,int b)
	{
		System.out.println("Substraction Result:"+(a-b));
	}
}
public class SimpleInheritance {

	public static void main(String[] args) {
	Maths2 o=new Maths2();
	o.addition(100,30);
	o.substraction(45,9);
	}

}
