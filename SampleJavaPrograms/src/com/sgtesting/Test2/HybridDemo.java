package com.sgtesting.Test2;
class program9
{
	void addition(int a,int b)
	{
		System.out.println("Addition Result :"+(a+b));
	}
}
class program10 extends program9
{
	void substraction(int a,int b)
	{
		System.out.println("Substarction Result :"+(a-b));
	}
}
class program11 extends program10
{
	void multiplication(int a,int b)
	{
		System.out.println("Multiplication Result :"+(a*b));
	}
}
class program12 extends program9
{
	void division(int a,int b)
	{
		System.out.println("Division Result :"+(a/b));
	}
}
public class HybridDemo {

	public static void main(String[] args) {
		program11 x=new program11();
		x.addition(12,10);
		x.substraction(33,65);
		x.multiplication(34,6); 
		
		program12 y=new program12();
		y.addition(20,12);
		y.division(15,5);

	}

}
