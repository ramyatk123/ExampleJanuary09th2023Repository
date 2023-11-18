package com.sgtesting.methodoverloading;
class CallByValueDemo
{
	void calculate(int x,int y)
	{
		x+=120;
		y*=9;
		System.out.println("In method,x value:"+x);
		System.out.println("In method,y value:"+y);
	}
}
public class CallByValue {

	public static void main(String[] args) {
	int x,y;
	x=10;
	y=5;
	System.out.println("The value of x:"+x);
	System.out.println("The value of y:"+y);
	CallByValueDemo obj1=new CallByValueDemo();
	obj1.calculate(x, y);
	System.out.println("After execution of method,value of x:"+x);
	System.out.println("After execution of method,value of y:"+y);
	}

}
