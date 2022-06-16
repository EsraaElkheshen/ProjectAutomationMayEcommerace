package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Search_Page;

public class SearchStepDefinations {

Search_Page home=new Search_Page();

    @Given("user open Home Page and open search")
    public void NavigateToSearch(){
        home.openSearch();

    }
    @When("^user enter Product as \"(.*)\"$")
    public void searchWithProduct(String product){

        home.searchProduct(product);
    }
    @And("user search")
    public void searchOfProduct(){

        home.pressSearch();
    }
    @Then("All words of search contain Apple")
    public void verifyWithSearch(){
       // Assert.assertTrue(home.verifyName().contains("Apple"));
        Assert.assertTrue(home.vervifySearch());

    }
    @And("user open link and found Sku")
    public void navigateToLink(){
        home.navigateToLink();
        Assert.assertTrue(home.isDisplaySku());
    }

}
