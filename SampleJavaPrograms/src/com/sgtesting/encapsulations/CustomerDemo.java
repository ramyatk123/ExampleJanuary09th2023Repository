package com.sgtesting.encapsulations;
class customer
{
	String customername;
	int id;
}
class products
{
	String brand;
	int no;
}
class orders
{
	String kurtis;
	int no;
}
public class CustomerDemo {

	public static void main(String[] args) {
	customer obj1=new customer();
	obj1.customername="Kiran";
	obj1.id=10;
	System.out.println("customername:"+obj1.customername);
	System.out.println("id:"+obj1.id);
	System.out.println("+++++++++++");
	products obj2=new products();
	obj2.brand="Amazon";
	obj2.no=1;
	System.out.println("brand:"+obj2.brand);
	System.out.println("no:"+obj2.no);
	System.out.println("++++++++++");
	orders obj3=new orders();
	obj3.kurtis="Anarkali";
	obj3.no=4;
	System.out.println("kurtis:"+obj3.kurtis);
	System.out.println("no:"+obj3.no);
	

	}

}
