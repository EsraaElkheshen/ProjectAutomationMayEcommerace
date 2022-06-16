package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.WishList_Page;

public class WishListStepDefinations {
    WishList_Page wishlist = new WishList_Page();
    SoftAssert softassert;

    //Scenario1
    @Given("user open page and click on product wishlist")
    public void addingToWishList() {
        wishlist.pressOnWishBoard();
    }

    @Then("message displayed with green")
    public void verifyMessageandcolour() {
        softassert = new SoftAssert();
        softassert.assertTrue(wishlist.isDisplaysucessMessage());
        softassert.assertEquals(wishlist.verifyMessageColour(), "#4bb07a");
        softassert.assertAll();
    }

    //Scenario2
    @Given("user open home page and click on button add to wishlist")
    public void clickOnWishList() {

        wishlist.pressOnWishBoard();
    }

    @Then("wait for element to be invisible")
    public void waitSuccessBar() {

        wishlist.handleError();
    }

    @Then("user able to click on wishList Link")
    public void openWishLink() {

        wishlist.navigateToWishListLink();
    }

    //Scenario3
    @Given("user open home page and add to wishlist")
    public void addNewProduct() {
        wishlist.pressOnAddWishList();
    }


    @And("enter all data")
    public void enterAllData() {
        wishlist.enterData("esraa", "esraa22@gmail.com", "esraa3", "esraa4@gmail.com");
        wishlist.clickonAddToWish();
        wishlist.handleError();
    }


    @Then("product added to wish list")
    public void validateResult() {
        wishlist.navigateToWishListLink();
        wishlist.getValueOfQuantity();

    }
}
