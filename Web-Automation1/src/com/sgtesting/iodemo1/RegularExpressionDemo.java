package com.sgtesting.iodemo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
	//	matchesDemo();
	//  findDemo();
	//	countofMatching();
	//	patternMatching();
	//  positionofpatternMatching();
	//  replaceDemo();
	  splitDemo();	

	}
    private static void matchesDemo()
    {
    	Pattern pattern=Pattern.compile("Java");
    	Matcher match=pattern.matcher("Java");
    	boolean v1=match.matches();
    	System.out.println(v1);
    	System.out.println("+++++++");
    }
    private static void findDemo()
    {
    	Pattern pattern=Pattern.compile("Java");
    	Matcher match=pattern.matcher("Java JDK Java JRE JVM Java");
    	boolean v1=match.find();
    	System.out.println(v1);
    	System.out.println("++++++++");
    }
    private static void countofMatching()
    {
    	Pattern pattern=Pattern.compile("Java");
    	Matcher match=pattern.matcher("Java JDK Java JRE JVM Java");
    	int count=0;
    	while(match.find())
    	{
    		count=count+1;
    	}
    	System.out.println("# of count :"+count);
    	System.out.println("++++++++++");
    }
    private static void patternMatching()
    {
    	Pattern pattern=Pattern.compile("Java");
    	Matcher match=pattern.matcher("Java JDK Java JRE JVM Java");
    	while(match.find())
    	{
    		System.out.println(match.group());
    	}
    	System.out.println("+++++++++");
    }
    private static void positionofpatternMatching()
    {
    	Pattern pattern=Pattern.compile("Java");
    	Matcher match=pattern.matcher("Java JDK Java JRE JVM Java");
    	while(match.find())
    	{
    		System.out.println(match.group()+" its start position :"+match.start()+" End position :"+match.end());
    	}
    	System.out.println("+++++++++");
    }
    private static void replaceDemo()
    {
    	Pattern pattern=Pattern.compile("Java");
    	Matcher match=pattern.matcher("Java JDK Java JRE JVM Java");
    	String result=match.replaceAll("Python");
    	System.out.println(result);
    	System.out.println("+++++++++");
    }
    private static void splitDemo()
    {
    	Pattern pattern=Pattern.compile("[,]");
    	String s[]=pattern.split("Mango,Apple,Orange,Banana");
    	for(String kk:s)
    	{
    		System.out.println(kk);
    	}
    }
}
