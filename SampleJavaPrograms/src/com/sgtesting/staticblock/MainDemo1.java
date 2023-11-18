package com.sgtesting.staticblock;
class Demo1
{
	static String subjectname;
	static void calculate(int x,int y)
	{
		x+=25;
		y*=9;
		System.out.println("x value:"+x);
		System.out.println("y value:"+y);
	}
}
public class MainDemo1 {

	public static void main(String[] args) {
		Demo1.subjectname="Algebra";
		Demo1.calculate(10,5);

	}

}
