package com.sgtesting.encapsulations;
class person
{
	String firstname;
	int age;
}
class Birds1
{
	String feathercolor;
	int noofwings;  
}
class DomesticAnimal
{
	String quantityofmilkprovides;
	String breename;
}

public class HumanDemo2
{
	public static void main(String[] args) 
	{
		person obj1=new person();
		obj1.firstname="Darshan";
		obj1.age=26;
		System.out.println("firstname:"+obj1.firstname);
		System.out.println("age:"+obj1.age);
		System.out.println("++++++++++");
		Birds1 sparrow=new Birds1();
		sparrow.feathercolor="gray color";
		sparrow.noofwings=2;
		System.out.println("feathercolor:"+sparrow.feathercolor);
		System.out.println("noofwings:"+sparrow.noofwings);
		System.out.println("++++++++++");
		DomesticAnimal cow=new DomesticAnimal();
		cow.quantityofmilkprovides="10 liters";
		cow.breename="jersey";
		System.out.println("quantityofmilkprovides:"+cow.quantityofmilkprovides);
		System.out.println("breed name:"+cow.breename);

	}

}
