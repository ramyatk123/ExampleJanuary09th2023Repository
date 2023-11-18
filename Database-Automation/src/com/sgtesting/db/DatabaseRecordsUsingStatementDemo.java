package com.sgtesting.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DatabaseRecordsUsingStatementDemo {

	public static void main(String[] args) {
		readRecordsFromTable();
	//	insertRecordsFromTable();
		
	}
	private static void readRecordsFromTable()
	{
		Connection conn=null;
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","tiger");
			System.out.println("Connection Successfull");
			Statement stmt=conn.createStatement();
			String query="select * from dept";
			ResultSet rs=stmt.executeQuery(query);
			ResultSetMetaData rsdata=rs.getMetaData();
			String col1=rsdata.getColumnName(1);
			String col2=rsdata.getColumnName(2);
			String col3=rsdata.getColumnName(3);
			System.out.printf("%-12s",col1);
			System.out.printf("%-12s",col2);
			System.out.printf("%-12s",col3);
			System.out.println();
			
			
			while(rs.next())
			{
				String deptno=rs.getString("DEPTNO");
				String dname=rs.getString("DNAME");
				String loc=rs.getString("LOC");
				System.out.printf("%-12s",deptno);
				System.out.printf("%-12s",dname);
				System.out.printf("%-12s",loc);
				System.out.println();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	private static void insertRecordsFromTable()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","tiger");
			System.out.println("Connection Successfull");
			Statement stmt=conn.createStatement();
			String query="insert into dept values(50,'HEALTH','SANJOSE')";
			stmt.executeQuery(query);
			System.out.println("A Record has inserted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
