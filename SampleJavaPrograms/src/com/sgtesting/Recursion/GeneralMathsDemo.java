package com.sgtesting.Recursion;
class GeneralMaths1
{
	static int number=9;
	static void display()
	{
		number=number+1;
		if(number<=20)
		{
			System.out.println(number);
			display();
		}
	}
}
public class GeneralMathsDemo {

	public static void main(String[] args) {
		GeneralMaths1.display();

	}

}
