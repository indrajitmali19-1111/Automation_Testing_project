Feature: Login Gmail

  Scenario: verify after entering valid email and password gmail login successfull
    Given User should be registered
    When Open gmail login page , enter valid credentials
    Then Gmail login should be successfull
