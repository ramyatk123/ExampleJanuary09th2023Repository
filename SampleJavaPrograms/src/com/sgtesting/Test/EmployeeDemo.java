package com.sgtesting.Test;
class employee
{
	String firstname;
	int age;
	employee(String fn,int ag)
	{
		firstname=fn;
		age=ag;
		System.out.println(fn);
		System.out.println(ag);
		System.out.println("+++++++");
	}
}
class department
{
	String name;
	int departmentno;
	department(String nm,int deptno)
	{
		name=nm;
		departmentno=deptno;
		System.out.println(nm);
		System.out.println(deptno);
		System.out.println("++++++");
	}
}
class college
{
	String collegename;
	String location;
	college(String cn,String loc)
	{
		collegename=cn;
		location=loc;
		System.out.println(cn);
		System.out.println(loc);
		
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		employee a=new employee("Thanu",24);
		department b=new department("Computer science",20);
		college c=new college("GFGC","Tumkur");

	}

}
