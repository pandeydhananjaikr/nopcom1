Feature: Demo DataTable

  @datatable
  Scenario: Datatable reading demo
    Given I am on homepage
      | abc |
    When I give the data
      | firstname | lastname | email         |
      | abc       | def      | abc@gmail.com |

    Then the test passes

    @exceltestcase
  Scenario Outline: abc
    Given read excel value based on value "<SheetName>" , "<TestCaseNumber>"
    Examples:
      | SheetName | TestCaseNumber |
      | Sheet1    | 1              |
      | Sheet1    | 2              |
      | Sheet1    | 3              |
      | Sheet1    | 4              |

  @dataexcel
  Scenario: ExcelReadingDemo
    Given Read excel value
      | SheetName | RowNumber | ColumnNumber |
      | Sheet1    | 4         | 4            |

