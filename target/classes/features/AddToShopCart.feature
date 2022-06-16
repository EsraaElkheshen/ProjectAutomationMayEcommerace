@RunSmoke
Feature:user able to add to Shop Cart
  #Scenario1:
  Scenario: success message display after add to cart
    Given user open page and click on add Random Cart
    Then Shopping notification  is visible
