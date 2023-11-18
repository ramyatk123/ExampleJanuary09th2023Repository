package com.sgtesting.MethodReturnValue;
class Demo8
{
	void Reverse2Dto1D(int a[][])
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
public class Reverse2DTo1DArray {

	public static void main(String[] args) {
		Demo8 a=new Demo8();
		int b[][]= {{10,20,30},{40,50,60},{70,80,90}};
		a.Reverse2Dto1D(b);
	}

}
