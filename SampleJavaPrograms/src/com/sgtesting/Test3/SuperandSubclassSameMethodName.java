package com.sgtesting.Test3;
class metrocity
{
	void displaycity(String cityname)
	{
		System.out.println("Metro city Name :"+cityname);
	}
}
class capitalcity extends metrocity
{
	capitalcity(String cityname)
	{
		super.displaycity(cityname);
	}
	void displaycity(String cityname)
	{
		System.out.println("Capital city Name :"+cityname);
	}
}
public class SuperandSubclassSameMethodName {

	public static void main(String[] args) {
		capitalcity o=new capitalcity("Delhi");
		o.displaycity("Bangalore");

	}

}
