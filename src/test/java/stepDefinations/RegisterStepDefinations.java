package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.Register_Page;


public class RegisterStepDefinations {
    Register_Page reg= new Register_Page();
    SoftAssert softAssert;

    @Given("user open Register Link")
    public void navigateToRegisterLink(){
        reg.openRegisterLink();
    }

    @When("user enter personal data and Email")
    public void enterData(){
        reg.enterPersonalData("Esraa","Mahmoud",4,4,
                "1988","Esraa.M.Mohamed4@gmail.com","Wedata1");

    }
    @And("user enter password and confirm password")
    public void enterValidPassword(){
    reg.enterPassword("12345678");
    }

    @And("user click on Register button")
    public void clickOnRegisteration(){
     reg.pressOnRegisterButton();
    }
    @Then("page should be opened successfully")
    public void registerSucess(){
        softAssert=new SoftAssert();
        softAssert.assertTrue(reg.issucessMessageDisplay());
        softAssert.assertAll();
		//Assert.assertEquals("rgba(76, 177, 124, 1)",reg.GetCssColour(reg.txt_sucessMessage));
       Assert.assertEquals(reg.GetCssColour(reg.txt_sucessMessage),"#4cb17c");
        
    }
    @And("user log out")
    public void logOut(){
        reg.userLogOut();
 }

}
