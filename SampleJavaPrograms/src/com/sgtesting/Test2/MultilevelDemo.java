package com.sgtesting.Test2;
class program6
{
	void addition(int a,int b)
	{
		System.out.println("Addition Result :"+(a+b));
	}
}
class program7 extends program6
{
	void substraction(int a,int b)
	{
		System.out.println("substraction Result :"+(a-b));
	}
}
class program8 extends program7
{
	void multiplication(int a,int b)
	{
		System.out.println("miltiplication Result :"+(a*b));
	}
}
public class MultilevelDemo {

	public static void main(String[] args) {
		program8 x=new program8();
		x.addition(45,12);
		x.substraction(75,13);
		x.multiplication(33,7);

	}

}
