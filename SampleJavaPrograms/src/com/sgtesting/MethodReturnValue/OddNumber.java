package com.sgtesting.MethodReturnValue;
class Demo4
{
	void oddnumber()
	{
		for(int i=20;i>=60;i--)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
public class OddNumber {

	public static void main(String[] args) {
		Demo4 a=new Demo4();
		a.oddnumber();

	}

}
