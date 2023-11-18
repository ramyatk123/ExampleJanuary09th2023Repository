package com.sgtesting.Test;
class Testing
{
	Testing (double d[][])
	{
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(d[i][j]+"   ");
			}
			System.out.println();
		}
		
	}
}
public class parameter2DArray {

	public static void main(String[] args) {
	double d[][]= {{10.1,20.5,30.05},{40.11,50.12,60.33},{70.45,80.76,90.99}};
	Testing a=new Testing(d);

	}

}
