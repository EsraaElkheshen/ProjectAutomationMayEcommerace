package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Cart_Page;

public class AddToShopCartStepDefinations {
    Cart_Page cart=new Cart_Page();

 //Scenario1
    @Given("user open page and click on add Random Cart")
    public void  openpagee(){
       cart.openPage();
        cart.addingCart();


    }

    @Then("Shopping notification  is visible")
    public void verifyMessage(){
       Assert.assertTrue(cart.isDisplayMessage());

    }
}
