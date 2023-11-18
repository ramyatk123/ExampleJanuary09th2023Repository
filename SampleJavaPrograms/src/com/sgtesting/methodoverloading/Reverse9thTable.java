package com.sgtesting.methodoverloading;
class Reverse
{
	String[] demo()
	{
		String s[]=new String[10];
		int k=0;
		for(int i=10;i>=1;i--)
		{
			int r=9*i;
			String res="9 * "+i+" = "+r;
			s[k]=res;
			k++;
		}
		return s;
	}
}
public class Reverse9thTable {

	public static void main(String[] args) {
		Reverse a=new Reverse();
		String s[]=a.demo();
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
