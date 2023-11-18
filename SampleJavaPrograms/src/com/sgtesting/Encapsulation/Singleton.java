package com.sgtesting.Encapsulation;
class Test
{
	void addition(int x,int y)
	{
		int result=(x+y);
		System.out.println("Addition Result:"+result);
	}
	void multiplication(int x,int y)
	{
		int result=(x*y);
		System.out.println("multiplication Result:"+result);
	}
}
public class Singleton {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.addition(12,10);
		t1.multiplication(5,14);
		
		Test t2=new Test();
		t2.addition(100,50);
		t2.multiplication(7, 9);
		
		Test t3=new Test();
		t3.addition(25,78);
		t3.multiplication(18,6);
	}

}
