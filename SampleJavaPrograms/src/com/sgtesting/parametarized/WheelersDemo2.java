package com.sgtesting.parametarized;
class twowheelers2
{
	String brandname;
	int amount;
	twowheelers2(String bd,int amt)
	{
		System.out.println(bd);
		System.out.println(amt);
		System.out.println("++++++++");
		
	}
}
class fourwheelers2
{
	String name;
	int cost;
	fourwheelers2(String nm,int cs)
	{
		System.out.println(nm);
		System.out.println(cs);
	}
}
public class WheelersDemo2 {

	public static void main(String[] args) {
		twowheelers2 a=new twowheelers2("KTM",20000);
		fourwheelers2 b=new fourwheelers2("Fortuner",350000);

	}

}
