package com.sgtesting.Thread;
class Myclass1 implements Runnable
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println("It is an entry point for thread "+name);
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Myclass1 obj=new Myclass1();
		Thread t1=new Thread(obj);
		t1.setName("alpha");
		t1.start();

	}

}
