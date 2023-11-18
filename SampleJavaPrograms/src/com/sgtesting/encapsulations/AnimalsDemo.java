package com.sgtesting.encapsulations;
class Animals
{
	String animalsname;
	String color;
}
class Birds
{
	String birdsname;
	String type;
}
class insects
{
	String insectsname;
	String name;
}
public class AnimalsDemo {

	public static void main(String[] args) {
	Animals obj1=new Animals();
	obj1.animalsname="Tiger";
	obj1.color="golden color";
	System.out.println("animalsname:"+obj1.animalsname);
	System.out.println("color:"+obj1.color);
	System.out.println("+++++++++");
	Birds obj2=new Birds();
	obj2.birdsname="parrot";
	obj2.type="lower classification";
	System.out.println("birdsname:"+obj2.birdsname);
	System.out.println("type:"+obj2.type);
	System.out.println("++++++++++");
	insects obj3=new insects();
	obj3.insectsname="bees";
	obj3.name="mining bee";
	System.out.println("insectsname:"+obj3.insectsname);
	System.out.println("name:"+obj3.name);
	

	}

}
