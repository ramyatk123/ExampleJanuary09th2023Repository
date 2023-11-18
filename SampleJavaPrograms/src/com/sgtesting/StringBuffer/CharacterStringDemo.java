package com.sgtesting.StringBuffer;

public class CharacterStringDemo {

	public static void main(String[] args) {
	//	getonecharacter();
		showcharacters();
	}
	
		private static void getonecharacter()
		{
		String s="Ramya";
		char ch1=s.charAt(0);
		System.out.println(ch1);
		char ch2=s.charAt(2);
		System.out.println(ch2);
		System.out.println(" +++++++++++ ");
		}
	private static void showcharacters()
	{
		String s="Sweety";
		char ch[]=s.toCharArray();

		for(int i=ch.length-1;i>=0;i--)
		{
		     System.out.print(ch[i]);
		}
	//	System.out.println(" ++++++++++ ");
	}
}
