package com.sgtesting.Test2;
class metrocity
{
	void displaycity(String cityname)
	{
		System.out.println("Metro city name :"+cityname);
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
		System.out.println("Capital city name :"+cityname);
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		capitalcity o=new capitalcity("Delhi");
		o.displaycity("Bangalore");
	}

}
