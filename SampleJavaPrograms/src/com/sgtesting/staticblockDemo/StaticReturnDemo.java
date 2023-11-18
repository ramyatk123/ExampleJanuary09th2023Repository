package com.sgtesting.staticblockDemo;
class sample
{
	static int[] getArray(int arr[])
	{
		int b[]=new int[arr.length];
		int k=0;
		for(int i=arr.length;i>=0;i--)
		{
			b[k]=arr[i];
			k++;
		}
		return b;
	}
}
public class StaticReturnDemo {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int c[]=sample.getArray(a);
		for(int kk:c)
		{
			System.out.println(kk);
		}

	}

}
