@RunSmoke
Feature: user able to login to Application
  Scenario: user should be able to login successfully
    Given user open Login Link
    When user enter Email and Password
    And user click on Login Button
    Then user should login successfully
