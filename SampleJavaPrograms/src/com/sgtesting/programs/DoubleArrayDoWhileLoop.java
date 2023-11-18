package com.sgtesting.programs;

public class DoubleArrayDoWhileLoop {

	public static void main(String[] args) {
		double k[][]= {{12.01,13.05,15.05},{13.02,16.07,18.08},{19.91,17.56,91.75}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(k[i][j]+" ");
				j++;
			}while(j<k[i].length); 
				System.out.println();
				 i++;
		}while(i<k.length);
	}

}
