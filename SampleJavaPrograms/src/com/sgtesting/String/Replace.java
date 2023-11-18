package com.sgtesting.String;

public class Replace {

	public static void main(String[] args) {
		
		replaceDemo();
	}
	private static void replaceDemo()
	{
		String s="India is where i live";
		String s1=s.replace("India","Bangalore");
		System.out.println("Replace Result :"+s1);
		System.out.println("+++++++++");
	}
}
