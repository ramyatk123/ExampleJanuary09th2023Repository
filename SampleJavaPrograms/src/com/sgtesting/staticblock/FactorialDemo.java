package com.sgtesting.staticblock;
class Demo2
{
	static String subjectname;
	static void calculate(int x,int y)
	{
		x+=25;
		y*=10;
		System.out.println("x value:"+x);
		System.out.println("y value:"+y);
	}
	void factorial(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of" +num+ " is " +fact);
	}
}
public class FactorialDemo {

	public static void main(String[] args) {
		Demo2.subjectname="Algebra";
		Demo2.calculate(10, 5);
		Demo2 obj1=new Demo2();
        obj1.factorial(5);
	}

}
