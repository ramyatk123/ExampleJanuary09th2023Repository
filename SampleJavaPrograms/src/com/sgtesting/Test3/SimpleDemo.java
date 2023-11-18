package com.sgtesting.Test3;
class maths05
{
	void addition(int x,int y)
	{
		System.out.println("Addtion Result :"+(x+y));
	}
}
class maths06 extends maths05
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}
public class SimpleDemo {

	public static void main(String[] args) {
		maths06 o=new maths06();
		o.addition(10,20);
		o.substraction(40,12);

	}

}
