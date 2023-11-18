package com.sgtesting.methodoverloading;
class DoubleArray
{
	 double [] demo (double d[])
	 {
		double z[]=new double[d.length];
		int k=0;
	 for(int i=0;i<=d.length-3;i++)
	 {
		 z[k]=d[i];
		 k++;
	 }
	 return z;
	 }
}
public class DoubleArrayFirstHalfofElements {

	public static void main(String[] args)
	{
		DoubleArray obj1=new DoubleArray();
		double d[]={10.5,20.4,30.45,40.09,12.33,15.75};
		double z[]=obj1.demo(d);
		for(int j=0;j<=z.length-3;j++)
		{
			System.out.println(z[j]);
		}
	
	}

}
