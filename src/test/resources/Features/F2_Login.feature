Feature: Feature to test the login
  Scenario Outline: Validate that the registered login is working
    Given we are on loginPage
    When we enter the right "<email>" and "<password>"
    And we click on the login button
    Then We see the log out button on the page
    Examples:
      | email | password |
      |abc@abc.com    |12345    |



