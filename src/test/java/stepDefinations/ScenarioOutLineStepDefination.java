package stepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import pages.MultSearch_Page;

public class ScenarioOutLineStepDefination {

    MultSearch_Page home=new MultSearch_Page();



    @Given("user open home page and search")
    public void NavigateToSearch(){
        home.openSearch();
        Assert.assertTrue(home.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
    }
    @Then("^user enter my Product as \"(.*)\" and verify$")
    public void enterProduct(String product){
        home.searchProduct(product);
        home.VerifyProduct(product);
        Assert.assertTrue(home.getCurrentUrl().contains("/search"));
        Assert.assertTrue(product.contains(product));
    }

//scenario2
    @Given("user open home page and press search")
    public void NavigateToSearchserial(){
        home.openSearch();
        Assert.assertTrue(home.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
    }

        @Then("^user enter my Serials as \"(.*)\" and verify$")
    public void enterSerialNumber(String serial){
            home.searchProduct(serial);
            home.VerifyProduct(serial);
            Assert.assertTrue(home.getCurrentUrl().contains("/search"));
            Assert.assertTrue(serial.contains(serial));
    }
}
