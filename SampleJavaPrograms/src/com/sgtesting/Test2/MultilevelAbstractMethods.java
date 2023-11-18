package com.sgtesting.Test2;
abstract class player1
{
	abstract void playername();
	abstract void sportsname();
	abstract void location();
}
abstract class sports1 extends player1
{
	void playername()
	{
		System.out.println("Player Name :Ramya");
	}
	void sportsname()
	{
		System.out.println("Sports Name :FootBall");
	}
}
class sports2 extends sports1
{
	void location()
	{
		System.out.println("Location :location");
	}
}
public class MultilevelAbstractMethods {

	public static void main(String[] args) {
		sports2 a=new sports2();
		a.playername();
		a.sportsname();
		a.location();
	}

}
