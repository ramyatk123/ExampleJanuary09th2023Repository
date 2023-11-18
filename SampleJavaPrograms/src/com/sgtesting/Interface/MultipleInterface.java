package com.sgtesting.Interface;
interface University
{
	void showuniversityname(String name);
}
interface EnggCollege 
{
	abstract void showcollegename(String name);
}
interface DiplomaCollege
{
	abstract void showdiplomacollege(String name);
}

class College1 implements University,EnggCollege,DiplomaCollege
{
	public void showuniversityname(String name)
	{
		System.out.println("University Name :"+name);
	}
	public void showcollegename(String name)
	{
		System.out.println("Diploma College Name :"+name);
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
public class MultipleInterface {

	public static void main(String[] args) {
		
        
        College1 a1=new College1();
		a1.showuniversityname("Tumkur University");
        a1.showcollegename("GTTC");
        a1.showdiplomacollege("Siddaganga");
        a1.displayAddress("Tumkur");
        
	}

}
