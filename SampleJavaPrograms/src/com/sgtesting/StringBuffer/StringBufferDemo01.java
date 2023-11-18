package com.sgtesting.StringBuffer;

public class StringBufferDemo01 {

	public static void main(String[] args) {
		appendDemo();
		insertDemo();
		deleteDemo();
		reverseDemo();
	}
	private static void appendDemo()
	{
		StringBuffer s=new StringBuffer(" Java ");
		System.out.println(s);
		s.append(" Programming ");
		System.out.println(s);
		System.out.println(" +++++++++ ");
	}
	private static void insertDemo()
	{
		StringBuffer s=new StringBuffer(" Programming ");
		StringBuffer s1=s.insert(7,"new");
		System.out.println(s1);
		System.out.println(" +++++++++ ");
	}
	private static void deleteDemo()
	{
		StringBuffer s=new StringBuffer("It is a new book");
		StringBuffer s1=s.delete(8,12);
		System.out.println(s1);
		System.out.println(" +++++++++++ ");
	}
	private static void reverseDemo()
	{
		StringBuffer s=new StringBuffer("Bangalore");
		StringBuffer s1=s.reverse();
		System.out.println(s1);
		System.out.println(" +++++++++++ ");
	}

}
