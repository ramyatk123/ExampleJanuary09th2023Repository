package com.sgtesting.InheritanceAssignment;
class student
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result:"+(x+y));
	}
}
class student2 extends student
{
	void substraction(int a,int b)
	{
		System.out.println("Substraction Result:"+(a-b));
	}
}
class student3 extends student2
{
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result:"+(x*y));
	}
}
class student4 extends student3
{
	void division(int a,int b)
	{
		System.out.println("Division Result:"+(a/b));
	}
}
public class MultilevelDemo {

	public static void main(String[] args) {
	     student4 obj1=new student4();
	     obj1.addition(22,33);
	     obj1.substraction(123,19);
	     obj1.multiplication(35,7);
	     obj1.division(66,4);

	}

}
