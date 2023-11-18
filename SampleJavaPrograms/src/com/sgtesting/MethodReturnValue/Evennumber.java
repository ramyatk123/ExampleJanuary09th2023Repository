package com.sgtesting.MethodReturnValue;
class Demo
{
	void evennumber()
	{
		
		for(int i=100;i<=150;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class Evennumber {

	public static void main(String[] args) {
		Demo obj1=new Demo();
		obj1.evennumber();

	}

}
