package com.sgtesting.Methods;
class  ArrayDemo
{
	void ReadElements(String str[][])
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
				System.out.println(str[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
public class ReadElememts2DArray {

	public static void main(String[] args) {
		ArrayDemo a=new ArrayDemo();
		String s[][]= {{"sunday","Monday","Tuesday"},{"Thurday","Friday","Saturday"}};
        a.ReadElements(s);
	}

}
