package com.sgtesting.methodoverloading;
class ArrayDemo
{
	int[][] addition(int x[][],int y[][])
	{
		int c[][]=new int[x.length][x[0].length];
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				c[i][j]=x[i][j]+y[i][j];
			}
		}
		return c;
	}
}
public class ArrayAdditionDemo {

	public static void main(String[] args) {
		ArrayDemo o=new ArrayDemo();
		int a[][]= {{10,20,30},{40,50,60}};
		int b[][]= {{1,2,3},{4,5,6}};
		int z[][]=o.addition(a, b);
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z[i].length;j++)
			{
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}

	}

}
