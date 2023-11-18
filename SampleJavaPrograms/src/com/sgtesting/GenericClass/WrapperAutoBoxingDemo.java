package com.sgtesting.GenericClass;

public class WrapperAutoBoxingDemo {

	public static void main(String[] args) {
	     int a=25; //primitive data
	     System.out.println("int a  "+a);
	     Integer b=Integer.valueOf(a); //Converting into wrapper class
	     System.out.println("Integer b  "+b);
	     
	     //Autoboxing
	     Integer c=a;
	     System.out.println("Integer c  "+c);

	}

}
