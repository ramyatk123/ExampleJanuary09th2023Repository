package com.sgtesting.Methods;
class ArrayDemo5
{
	char[] getonedimensionalarray()
	{
		char ch[]= {'q','w','e','r','t','y'};
		return ch;
	}
}
public class CharacterArrayDemo {

	public static void main(String[] args) {
		ArrayDemo5 a=new ArrayDemo5();
		char ch1[]=a.getonedimensionalarray();
		System.out.println("Ready half of the elements");
		for(int i=0;i<ch1.length/2;i++)
		{
			System.out.println(ch1[i]);
		}
		System.out.println("++++++++++");
		System.out.println("Second half of the elements");
        for(int i=ch1.length/2;i<ch1.length;i++)
        {
        	System.out.println(ch1[i]);
        }
        System.out.println("++++++++++");
        System.out.println("Read elements in reverse order");
        for(int i=ch1.length-1;i>=0;i--)
        {
        	System.out.println(ch1[i]);
        }
	}

}
