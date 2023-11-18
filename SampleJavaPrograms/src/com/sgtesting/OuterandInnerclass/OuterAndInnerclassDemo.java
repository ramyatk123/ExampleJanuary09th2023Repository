package com.sgtesting.OuterandInnerclass;
class Outer
{
	int playercount;
	inner inner=new inner();
	void ShowItemName()
	{
		inner.sportsitemname="Cricket and Bat";
		System.out.println("sportsitemname:"+inner.sportsitemname);
	}
	class inner
	{
		String sportsitemname;
		void ShowPlayerCount()
		{
			playercount=11;
			System.out.println("playercount:"+playercount);
			
		}
	}
}
public class OuterAndInnerclassDemo {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.ShowItemName();
		outer.inner.ShowPlayerCount();
	}

}
