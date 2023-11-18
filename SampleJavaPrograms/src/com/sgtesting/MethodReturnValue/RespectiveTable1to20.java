package com.sgtesting.MethodReturnValue;
class Demo6
{
	void RespectiveTable1to20()
	{
		int a=0;
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=20;j++)
			{
				a=i*j;
				System.out.println(i+" * "+j+" = "+a);
			}
			System.out.println("+++++++++++");
		}
	}
}
public class RespectiveTable1to20 {

	public static void main(String[] args) {
		Demo6 obj1=new Demo6();
		obj1.RespectiveTable1to20();

	}

}
