package com.sgtesting.Test;
class Demo
{
	void elements(int a[][])
	{
		for(int i=a.length-1;i>=0;i++)
		{
			for(int j=a[i].length-1;j>=0;j++)
			{
				System.out.println(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
public class programTest11 {

	public static void main(String[] args) {
		Demo x=new Demo();
		int p[][]= {{10,20,30},{40,50,60},{70,80,90}};
		x.elements(p);

	}

}
