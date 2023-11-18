package com.sgtesting.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class DBUtility {
	/**
	 * Verify the DB Connection
	 * Return Value:Boolean
	 */
	public static Connection getDatabaseconnection()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","tiger");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}

/**
 * Find the Number of columns in a table
 * Return Value:integer
 * 
 */
public static int getRowCount(String query)
{
	int rc=0;
	try
	{
		Connection conn=getDatabaseconnection();
		PreparedStatement stmt=conn.prepareStatement(query);
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
			rc=rc+1;
		}
		conn.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return rc;
 }
   /**
    * Find the Number of columns in a table
    * Return Value: integer
    *
    */
     public static int getColumnCount(String query)
     {
	    int count=0;
	    try
	    {
		    Connection conn=getDatabaseconnection();
		    PreparedStatement stmt=conn.prepareStatement(query);
		    ResultSet rs=stmt.executeQuery();
		    ResultSetMetaData rsdata=rs.getMetaData();
		    count=rsdata.getColumnCount();
		    conn.close();
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return count;
     }
     /**
      * Get column names from a table
      * Return Value:String Array
      */
     public static ArrayList<String> getColumnNames(String query)
     {
    	 ArrayList<String> obj=null;
    	 try
    	 {
    		 Connection conn=getDatabaseconnection();
    		 PreparedStatement stmt=conn.prepareStatement(query);
    		 
    		 ResultSet rs=stmt.executeQuery();
    		 ResultSetMetaData rsdata=rs.getMetaData();
    		 int cc=rsdata.getColumnCount();
    		 obj=new ArrayList<String>();
    		 for(int i=1;i<=cc;i++)
    		 {
    			 obj.add(rsdata.getColumnName(i));
    		 }
    		 conn.close();
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 return obj;
     }
     /**
      * Verify whether table is blank or Empty
      * Return Value:Boolean
      */
     public static boolean isEmptyTable(String query)
     {
    	 boolean status=true;
    	 try
    	 {
    		 Connection conn=getDatabaseconnection();
    		 PreparedStatement stmt=conn.prepareStatement(query);
    		 
    		 ResultSet rs=stmt.executeQuery();
    		 if(rs.next()==true)
    		 {
    			 status=false;
    		 }
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 return status;
     }
     /**
      * From the given query the table has to return given column data
      * Return Value:Boolean
      */
     public static ArrayList<Object>getColumnData(String query,String ColumnName)
     {
    	 ArrayList<Object> obj=null;
    	 try
    	 {
    		 Connection conn=getDatabaseconnection();
    		 PreparedStatement stmt=conn.prepareStatement(query);
    		 ResultSet rs=stmt.executeQuery();
    		 obj=new ArrayList<Object>();
    		 while(rs.next())
    		 {
    			 obj.add(rs.getString(ColumnName));
    		 }
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 return obj;
     }
  }