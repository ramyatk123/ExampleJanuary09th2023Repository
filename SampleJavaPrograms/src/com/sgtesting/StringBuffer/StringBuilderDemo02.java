package com.sgtesting.StringBuffer;

public class StringBuilderDemo02 {

	public static void main(String[] args) {
		appendDemo();
		insertDemo();
		deleteDemo();
		reverseDemo();
	}
	private static void appendDemo()
	{
		StringBuilder s=new StringBuilder(" Java ");
		System.out.println(s);
		s.append(" Programming ");
		System.out.println(s);
		s.append(" Language ");
		System.out.println(s);
	}
	private static void insertDemo()
	{
		StringBuilder s=new StringBuilder(" It is a book ");
		StringBuilder s1=s.insert(7,"new");
		System.out.println(s);
		System.out.println(" ++++++++++ ");
	}
	private static void deleteDemo()
	{
		StringBuilder s=new StringBuilder("It is a new book");
		StringBuilder s1=s.delete(8,12);
		System.out.println(s);
		System.out.println(" ++++++++++ ");
	}
	private static void reverseDemo()
	{
		StringBuilder s=new StringBuilder("Bangalore");
		StringBuilder s1=s.reverse();
		System.out.println(s);
		System.out.println(" +++++++++++ ");
	}
	

}
