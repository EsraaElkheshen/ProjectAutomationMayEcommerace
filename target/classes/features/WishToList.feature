@RunSmoke
Feature:user able to add product to wish list
  #Scenario1:
  Scenario: user able to press on add wish on product
    Given user open page and click on product wishlist
    Then message displayed with green


     #Scenario2:
  Scenario: user able to press on add wish on product and open  link Wishlist
    Given user open home page and click on button add to wishlist
    And wait for element to be invisible
    Then user able to click on wishList Link


     #Scenario3:
  Scenario: user add to wishlist
    Given user open home page and add to wishlist
    And enter all data
    Then product added to wish list