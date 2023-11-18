package com.sgtesting.Inheritance;
class AA
{
	AA()
	{
		System.out.println("It is AA class Constructor");
	}
}
class BB extends AA
{
	BB()
	{
		super();
		System.out.println("It is BB class Constructor");
	}
}
class CC extends BB
{
	CC()
	{
		super();
		System.out.println("It is CC class Constructor");
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		CC obj1=new CC();

	}

}
