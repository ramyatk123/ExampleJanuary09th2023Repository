package com.sgtesting.Test2;
class Demo24
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
public class FactorialDemo6 {

	public static void main(String[] args) {
		int res=Demo24.findfactorial(5);
		System.out.println(res);

	}

}
