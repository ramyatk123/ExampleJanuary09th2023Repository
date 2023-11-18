package com.sgtesting.Test2;
abstract class Student01
{
	abstract void showstudentname(String name);
	abstract void showcollegename(String name);
	void displaybranches(String branches[])
	{
		System.out.println("Branch Name:");
		for(int i=0;i<branches.length;i++)
		{
			System.out.println(branches[i]);
		}
	}
}
class GFGC extends Student01
{
	void showstudentname(String name)
	{
		System.out.println("Student Name :"+name);
	}
	void showcollegename(String name)
	{
		System.out.println("Student College Name :"+name);
	}
	void displayAddress(String address)
	{
		System.out.println("College Address :"+address);
	}
}
public class AbstractDemo12 {

	public static void main(String[] args) {
		GFGC a=new GFGC();
		a.showstudentname("Ramya Gowda");
		a.showcollegename("Tumkur University");
		String s[]= {"Bcom","BCA","MSc"};
		a.displaybranches(s);
		a.displayAddress("Tumkur");
		
	}

}
