package com.sgtesting.programs;

public class PrimeNumber {

	public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	int flag=0;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			flag=flag+1;
			break;
		}
		if(flag==0)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
	}
  }

}
