package com.sgtesting.Test;
class Read
{
	void HalfElements(int a[])
	{
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	void readelements(String str[][])
		{
			for(int i=0;i<str.length;i++)
			{
				for( int j=0;j<str[i].length;j++)
				{
					System.out.println(str[i][j]+"  ");
				}
				System.out.println();
			}
		}
	
}
public class ReadyHalfElements {

	public static void main(String[] args) {
		Read obj1=new Read();
		int b[]= {10,2,30,40,50,60};
		obj1.HalfElements(b);

	}

}
