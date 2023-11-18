package com.sgtesting.constructoroverloading;
class University
{
	University(String Universityname)
	{
		System.out.println("Universityname:"+Universityname);
	}
	University(int department)
	{
		System.out.println("department:"+department);
	}
	University(String principle,String location)
	{
		System.out.println("principle:"+principle);
		System.out.println("location:"+location);
	}
}
public class UniversityDemo {

	public static void main(String[] args) {
		University a=new University("Bangalore University");
		University b=new University(10);
		University c=new University("Ramya Gowda","Bangalore");

	}

}
