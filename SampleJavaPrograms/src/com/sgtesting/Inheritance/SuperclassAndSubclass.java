package com.sgtesting.Inheritance;
class customer
{
	String ProductName;
	void show()
	{
		System.out.println("In super class:"+ProductName);
	}
}
class product extends customer
{
	String ProductName;
	product(String ProductName,String superproductname)
	{
		super.ProductName=superproductname;
		this.ProductName=ProductName;
	}
	void display()
	{
		System.out.println("In sub class:"+ProductName);
	}
}
public class SuperclassAndSubclass {

	public static void main(String[] args) {
		product o=new product("Lenovo","Dell");
		o.show();
		o.display();

	}

}
