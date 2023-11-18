package com.sgtesting.StringBuffer;

public class InsertandDeleteDemo {

	public static void main(String[] args) {
		insertDemo();
		 deleteDemo();
	}
        private static void insertDemo()
        {
        	
        	String s=new String("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
        	
        	String str=s.replaceAll("DAY","DAY,");
        	System.out.println(str);
        	
        }
        private static void deleteDemo()
        {
        	String s="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        	String s1=s.replace("DAY", "");
        	System.out.println(s1);
        	System.out.println(" +++++++++ ");
        }

	}

