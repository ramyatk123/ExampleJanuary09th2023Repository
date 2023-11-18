package com.sgtesting.Test3;
class maths07
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}
class maths08 extends maths07
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}
class maths09 extends maths07
{
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result :"+(x*y));
	}
}
public class HierarchicalDemo02 {

	public static void main(String[] args) {
		maths08 a=new maths08();
		a.addition(10,5);
		a.substraction(25,9);
	
		maths09 b=new maths09();
		b.addition(22,33);
		b.multiplication(10,2);

	}

}
