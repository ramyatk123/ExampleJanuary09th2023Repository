package com.sgtesting.programs;

public class PatternDemo {

	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=num;j++)
			{
				System.out.print("5"+" ");
			}
			System.out.println();
			
		}

	}

}
