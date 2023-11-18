package com.sgtesting.InstanceBlock;
class Demo7
{
	
   {
       System.out.println("It is a first instance block");
   }
   {
	   System.out.println("It is a second instance block");
   }
}
public class Instanceblock {

	public static void main(String[] args) {
		Demo7 obj1=new Demo7();
	}

}
