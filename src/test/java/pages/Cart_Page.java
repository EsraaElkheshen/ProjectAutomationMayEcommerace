package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinations.Hooks;
import java.time.Duration;

public class Cart_Page {
    By btn_addCart= By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/18/1/1\"),!1']");
    By txt_notificationMessage = By.xpath("//*[text()='The product has been added to your ']");
    By notificationBar = By.xpath("//div[@class='bar-notification success']");
    By txt_Quantity=By.xpath("//tbody//tr[1]//td[5]//input");


  public void openPage(){
      Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
  }
  public void addingCart(){
      clickButton(btn_addCart);
  }
  public boolean isDisplayMessage(){
        return isDisplay(txt_notificationMessage);
  }
    public void handleError(){
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(Hooks.driver.findElement(notificationBar)));
    }

    public int getQuantity(){
        String value=getText(txt_Quantity);
        System.out.println(value);
        int quantityValue=Integer.parseInt(value);
        System.out.println(quantityValue);
        return  quantityValue;

    }



    public void sendText(By element,String value) {
        Hooks.driver.findElement(element).sendKeys(value);
    }

    public String getText(By element) {
        return Hooks.driver.findElement(element).getText();
    }

    public void clickButton(By element) {

        Hooks.driver.findElement(element).click();
    }
    public boolean isDisplay(By element){

        return Hooks.driver.findElement(element).isDisplayed() ;
    }
}
