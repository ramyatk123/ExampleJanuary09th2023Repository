package com.sgtesting.noargs;



class customer1
{
	String customername;
	int id;
	customer1()
	{
		customername="Kiran";
		id=10;
		System.out.println("customername:"+customername);
		System.out.println("id:"+id);
		System.out.println("+++++++++++");
	}
}
class products1
{
	String brand;
	int no;
	products1()
	{
		brand="Amazon";
		no=1;
		System.out.println("brand:"+brand);
		System.out.println("no:"+no);
		System.out.println("++++++++++");
	}
}
class orders1
{
	String kurtis;
	int no;
	orders1()
	{
		kurtis="Anarkali";
		no=4;
		System.out.println("kurtis:"+kurtis);
		System.out.println("no:"+no);
	}
}
public class CustomerDemo1 {

	public static void main(String[] args) {
		customer1 obj1=new customer1();
		
		products1 obj2=new products1();
		
		orders1 obj3=new orders1();

	}

}
