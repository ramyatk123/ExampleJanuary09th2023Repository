package com.sgtesting.Test;

class employee2
{
	String firstname;
	int age;
	employee2(String fn,int age)
	{
		this.firstname=fn;
		this.age=age;
		System.out.println("firstname:"+this.firstname);
		System.out.println("age:"+this.age);
		System.out.println("++++++++");
	}
	void display()
	{
		System.out.println("firstname:"+this.firstname);
		System.out.println("age:"+this.age);
	}
}
public class ThisOperator {

	public static void main(String[] args) {
		employee2 a=new employee2("santosh",24);
		a.display();

	}

}
