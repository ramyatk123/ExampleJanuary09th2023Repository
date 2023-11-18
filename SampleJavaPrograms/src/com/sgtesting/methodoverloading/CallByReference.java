package com.sgtesting.methodoverloading;
class CallByReferenceDemo
{
	int x,y;
	void calculate(CallByReferenceDemo a)
	{
		a.x+=112;
		a.y*=9;
		System.out.println("In method,x value:"+a.x);
		System.out.println("In method,y value:"+a.y);
	}
}
public class CallByReference {

	public static void main(String[] args) {
		CallByReferenceDemo a=new CallByReferenceDemo();
		a.x=10;
		a.y=5;
		System.out.println("The value of x:"+a.x);
		System.out.println("The value of y:"+a.y);
		a.calculate(a);
		System.out.println("After execution of method,value of x:"+a.x);
		System.out.println("After execution of method,value of y:"+a.y);
	}

}
