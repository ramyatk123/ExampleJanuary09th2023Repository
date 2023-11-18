package com.sgtesting.methodoverloading;
class string
{
	String [] demo (String a[])
	{
		String a1[]=new String[a.length];
		int k=0;
		for(int i=a.length/2;i<a.length;i++)
		{
			a1[k]=a[i];
			k++;
		} 
		return a1;
		
		
	}
}
public class StringSecondHalfofElements {

	public static void main(String[] args) {
		string x=new string();
		String z[]= {"Ramya","Kiran","Bhavya","Divya","Vinay","Lakshmi"};
		String a2[]=x.demo(z);
		for(int j=0;j<z.length/2;j++)
		{
			System.out.println(a2[j]);
		}

	}

}
