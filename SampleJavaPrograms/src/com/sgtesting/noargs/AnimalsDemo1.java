package com.sgtesting.noargs;

class Animals1
{
	String animalsname;
	String color;
	Animals1()
	{
		animalsname="Tiger";
		color="golden color";
		System.out.println("animalsname:"+animalsname);
		System.out.println("color:"+color);
		System.out.println("+++++++++");
	}
}
class Birds1
{
	String birdsname;
	String type;
	Birds1()
	{
		birdsname="parrot";
		type="lower classification";
		System.out.println("birdsname:"+birdsname);
		System.out.println("type:"+type);
		System.out.println("++++++++++");
	}
}
class insects1
{
	String insectsname;
	String name;
	insects1()
	{
		insectsname="bees";
		name="mining bee";
		System.out.println("insectsname:"+insectsname);
		System.out.println("name:"+name);
	}
}
public class AnimalsDemo1 {

	public static void main(String[] args) {
		Animals1 obj1=new Animals1();
		
		Birds1 obj2=new Birds1();
		
		insects1 obj3=new insects1();

	}

}
