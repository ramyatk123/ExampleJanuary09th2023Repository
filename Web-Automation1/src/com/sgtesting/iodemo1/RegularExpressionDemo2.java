package com.sgtesting.iodemo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {

	public static void main(String[] args) {
	//	 regExpTesting1();
	//   regExpTesting2();
	  regExpTesting3();	 

	}
	private static void regExpTesting1()
	{
		String str=("Bangalore received 125 centimeters of rain yesterday");
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
    	Matcher match=pattern.matcher(str);
		boolean v1=match.find();
		System.out.println(v1);
		
	}
	private static void regExpTesting2()
	{
		String str=("Bangalore received 125 centimeters of rain yesterday");
		Pattern pattern=Pattern.compile("[0-9][0-9]{3}");
    	Matcher match=pattern.matcher(str);
    	String v1=match.replaceAll("many");
    	System.out.println(v1);
	}
	private static void regExpTesting3()
	{
		String str=("Bangalore received 125 centimeters of rain yesterday");
		Pattern pattern=Pattern.compile("[a-zA-Z]+");
    	Matcher match=pattern.matcher(str);
    	while(match.find())
    	{
    		System.out.println(match.group());
    	}
	}

}
