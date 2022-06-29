Feature: Login for common users




  @UIlogin
  Scenario Outline: login functionality

    Given user navigates to lending page "<url>"
    And user navigates to sign in portal
    And user clicks on sign in button
    When user provides the username as "<username>"
    And user provides the password as "<password>"
    Then user clicks on login button

    Examples: all data
    |url|username|password|
    |https://medunna.com|admin|Admin@123|
