package com.sgtesting.MethodReturnValue;
class Demo3
{
	void primenumber()
	{
		int num=0;
		int flag=1;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
			if(flag==1)
			{
				System.out.println(num+"is a prime number");
			}
			else
			{
				System.out.println(num+" is not a prime number");
			}
		}
	}
}
public class PrimeNumber {

	public static void main(String[] args) {
		Demo3 a=new Demo3();
		a.primenumber();

	}

}
