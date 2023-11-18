package com.sgtesting.Thread;
class Myclass2 implements Runnable
{
	@Override
	public  void run()
	{
	showEvenNumbers();

	
}
private static void showEvenNumbers()
{
	try
	{
		String name=Thread.currentThread().getName();
		for(int i=20;i<=40;i++)
		{
			Thread.sleep(1000);
			if(i%2==0)
			{
				System.out.println(name+" displays even number ");
			}
		}	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
public class MultiThreadingDemo {

	public static void main(String[] args) {
		Myclass2 obj=new Myclass2();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("alpha");
		t2.setName("omega");
		
		t1.start();
		t2.start();

	}

}
