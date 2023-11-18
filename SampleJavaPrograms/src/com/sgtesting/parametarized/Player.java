package com.sgtesting.parametarized;

class playerDemo
{
	String firstname;
	String sportsname;
	playerDemo(String fn,String sn)
	{
		firstname=fn;
		sportsname=sn;
		System.out.println("firstname:"+firstname);
		System.out.println("sportsname:"+sportsname);
		System.out.println("+++++++++");
		
	}
}
public class Player {

	public static void main(String[] args) {
	playerDemo obj1=new playerDemo("Rahul Dravid","Cricket");
	playerDemo obj2=new playerDemo("Messi","football");

	}

}
