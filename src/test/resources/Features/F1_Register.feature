Feature: User registers a new account

  Scenario: User registers with valid data
    Given We are on registerpage
    When user enters "abc" in the first name and "abc" in the last name
#    And user enters "01", "January" and "1988"
    And user enters "abc@abc.com" in the email address
    And user enters "123456" in password and confirmpassword
    Then the user is registered and successfully and the message "Your registration completed" appears

  Scenario: User registers with invalid data
    Given We are on registerpage
    When user enters "@12323" in the first name and "@!*&&&" in the last name
    And user enters "1221sdsfdf" in the email address
    And user enters "123456" in password and confirmpassword
    Then error message for invalid data appears

  Scenario: User registers with empty data field
    Given We are on register page
    When user enters "" in the first name and "" in the last name
    And user enters "abc@abc.com" in the email address
    And user enters "" in password and confirmpassword
    Then error message for empty field appears

  Scenario: User registers with existing email
    Given We are on registerpage
    When user enters "bcd" in the first name and "bcd" in the last name
    And user enters "abc@abc.com" in the email address
    And user enters "123456" in password and confirmpassword
    Then error message for existing email appears
