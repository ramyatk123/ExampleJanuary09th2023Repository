package com.sgtesting.methodoverloading;
class chararray
{
	char[]Demo(char ch[])
	{
		int k=0;
		char a[]=new char[ch.length];
		for(int i=ch.length-1;i>=0;i--)
	    {
			a[k]=ch[i];
			k++;
		}
		return a;
	}
}
public class CharacterArrayReverse {

	public static void main(String[] args) {
		chararray obj1=new chararray();
		char c[]= {'R','A','M','Y','A'};
		char b[]=obj1.Demo(c);
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}

	}

}
