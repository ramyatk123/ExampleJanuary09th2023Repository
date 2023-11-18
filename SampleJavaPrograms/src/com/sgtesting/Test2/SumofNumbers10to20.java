package com.sgtesting.Test2;
class Demo21
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
public class SumofNumbers10to20 {

	public static void main(String[] args) {
		Demo21.display();

	}

}
