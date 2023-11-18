package com.sgtesting.InheritanceAssignment;
class employee11
{
	employee11(String employeename)
	{
		System.out.println("employeename:"+employeename);
	}
}
class employee10 extends employee11
{
	String branchname;
	employee10(String employeename,String branchname)
	{
		super(employeename);
		this.branchname=branchname;
		System.out.println("branchname:"+branchname);
	}
	
}
class employee8 extends employee10
{
	int age;
	
	employee8(String employeename,String branchname,int age)
	{
		super(employeename,branchname);
		this.age=age;
		System.out.println("Age:"+age);
	}
	
}
 class employee9 extends employee11
{
	String location;
    employee9(String employeename,String location)
	{
		super(employeename);
		this.location=location;
		System.out.println("location:"+location);
	}
}
public class Program6 {

	public static void main(String[] args) {
		employee8 obj1=new employee8("Ramya","Computer Science",24);
		System.out.println("+++++++++++++++");
		employee9 obj2=new employee9("Ramya","Bangalore");
	}

}
