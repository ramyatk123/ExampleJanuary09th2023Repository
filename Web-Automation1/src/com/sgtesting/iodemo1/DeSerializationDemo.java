package com.sgtesting.iodemo1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;



public class DeSerializationDemo {

	public static void main(String[] args) {
		deserialization();

	}
	private static void deserialization()
	{
		FileInputStream fin=null;
		ObjectInputStream in=null;
		Employee obj=null;
		try
		{
			fin=new FileInputStream("D:\\Example\\Employee.ser");
			in=new ObjectInputStream(fin);
			obj=(Employee)in.readObject();
			obj.showEmpNo();
			obj.showEmpName();
			obj.showJobName();
			obj.showSalary();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				in.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
