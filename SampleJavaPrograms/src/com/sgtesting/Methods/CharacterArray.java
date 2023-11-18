package com.sgtesting.Methods;
class ArrayDemo4
{
	char[] getonedimensionalarray()
	{
		char ch[]= {'q','w','e','r','t','y'};
		return ch;
	}
	
}
public class CharacterArray {

	public static void main(String[] args) {
		ArrayDemo4 a=new ArrayDemo4();
		char ch1[]=a.getonedimensionalarray();
		for(int i=0;i<ch1.length;i++)
		{
			System.out.println(ch1[i]);
		}
	}

}
