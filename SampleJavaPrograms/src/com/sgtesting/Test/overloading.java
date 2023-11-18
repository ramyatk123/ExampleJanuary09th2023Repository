package com.sgtesting.Test;
class studentDemo
{
	studentDemo(String firstname)
	{
		System.out.println("firstname:"+firstname);
	}
	studentDemo(int age)
	{
		System.out.println("age:"+age);
	}
	studentDemo(String branchname,String location)
	{
		System.out.println("branchname:"+branchname);
		System.out.println("location:"+location);
	}
}
public class overloading {

	public static void main(String[] args) {
		studentDemo a=new studentDemo("Divya");
		studentDemo b=new studentDemo(22);
		studentDemo c=new studentDemo("Civil","Tumkur");

	}

}
