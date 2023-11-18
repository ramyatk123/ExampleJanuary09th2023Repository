package com.sgtesting.Test;
class maths
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println("addition result:"+res);
		
	}
	void substraction(int x,int y)
	{
		int res=x-y;
		System.out.println("substraction result:"+res);
	}
	void multiplication(int x,int y)
	{
		int res=x*y;
		System.out.println("multiplication result:"+res);
	}
	void division(int x,int y)
	{
		int res=x/y;
		System.out.println("division:"+res);
	}
}
public class MethodsAdd {

	public static void main(String[] args) {
	maths a=new maths();
	a.addition(20,30);
	maths b=new maths();
	b.substraction(65,99);
	maths c=new maths();
	c.multiplication(25,88);
	maths d=new maths();
	d.division(22,77);
	}

}
