package com.sgtesting.GenericClass;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		   addElements();
		// removeElements();
		// readElements1();
		// readElements2();
		// readElementsByEnumeration();
        // withoutGenerics();
	}
	private static void addElements()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(500);
		obj.add(2,400);
		System.out.println("Elements :"+obj);
		Vector<Integer> obj1=new Vector<Integer>();
		obj1.add(55);
		obj1.add(75);
		obj1.add(65);
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	private static void removeElements()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(500);
		obj.add(400);
		System.out.println("Elements :"+obj);
		obj.remove(2);
		System.out.println("Elements :"+obj);
		obj.remove(Integer.valueOf(700));
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	private static void readElements1()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(500);
		obj.add(400);
		System.out.println("Elements :"+obj);
		for(int a:obj)
		{
			System.out.println(a);
		}
	}
	private static void readElements2()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(500);
		obj.add(400);
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	private static void readElementsByEnumeration()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(500);
		obj.add(400);
		System.out.println("Elements :"+obj);
		Enumeration<Integer> eles=obj.elements();
		while(eles.hasMoreElements())
		{
			System.out.println(eles.nextElement());
		}
	}
    private static void withoutGenerics()
    {
    	Vector obj=new Vector();
    	System.out.println("Elements :"+obj);
    	obj.add(135);
    	obj.add("Mango");
    	obj.add(true);
    	obj.add('Y');
    	System.out.println("Elements :"+obj);
    }
}
