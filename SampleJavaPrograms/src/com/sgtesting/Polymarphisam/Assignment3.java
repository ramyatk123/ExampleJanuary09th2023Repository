package com.sgtesting.Polymarphisam;
abstract class 	BasicMaths02
{
	abstract void Relational ();
}
class Addition01 extends BasicMaths02
{

	void Relational()
	{
		int a; int b;
		a=15;
		b=30;

		System.out.println("Addition Result:"+(a+b));
	}

}

class Substraction02 extends BasicMaths02
{
	void Relational()
	{
		int a; int b;
		a=140;
		b=60;
		System.out.println("Substraction Result:"+(a-b));
	}
}

class Multiplication03 extends BasicMaths02
{
	void Relational()
	{
		int a; int b;
		a=15;
		b=18;
		System.out.println("Multiplication Result:"+(a*b));
	}
}

class Division04 extends BasicMaths02
{
	void Relational()
	{
		int a; int b;
		a=75;
		b=15;
		System.out.println("Divios Result:"+(a/b));
	}
}

class Modulus05 extends BasicMaths02
{
	void Relational()
	{
		int a; int b;
		a=46;
		b=15;
		System.out.println("Modulus Result:"+(a%b));
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		BasicMaths02 maths=null;
		Addition01 add=new Addition01();
		Substraction02 subs=new Substraction02();
		Multiplication03 multi=new Multiplication03();
		Division04 div=new Division04();
		Modulus05 mod=new  Modulus05();

		maths=add;
		maths.Relational();

		maths=subs;
		maths.Relational();

		maths=multi;
		maths.Relational();
		
		maths=div;
		maths.Relational();


		maths=mod;
		maths.Relational();
	}

}
