Feature: LoginFeature
  This Feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for login
      | userName | passWord      |
      | admin    | adminpassword |

    And I click login button
    Then I should see the userform page