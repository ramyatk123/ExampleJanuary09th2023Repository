package com.sgtesting.constructoroverloading;
class player
{
	player(String playername)
	{
		System.out.println("playername:"+playername);
	}
	player(int playerid)
	{
		System.out.println("playerid:"+playerid);
	}
	player(String sportsname,int dateofbirth,String location)
	{
		System.out.println("sportsname:"+sportsname);
		System.out.println("dateofbirth:"+dateofbirth);
		System.out.println("location:"+location);
	}
}
public class PlayerDemo2 {

	public static void main(String[] args) {
		player a=new player("Prajwal Gowda");
		player b=new player(12);
		player c=new player("football",1996,"Tumkur");

	}

}
