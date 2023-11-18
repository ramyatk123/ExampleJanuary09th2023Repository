package com.sgtesting.GenericClass;
class MyGeneric2
{
	public static <E> void displayElements(E[] elements)
	{
		for(E element :elements)
		{
			System.out.println(element);
		}
	}
}
public class GenericMethodDemo {

	public static void main(String[] args) {
	    Integer a[]= {10,20,30};
	    MyGeneric2.displayElements(a);
	    
	    Double d[]= {2.24,4.10,3.55};
	    MyGeneric2.displayElements(d);
	    
	    String s[]= {"Apple","Mango","Orange"};
	    MyGeneric2.displayElements(s);

	}

}
