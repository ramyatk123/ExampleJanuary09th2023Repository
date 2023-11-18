package com.sgtesting.parametarized;
class student
{
	student(String firstname,String branchname)
	{
		System.out.println("firstname:"+firstname);
		System.out.println("branchname:"+branchname);
	}
}

public class MainDemoStudent {

	public static void main(String[] args) {
	   student a=new student("santosh","EEE");

	}

}
