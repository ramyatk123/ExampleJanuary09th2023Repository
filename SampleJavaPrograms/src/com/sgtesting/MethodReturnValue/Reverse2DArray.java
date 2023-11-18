package com.sgtesting.MethodReturnValue;
class Demo7
{
	void Reverse(double a[][])
	{
		
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
public class Reverse2DArray {

	public static void main(String[] args) {
		Demo7 x=new Demo7();
		double a[][]= {{10.2,20.5,30.8},{40.05,50.66,60.78},{70.01,80.54,90.21}};
		x.Reverse(a);
	}

}
