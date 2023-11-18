package com.sgtesting.methodoverloading;
class program
{
	void addition(int x,int y)
	{
		System.out.println("Additon Result:"+(x+y));
	}
	void addition(int x,int y,int z)
	{
		System.out.println("Addition Result:"+(x+y+z));
	}
	void addition(int arr[])
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res=res+arr[i];
		}
		System.out.println("Addition Result:"+res);
	}
}
public class OverLoadingDemo {

	public static void main(String[] args) {
		program obj1=new program();
		obj1.addition(10,20);
		obj1.addition(10,20,30);
		int a[]= {10,20,30,40,50};
		obj1.addition(a);

	}

}
