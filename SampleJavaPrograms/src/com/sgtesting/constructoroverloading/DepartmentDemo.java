package com.sgtesting.constructoroverloading;
class department
{
	department(String dname)
	{
		System.out.println("dname:"+dname);
	}
	department(int deptno)
	{
		System.out.println("deptno:"+deptno);
	}
	department(String JobRole,String Location)
	{
		System.out.println("Jobrole:"+JobRole);
		System.out.println("Location:"+Location);
		
	}
	
}
public class DepartmentDemo {

	public static void main(String[] args) {
		department a=new department("Civil");
		department b=new department(10);
		department d=new department("Manager","Tumkur");
		
	}

}
