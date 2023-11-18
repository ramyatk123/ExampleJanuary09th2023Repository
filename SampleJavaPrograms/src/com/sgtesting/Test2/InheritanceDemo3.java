package com.sgtesting.Test2;
class customer
{
	String productname;
	void show()
	{
		System.out.println("In super class :"+productname);
	}
}
class product extends customer
{
	String productname;
	product(String productname,String superproductname)
	{
		super.productname=superproductname;
		this.productname=productname;
	}
	void display()
	{
		System.out.println("In sub class :"+productname);
	}
}
public class InheritanceDemo3 {

	public static void main(String[] args) {
		product o=new product("Dell","HP");
		o.show();
		o.display();

	}

}
