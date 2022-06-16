package pages;

import org.openqa.selenium.By;
import stepDefinations.Hooks;

public class Slider_Page {
    By btn_slide1=By.xpath("//div//a[@class='nivo-control active']");
    By btn_slide2=By.xpath("//div//a[@class='nivo-control']");
    By txt_wordSlide1=By.xpath("//div//a[@class='nivo-control active']");
    By txt_wordSlide2=By.xpath("//div//a[@class='nivo-control']");



    public void  openHomePage(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    public void openSlide1(){
        clickButton(btn_slide1);
    }
    public void openSlide2(){
        clickButton(btn_slide2);
    }
    public void clickButton(By element){
        Hooks.driver.findElement(element).click();
    }
    public String getUrl(){
         return Hooks.driver.getCurrentUrl();
    }
}
