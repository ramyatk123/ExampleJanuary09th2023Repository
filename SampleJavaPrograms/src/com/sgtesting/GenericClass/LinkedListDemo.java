package com.sgtesting.GenericClass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		// addElements();
		//  removeElements();
		//  readElements1();
		//  readElements2();
		//  readElementsByIterator();
		//  readElementsByListIterator();
		//  withoutGenerics();
		  queueDemo();

	}
	private static void addElements()
	{
		LinkedList<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(500);
		obj.add(2,400);
		System.out.println("Elements :"+obj);
		LinkedList<Integer> obj1=new LinkedList<Integer>();
		obj1.add(55);
		obj1.add(75);
		obj1.add(65);
		obj1.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	private static void removeElements()
	{
		LinkedList<Integer> obj=new LinkedList<Integer>();
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
	private static void readElements1()
	{
		LinkedList<Integer> obj=new LinkedList<Integer>();
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
		LinkedList<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(700);
		obj.add(400);
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	private static void readElementsByIterator()
	{
		LinkedList<Integer> obj=new LinkedList<Integer>();
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
	private static void readElementsByListIterator()
	{
		LinkedList<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(500);
		obj.add(300);
		obj.add(700);
		obj.add(400);
		System.out.println("Elements :"+obj);
		ListIterator<Integer> ite=obj.listIterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	private static void withoutGenerics()
	{
		LinkedList obj=new LinkedList();
		System.out.println("Elements :"+obj);
		obj.add(135);
		obj.add("Mango");
		obj.add(true);
		obj.add('Y');
		System.out.println("Elements :"+obj);
	}
	private static void queueDemo()
	{
		Queue<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		System.out.println("Elements :"+obj);
		obj.remove();
		System.out.println("Elements :"+obj);
		obj.remove();
		System.out.println("Elements :"+obj);
	}

}
