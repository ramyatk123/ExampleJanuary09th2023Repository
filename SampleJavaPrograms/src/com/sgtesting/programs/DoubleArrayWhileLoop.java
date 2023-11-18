package com.sgtesting.programs;

public class DoubleArrayWhileLoop {

	public static void main(String[] args) {
	{
		double k[][]= {{12.11,13.01,14.05},{15.99,25.05,32.08},{99.01,75.65,66.88}};
		int i=0;
		while(i<k.length)
		{
			int j=0;
			while(j<k[i].length)
			{
				System.out.print(k[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	}

}
