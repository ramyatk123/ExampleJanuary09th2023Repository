package com.sgtesting.Test3;
class maths10
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}
class maths11 extends maths10
{
	void substraction(int x,int y)
	{
		System.out.println("Substarction Result :"+(x-y));
	}
}
class maths12 extends maths11
{
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result :"+(x*y));
	}
}
class maths13 extends maths12
{
	void division(int x,int y)
	{
		System.out.println("Division Result :"+(x/y));
	}
}
public class MultilevelDemo3 {

	public static void main(String[] args) {
		maths13 a=new maths13();
		a.addition(10,5);
		a.substraction(22,6);
		a.multiplication(22,3);
		a.division(44,6);

	}

}
