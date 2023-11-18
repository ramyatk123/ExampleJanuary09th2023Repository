package com.sgtesting.Test2;
class program
{
	void addition1(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}
class program2 extends program
{
	void substraction2(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}
public class Simple {

	public static void main(String[] args) {
		program2 a=new program2();
		a.addition1(20,10);
		a.substraction2(45,16);
	}

}
