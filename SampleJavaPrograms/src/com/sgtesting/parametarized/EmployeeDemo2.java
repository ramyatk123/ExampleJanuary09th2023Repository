package com.sgtesting.parametarized;
class Employee
{
	String firstname;
	int age;
	Employee(String fn,int age)
	{
		this.firstname=fn;
		this.age=age;
		System.out.println("firstname:"+this.firstname);
		System.out.println("age:"+this.age);
	}
void display()
{
	System.out.println("firstname:"+this.firstname);
	System.out.println("age:"+this.age);
}
}
public class EmployeeDemo2 {

	public static void main(String[] args) {
		Employee a=new Employee("Santosh",20);
		a.display();
	}
}
