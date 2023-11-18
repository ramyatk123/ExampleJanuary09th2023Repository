package com.sgtesting.encapsulations;
class twowheelers
{
	String brandname;
	int amount;
}
class fourwheelers
{
	String name;
	int cost;
}
public class WheelersDemo {

	public static void main(String[] args) {
	twowheelers obj1=new twowheelers();
	obj1.brandname="KTM";
	obj1.amount=120000;
	System.out.println("brandname:"+obj1.brandname);
	System.out.println("amount:"+obj1.amount);
	System.out.println("++++++++++");
	fourwheelers obj2=new fourwheelers();
	obj2.name="furtuner";
	obj2.cost=350000;
	System.out.println("name:"+obj2.name);
	System.out.println("cost:"+obj2.cost);

	}

}
