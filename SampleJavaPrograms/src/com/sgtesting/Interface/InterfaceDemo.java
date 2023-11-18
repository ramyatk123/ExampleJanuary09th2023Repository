package com.sgtesting.Interface;
interface University01
{
	void showuniversityname(String name);
}
class college implements University01
{
	public void showuniversityname(String name)
	{
		System.out.println("University Name :"+name);
	}
	void displayAddress(String address)
	{
		System.out.println("College Address :"+address);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		college a=new college();
		a.showuniversityname("VTU Belagam");
		a.displayAddress("Bangalore");

	}

}
