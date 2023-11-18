package com.sgtesting.Encapsulation;
class Test1
{
	static Test1 obj=null;
	private Test1()
	{
		//private constructor
	}
	void addition(int x,int y)
	{
		int result=(x+y);
		System.out.println("Addition Result:"+result);
	}
	void multiplication(int x,int y)
	{
		int result=(x*y);
		System.out.println("Multiplication Result:"+result);
	}
	static Test1 getInstance()
	{
		if(obj==null)
		{
			obj=new Test1();
		}
		return obj;
	}
}
public class SingleTonDemo {

	public static void main(String[] args) {
		Test1 t1=Test1.getInstance();
		t1.addition(10,5);
		t1.multiplication(22,8);
		
		Test1 t2=Test1.getInstance();
        t2.addition(44,99);
        t2.multiplication(9,11);
        
        Test1 t3=Test1.getInstance();
        t3.addition(67,35);
        t3.multiplication(14,5);
        
        if(t1==t2 && t2==t3)
        {
        	System.out.println(" All objects or instances are same");
        }
        else
        {
        	System.out.println(" All objects or instances are not same");
        }
	}

}
