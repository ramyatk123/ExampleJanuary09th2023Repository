package com.sgtesting.Interface;
interface University03
{
	void showuniversityname(String name);
}
interface EnggCollege04
{
	abstract void showcollegename(String name);
}
class college02 implements University03,EnggCollege04
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
public class InterfaceAlone {

	public static void main(String[] args) {
		college02 a=new college02();
		//a.showuniversityname("Tumkur University");  cann't access
		a.showcollegename("Government College");
		//a.displayAddress("Tumkur");  cann't access


	}

}
