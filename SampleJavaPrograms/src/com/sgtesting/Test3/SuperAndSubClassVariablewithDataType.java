package com.sgtesting.Test3;
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
public class SuperAndSubClassVariablewithDataType {

	public static void main(String[] args) {
		product a=new product("Amazon","Iphone");
		a.show();
		a.display();

	}

}
