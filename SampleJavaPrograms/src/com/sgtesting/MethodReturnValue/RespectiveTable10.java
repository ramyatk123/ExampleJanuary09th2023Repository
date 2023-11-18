package com.sgtesting.MethodReturnValue;
class Demo5
{
	void Table10th()
	{
		
		for(int i=1;i<=10;i++)
		{
			 String s="10 * "+i+ " = "+(10*i);
			System.out.println(s);
		}
	}
}
public class RespectiveTable10 {

	public static void main(String[] args) {
		Demo5 a= new Demo5();
		a.Table10th();

	}

}
