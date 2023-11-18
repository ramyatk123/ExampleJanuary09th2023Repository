package com.sgtesting.noargs;

class twowheelers1
{
	String brandname;
	int amount;
	twowheelers1()
	{
		brandname="KTM";
		amount=120000;
		System.out.println("brandname:"+brandname);
		System.out.println("amount:"+amount);
		System.out.println("++++++++++");
	}
}
class fourwheelers1
{
	String name;
	int cost;
	fourwheelers1()
	{
		name="furtuner";
		cost=350000;
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
	}
}
public class WheelersDemo1 {

	public static void main(String[] args) {
		twowheelers1 obj1=new twowheelers1();
		
		fourwheelers1 obj2=new fourwheelers1();

	}

}
