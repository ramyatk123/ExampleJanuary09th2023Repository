package com.sgtesting.GenericClass;

public class WrapperUnBoxingDemo {

	public static void main(String[] args) {
		Integer a=Integer.valueOf(25); //wrapper object
		System.out.println("Integer a "+a);
		int b=a.intValue(); //converts to primitive
		System.out.println("int b "+b);
		
		//unboxing
		int c=a;
		System.out.println("int c "+c);

	}

}
