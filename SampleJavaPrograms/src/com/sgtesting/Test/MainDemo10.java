package com.sgtesting.Test;

class person6
{
	  String firstname;
	  int age;
	  person6()
	  {
		  firstname="Vinay";
		  age=24;
			System.out.println("firstname:"+firstname);
			System.out.println("age:"+age);
			System.out.println("++++++");
	  }
}
class Birds6
{
	  String feathercolor;
	  int noofwings;
	  Birds6()
	  {
		  feathercolor="Pink";
			noofwings=2;
			System.out.println("feathercolor:"+feathercolor);
			System.out.println("noofwings:"+noofwings);
			System.out.println("+++++++");
	  }
}
class DomesticAnimal6
{
	  String quantityofmilk;
	  String breename;
	  DomesticAnimal6()
	  {
		  quantityofmilk="10 liters";
			breename="Jersey";
			System.out.println("quantityofmilk:"+quantityofmilk);
			System.out.println("breename:"+breename);
	  }
}
public class MainDemo10 {

	public static void main(String[] args) {
		person6 obj1=new person6();
		Birds6 obj2=new Birds6();
		DomesticAnimal6 obj3=new DomesticAnimal6();

	}

}
