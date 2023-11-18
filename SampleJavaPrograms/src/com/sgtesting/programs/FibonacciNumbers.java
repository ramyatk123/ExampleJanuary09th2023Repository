package com.sgtesting.programs;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int firstnum=0;
		int secondnum=1;
		System.out.println(firstnum+" "+secondnum);
		for(int i=1;i<=8;i++)
		{
			int thirdnum=firstnum+secondnum;
			System.out.println(" "+thirdnum);
			firstnum=secondnum;
			secondnum=thirdnum;
		}

	}

}
