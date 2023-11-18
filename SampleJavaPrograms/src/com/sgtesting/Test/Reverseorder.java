package com.sgtesting.Test;
class program10
{
	void Reverse2DArray(int a[][])
	{
		int k=0;
		int c[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[k]=a[i][j];
				k++;
			}
			for(int z=8;z>=0;z--)
			{
				System.out.println(c[z]);
			}
		}
	}
}
public class Reverseorder {

	public static void main(String[] args) {
		program10 obj1=new program10();
		int b[][]= {{10,20,30},{40,60,70},{80,90,50}};
		obj1.Reverse2DArray(b);

	}

}
