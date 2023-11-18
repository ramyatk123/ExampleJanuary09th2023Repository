package com.sgtesting.Test;
class customerDemo
{
	customerDemo (String customername)
	{
		System.out.println("customername:"+customername);
	}
	customerDemo(int customerid)
	{
		this("Ramya");
		System.out.println("customerid:"+customerid);
	}
}
public class customer {

	public static void main(String[] args) {
		customerDemo a=new customerDemo(10);

	}

}
