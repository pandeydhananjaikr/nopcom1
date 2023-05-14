
Feature: Demo DataTable

@data
Scenario: Datatable reading demo
Given I am on homepage
| abc |
When I give the data
| firstname | lastname | email         |
| abc       | def      | abc@gmail.com |

Then the test passes