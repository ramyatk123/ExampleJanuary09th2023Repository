package com.sgtesting.InheritanceAssignment;
class school
{
	String firstname="Ramya";
	void student1()
	{
		System.out.println("Student First Name:"+firstname);
	}
}
class school1 extends school
{
     String lastname="Gowda";
     void student2()
     {
    	 System.out.println("student Last Name:"+lastname);
     }
}
class school2 extends school
{
	int age=24;
	void student3()
	{
		System.out.println("student age:"+age);
	}
	
}
class school3 extends school
{
	String branchname="Computer Science";
	void student4()
	{
		System.out.println("student Branch Name:"+branchname);
	}
	
}
public class HierarchicalDemo {

	public static void main(String[] args) {
	school1 obj1=new school1();
	obj1.student1();
	obj1.student2();
	
	school2 obj2=new school2();
	obj2.student3();
	obj2.student1();
	
     school3 obj3=new school3();
     obj3.student1();
     obj3.student4();
	}

}
