package com.sgtesting.Methods;
class Maths4
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
		System.out.println("division result:"+res);
	}
	
}
public class MainDemo4 {

	public static void main(String[] args) {
		Maths4 o1=new Maths4();
		o1.addition(5,10);
		Maths4 o2=new Maths4();
        o2.substraction(25,8);
    	Maths4 o3=new Maths4();
        o3.multiplication(22,33);
    	Maths4 o4=new Maths4();
        o4.division(125,5);
	}

}
