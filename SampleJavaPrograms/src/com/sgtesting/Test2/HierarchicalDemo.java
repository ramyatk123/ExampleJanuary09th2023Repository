package com.sgtesting.Test2;
class program3
{
	void addition(int a,int b)
	{
		System.out.println("Addition Result :"+(a+b));
	}
}
class program4 extends program3
{
	void substraction(int a,int b)
	{
		System.out.println("Substarction Result :"+(a-b));
	}
}
class program5 extends program3
{
	void multiplication(int a,int b)
	{
		System.out.println("Multiplication Result :"+(a*b));
	}
}
public class HierarchicalDemo {

	public static void main(String[] args) {
		program4 o=new program4();
		o.addition(10,20);
		o.substraction(20,5);
		
		program5 o2=new program5();
		o2.addition(55,67);
		o2.multiplication(88,8);
	}

}
