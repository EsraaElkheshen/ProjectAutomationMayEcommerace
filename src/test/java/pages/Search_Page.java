package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinations.Hooks;

import java.util.ArrayList;
import java.util.List;

public class Search_Page {
    By btn_productSearch= By.xpath("//input[@id='small-searchterms']");
    By btn_Search= By.xpath("//button[@type='submit']");
    By txt_SKU= By.xpath("//div//span[@id='sku-4' and text()='AP_MBP_13']");
    By btn_product=By.xpath("//h2//a[@href='/apple-macbook-pro-13-inch']");


    public void openSearch(){

        clickButton(btn_productSearch);
    }
    public void searchProduct(String name){
        sendText(btn_productSearch,name);

    }
    public void pressSearch(){
        clickButton(btn_Search);
    }
    String product;
    public String verifyName(){
        List<WebElement> elements=Hooks.driver.findElements(By.xpath("//h2[@class='product-title']"));
        System.out.println("Number of elements:" +elements.size());
        for(int i=0; i<elements.size(); i++){
            String product=elements.get(i).getText();
            System.out.println(product);
        }
        return product;
    }

    public boolean vervifySearch() {
        List<WebElement> elements = Hooks.driver.findElements(By.xpath("//h2[@class='product-title']"));
        System.out.println("Number of elements:" + elements.size());
        for (int i = 0; i < elements.size(); i++) {
            String product = elements.get(i).getText();
            if (product.contains("Apple")) {
                return true;
            }
        }
            return true;
        }




    public void navigateToLink() {
        clickButton(btn_product);
        //Hooks.driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
    }
   public String getCurrentUrl(){

        return Hooks.driver.getCurrentUrl();
   }

public boolean isDisplaySku(){
        return isDisplay(txt_SKU);
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
