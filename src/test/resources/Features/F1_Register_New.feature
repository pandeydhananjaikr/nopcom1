Feature: User registers a new account

  @positive
  Scenario Outline: User registers with valid data
    Given We are on registerpage
    When user enters "<firstname>" in the first name and "<lastname>" in the last name
    And user enters "<email>" in the email address
    And user enters "<password>" in password
    And user enters "<confPassword>" in confirm password
    Then the user is registered and successfully and the message "Your registration completed" appears
    Examples:
      | firstname | lastname | email          | password | confPassword |
      | abc       | abc      | abcdef@abc.com | 123456   | 123456       |

  @negative
  Scenario Outline: User registers with invalid data
    Given We are on registerpage
    When user enters "<firstname>" in the first name and "<lastname>" in the last name
    And user enters "<email>" in the email address
    And user enters "<password>" in password
    And user enters "<confPassword>" in confirm password
    Then error message for invalid data appears "<user count>"
    Examples:
      | user count | firstname | lastname | email       | password | confPassword |
      | 1          | abc       | abc      | abcdef      | 123456   | 123456       |
      | 2          | abc       | abc      | abc@abc.com | 1234     | 1234         |
      | 3          | abc       | abc      | abc@abc.com | 1234567  | 123456       |

  Scenario Outline: User registers with empty data field
    Given We are on registerpage
    When user enters "<firstname>" in the first name and "<lastname>" in the last name
    And user enters "<email>" in the email address
    And user enters "<password>" in password
    And user enters "<confPassword>" in confirm password
    Then error message for empty field appears
    Examples:
      | firstname | lastname | email | password | confPassword |
      |           |          |       |          |              |

  Scenario Outline: User registers with existing email
    Given We are on registerpage
    When user enters "<firstname>" in the first name and "<lastname>" in the last name
    And user enters "<email>" in the email address
    And user enters "<password>" in password
    And user enters "<confPassword>" in confirm password
    Then error message for existing email appears
      | firstname | lastname | email       | password | confPassword |
      | abc       | abc      | abc@abc.com | 123456   | 12345        |





