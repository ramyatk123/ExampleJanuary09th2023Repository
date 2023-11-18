package com.sgtesting.Recursion;
class GeneralMaths2
{
	static int findfactorial(int num)
	{
		if(num==0 || num==1)
		{
			return 1;
		}
		return num*findfactorial(num-1);
	}
}
public class FactorialDemo {

	public static void main(String[] args) {
		int res=GeneralMaths2.findfactorial(5);
		System.out.println(res);

	}

}
