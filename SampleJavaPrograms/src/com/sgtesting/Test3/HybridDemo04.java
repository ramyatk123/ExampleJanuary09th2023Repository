package com.sgtesting.Test3;
class maths013
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}
class maths14 extends maths13
{
	void substarction(int x,int y)
	{
		System.out.println("Substarction Result :"+(x-y));
	}
}
class maths15 extends maths14
{
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result :"+(x*y));
	}
}
class maths16 extends maths013
{
	void division(int x,int y)
	{
		System.out.println("Division Result :"+(x/y));
	}
}
public class HybridDemo04 {

	public static void main(String[] args) {
		maths15 a=new maths15();
		a.addition(12,33);
		a.substarction(33,8);
		a.multiplication(25,4);
		
		maths16 b=new maths16();
		b.addition(20,77);
		b.division(56,5);

	}

}
