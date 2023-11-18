package com.sgtesting.Interface;
interface University1
{
	void showuniversityname(String name);
}
interface EnggCollege1
{
	abstract void showcollegename(String name);
}
interface DiplomaCollege1
{
	abstract void showdiplomacollege(String name);
}
abstract class branchname
{

	void displaybranchname(String name)
	{
		System.out.println("Branch Name :"+name);
	}
}

class College2 extends branchname implements University,EnggCollege,DiplomaCollege
{
	public void showuniversityname(String name)
	{
		System.out.println("University Name :"+name);
	}
	public void showcollegename(String name)
	{
		System.out.println("Engineering College Name :"+name);
	}
	 public void showdiplomacollege(String name)
	{
		System.out.println(" Diploma College name :"+name);
	}
	 void displayAddress(String address)
	 {
		 System.out.println("college address :"+address);
	 }
}
public class Program2 {

	public static void main(String[] args) {
		College2 a1=new College2();
		a1.showuniversityname("Tumkur University");
        a1.showcollegename("GTTC");
        a1.showdiplomacollege("Siddaganga");
        a1.displayAddress("Tumkur");
        a1.displaybranchname("Civil");
       

	}

}
