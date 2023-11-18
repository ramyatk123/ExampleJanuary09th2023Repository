package com.sgtesting.Test2;
class player
{
	player(String playername)
	{
		System.out.println("player name:"+playername);
	}
}
class sports extends player
{
	String sportsname;
	sports(String playername,String sportsname)
	{
		super(playername);
		this.sportsname=sportsname;
		System.out.println("sportsname:"+sportsname);
	}
}
public class ParametarizedConstructor {

	public static void main(String[] args) {
		sports sp=new sports("Ramya","FootBall");

	}

}
