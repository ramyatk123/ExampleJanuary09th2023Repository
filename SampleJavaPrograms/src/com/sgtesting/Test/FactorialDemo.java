package com.sgtesting.Test;
class factorialDemo3
{
	void factorial2()
	{
	int num=5;
	int fact=1;
	for(int i=5;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println("factorial of given number:"+num);

	}
}
public class FactorialDemo {

	public static void main(String[] args) {
		factorialDemo3 a=new factorialDemo3();
		a.factorial2();

	}

}
