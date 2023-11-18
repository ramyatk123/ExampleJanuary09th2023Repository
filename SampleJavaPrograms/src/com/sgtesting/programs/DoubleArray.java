package com.sgtesting.programs;

public class DoubleArray {

	public static void main(String[] args) {
	{
		double p[][]= {{12.23,23.25,45.01},{13.05,15.15,45.07},{99.99,88.79,75.25}};
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				System.out.print(p[i][j]+" ");
			}
			System.out.println();
		}
	}

	}

}
