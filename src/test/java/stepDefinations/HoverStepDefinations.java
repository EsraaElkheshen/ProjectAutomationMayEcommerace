package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HoverCateogary;

public class HoverStepDefinations {
    HoverCateogary hover=new HoverCateogary();
    @Given("open Homepage and hover on Category")
    public void Hofer(){
        hover.selectCategory();

    }
    @When("user get Text of sub Category")
    public void getTextSubOfCategory(){
        hover.selectSubCategory();
        hover.GetTextSubCateogary();
    }

    @Then("user can open sub-Category")
    public void openSubCatogry(){
        hover.pressSubCategory();
    }
}
