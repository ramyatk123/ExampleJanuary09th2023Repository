package com.sgtesting.testcases.stepDefinitions;

import org.testng.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinitions {
	public static RequestSpecification httpRequest=null;
	public static String jsonUser=null;
	public static Response response=null;
	/**
	 * Author:
	 * Step:
	 */
	@Given("^i provide the endPoint$")
	public void i_provide_the_endPoint()
	{
		try
		{
			RestAssured.baseURI="http://localhost:8082/springboot-sgsoftwaretestinginstitute-sgtesting/users";

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@And("^I create httpRequest Object$")
	public void I_create_httpRequest_Object()
	{
		try
		{
			httpRequest= RestAssured.given();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@And("^I create User Pojo Json request$")
	public void I_create_User_Pojo_Json_request()
	{
		try
		{
			User obj=new User(
					"Bangalore","kiran@gmail.com",
					"Kiran","Gowda","8882277256",
					"Manager",560040L);
			ObjectMapper objMapper=new ObjectMapper();
			jsonUser=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@When("^I post the Request$")
	public void I_post_the_Request()
	{
		try
		{
			httpRequest.header("Content-Type","application/json");
			httpRequest.body(jsonUser);
			response=httpRequest.post();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Then("^I get 201 status code$")
	public void I_get_201_status_code()
	{
		try
		{
			int statuscode=response.getStatusCode();
			Assert.assertEquals(201,statuscode);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
