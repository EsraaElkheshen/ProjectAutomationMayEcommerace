package pages;

import org.openqa.selenium.By;
import stepDefinations.Hooks;

import java.util.ArrayList;

public class Follow_Page {

    By btn_facebook= By.xpath("//a[@href='http://www.facebook.com/nopCommerce']");
    By btn_Tiwtter= By.xpath("//a[@href='https://twitter.com/nopCommerce']");
    By btn_Rss= By.xpath("//a[@href='/news/rss/1']");
    By btn_youTube= By.xpath("//a[@href='http://www.youtube.com/user/nopCommerce']");

    ArrayList<String>Tab;

    public void scroll(){
    }
    public void switchTofacebook() throws InterruptedException {
        clickButton(btn_facebook);
        Thread.sleep(1000);
        Tab=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tab.get(1));
        System.out.println( Hooks.driver.getCurrentUrl());
        System.out.println( Hooks.driver.getTitle());
    }
    public void closefacebook() throws InterruptedException {
        Thread.sleep(1000);
        Tab=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tab.get(0));
    }

    public void switchToTiwtter() throws InterruptedException {
        clickButton(btn_Tiwtter);
        Thread.sleep(1000);
        Tab=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tab.get(1));
        System.out.println( Hooks.driver.getCurrentUrl());
        System.out.println( Hooks.driver.getTitle());
    }
    public void closeTiwtter() throws InterruptedException {
        Thread.sleep(1000);
        Tab=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tab.get(0));
    }

    public void switchToRss() throws InterruptedException {
        clickButton(btn_Rss);
        Thread.sleep(1000);
        Tab=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tab.get(1));
        System.out.println( Hooks.driver.getCurrentUrl());
        System.out.println( Hooks.driver.getTitle());
    }
    public void closeRss() throws InterruptedException {
        Thread.sleep(1000);
        Tab=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tab.get(0));
    }

    public void switchToyouTube() throws InterruptedException {
        clickButton(btn_youTube);
        Thread.sleep(1000);
        Tab=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tab.get(1));
        System.out.println( Hooks.driver.getCurrentUrl());
        System.out.println( Hooks.driver.getTitle());
    }
    public void closeyouTube() throws InterruptedException {
        Thread.sleep(1000);
        Tab=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tab.get(0));
    }


    public void clickButton(By element) {
        Hooks.driver.findElement(element).click();
    }
    public void openHomePage(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");

    }
    public String getCurentURL(){
        return  Hooks.driver.getCurrentUrl();
    }

}
