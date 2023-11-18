package com.sgtesting.Inheritance;
class Maths5
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result:"+(x+y));
	}
}
class Maths6 extends Maths2
{
	void substraction(int a,int b)
	{
		System.out.println("Substraction Result:"+(a-b));
	}
}
class Maths4 extends Maths6
{
	void division(int x,int y)
	{
		System.out.println("Division Result:"+(x/y));
	}
}
public class Multilevel {

	public static void main(String[] args) {
	Maths4 obj1=new Maths4();
	obj1.addition(12,88);
	obj1.substraction(44,12);
	obj1.division(50,6);

	}

}
