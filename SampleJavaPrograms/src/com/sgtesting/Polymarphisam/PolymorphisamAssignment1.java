package com.sgtesting.Polymarphisam;

 abstract class Maths10
{
     abstract void show();
}
 class Addition extends Maths10
 {
	 void show()
	 {
		 int a=5;
		 int b=15;
		 System.out.println("Addtion Result :"+(a+b));
	 }
 }
 class Substraction extends Addition
 {
	 void show()
	 {
		 int a=185;
		 int b=15;
		 System.out.println("Substraction Result :"+(a-b));
	 }
 }
 class Division extends Substraction
 {
	 void show()
	 {
		 int a=125;
		 int b=15;
		 System.out.println("Division Result :"+(a/b));
	 }
 }
public class PolymorphisamAssignment1 {

	public static void main(String[] args) {
		Maths10 maths=null;
		Addition addition=new Addition();
		Substraction substraction=new Substraction();
		Division division=new Division();
		
		maths=addition;
		maths.show();
		
		maths=substraction;
		maths.show();
		
		maths=division;
		maths.show();
		

	}

}
