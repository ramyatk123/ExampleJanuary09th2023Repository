package com.sgtesting.AbstractClass;
abstract class University
{
	abstract void showuniversityname(String name);
	abstract void showcollegename(String name);
	void displaybranches(String branches[])
	{
		System.out.println("Branch Name  :");
		for(int i=0;i<branches.length;i++)
		{
			System.out.println(branches[i]);
		}
	}
}
class BMSEngg extends University
{
	void showuniversityname(String name)
	{
		System.out.println("University Name  :"+name);
	}
	void showcollegename(String name)
	{
		System.out.println("Engeneering College Name  :"+name);
	}
	void displayAddress(String address)
	{
		System.out.println("College Address  :"+address);
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		BMSEngg bms=new BMSEngg();
		bms.showuniversityname("VTU University");
		bms.showcollegename("BMS Engeneering College");
		String s[]= {"Civil","Computer Science","Mechanical"};
		bms.displaybranches(s);
		bms.displayAddress("7th main,5th cross Bangalore");

	}

}
