package com.sgtesting.MethodReturnValue;
class calculation
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
    void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("multiplication result:"+res);
	}
}
public class ReturnAdditionDemo {

	public static void main(String[] args) {
		calculation obj1=new calculation();
		int a=obj1.addition(10,5);
		int b=obj1.substraction(45,15);
		obj1.multiplication(a, b);
		obj1.multiplication(obj1.addition(25, 10),obj1.substraction(5,3));

	}

}
