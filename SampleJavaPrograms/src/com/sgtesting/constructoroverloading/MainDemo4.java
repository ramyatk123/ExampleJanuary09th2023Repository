package com.sgtesting.constructoroverloading;
class Maths1
{
	Maths1(byte a)
	{
		System.out.println("byte a:"+a);
	}
	Maths1(short b)
	{
		System.out.println("short b:"+b);
	}
	Maths1(int c)
	{
		System.out.println("int c:"+c);
	}
	Maths1(long d)
	{
		System.out.println("long d:"+d);
	}
}
public class MainDemo4 {

	public static void main(String[] args) {
		Maths1 obj1=new Maths1(12);
		Maths1 obj2=new Maths1((byte)15);
		Maths1 obj3=new Maths1((short)12);
		Maths1 obj4=new Maths1((long)25);

	}

}
