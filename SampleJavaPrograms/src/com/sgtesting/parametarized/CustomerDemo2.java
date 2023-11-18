package com.sgtesting.parametarized;
class customer2
{
	String customername;
	String location;
	customer2(String cn,String loc)
	{
		System.out.println(cn);
		System.out.println(loc);
		System.out.println("+++++++");
	}
}
class products2
{
	String brand;
	int noofbrand;
	products2(String bd,int nob)
	{
		System.out.println(bd);
		System.out.println(nob);
		System.out.println("+++++++");
	}
}
class orders2
{
	String kurtis;
	int noofpattern;
	orders2(String ks,int nop)
	{
		System.out.println(ks);
		System.out.println(nop);
	}
}
public class CustomerDemo2 {

	public static void main(String[] args) {
		customer2 a=new customer2("Bhavya","Banglore");
		products2 b=new products2("Amazon",4);
		orders2 c=new orders2("Anarkali",10);

	}

}
