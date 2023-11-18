package com.sgtesting.Test3;
class student001
{
	student001(String firstname)
	{
		System.out.println("firstname :"+firstname);
	}
}
class department extends student001
{
	String branchname;
	department(String firstname,String branchname)
	{
		super(firstname);
		this.branchname=branchname;
		System.out.println("branch name :"+branchname);
	}
}
public class ParametarizedConstructorDemo {

	public static void main(String[] args) {
		department a=new department("Ramya","Computer Science");

	}

}
