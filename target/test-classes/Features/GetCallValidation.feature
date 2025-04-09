Feature: Validate response of get request
  
 
  Scenario: Validate response of get request
    Given I have valid get request
    When I hit the api
    Then Verify status code of get request

    
