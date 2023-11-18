package com.sgtesting.Interface;
interface University02
{
	void showuniversityname(String name);
}
interface EnggCollege03
{
	abstract void showcollegename(String name);
}
class college01 implements University02,EnggCollege03
{
	public void showuniversityname(String name)
	{
		System.out.println("University Name :"+name);
	}
	public void showcollegename(String name)
	{
		System.out.println("Engineering College Name :"+name);
	}
	void displayAddress(String address)
	{
		System.out.println("College Address :"+address);
	}
}
public class MoreThanOneMultipleInterface {

	public static void main(String[] args) {
		college01 a=new college01();
		a.showuniversityname("Tumkur University");
		a.showcollegename("Government College");
		a.displayAddress("Tumkur");

	}

}
