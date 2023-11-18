package com.sgtesting.InheritanceAssignment;
class sorting
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
public class BubbleSortProgram {

	public static void main(String[] args) {
		int arr[]= {5,11,6,28,22};
		sorting.sortingnumbers(arr);

	}

}
