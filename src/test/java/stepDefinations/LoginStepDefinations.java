package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.testng.asserts.SoftAssert;
import pages.Login_Page;


public class LoginStepDefinations {
    Login_Page login= new Login_Page();
    SoftAssert softAssert;

    @Given("user open Login Link")
    public void navigateToLoginLink(){
        login.openLoginLink();

    }
    @When("user enter Email and Password")
    public void enterValidEmailAndValidPassword(){
      login.enterEmailAndPassword("Esraa.M.Mohamed2@gmail.com","12345678");
    }
    @And("user click on Login Button")
    public void clickLoginButton(){
    login.pressLoginButton();
    }
    @Then("user should login successfully")
    public void loginUserSuccess(){
        softAssert=new SoftAssert();
        softAssert.assertEquals(login.getCurrentUrl(),"https://demo.nopcommerce.com/");
        softAssert.assertTrue(login.isDisplayMyAccount());
        softAssert.assertAll();

    }
}
