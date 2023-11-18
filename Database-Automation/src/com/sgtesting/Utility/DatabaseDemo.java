package com.sgtesting.Utility;

import java.util.ArrayList;

public class DatabaseDemo {

	public static void main(String[] args) {
		try
		{
			int rc=DBUtility.getRowCount("select * from dept");
			System.out.println("Row Count:"+rc);
			
			int cc=DBUtility.getColumnCount("select * from dept");
			System.out.println("Column Count:+cc");
			
			ArrayList<String>obj=DBUtility.getColumnNames("select *from dept");
			for(int i=0;i<obj.size();i++)
			{
				System.out.println(obj.get(i));
			}
			
			boolean v1=DBUtility.isEmptyTable("select * from dept");
			System.out.println("Table is Empty:"+v1);
			
			ArrayList<Object>dname=DBUtility.getColumnData("select * from dept","DNAME");
			for(int i=0;i<dname.size();i++)
			{
				System.out.println(dname.get(i));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
