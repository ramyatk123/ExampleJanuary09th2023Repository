package com.sgtesting.Thread;
class Myclass3 implements Runnable
{
	public void run()
	{
		shoeEvenNumbers();
	
}
	synchronized private void shoeEvenNumbers()
	{
		try
		{
			String name=Thread.currentThread().getName();
			for(int i=20;i<=40;i++)
			{
				Thread.sleep(1000);
				if(i%2==0)
				{
					System.out.println(name+" display even number "+i);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadSafeDemo {

	public static void main(String[] args) {
		Myclass3 obj=new Myclass3();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("alpha");
		t2.setName("omega");
		
		t1.start();
		t2.start();

	}

}
