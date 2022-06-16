package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Currency_Page;

public class CurrencyStepDefinations {
    Currency_Page currency=new Currency_Page();

    @Given("user press on currency dropdown and switch to Euro")
    public void switchToEuroCurrency(){
        currency.navigateToCurrency();
    }
    @When("user scroll down")
    public void scrollPage(){
        currency.scrollDown();
    }
    @Then("Euro should be displayed")
    public void verifyEuro(){
        Assert.assertTrue(currency.validateCurrency().contains("€"));

    }
}
