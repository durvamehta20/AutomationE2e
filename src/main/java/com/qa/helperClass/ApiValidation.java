package com.qa.helperClass;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiValidation {
	
static Response  response;
	
	public static void sendRequest()
	{
		RestAssured.baseURI="https://demoqa.com/BookStore";
		  
		RequestSpecification httpRequest = RestAssured.given().log().all();

        response = httpRequest.request(Method.GET, "v1/Books");
			
		
		System.out.println(response);
         // System.out.println("Status received => " + response.getStatusLine());
          //System.out.println("Response=>" + response.prettyPrint());

		
	}
	
	public static void responseValidation()
	{
		Assert.assertEquals(200,response.statusCode());
	}

}
