#Feature: User registers a new account
#
#  Scenario Outline: User registers with valid data
#    Given We are on registerpage
#    When user enters "<firstname>" in the first name and "<lastname>" in the last name
#    And user enters "<email>" in the email address
#    And user enters "<password>" in password
#    And user enters "<confPassword>" in confirm password
#    Then the user is registered and successfully and the message "Your registration completed" appears
#    Examples:
#      | firstname | lastname | email       | password | confPassword |
#      | abc       | abc      | abc@abc.com | 123456   | 12345        |
#
#  @InvalidData
#  Scenario Outline: User registers with invalid email
#    Given We are on registerpage
#    When user enters "<firstname>" in the first name and "<lastname>" in the last name
#    And user enters "<email>" in the email address
#    And user enters "<password>" in password
#    And user enters "<confPassword>" in confirm password
#    Then error message for invalid email appears
#    Examples:
#      |firstname  |lastname |email| password|confPassword|
#      |abc  |abc |abcdef| 123456|123456|
#
#  @InvalidData
#  Scenario Outline: User registers with invalid password
#    Given We are on registerpage
#    When user enters "<firstname>" in the first name and "<lastname>" in the last name
#    And user enters "<email>" in the email address
#    And user enters "<password>" in password
#    And user enters "<confPassword>" in confirm password
#    Then error message for invalid password appears
#    Examples:
#      |firstname  |lastname |email| password|confPassword|
#      |abc  |abc |abc@abc.com|1234|1234|
#
#  @InvalidData
#  Scenario Outline: User registers with password mismatch
#    Given We are on registerpage
#    When user enters "<firstname>" in the first name and "<lastname>" in the last name
#    And user enters "<email>" in the email address
#    And user enters "<password>" in password
#    And user enters "<confPassword>" in confirm password
#    Then error message for password mismatch appears
#    Examples:
#      |firstname  |lastname |email| password|confPassword|
#      |abc  |abc |abc@abc.com|1234567|123456|
#
#  Scenario Outline: User registers with empty data field
#    Given We are on registerpage
#    When user enters "<firstname>" in the first name and "<lastname>" in the last name
#    And user enters "<email>" in the email address
#    And user enters "<password>" in password
#    And user enters "<confPassword>" in confirm password
#    Then error message for empty field appears
#    Examples:
#      |firstname  |lastname |email| password|confPassword|
#      ||||||
#
#  Scenario Outline: User registers with existing email
#    Given We are on registerpage
#    When user enters "<firstname>" in the first name and "<lastname>" in the last name
#    And user enters "<email>" in the email address
#    And user enters "<password>" in password
#    And user enters "<confPassword>" in confirm password
#    Then error message for existing email appears
#      | firstname | lastname | email       | password | confPassword |
#      | abc       | abc      | abc@abc.com | 123456   | 12345        |
#
#
#
#
