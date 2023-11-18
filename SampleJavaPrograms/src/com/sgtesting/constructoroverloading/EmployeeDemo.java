package com.sgtesting.constructoroverloading;
class Employee
{
	Employee(String firstname)
	{
		System.out.println("firstname:"+firstname);
	}
	Employee(int age)
	{
		System.out.println("age:"+age);
	}
	Employee(int salary,String location)
	{
		System.out.println("salary:"+salary);
		System.out.println("location:"+location);
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee a=new Employee("Ramya");
		Employee b=new Employee(24);
		Employee c=new Employee(20000,"Banglore");

	}

}
