package com.sgtesting.MethodReturnValue;
class Array
{
	void Ascendingorder(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
                    int b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
				}
			}
		}
		for(int z=0;z<a.length;z++)
		{
			System.out.println(a[z]);
		}
	}
}
public class AnotherAsendingOrder {

	public static void main(String[] args) {
		Array x=new Array();
		int a[]={10,9,5,8,4,7,3,1,2,6};
		x.Ascendingorder(a);

	}

}
