package com.sgtesting.String;

public class StringMethods {

	public static void main(String[] args) {
		lowercase();
		uppercase();
		getlength();
		replaceDemo();
		compareStrings1();
		compareStrings2();
		existanceofString();
		showcharacters();
		splitString();
		valueofDemo();
		getonecharacter();
		extractDemo();
		findposition();
	}
	private static void lowercase()
	{
		String s=new String("PROGRAM");
		String s1=s.toLowerCase();
		System.out.println("Lower Case :"+s1);
		System.out.println("+++++++++");
	}
	private static void uppercase()
	{
		String s=new String("Programming");
		System.out.println("Upper Case :"+s.toUpperCase());
		System.out.println("+++++++++");
	} 
	private static void getlength()
	{
		String s=new String("Programmimg");
		System.out.println("Number of chars :"+s.length());
		System.out.println("++++++++++");
	}
	private static void replaceDemo()
	{
		String s="It is a new palace";
		String s1=s.replace("is","was");
		System.out.println("Replace Result :"+s1);
		System.out.println("+++++++++");
	}
	private static void compareStrings1()
	{
		String s1="JavaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are equal with case sensitive :"+s1.equals(s2));
		System.out.println("s1 and s2 are equal without case sensitive :"+s1.equalsIgnoreCase(s2));
	}
	private static void compareStrings2()
	{
		String s1="JAvaScript";
		String s2="JAVASCRIPT";
		System.out.println("s1 and s2 are equal with case sensitive :"+s1.equals(s2));
		System.out.println("s1 and s2 are equal without case sensitive :"+s1.compareToIgnoreCase(s2));
		System.out.println("++++++++++");
	}
	private static void existanceofString()
	{
		String s="Kayi Thimmanahalli is a very remote city";
		System.out.println("starts with :"+s.startsWith("Kayi"));
		System.out.println("contains :"+s.contains("very"));
		System.out.println("Ends with :"+s.endsWith("city"));
		System.out.println("++++++++");
	}
	private static void showcharacters()
	{
		String s="Welcome";
		char ch[]=s.toCharArray();
		for (char ch1:ch)
		{
			System.out.println(ch1);
		}
		System.out.println("++++++++");
	}
	private static void splitString()
	{
		String s="Apple,Mango,Banana,Orange";
		String str[]=s.split(",");
		for(String kk:str)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++");
	}
	private static void valueofDemo()
	{
		int a=125;
		String s1=String.valueOf(a);
		System.out.println(s1);
		double d=12.75;
		String s2=String.valueOf(d);
		System.out.println(s2);
		System.out.println("+++++++++");
	}
	private static void getonecharacter()
	{
		String s="Ramya";
		char ch1=s.charAt(0);
		System.out.println(ch1);
		char ch2=s.charAt(2);
		System.out.println(ch2);
		System.out.println("++++++++++");
	}
	private static void extractDemo()
	{
		String s="Programming";
		String s1=s.substring(3);
		System.out.println(s1);
		String s2=s.substring(3,7);
		System.out.println(s2);
		System.out.println("++++++++++");
	}
	private static void findposition()
	{
		String s="It is It was It is was";
		int pos1=s.indexOf("is",5);
		System.out.println(pos1);
		int pos2=s.lastIndexOf("was");
		System.out.println(pos2);
		System.out.println("++++++++++");
	}
	

}
