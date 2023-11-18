package com.sgtesting.Inheritance;
class player
{
	player(String playerName)
	{
		System.out.println("player Name:"+playerName);
	}
}
class sports extends player
{
	String sportsname;
	sports(String playerName,String sportsname)
	{
		super(playerName);
		this.sportsname=sportsname;
		System.out.println("sportsname:"+sportsname);
	}
}
public class ParametarizedConstructorDemo {
	public static void main(String[] args) {
		sports sp=new sports("Ramya","Kabadi");
	}

}
