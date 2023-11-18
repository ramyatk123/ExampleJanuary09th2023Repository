package com.sgtesting.Test;
class Demo10
{
	void Array3()
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
public class TransposeArray {

	public static void main(String[] args) {
		Demo10 obj1=new Demo10();
		obj1.Array3();

	}

}
