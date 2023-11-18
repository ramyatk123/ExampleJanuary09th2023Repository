package com.sgtesting.constructorchaining;
class customer
{
	customer (String customername)
	{
		System.out.println("customername:"+customername);
	}
	customer (int customerID)
	{
		this("Jones");
		System.out.println("customerid:"+customerID);
	}
}
public class constructorchainingdemo {

	public static void main(String[] args) {
		customer a=new customer(10);
	}

}
