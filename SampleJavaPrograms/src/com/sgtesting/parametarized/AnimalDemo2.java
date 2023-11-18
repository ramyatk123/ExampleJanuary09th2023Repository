package com.sgtesting.parametarized;
class Animals2
{
	String animalsname;
	String color;
	Animals2(String as,String cl)
	{
		System.out.println(as);
		System.out.println(cl);
		System.out.println("++++++++");
	}
}
class Birds2
{
	String birdsname;
	String type;
	Birds2(String bd,String tp)
	{
		System.out.println(bd);
		System.out.println(tp);
		System.out.println("++++++++");
	}
}
class insects2
{
	String insectsname;
	String name;
	insects2(String in,String nm)
	{
		System.out.println(in);
		System.out.println(nm);
	}
}
public class AnimalDemo2 {

	public static void main(String[] args) {
		Animals2 a=new Animals2("Tiger","Golden color");
		Birds2 b=new Birds2("parrot","lower classification");
		insects2 c=new insects2("bees","mining bee");

	}

}
