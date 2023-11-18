package com.sgtesting.iodemo1;

import java.io.Serializable;

public class Employee implements Serializable{

   	/**
	 * 
	 */
	private static final long serializationID=1l;
	int empNo;
	String empName;
	String jobName;
	double salary;
	Employee(int empNo,String empName,String jobName,double salary)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.jobName=jobName;
		this.salary=salary;
	}
	public void showEmpNo()
	{
		System.out.println("Employee Number :"+empNo);
	}
	public void showEmpName()
	{
		System.out.println("Employee Name :"+empName);
	}
	public void showJobName()
	{
		System.out.println("Employee Job Name :"+jobName);
	}
	public void showSalary()
	{
		System.out.println("Employee salary :"+salary);
	}
}
