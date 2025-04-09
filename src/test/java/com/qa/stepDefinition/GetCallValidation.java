package com.qa.stepDefinition;



import com.qa.helperClass.ApiValidation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetCallValidation {
ApiValidation api=new ApiValidation();
	
	@Given("I have valid get request")
	public void getRequest()
	{
		System.out.println("validate get request");
	}
	
    @When ("I hit the api")
    public void sendApiRequest()
    {
    	api.sendRequest();
    }
    @Then("Verify status code of get request")
    public void validateResponse()
    {
    	api.responseValidation();
    }


}
