package com.sgtesting.Users;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class User {
	public static String user_id=null;
     @Test(priority = 1)
     public void createUser()
     {
    	 try
    	 {
    		RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users";
    		RequestSpecification httpRequest= RestAssured.given();
    		
    		Map<String,String> obj=new HashMap<String,String>();
    	    obj.put("address","Tumkur");
    	    obj.put("emailId","ramyagowda@gmail.com");
    	    obj.put("firstName","Ramya");
    	    obj.put("lastName","Gowda");
    	    obj.put("phoneNumber","8660421948");
    	    obj.put("userRole","Manager");
    	    obj.put("zipcode","560040");
    	    
    	    httpRequest.header("Content-Type","application/json");
    	    httpRequest.body(obj);
    	    
    	    Response response=httpRequest.post();
    	    String content=response.asString();
    	    System.out.println(content);
    	     
    	    JsonPath jpath=response.jsonPath();
    	    user_id=jpath.getString("id");
    	    System.out.println("User Id :"+user_id);
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     
     @Test(priority = 2)
     public void displayParticularUser()
     {
    	 try
    	 {
    		 System.out.println("Display a particular User using GET http Method");
    		 RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/"+user_id;
    		 RequestSpecification httpRequest=RestAssured.given();
    		  
    		 httpRequest.header("content-Type","application/json");
    		 
    		 Response response=httpRequest.get();
    		 String content=response.asString();
    		 System.out.println(content);
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 
     }
    
     @Test(priority = 3)
     public void modifyUser()
     {
    	 try
    	 {
    		RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/"+user_id;
    		RequestSpecification httpRequest= RestAssured.given();
    		
    		Map<String,String> obj=new HashMap<String,String>();
    	    obj.put("address","Bangalore");
    	    obj.put("emailId","ramya@gmail.com");
    	    obj.put("firstName","kiran");
    	    obj.put("lastName","Gowda");
    	    obj.put("phoneNumber","1234567891");
    	    obj.put("userRole","Analyst");
    	    obj.put("zipcode","560046");
    	    
    	    httpRequest.header("Content-Type","application/json");
    	    httpRequest.body(obj);
    	    
    	    Response response=httpRequest.put();
    	    String content=response.asString();
    	    System.out.println(content);
    	     
 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     @Test(priority = 4)
     public void displayParticularmodifyUser()
     {
    	 try
    	 {
    		 System.out.println("Display a particular User using GET http Method");
    		 RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/"+user_id;
    		 RequestSpecification httpRequest=RestAssured.given();
    		  
    		 httpRequest.header("content-Type","application/json");
    		 
    		 Response response=httpRequest.get();
    		 String content=response.asString();
    		 System.out.println(content);
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     @Test(priority = 5)
     public void deletemodifyUser()
     {
    	 try
    	 {
    		 System.out.println("Delete user");
    		 RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users/"+user_id;
    		 RequestSpecification httpRequest=RestAssured.given();
    		  
    		 httpRequest.header("content-Type","application/json");
    		 
    		 Response response=httpRequest.delete();
    		 String content=response.asString();
    		 System.out.println(content);
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
}
