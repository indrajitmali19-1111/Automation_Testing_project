Feature: Register and login Opencart

Background:
Given Opnecart website should be launched

  Scenario: To verify register with all details.
   
    When Enter username, firstname, lastname
    And Enter email , country , password
    Then User should create account and register should be successfull

  Scenario: To verify user should be login with valid credentials
    
    When Click on login button
    And Enter Email and password
    Then Click on button
