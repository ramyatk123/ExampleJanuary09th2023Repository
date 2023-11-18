package com.sgtesting.StringBuffer;

public class ReverseMethodToCharArray {

	public static void main(String[] args) {
		reverseDemo();
		getonecharacter();
		extraxtDemo();
	}
		private static void reverseDemo()
		{
			String s="Programming";
			char ch[]=s.toCharArray();
			for(char ch1:ch)
			{
				System.out.println(ch1);
			}
			System.out.println(" ++++++++++ ");
		}
		private static void getonecharacter()
		{
			String s="Programming";
			char ch1=s.charAt(0);
			System.out.println(ch1);
			char ch2=s.charAt(2);
			System.out.println(ch2);
			System.out.println(" ++++++++++ ");
		}
		private static void extraxtDemo()
		{
			String s="Programming";
			String s1=s.substring(3);
			System.out.println(s1);
			String s2=s.substring(3,7);
			System.out.println(s2);
			System.out.println(" ++++++++++ ");
		}

	}

