package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepDefinations.Hooks;

import java.util.ArrayList;
import java.util.List;

public class MultSearch_Page {
    By btn_productSearch= By.xpath("//input[@id='small-searchterms']");
    By btn_Search= By.xpath("//button[@type='submit']");
    By txt_SKU= By.xpath("//span[@id='sku-4']");
    By txt_Pic1= By.xpath("//h2//a[@href='/science-faith']");
    By txt_Pic2= By.xpath("//h2//a[@href='/apple-icam']");
    By txt_Pic3= By.xpath("//h2//a[@href='/sound-forge-pro-11-recurring']");
    public int numOfProduct=Hooks.driver.findElements(By.xpath("//h2[@class='product-title']")).size();

    public void openSearch(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        clickButton(btn_productSearch);
    }

    public void searchProduct(String name){
        sendText(btn_productSearch,name);
        clickButton(btn_Search);
    }
    String product;
    public void VerifyProduct(String name){
        List<WebElement> elements=Hooks.driver.findElements(By.xpath("//h2[@class='product-title']"));
        System.out.println("Number of elements:" +elements.size());
        for(int i=0; i<elements.size(); i++) {
            String product = elements.get(i).getText();
            System.out.println(product);
        }
    }

    public void navigateToLink() {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
    }
    public String returnText(){

        return getText(txt_SKU);
    }
    public boolean isDisplaySku(){

        return isDisplay(txt_SKU);
    }

    public String getCurrentUrl(){

        return Hooks.driver.getCurrentUrl();
    }

    public boolean isDisplayPic1(){

        return isDisplay(txt_Pic1);
    }
    public boolean isDisplayPic2(){

        return isDisplay(txt_Pic2);
    }
    public boolean isDisplayPic3(){

        return isDisplay(txt_Pic3);
    }

    public void clickButton(By element){

        Hooks.driver.findElement(element).click();
    }

    public void sendText(By element,String value){

        Hooks.driver.findElement(element).sendKeys(value);
    }
    public String getText(By element){

        return Hooks.driver.findElement(element).getText();
    }
    public boolean isDisplay(By element){
        return Hooks.driver.findElement(element).isDisplayed() ;
    }
}
