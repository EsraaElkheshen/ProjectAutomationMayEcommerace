@RunSmoke
Feature: switch between windows
  Background: user open Home Page
    #Scenario 1:
    Scenario: user able to open facebook
    When user open facebook
    Then user close facebook and switch back


       #Scenario 2:
  Scenario: user able to open twitter
    When user open twitter
    Then user close twitter and switch back


     #Scenario 3:
  Scenario: user able to open Rss
    When user open Rss
    Then user close Rss and switch back

     #Scenario 4:
  Scenario: user able to open youTube
    When user open youTube
    Then user close youTube and switch back