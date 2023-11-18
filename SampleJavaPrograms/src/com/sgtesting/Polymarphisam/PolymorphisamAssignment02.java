package com.sgtesting.Polymarphisam;
abstract class StudentDetails
{
	abstract void Sdetails ();
}
class Studentname extends StudentDetails
{

	void Sdetails()
	{
		String s;
		s="Ramya";

		System.out.println("student name:"+s);
	}

}

class StudentSchool extends StudentDetails
{
	void Sdetails()
	{
		String s;
		s="SSVP";

		System.out.println("student school name:"+s);
	}
}

class StudentAddress extends StudentDetails
{
	void Sdetails()
	{
		String s;
		s="Tumkur";
		System.out.println("student Address:"+s);
	}
}

class StudentNumber extends StudentDetails
{
	void Sdetails()
	{
		int n;
		n=21;
		System.out.println("Stdent Number:"+n);
	}
}
public class PolymorphisamAssignment02 {

	public static void main(String[] args) {
		StudentDetails details=null;
		Studentname sn =new Studentname();
		StudentSchool ss=new StudentSchool();	 
		StudentAddress sa=new StudentAddress();	 
		StudentNumber snum=new StudentNumber();

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
