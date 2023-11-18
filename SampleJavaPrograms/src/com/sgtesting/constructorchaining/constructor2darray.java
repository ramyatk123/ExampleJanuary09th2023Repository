package com.sgtesting.constructorchaining;
class Testing
{
	Testing(double d[][])
	{
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class constructor2darray {

	public static void main(String[] args) {
		double d[][]= {{2.1,3.2,4.5},{10.1,20.5,40.8}};
		Testing a=new Testing(d);
	}

}
