package com.sgtesting.StringBuffer;

public class VowelsStringDemo {

	public static void main(String[] args) {
		lowercase();
	}
	
		private static void lowercase()
		{
			String str=" Programming ";
			str=str.toLowerCase();
			int count=0;
			for(int i=0;i<str.length();i++)
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				count++;
			}
			System.out.println(" total number of given String is :"+count);
		}

	}
