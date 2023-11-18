package com.sgtesting.TryandCatchBlock;

abstract class Cricket01
{
	abstract void Player();
}

class PlayerName02 extends Cricket01
{

	void Player()
	{
		String s;
		s="Virat Kohli";

		System.out.println("Player name:"+s);
	}

}

class PlayerNation03 extends Cricket01
{
	void Player()
	{
		String s;
		s="INDIA";

		System.out.println("Player Nation name:"+s);
	}
}

class PlayerStrikeRate04 extends Cricket01
{
	void Player()
	{
		try
		{
		double d;
		d=145.67;
		System.out.println("Student Strikerate:"+d);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
		
}

class PlayerAverage05 extends Cricket01
{
	void Player()
	{
		double d;
		d=58.78;
		System.out.println("Player Average Score:"+d);
	}
}
public class NullpointExceptionDemo {

	public static void main(String[] args) {
		Cricket01 cr=null;
		PlayerName02 pn=new PlayerName02();
		PlayerNation03 pc=new PlayerNation03();
		PlayerStrikeRate04 ps=new  PlayerStrikeRate04();
		PlayerAverage05 pa=new PlayerAverage05();
		
		
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
