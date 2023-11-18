package com.sgtesting.StringBuffer;

public class PolindromeStringDemo 
{

	public static void main(String[] args) {
		reverseDemo();
	}
		private static void reverseDemo()
		{
			StringBuffer s=new StringBuffer("XYZ");
			System.out.println(s);
			StringBuffer s1=s.reverse();
			System.out.println(s1);
			
			String ss1=new String(s);
			String ss2=new String(s1);
			
			if(ss1.equals(ss2))
			{
				System.out.println("Palindrome!!!...");
			}
			else
			{
				System.out.println("Not a Palindrome");
			}
		}

	}

