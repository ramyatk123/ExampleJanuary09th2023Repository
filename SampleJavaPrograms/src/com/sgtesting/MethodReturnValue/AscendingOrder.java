package com.sgtesting.MethodReturnValue;
class order
{
	void AscendingOrderDemo(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Elements of array sorted in ascending order");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"  ");
		}
	}
}
public class AscendingOrder {

	public static void main(String[] args) {
		order obj1=new order();
		int a[]={10,9,5,8,4,7,3,1,2,6};
		obj1.AscendingOrderDemo(a);

	}

}
