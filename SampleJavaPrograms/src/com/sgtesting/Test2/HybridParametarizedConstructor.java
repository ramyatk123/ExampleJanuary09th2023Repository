package com.sgtesting.Test2;
class employee10
{
	employee10(String employeename)
	{
		System.out.println("employeename :"+employeename);
	}
}
class employee11 extends employee10
{
	String lastname;
	employee11(String employeename,String lastname)
	{
		super(employeename);
		this.lastname=lastname;
		System.out.println("last name :"+lastname);
	}
}
class employee12 extends employee11
{
	int age;
	employee12(String employeename,String lastname,int age)
	{
		super(employeename,lastname);
		this.age=age;
		System.out.println("Age :"+age);
	}
}
class employee13 extends employee10
{
	String address;
	employee13(String employeename,String location)
	{
		super(employeename);
		this.address=address;
		System.out.println("Address :"+address);
	}
}
public class HybridParametarizedConstructor {

	public static void main(String[] args) {
		employee12 a=new employee12("Ramya","Gowda",24);
		System.out.println("+++++++++");
		employee13 b=new employee13("Ramya Gowda","Bangalore");
	}

}
