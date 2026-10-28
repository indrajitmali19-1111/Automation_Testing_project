Feature: Sauce demo login

  Scenario: Verify login and logout should be successfull
    Given Launch login page of sauce demo
    When Enter username as "<username>" and password as "<password>"
    And click on login button and logout button
    Then User should be login and logout successfull and result as "<Expectedresult>"

    Examples:
      | username                | password     | Expectedresult |
      | standard_user           | secret_sauce | Success        |
      | problem_user            | secret_sauce | Success        |
      | performance_glitch_user | secret_sauce | Success        |
      | error_user              | secret_sauce | Success        |
      | visual_user             | secret_sauce | Success        |
      | locked_out_user         | secret_sauce | Fail           |
