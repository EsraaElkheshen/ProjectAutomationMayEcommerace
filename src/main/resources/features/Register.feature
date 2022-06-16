@RunSmoke
Feature: user should be register to application
  Scenario: user able to register
    Given user open Register Link
    When user enter personal data and Email
    And  user enter password and confirm password
    And user click on Register button
    Then page should be opened successfully
    And user log out
