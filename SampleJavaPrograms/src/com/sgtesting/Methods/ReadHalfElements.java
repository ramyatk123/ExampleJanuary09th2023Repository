package com.sgtesting.Methods;
class ArrayDemo2
{
	void ReadHalfofEmelents(int a[])
	{
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	void ReadElements(String str[][])
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				System.out.print(str[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
public class ReadHalfElements {

	public static void main(String[] args) {
		ArrayDemo2 a=new ArrayDemo2();
		int b[]= {10,20,30,40,50,60};
		a.ReadHalfofEmelents(b);

	}

}
