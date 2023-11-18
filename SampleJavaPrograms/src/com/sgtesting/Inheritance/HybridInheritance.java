package com.sgtesting.Inheritance;
class Maths7
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result:"+(x+y));
	}
}
class Maths8 extends Maths7
{
	void substraction(int a,int b)
	{
		System.out.println("Substraction Result:"+(a-b));
	}
}
class Maths9 extends Maths8
{
	void multiplication(int x,int y)
	{
		System.out.println("Division Result:"+(x*y));
	}
}
class Maths10 extends Maths7
{
	void division(int x,int y)
	{
		System.out.println("Division Result:"+(x/y));
	}
}
public class HybridInheritance {
	public static void main(String[] args) {
	Maths9 obj1=new Maths9();
	obj1.addition(50,10);
	obj1.substraction(100,70);
	obj1.multiplication(50,5);
	
	Maths10 obj2=new Maths10();
	obj2.addition(22,5);
	obj2.division(75,4);
	}

}
