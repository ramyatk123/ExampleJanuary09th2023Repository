package com.sgtesting.MethodReturnValue;
class Demo2
{
	void fibonacci()
	{
		int firstnum=0;
		int secondnum=1;
		System.out.print(firstnum+" "+secondnum);
		for(int i=1;i<=20;i++)
		{
			int thirdnum=firstnum+secondnum;
			System.out.println("  "+thirdnum);
			firstnum=secondnum;
			secondnum=thirdnum;
		}
	}
}
public class FibonacciNumberDemo2 {

	public static void main(String[] args) {
		Demo2 a=new Demo2();
		a.fibonacci();

	}

}
