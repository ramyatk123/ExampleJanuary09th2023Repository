package com.sgtesting.Test2;
class Demo22
{
	static int number=10;
	static void display()
	{
		number=number+1;
		if(number%2==0)
		{
			System.out.println(number);
			display();
		}
	}
}
public class EvenNumbers5 {

	public static void main(String[] args) {
		Demo22 x=new Demo22();
	

	}

}
