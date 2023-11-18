package com.sgtesting.encapsulations;
class country
{
	String countryname;
	int numberofcountry;
}
class state
{
	String Statename;
	int numberofstate;
}
class distinct
{
	String distinctname;
	int numberofdistinct;
}
public class CountryDemo {

	public static void main(String[] args) {
	country obj1=new country();
	obj1.countryname="India";
	obj1.numberofcountry=48;
	System.out.println("countryname:"+obj1.countryname);
	System.out.println("numberofcountry:"+obj1.numberofcountry);
	System.out.println("+++++++++");
	state obj2=new state();
	obj2.Statename="vijaynagara";
	obj2.numberofstate=31;
	System.out.println("Statename:"+obj2.Statename);
	System.out.println("numberofstate:"+obj2.numberofstate);
	System.out.println("+++++++++");
	distinct obj3=new distinct();
	obj3.distinctname="Tumkur";
	obj3.numberofdistinct=8;
	System.out.println("distinctname:"+obj3.distinctname);
	System.out.println("numberofdistinct:"+obj3.numberofdistinct);
	

	}

}
