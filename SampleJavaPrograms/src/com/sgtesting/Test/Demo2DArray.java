package com.sgtesting.Test;
class program
{
	void Array(String str[][])
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				System.out.print(str[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
public class Demo2DArray {

	public static void main(String[] args) {
		program x=new program();
		String str[][]= {{"sunday","monday","tuesday","wednesday"},{"thursday","friday","saturday"}};
        x.Array(str);
	}

}
