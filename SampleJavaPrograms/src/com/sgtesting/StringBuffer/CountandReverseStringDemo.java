package com.sgtesting.StringBuffer;

public class CountandReverseStringDemo {

	public static void main(String[] args) {
		getlength();
		//reverseDemo();
	}
		private static void getlength()
		{
			String s=new String("The temple is at the top of the hill");
			int len=s.split(" ").length;
			System.out.println(" Number of words :"+len);
			System.out.println(" +++++++++ ");
		}
		private static void reverseDemo()
		{
			StringBuilder s=new StringBuilder(" The temple is at the top of the hill ");
			StringBuilder s1=s.reverse();
			System.out.println(s);
			System.out.println(" ++++++++ ");
		}
	}
