package com.sgtesting.pojo.testcases;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserTestCase {
   public static String user_id=null;
   @Test(priority = 1)
   public void createUser()
   {
	   try
	   {
		   RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users";
		   RequestSpecification httpRequest= RestAssured.given();
		   
		   User obj=new User(
				 "Tumkur","shivu@gmail.com",
				 "shivu","gowda","9975203456",
				 "Analyst",572228L);
		   ObjectMapper objMapper=new ObjectMapper();
		   String jsonUser=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		   
		   httpRequest.header("content-Type","application/json");
		   httpRequest.body(jsonUser);
		   
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
   
}
