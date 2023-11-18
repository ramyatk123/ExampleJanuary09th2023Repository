package com.sgtesting.SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		 // addElements();
		 // removeElements();
		// readElements();
		 // readElementsByIterator();
		// convertToArray();
		   withoutGenerics();

	}
	private static void addElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("Orange");
		System.out.println("Elements :"+obj);
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("Blue");
		obj1.add("White");
		obj1.add("Red");
		obj.add("obj1");
		System.out.println("Elements :"+obj);
	}
	private static void removeElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("Fig");
		System.out.println("Elements :"+obj);
		obj.remove("Mango");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
    private static void readElements()
    {
    	HashSet<String> obj=new HashSet<String>();
    	System.out.println("Elements :"+obj);
    	obj.add("Orange");
    	obj.add("Grapes");
    	obj.add("Mango");
    	obj.add("Apple");
    	obj.add("Banana");
    	obj.add("Fig");
    	System.out.println("Elements :"+obj);
    	for(String kk:obj)
    	{
    		System.out.println("Elements :"+obj);
    	}
    }
    private static void readElementsByIterator()
    {
    	HashSet<String> obj=new HashSet<String>();
    	System.out.println("Elements :"+obj);
    	obj.add("Orange");
    	obj.add("Grapes");
    	obj.add("Mango");
    	obj.add("Apple");
    	obj.add("Banana");
    	obj.add("Fig");
    	System.out.println("Elements :"+obj);
    	Iterator<String> ite=obj.iterator();
    	while(ite.hasNext())
    	{
    		System.out.println("Elements :"+obj);
    	}
    }
    private static void convertToArray()
    {
    	HashSet<String> obj=new HashSet<String>();
    	System.out.println("Elements :"+obj);
    	obj.add("Orange");
    	obj.add("Grapes");
    	obj.add("Mango");
    	obj.add("Apple");
    	obj.add("Banana");
    	obj.add("Fig");
    	System.out.println("Elements :"+obj);
    	Object arr[]=obj.toArray();
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println(arr[i].toString());
    	}
    }
    private static void withoutGenerics()
    {
    	HashSet obj=new HashSet();
    	System.out.println("Elements :"+obj);
    	obj.add(125);
    	obj.add(10.75);
    	obj.add("Mango");
    	obj.add('Y');
    	obj.add(true);
    	System.out.println("Elements :"+obj);
    	
    }
}
