package com.sgtesting.encapsulations;

public class HumanDemo1 {
	String firstname;
	int age;

	public static void main(String[] args) {
    Human obj1=new Human();
    obj1.firstname="santosh";
    obj1.age=45;
    System.out.println("firstname:"+obj1.firstname);
    System.out.println("age:"+obj1.age);
    Human obj2=new Human();
    obj2.firstname="madhu";
    obj2.age=26;
    System.out.println("firstname:"+obj2.firstname);
    System.out.println("age:"+obj2.age);

	}

}
