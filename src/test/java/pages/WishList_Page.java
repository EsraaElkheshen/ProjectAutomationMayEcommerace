package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinations.Hooks;

import java.time.Duration;
import java.util.List;

public class WishList_Page {
    By btn_Product1 = By.xpath("//div//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/18/2/1\"),!1']");
     By wishHeader = By.xpath("//div[@class='bar-notification success']");
    By txt_SuccessMessage = By.xpath("//*[text()='The product has been added to your ']");
    By btn_wishLishLink = By.xpath("//a[@href='/wishlist']");
    By btn_Product2= By.xpath("//div//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/43/2/1\"),!1']");
    By txt_recipientName= By.id("giftcard_43_RecipientName");
    By txt_recipientEmail= By.id("giftcard_43_RecipientEmail");
    By txt_Name=By.id("giftcard_43_SenderName");
    By txt_Email=By.id("giftcard_43_SenderEmail")     ;
    By btn_addWishlist=By.xpath("//button[@id='add-to-wishlist-button-43']");
    By txt_Quantity=By.xpath("//tbody//tr[1]//td[6]//input");

    public void pressOnWishBoard() {

        clickButton(btn_Product1);
    }
    public String verifyMessageColour(){

        return getCssValue(wishHeader);
    }
    public boolean isDisplaysucessMessage(){

        return isDisplayMessage(txt_SuccessMessage);
    }

    public String getCssValue(By element){
        String backGroundColour = Color.fromString(Hooks.driver.findElement(element).getCssValue("background-color")).asHex();
        return backGroundColour;
    }
    public void handleError(){
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(Hooks.driver.findElement(wishHeader)));
    }
    public void navigateToWishListLink(){

        clickButton(btn_wishLishLink);
    }

    public void pressOnAddWishList(){
        clickButton(btn_Product2);
    }


    public void enterData(String receiptname,String receiptemail,String name, String email){
        sendText(txt_recipientName,receiptname);
        sendText(txt_recipientEmail,receiptemail);
        sendText(txt_Name,name);
        sendText(txt_Email,email);
    }
    public void clickonAddToWish(){

        clickButton(btn_addWishlist);
    }
    public void getValueOfQuantity(){
        System.out.println(Hooks.driver.findElement(txt_Quantity).getAttribute("value"));

    }

  public void sendText(By element,String value){
      Hooks.driver.findElement(element).sendKeys(value);
  }
    public boolean isDisplayMessage(By element){

        return Hooks.driver.findElement(element).isDisplayed();
    }

    public String getText(By element) {

        return Hooks.driver.findElement(element).getText();
    }
    public String getAttribute(By element) {

        return Hooks.driver.findElement(element).getAttribute("value");
    }

    public void clickButton(By element) {

        Hooks.driver.findElement(element).click();
    }
}



