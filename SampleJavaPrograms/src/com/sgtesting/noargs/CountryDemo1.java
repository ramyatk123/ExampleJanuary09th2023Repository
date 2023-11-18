package com.sgtesting.noargs;

class country1
{
	String countryname;
	int numberofcountry;
	country1()
	{
		countryname="India";
		numberofcountry=48;
		System.out.println("countryname:"+countryname);
		System.out.println("numberofcountry:"+numberofcountry);
		System.out.println("+++++++++");
	}
}
class state1
{
	String Statename;
	int numberofstate;
	state1()
	{
		Statename="vijaynagara";
		numberofstate=31;
		System.out.println("Statename:"+Statename);
		System.out.println("numberofstate:"+numberofstate);
		System.out.println("+++++++++");
	}
}
class distinct1
{
	String distinctname;
	int numberofdistinct;
	distinct1()
	{
		distinctname="Tumkur";
		numberofdistinct=8;
		System.out.println("distinctname:"+distinctname);
		System.out.println("numberofdistinct:"+numberofdistinct);
	}
}
public class CountryDemo1 {

	public static void main(String[] args) {
		country1 obj1=new country1();
		
		state1 obj2=new state1();
		
		distinct1 obj3=new distinct1();

	}

}
