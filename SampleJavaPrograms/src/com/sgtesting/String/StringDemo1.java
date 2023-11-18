package com.sgtesting.String;
class sample
{
	String firstname;
	int age;
	sample(String firstname,int age)
	{
		this.firstname=firstname;
		this.age=age;
	}
	public String toString()
	{
		return "Name of the student "+firstname+" and age "+age;
	}
}
public class StringDemo1 {

	public static void main(String[] args) {
		sample obj=new sample("Ramya",24);
		System.out.println(obj);

	}

}
