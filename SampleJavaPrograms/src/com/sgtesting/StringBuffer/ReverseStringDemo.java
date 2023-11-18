package com.sgtesting.StringBuffer;

public class ReverseStringDemo {

	public static void main(String[] args) {
		reverseDemo();
	}
	private static void reverseDemo()
	{
		StringBuilder s=new StringBuilder("Bangalore");
		System.out.println(s);
		
		s.append(" Mysore ");
		StringBuilder s2=s.reverse();
		System.out.println(s);
	

	}

}
