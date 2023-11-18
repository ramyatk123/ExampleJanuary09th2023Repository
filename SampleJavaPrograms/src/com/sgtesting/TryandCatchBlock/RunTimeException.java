package com.sgtesting.TryandCatchBlock;

abstract class Maths06
{
    abstract void show();
}
class Addition01 extends Maths06
{
	 void show()
	 {
		 int a=5;
		 int b=15;
		 System.out.println("Addtion Result :"+(a+b));
	 }
}
class Substraction02 extends Addition01
{
	 void show()
	 {
		
		 int a=185;
		 int b=15;
		 System.out.println("Substraction Result :"+(a-b));
		 
	 }
}
class Division03 extends Substraction02
{
	 void show()
	 {
		 try
		 {
		 int a=125;
		 int b=15;
		 System.out.println("Division Result :"+(a/b));
		 }
		 catch(RuntimeException e)
		 {
			 e.printStackTrace();
		 }
	 }
}
public class RunTimeException {

	public static void main(String[] args) {
		Maths06 maths=null;
		Addition01 addition=new Addition01();
		Substraction02 substraction=new Substraction02();
		Division03 division=new Division03();
		
		maths=addition;
		maths.show();
		
		maths=substraction;
		maths.show();
		
		maths=division;
		maths.show();

	}

}
