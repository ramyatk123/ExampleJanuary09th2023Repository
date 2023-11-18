package com.sgtesting.encapsulations;
class employee
{
	String firstname;
	int salary;
}
class department
{
	String branch;
	int slno;
}
class insurance
{
	String lic;
	int amount;
}

public class MemberEmployee {

	public static void main(String[] args) {
		employee obj1=new employee();
		obj1.firstname="Ramya";
		obj1.salary=10000;
		System.out.println("firstname:"+obj1.firstname);
		System.out.println("salary:"+obj1.salary);
		System.out.println("++++++++");
		department obj2=new department();
		obj2.branch="computer science";
		obj2.slno=10;
		System.out.println("branch:"+obj2.branch);
		System.out.println("slno:"+obj2.slno);
		System.out.println("+++++++");
		insurance obj3=new insurance();
		obj3.lic="lifeinsurance";
		obj3.amount=5000;
		System.out.println("lic:"+obj3.lic);
		System.out.println("amount:"+obj3.amount);	
	}

}
