package com.sgtesting.noargs;


class employee1
{
	String firstname;
	int salary;
	employee1()
	{
		firstname="Ramya";
		salary=10000;
		System.out.println("firstname:"+firstname);
		System.out.println("salary:"+salary);
		System.out.println("++++++++");
	}
}
class department1
{
	String branch;
	int slno;
	department1()
	{
	branch="computer science";
	slno=10;
	System.out.println("branch:"+branch);
	System.out.println("slno:"+slno);
	System.out.println("+++++++");
	}
}
class insurance1
{
	String lic;
	int amount;
	insurance1()
	{
		lic="lifeinsurance";
		amount=5000;
		System.out.println("lic:"+lic);
		System.out.println("amount:"+amount);	
	}
}
public class MainDemo1 {

	public static void main(String[] args) {
		employee1 obj1=new employee1();
		
		department1 obj2=new department1();
		
		insurance1 obj3=new insurance1();

	}

}
