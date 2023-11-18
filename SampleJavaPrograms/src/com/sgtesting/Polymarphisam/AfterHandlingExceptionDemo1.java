package com.sgtesting.Polymarphisam;
class BasicMaths01
{
	static void addition(int x,int y)
	{
		int res=(x*y);
		System.out.println("Addition Result :"+res);
	}
	static void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Substraction Result :"+res);
	}
	static void division(int x,int y)
	{
		try
		{
		int res=(x/y);
		System.out.println("Division Result :"+res);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	static void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication Result :"+res);
	}
	static void isEvenNumber(int x)
	{
		if(x%2==0)
		{
			System.out.println(x+" is an even number");
		}
	}
	static void isOddNumber(int x)
	{
		if(x%2==1)
		{
			System.out.println(x+" is an odd number");
		}
	}
	static void modulus(int x,int y)
	{
		int res=(x%y);
		System.out.println("Modulus Result :"+res);
	}
}
public class AfterHandlingExceptionDemo1 {

	public static void main(String[] args) {
		BasicMaths01.addition(40,30);
		BasicMaths01.substraction(120,40);
		BasicMaths01.modulus(21,2);
		BasicMaths01.multiplication(12,2);
		BasicMaths01.division(35,0);
		BasicMaths01.isEvenNumber(44);
		BasicMaths01.isOddNumber(13);

	}

}
