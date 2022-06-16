package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import stepDefinations.Hooks;

public class HoverCateogary {
    Actions actions;
    By btn_Category= By.xpath("//ul[@class='top-menu notmobile']//li//a[text()='Computers ']");
    By btn_subCategory= By.xpath("(//div//button[@title='Add to wishlist'])[3]");


    public void selectCategory() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        actions = new Actions(Hooks.driver);
        actions.moveToElement(Hooks.driver.findElement(btn_Category)).build().perform();
    }
    public void selectSubCategory(){
        actions.moveToElement(Hooks.driver.findElement(btn_Category)).build().perform();
        //actions.moveToElement(Hooks.driver.findElement(btn_Category)).moveToElement(Hooks.driver.findElement(txt_subCategory))
        // .click().build().perform();
    }
    public void pressSubCategory(){
        clickOnButton(btn_subCategory);

    }
    public void clickOnButton(By element){
        Hooks.driver.findElement(element).click();
    }
    public String GetTextSubCateogary(){
         String text= getText(btn_subCategory).toLowerCase().trim();
        System.out.println(text);
         return text;

    }
    public String getText(By element){

        return Hooks.driver.findElement(element).getText();
    }


}
