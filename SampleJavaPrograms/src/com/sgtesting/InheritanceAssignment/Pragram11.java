package com.sgtesting.InheritanceAssignment;
class employee21
{
	employee21(String employeename)
	{
		System.out.println("employeename:"+employeename);
	}
}
class employee20 extends employee21
{
	String branchname;
	employee20(String employeename,String branchname)
	{
		super(employeename);
		this.branchname=branchname;
		System.out.println("branchname:"+branchname);
	}
	
}
class employee18 extends employee21
{
	int age;
	
	employee18(String employeename,int age)
	{
		super(employeename);
		this.age=age;
		System.out.println("Age:"+age);
	}
	
}
 class employee19 extends employee21
{
	String location;
    employee19(String employeename,String location)
	{
		super(employeename);
		this.location=location;
		System.out.println("location:"+location);
	}
}
public class Pragram11 {

	public static void main(String[] args) {
		employee18 obj1=new employee18("Vinu",24);
		employee20 obj3=new employee20("Kiran","Computer Science");
		System.out.println("+++++++++++++++");
		employee19 obj2=new employee19("Ramya","Bangalore");	

	}

}
