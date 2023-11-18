package com.sgtesting.MethodReturnValue;
class sort
{
	void descendingorder(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
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
public class DesendingOrder {

	public static void main(String[] args) {
		sort x=new sort();
		int d[]= {20,30,40,60,90,70,80,50,100,10};
		x.descendingorder(d);

	}

}
