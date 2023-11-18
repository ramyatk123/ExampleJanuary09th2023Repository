package com.sgtesting.Polymarphisam;
class BasicMaths
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
		int res=(x/y);
		System.out.println("Division Result :"+res);
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
			System.out.println(x+"is an odd number");
		}
	}
	static void modulus(int x,int y)
	{
		int res=(x%y);
		System.out.println("Modulus Result :"+res);
	}
}
public class BeforeHandlingExceptionDemo {

	public static void main(String[] args) {
		BasicMaths.addition(40,30);
		BasicMaths.substraction(120,40);
		BasicMaths.modulus(21,2);
		BasicMaths.multiplication(12,2);
		BasicMaths.division(35,0);
		BasicMaths.isEvenNumber(44);
		BasicMaths.isOddNumber(13);

	}

}
