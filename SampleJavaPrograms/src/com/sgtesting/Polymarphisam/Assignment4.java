package com.sgtesting.Polymarphisam;
abstract class Cricket
{
	abstract void Player();
}

class PlayerName extends Cricket
{

	void Player()
	{
		String s;
		s="Virat Kohli";

		System.out.println("Player name:"+s);
	}

}

class PlayerNation extends Cricket
{
	void Player()
	{
		String s;
		s="INDIA";

		System.out.println("Player Nation name:"+s);
	}
}

class PlayerStrikeRate extends Cricket
{
	void Player()
	{
		double d;
		d=145.67;
		System.out.println("Student Strikerate:"+d);
	}
}

class PlayerAverage extends Cricket
{
	void Player()
	{
		double d;
		d=58.78;
		System.out.println("Player Average Score:"+d);
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		Cricket cr=null;
		PlayerName pn=new PlayerName();
		PlayerNation pc=new PlayerNation();
		PlayerStrikeRate ps=new  PlayerStrikeRate();
		PlayerAverage pa=new PlayerAverage();
		
		
		cr=pn;
		cr.Player();
		
		cr=pc;
		cr.Player();
		
		cr=ps;
		cr.Player();
		
		cr=pa;
		cr.Player();

	}

}
