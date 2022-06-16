
@RunSmoke
Feature: search with more product and serial
  #Scenario1:
  Scenario Outline: user can search with  more product
    Given user open home page and search
    Then user enter my Product as "<product>" and verify

    Examples:
  | product |
  | book |
  | laptop |
  | nike |


     #Scenario2:
  Scenario Outline: user can search  more serial product
    Given user open home page and press search
    Then user enter my Serials as "<serial>" and verify
    Examples:
      | serial |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PR0_11 |