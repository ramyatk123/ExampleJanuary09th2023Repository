package com.sgtesting.staticblockDemo;
class Demo3
{
	static
	{
		System.out.println("It is a static block");
	}
}
public class staticDemo2 {

	public static void main(String[] args) {
		Demo3 o=new Demo3();

	}

}
