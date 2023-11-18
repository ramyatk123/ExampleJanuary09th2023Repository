package com.sgtesting.MethodReturnValue;
class calculationDemo
{
	int addition(int x,int y)
	{
		return(x+y);
	}
	int substraction(int x,int y)
	{
		int res=(x-y);
		return res;
	}
	void multiplication()
	{
		int x=this.addition(12,8);
		int y=this.substraction(10,5);
		int result=(x*y);
		System.out.println("multiplication result:"+result);
	}
}
public class ReturnAdditionDemo1 {

	public static void main(String[] args) {
		calculationDemo obj1=new calculationDemo();
		obj1.multiplication();

	}

}
