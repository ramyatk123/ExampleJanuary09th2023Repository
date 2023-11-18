package com.sgtesting.Test2;
class sorting1
{
	static void sortingnumbers(int a[])
	{
		int temp=0;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}
public class BubbleSortDemo09 {

	public static void main(String[] args) {
		int arr[]= {5,11,6,22,4};
		sorting1.sortingnumbers(arr);

	}

}
