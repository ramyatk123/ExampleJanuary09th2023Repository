package com.sgtesting.parametarized;
class fruits2
{
	String fruitsname;
	String nooffruits;
	fruits2(String fn,String no)
	{
		System.out.println(fn);
		System.out.println(no);
		System.out.println("++++++++");
	}
}
class flowers2
{
	String flowersname;
	String noofflowers;
	flowers2(String fln,String nof)
	{
		System.out.println(fln);
		System.out.println(nof);
		System.out.println("+++++++");
	}
}
class vegetables2
{
	String vegetablesname;
	String noofvegetables;
	vegetables2(String veg,String nov)
	{
		System.out.println(veg);
		System.out.println(nov);
	}
}
public class FruitsDemo2 {

	public static void main(String[] args) {
		fruits2 obj1=new fruits2("Apple","4");
		flowers2 obj2=new flowers2("Jasmine","10");
		vegetables2 obj3=new vegetables2("Carrot","10");

	}

}
