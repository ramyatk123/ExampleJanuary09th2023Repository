package com.sgtesting.Test;
  class person
  {
	  String firstname;
	  int age;
  }
  class Birds5
  {
	  String feathercolor;
	  int noofwings;
  }
  class DomesticAnimal
  {
	  String quantityofmilk;
	  String breename;
  }
public class MultipleConstructor {

	public static void main(String[] args) {
		person obj1=new person();
		obj1.firstname="Vinay";
		obj1.age=24;
		System.out.println("firstname:"+obj1.firstname);
		System.out.println("age:"+obj1.age);
		System.out.println("++++++");
		Birds5 obj2=new Birds5();
		obj2.feathercolor="Pink";
		obj2.noofwings=2;
		System.out.println("feathercolor:"+obj2.feathercolor);
		System.out.println("noofwings:"+obj2.noofwings);
		System.out.println("+++++++");
		DomesticAnimal obj3=new DomesticAnimal();
		obj3.quantityofmilk="10 liters";
		obj3.breename="Jersey";
		System.out.println("quantityofmilk:"+obj3.quantityofmilk);
		System.out.println("breename:"+obj3.breename);
		
		
	}

}
