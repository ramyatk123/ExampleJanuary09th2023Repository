package com.sgtesting.GenericClass;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		// addElements();
		 // removeElements();
	  // readElements();
		// readElements2();
		// readElementsByIterator();
		 withoutGenerics();
	}
	private static void addElements()
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(500);
		obj.add(2,400);
		System.out.println("Elements :"+obj);
		ArrayList<Integer> obj1=new ArrayList<Integer>();
		obj1.add(55);
		obj1.add(75);
		obj1.add(65);
		obj1.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	private static void removeElements()
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(700);
		obj.add(400);
		System.out.println("Elements :"+obj);
		obj.remove(2);
		System.out.println("Elements :"+obj);
		obj.remove(Integer.valueOf(700));
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
		
	}
	private static void readElements()
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(700);
		obj.add(400);
		System.out.println("Elements :"+obj);
		for(int a:obj)
		{
			System.out.println(a);
		}
	}
	private static void readElements2()
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(700);
		obj.add(400);
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++) 
		{
			System.out.println("Elements :"+obj);
		}
		
		
	}
	private static void readElementsByIterator()
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(700);
		obj.add(400);
		System.out.println("Elements :"+obj);
		Iterator<Integer> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	private static void withoutGenerics()
	{
		ArrayList obj=new ArrayList();
		System.out.println("Elements :"+obj);
		obj.add(135);
		obj.add("Mango");
		obj.add(true);
		obj.add('Y');
		System.out.println("Elements :"+obj);
	}

}
