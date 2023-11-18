package com.sgtesting.GenericClass;
class MyGeneric<T>
{
	T obj;
	public void add(T obj)
	{
		this.obj=obj;
	}
	public T get()
	{
		return obj;
	}
}
public class GenericClassDemo {

	public static void main(String[] args) {
	    // with Generics
		MyGeneric<String> o=new MyGeneric<String>();
		o.add("Apple");
		String v1=o.get();
		System.out.println(v1);
		o.add("Mango");
		String v2=o.get();
		System.out.println(v2);
		
		// without generics
		MyGeneric o1=new MyGeneric();
		o1.add(125);
		int v3=(int) o1.get();
		System.out.println(v3);
		o1.add('Y');
		char v4=(char) o1.get();
		System.out.println(v4);

	}

}
