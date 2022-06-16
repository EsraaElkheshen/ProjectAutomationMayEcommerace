@RunSmoke
Feature:  user select different Categories
  Scenario: user able to hover on category then open sub-Category
    Given  open Homepage and hover on Category
    When  user get Text of sub Category
    Then  user can open sub-Category