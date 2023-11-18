package com.sgtesting.AbstractClass;
abstract class student
{
	abstract void studentname();
	abstract void collegename();
	abstract void location();
	
}
abstract class Reva extends student
{
	void studentname()
	{
		System.out.println("Student Name :Ramya");
	}
	void collegename()
	{
		System.out.println("collegename  :Reva");
	}
}

 class RV extends Reva
{
	void location()
	{
		System.out.println("location  :Bangalore");
	}
	
}
public class Program3 {

	public static void main(String[] args) {
		 RV r2=new RV();
		 r2.studentname();
		 r2.collegename();
		 r2.location();

	}

}
