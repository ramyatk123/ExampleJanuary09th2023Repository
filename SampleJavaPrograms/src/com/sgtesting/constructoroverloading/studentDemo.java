package com.sgtesting.constructoroverloading;
class student1
{
	student1(String firstname)
	{
		System.out.println("firstname:"+firstname);	
	}
	student1(int age)
	{
		System.out.println("age:"+age);
	}
	student1(String branchname,String location)
	{
		System.out.println("branchname:"+branchname);
		System.out.println("location:"+location);
	}
}

public class studentDemo {

	public static void main(String[] args) {
		student1 a=new student1("Santosh");
		student1 b=new student1(20);
		student1 c=new student1("Computer Science","Bangalore");
		

	}

}
