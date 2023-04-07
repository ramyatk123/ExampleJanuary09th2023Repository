package com.sgtesting.iodemo1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SerializationDemo {

	public static void main(String[] args) {
		serialization();

	}
	private static void serialization()
	{
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		Employee empobject=null;
		try
		{
			fout=new FileOutputStream("D:\\Example\\Employee.ser");
			empobject=new Employee(1998,"Ramya","Manager",9500);
			out=new ObjectOutputStream(fout);
			out.writeObject(empobject);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				out.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
