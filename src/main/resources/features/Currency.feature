@RunSmoke
Feature: user should be able to switch between currency
  Scenario: user able to switch between currency
    Given user press on currency dropdown and switch to Euro
     When user scroll down
     Then Euro should be displayed
