package com.sgtesting.Methods;
class factorial
{
	void factorial()
	{
		int num=5;
		int fact=1;
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+num+" is "+fact);
	}
}
public class FactorialDemo {

	public static void main(String[] args) {
		factorial obj1=new factorial();
		obj1.factorial();

	}

}
