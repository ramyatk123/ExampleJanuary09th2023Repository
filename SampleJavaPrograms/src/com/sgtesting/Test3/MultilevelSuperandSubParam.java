package com.sgtesting.Test3;
class employee02
{
	 employee02(String employeename)
	{
		System.out.println("In super class :"+employeename);
	}
}
class student extends employee02
{
	String lastname;
	student(String employeename,String branchname)
	{
		super(employeename);
		this.lastname=lastname;
		System.out.println("Last Name :"+lastname);
	}
}
class student10 extends student
{
	int age;
	student10(String employeename,String branchname,int age)
	{
		super(employeename,branchname);
		this.age=age;
		System.out.println("Age :"+age);
	}
}
public class MultilevelSuperandSubParam {

	public static void main(String[] args) {
		student10 a=new student10("Ramya","Civil",26);
		

	}

}
