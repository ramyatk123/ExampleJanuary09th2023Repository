package com.sgtesting.tests;
interface Employee
{
	void showJobName(String name);
}
interface Department
{
	void showDepartmentName(String name);
}
class person implements Employee,Department
{
	public void showJobName(String name)
	{
		System.out.println("Employee Job Name :"+name);
	}
	public void showDepartmentName(String name)
	{
		System.out.println("Department Name :"+name);
	}
}
public class CastingInterfaceDemo {

	public static void main(String[] args) {
		Employee emp=new person();
		emp.showJobName("Analyst");
		
		Department dept=(Department) emp;
		dept.showDepartmentName("Manager");

	}

}
