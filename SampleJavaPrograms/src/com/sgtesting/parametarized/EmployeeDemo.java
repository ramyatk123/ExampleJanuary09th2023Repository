package com.sgtesting.parametarized;
class employee2
{
	String firstname;
	String lastname;
	employee2(String fn,String ln)
	{
		firstname=fn;
		lastname=ln;
		System.out.println(fn);
		System.out.println(ln);
		System.out.println("+++++++++");

	}
}
class department2
{
	String branchname;
	String departmentno;
	department2(String b,String deptno)
	{
		System.out.println(b);
		System.out.println(deptno);
		System.out.println("+++++++++");
	}
}
class insurance2
{
	String lic;
	String amount;
	insurance2(String lic,String amt)
	{
		System.out.println(lic);
		System.out.println(amt);
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		employee2 obj1=new employee2("Ramya","Thanu");
		department2 obj2=new department2("Computer Science","10");
		insurance2 obj3=new insurance2("life insurance","5000");

	}

}
