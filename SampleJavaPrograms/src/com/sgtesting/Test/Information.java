package com.sgtesting.Test;
class Demo2
{
	char[] getonedimensionalarray()
	{
		char ch[]= {'R','A','M','Y','A'};
		return ch;
	}
}
public class Information {

	public static void main(String[] args) {
		Demo2 a=new Demo2();
		char ch[]=a.getonedimensionalarray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}

	}

}
