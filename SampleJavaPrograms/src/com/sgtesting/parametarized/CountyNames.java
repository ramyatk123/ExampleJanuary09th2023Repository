package com.sgtesting.parametarized;
class country2
{
	String countryname;
	int numberofcountry;
	String NationalBird;
	country2(String cn,int nos,String nb)
	{
		System.out.println(cn);
		System.out.println(nos);
		System.out.println(nb);
		System.out.println("++++++++");
	}
}
class state2
{
	String Statename;
	int numberofstate;
	String statebird;
	state2(String sn,int nos,String sb)
	{
		System.out.println(sn);
		System.out.println(nos);
		System.out.println(sb);
		System.out.println("++++++++");
	}
}
class district2
{
	String distinctname;
	int numberofdistinct;
	String noofpanchayath;
	district2(String dn,int nos,String nop)
	{
		System.out.println(dn);
		System.out.println(nos);
		System.out.println(nop);
	}
}
public class CountyNames {

	public static void main(String[] args) {
		country2 a=new country2("India",28,"peacock");
		state2 b=new state2("Tamilnadu",38,"Emerland Dove");
		district2 c=new district2("Tumkur",8,"12");
		

	}

}
