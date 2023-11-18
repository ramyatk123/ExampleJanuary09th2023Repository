package com.sgtesting.MethodReturnValue;
class Char2DArray
{
	void Char2DArray(char a[][])
	{
		
		for(int i=2;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
public class Character2dArray {

	public static void main(String[] args) {
		Char2DArray a=new Char2DArray();
		char ch[][]= {{'R','A','M','Y','A'},{'T','H','A','N','U'},{'K','I','R','A','N'}};
		a.Char2DArray(ch);

	}

}
