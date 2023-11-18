package com.sgtesting.noargs;
class fruits1
{
	String fruitsname1;
	int no;
	fruits1()
	{
		fruitsname1="Apple";
		no=2;
		System.out.println("fruitsname:"+fruitsname1);
		System.out.println("no:"+no);
		System.out.println("++++++++++");
	}
}
class flowers1
{
	String flowersname1;
	int no;
	flowers1()
	{
		flowersname1="jasmine";
		no=3;
		System.out.println("flowersname1:"+flowersname1);
		System.out.println("no:"+no);
		System.out.println("+++++++++++");
	}
}
class vegetables1
{
	String vegetablesname1;
	int no;
	vegetables1()
	{
		vegetablesname1="carrot";
		no=4;
		System.out.println("vegetablesname1:"+vegetablesname1);
		System.out.println("no:"+no);
	}
	
}
public class FruitsDemo1 {

	public static void main(String[] args) {
		fruits1 obj1=new fruits1();
		
		flowers1 obj2=new flowers1();
		
		vegetables1 obj3=new vegetables1();

	}

}
