package com.sgtesting.Test2;
class student
{
	student(String firstname)
	{
		System.out.println("First name :"+firstname);
	}
}
class  student1 extends student
{
	String lastname;
	student1(String firstname,String lastname)
	{
		super(firstname);
		this.lastname=lastname;
		System.out.println("Last Name :"+lastname);
	}
}
class student2 extends student1
{
	int age;
	student2(String firstname,String lastname,int age)
	{
		super(firstname,lastname);
		this.age=age;
		System.out.println("Age :"+age);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		student2 a=new student2("Ramya","Gowda",26);

	}

}
