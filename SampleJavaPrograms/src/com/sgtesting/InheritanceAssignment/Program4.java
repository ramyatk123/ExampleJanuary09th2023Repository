package com.sgtesting.InheritanceAssignment;
class employee
{
	employee(String employeename)
	{
		System.out.println("employeename:"+employeename);
	}
}
class employee1 extends employee
{
	String branchname;
	employee1(String employeename,String branchname)
	{
		super(employeename);
		this.branchname=branchname;
		System.out.println("branchname:"+branchname);
	}
	
}
class employee2 extends employee1
{
	int age;
	
	employee2(String employeename,String branchname,int age)
	{
		super(employeename,branchname);
		this.age=age;
		System.out.println("Age:"+age);
	}
	
}
public class Program4 {

	public static void main(String[] args) {
		
		employee2 obj2=new employee2("Kiran","Civil",25);

	}

}
