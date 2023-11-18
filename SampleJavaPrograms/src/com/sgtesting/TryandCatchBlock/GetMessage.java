package com.sgtesting.TryandCatchBlock;

abstract class Maths005
{
    abstract void show();
}
class Addition07 extends Maths005
{
	 void show()
	 {
		 int a=5;
		 int b=15;
		 System.out.println("Addtion Result :"+(a+b));
	 }
}
class Substraction08 extends Addition07
{
	 void show()
	 {
		 int a=185;
		 int b=15;
		 System.out.println("Substraction Result :"+(a-b));
	 }
}
class Division09 extends Substraction08
{
	 void show()
	 {
		 try
		 {
		 int a=125;
		 int b=15;
		 System.out.println("Division Result :"+(a/b));
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println(e.getMessage());
		 }
	 }
}

public class GetMessage {

	public static void main(String[] args) {
		Maths005 maths=null;
		Addition07 addition=new Addition07();
		Substraction08 substraction=new Substraction08();
		Division09 division=new Division09();
		
		maths=addition;
		maths.show();
		
		maths=substraction;
		maths.show();
		
		maths=division;
		maths.show();

	}

}
