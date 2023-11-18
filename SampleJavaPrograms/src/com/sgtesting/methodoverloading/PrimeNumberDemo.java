package com.sgtesting.methodoverloading;
class prime
{
	int [] demo()
	{
		int count=0;
		for(int num=1;num<=50;num++)
		{
			int a=0;
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
					a=a+1;
					break;
				}
			}
			if(a==0)
			{
				count=count+1;
			}
		}
		int m[]=new int[count];
		int k=0;
		for(int i=1;i<=50;i++)
		{
			int a=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					a=a+1;
					break;
				}
			}
			if(a==0)
			{
				m[k]=i;
				k++;
			}
		}
		return m;
	}
}
public class PrimeNumberDemo {

	public static void main(String[] args) {
		prime a=new prime();
		int res[]=a.demo();
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}

}
