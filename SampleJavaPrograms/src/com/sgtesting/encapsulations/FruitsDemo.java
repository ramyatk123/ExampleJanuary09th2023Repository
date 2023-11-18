package com.sgtesting.encapsulations;
class fruits
{
	String fruitsname;
	int no;
}
class flowers
{
	String flowersname;
	int no;
}
class vegetables
{
	String vegetablesname;
	int no;
}
public class FruitsDemo {

	public static void main(String[] args) {
		fruits obj1=new fruits();
		obj1.fruitsname="Apple";
		obj1.no=2;
		System.out.println("fruitsname:"+obj1.fruitsname);
		System.out.println("no:"+obj1.no);
		System.out.println("++++++++++");
		flowers obj2=new flowers();
		obj2.flowersname="jasmine";
		obj2.no=3;
		System.out.println("flowersname:"+obj2.flowersname);
		System.out.println("no:"+obj2.no);
		System.out.println("+++++++++++");
		vegetables obj3=new vegetables();
		obj3.vegetablesname="carrot";
		obj3.no=4;
		System.out.println("vegetablesname:"+obj3.vegetablesname);
		System.out.println("no:"+obj3.no);
		

	}

}
