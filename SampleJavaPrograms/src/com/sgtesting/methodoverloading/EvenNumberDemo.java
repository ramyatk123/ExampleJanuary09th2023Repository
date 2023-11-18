package com.sgtesting.methodoverloading;
class EvenNumber
{
	int [] demo()
	{
		int count=0;
		for(int i=60;i>=20;i--)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
			int a[]=new int[count];
			int k=0;
			for(int j=60;j>=20;j--)
			{
				if(j%2==0)
				{
					a[k]=j;
					k=k+1;
				}
			}
			return a;
		}
		
	}
public class EvenNumberDemo {

	public static void main(String[] args) {
		EvenNumber obj1=new EvenNumber();
		int a[]=obj1.demo();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
