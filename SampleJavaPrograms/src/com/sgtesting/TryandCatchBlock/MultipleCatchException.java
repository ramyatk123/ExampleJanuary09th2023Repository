package com.sgtesting.TryandCatchBlock;

abstract class StudentDetails01
{
	abstract void Sdetails ();
}
class Studentname02 extends StudentDetails01
{

	void Sdetails()
	{
		String s;
		s="Ramya";

		System.out.println("student name:"+s);
	}

}

class StudentSchool03 extends StudentDetails01
{
	void Sdetails()
	{
		String s;
		s="SSVP";
		System.out.println("student school name:"+s);
	}
}

class StudentAddress04 extends StudentDetails01
{
	void Sdetails()
	{
		try
		{
		String s;
		s="Tumkur";
		System.out.println("student Address:"+s);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
	}
}

class StudentNumber05 extends StudentDetails01
{
	void Sdetails()
	{
		int n;
		n=21;
		System.out.println("Stdent Number:"+n);
	}
}
public class MultipleCatchException {

	public static void main(String[] args) {
		StudentDetails01 details=null;
		Studentname02 sn =new Studentname02();
		StudentSchool03 ss=new StudentSchool03();	 
		StudentAddress04 sa=new StudentAddress04();	 
		StudentNumber05 snum=new StudentNumber05();

		details=sn;
		details.Sdetails();

		details=ss;
		details.Sdetails();

		details=sa;
		details.Sdetails();

		details=snum;
		details.Sdetails();
	}

}
