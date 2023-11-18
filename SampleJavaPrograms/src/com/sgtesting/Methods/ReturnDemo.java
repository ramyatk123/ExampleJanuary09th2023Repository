package com.sgtesting.Methods;
class Information
{
	String getname(String name)
	{
		return name;
	}
}
public class ReturnDemo {

	public static void main(String[] args) {
		Information a=new Information();
		String s=a.getname("Sweety");
		System.out.println(s);

	}

}
