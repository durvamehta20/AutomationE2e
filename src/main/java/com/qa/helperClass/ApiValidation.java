package com.qa.helperClass;

import org.testng.Assert;
import io.restassured.path.json.JsonPath;

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
          System.out.println("Status received => " + response.getStatusLine());
          System.out.println("Response=>" + response.prettyPrint());
          

		
	}
	
	public static void responseValidation()
	{
		Assert.assertEquals(response.statusCode(),200);
		JsonPath jsp=new JsonPath(response.body().asString());
        System.out.println(jsp);
      
        String subTitle=jsp.getString("books[7].subTitle");
        Assert.assertEquals(subTitle, "The Definitive Guide for JavaScript Developers");
	}

}
