package com.sgtesting.Test;
class TestingDemo
{
	TestingDemo(int x[],int y[])
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
public class Resultantarray {

	public static void main(String[] args) {
	int arr1[]= {2,4,6,8,10};
	int arr2[]= {22,24,26,28,30};
	TestingDemo a=new TestingDemo(arr1,arr2);

	}

}
