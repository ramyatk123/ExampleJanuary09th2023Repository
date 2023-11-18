package com.sgtesting.methodoverloading;
class ArrayDemo1
{
	int[][] substraction(int x[][],int y[][])
	{
		int c[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				c[i][j]=x[i][j]-y[i][j];
			}
		}
		return c;
	}
}
public class ArraySubstractionDemo {

	public static void main(String[] args) {
		ArrayDemo1 obj1=new ArrayDemo1();
		int a[][]= {{22,45,66},{75,89,55}};
		int b[][]= {{9,10,7},{5,4,2}};
		int z[][]=obj1.substraction(a, b);
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z[i].length;j++)
			{
				System.out.print(z[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
