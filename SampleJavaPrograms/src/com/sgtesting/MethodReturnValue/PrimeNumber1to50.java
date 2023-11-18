package com.sgtesting.MethodReturnValue;
class prime
{
	void primenumberDemo()
	{
		for(int i=1;i<=50;i++)
		{
	        int n=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					n++;
				}
			}
		
		if(n==0)
		{
			System.out.println( "It is a prime number:"+i);
		}
		}
	}
}
public class PrimeNumber1to50 {

	public static void main(String[] args) {
		prime a=new prime();
		a.primenumberDemo();
	}

}
