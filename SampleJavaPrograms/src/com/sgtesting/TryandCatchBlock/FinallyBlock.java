package com.sgtesting.TryandCatchBlock;

class BasicMaths03
{
	static void addition(int x,int y)
	{
		int res=(x+y);
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
			System.out.println(e);
		}
		finally
		{
			System.out.println("This block excutes always!!!!");
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
			System.out.println(x+" is odd number");
		}
	}
	static void modulus(int x,int y)
	{
		int res=(x%y);
		System.out.println("Modulus Result :"+res);
	}
}
public class FinallyBlock {

	public static void main(String[] args) {
		BasicMaths03.addition(20,5);
		BasicMaths03.substraction(45,12);
		BasicMaths03.multiplication(22,6);
		BasicMaths03.division(25,4);
		BasicMaths03.modulus(67,8);
		BasicMaths03.isEvenNumber(64);
		BasicMaths03.isOddNumber(17);

	}

}
