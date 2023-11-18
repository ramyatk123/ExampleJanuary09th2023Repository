package com.sgtesting.staticblockDemo;
class player
{
	static String firstname;
	static int age;
	
	static
	{
		firstname="Bhavya";
		Showfirstname();
		Showage();
	}
	static void Showfirstname() 
	{
		System.out.println("firstname:"+firstname);
	}
	static void Showage()
	{
		System.out.println("age:"+age);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		player.age=22;
		System.out.println("In main method,age value:"+player.age);

	}

}
