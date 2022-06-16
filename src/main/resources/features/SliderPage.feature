@RunSmoke
Feature: user compare between two slide
  #Scenario1
  Scenario: user compare between Urls for slide 1
    Given user can press on first slide
    Then  compare between URls of first slide and fail

#Scenario2
  Scenario:  user compare between Urls for slide 2
    Given user can press on second slide
    Then  compare between URls of second slide and fail