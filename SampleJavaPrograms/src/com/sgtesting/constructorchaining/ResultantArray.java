package com.sgtesting.constructorchaining;
class Testing1
{
	Testing1(int x[],int y[])
	{
		int res[]=new int[x.length+y.length];
	    int k=0;
		for(int i=0;i<x.length;i++)
		{
			res[k]=x[i];
			k=k+1;
		}
		for(int j=0;j<y.length;j++)
		{
			res[k]=y[j];
			k=k+1;
		}
		for(int z=0;z<res.length;z++)
		{
			System.out.println(res[z]);
		}
	}
}
public class ResultantArray {

	public static void main(String[] args) {
		int arr1[]= {2,4,6,8,10};
		int arr2[]= {22,24,26,28};
		Testing1 a=new Testing1(arr1,arr2);
		
	}

}
