package com.sgtesting.Inheritance;
class Metrocity
{
	void displaycity(String cityname)
	{
		System.out.println("Metro city name:"+cityname);
	}
}
class capitalcity extends Metrocity
{
	capitalcity(String cityname)
	{
		super.displaycity(cityname);
	}
	void displaycity(String cityname)
	{
		System.out.println("Capital city name:"+cityname);
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		capitalcity obj1=new capitalcity("Delhi");
		obj1.displaycity("Bangalore");

	}

}
