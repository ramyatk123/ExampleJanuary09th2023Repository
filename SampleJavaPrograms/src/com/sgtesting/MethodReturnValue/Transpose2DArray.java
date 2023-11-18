package com.sgtesting.MethodReturnValue;
class ArrayDemo
{
	void ArrayDemo2D()
	{
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
public class Transpose2DArray {

	public static void main(String[] args) {
		ArrayDemo obj2=new ArrayDemo();
		
		obj2.ArrayDemo2D();

	}

}
