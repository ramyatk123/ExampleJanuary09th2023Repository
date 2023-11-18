package com.sgtesting.Test;
class program2
{
	char[] getonedimenstionalarray()
	{
		char ch[]= {'W','E','L','C','O','M','E'};
		return ch;
	}
}
public class SecondHalfElements {

	public static void main(String[] args) {
		program2 a=new program2();
		char ch[]=a.getonedimenstionalarray();
		System.out.println("read first half of the elements");
		for(int i=0;i<ch.length/2;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("++++++");
		System.out.println("second half of the elements");
		for(int j=ch.length/2;j<ch.length;j++)
		{
			System.out.println(ch[j]);
		}
		System.out.println("+++++++");
		System.out.println("read the elements in reverse order");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}

	}

}
