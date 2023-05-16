Feature: Searching an item on he homepage
  Scenario Outline: Validate that the search option is giving right results
    When we are on the homePage
    And we insert an "<item>" name in the search field and click the search button
    Then we are taken to the results page
    And we validate the results
    Examples:
      | item   |
      | laptop |
      | phone  |


