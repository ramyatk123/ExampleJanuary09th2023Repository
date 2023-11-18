package com.sgtesting.Test3;
class AA
{
	AA()
	{
		System.out.println("It is AA class constructor");
	}
}
class BB extends AA
{
	BB()
	{
		super();
		System.out.println("It is BB class constructor");
	}
}
class CC extends BB
{
	CC()
	{
		super();
		System.out.println("It is CC class constructor");
	}
}
public class NoargsConstructor {

	public static void main(String[] args) {
		CC a=new CC();

	}

}
