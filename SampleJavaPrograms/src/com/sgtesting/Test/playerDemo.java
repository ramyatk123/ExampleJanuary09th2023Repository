package com.sgtesting.Test;
class playerDemo3
{
	String firstname;
	String sportsname;
	playerDemo3(String fn,String sn)
	{
		firstname=fn;
		sportsname=sn;
		System.out.println("firstname:"+firstname);
		System.out.println("sportsname:"+sportsname);
		System.out.println("+++++++");
	}
}
public class playerDemo {

	public static void main(String[] args) {
		playerDemo3 a=new playerDemo3("Kiran","kabadi");
		playerDemo3 b=new playerDemo3("Shivu","football");

	}

}
