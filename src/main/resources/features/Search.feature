@RunSmoke
Feature: user able to search on product
  Scenario: user should be able to search with Apple product
    Given user open Home Page and open search
    When user enter Product as "Apple"
    And user search
    Then All words of search contain Apple
    And user open link and found Sku

