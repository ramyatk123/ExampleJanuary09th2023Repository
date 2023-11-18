package com.sgtesting.methodoverloading;
class factorial
{
int  Demo(int a)
	{
		int res=1;
		for(int i=a;i>=1;i--)
		{
			res=res*i;
		}
		
		return res;
	} 
}
public class FactorialNumber {

	public static void main(String[] args) {
		factorial a=new factorial();
		int res=a.Demo(5);
		System.out.println("factorial of given number is :"+res);
	}

}
