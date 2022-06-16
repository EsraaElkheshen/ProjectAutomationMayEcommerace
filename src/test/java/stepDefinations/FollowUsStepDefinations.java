package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Follow_Page;

public class FollowUsStepDefinations {
    Follow_Page follow=new Follow_Page();

    @When("user open facebook")
    public void NavigateFaceBook() throws InterruptedException {
        follow.switchTofacebook();
        Assert.assertEquals(follow.getCurentURL(),"https://www.facebook.com/nopCommerce");
    }
    @Then("user close facebook and switch back")
    public void closeFacebookTab() throws InterruptedException {
        follow.closefacebook();
    }
      
       
   // user able to open twitter
    @When("user open twitter")
    public void navigateTwitter() throws InterruptedException {
        follow.switchToTiwtter();
        Assert.assertEquals(follow.getCurentURL(),"https://twitter.com/nopCommerce");

    }
    @Then("user close twitter and switch back")

    public void closetwitterTab() throws InterruptedException {
        follow.closeTiwtter();
    }
    //user able to open Rss
    @When("user open Rss")
    public void navigateRss() throws InterruptedException {
        follow.switchToRss();
        Assert.assertEquals(follow.getCurentURL(),"https://demo.nopcommerce.com/news/rss/1");
    }
    @Then("user close Rss and switch back")
    public void closeRssTab() throws InterruptedException {
        follow.closeRss();
    }
     
   // user able to open youTube
    @When("user open youTube")
    public void navigateYouTube() throws InterruptedException {
        follow.switchToyouTube();
        Assert.assertEquals(follow.getCurentURL(),"https://www.youtube.com/user/nopCommerce");
    }
    @Then("user close youTube and switch back")
    public void closeYouTubeTab() throws InterruptedException {
        follow.closeyouTube();
    }
}
