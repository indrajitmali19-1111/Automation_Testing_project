Feature: Orange hrm website login

  Scenario: Login should be successfull with valid credentils in the orange hrm website
    Given Luanch the orange hrm website on edgebrowser
    When Enter valid username as "Admin" and password as "admin123"
    And click on login button of orange hrm website
    Then User should be login succssfull on orange hrm dashboard
