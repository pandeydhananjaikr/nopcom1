Feature: Demo DataTable

    Scenario: Datatable reading demo
    Given I am on homepage
      | abc |
    When I give the data
      | firstname | lastname | email         |
      | abc       | def      | abc@gmail.com |

    Then the test passes

  @data
  Scenario: ExcelReadingDemo
    Given Read excel value
      | SheetName | RowNumber | ColumnNumber |
      | Sheet1    | 4         | 4            |
