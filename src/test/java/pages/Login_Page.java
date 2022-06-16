package pages;

import org.openqa.selenium.By;
import stepDefinations.Hooks;

public class Login_Page {
    By btn_LoginLink= By.linkText("Log in");
    By btn_Email= By.xpath("//input[@id='Email']");
    By btn_Password= By.xpath("//input[@id='Password']");
    By Btn_Login= By.xpath("//button[@type='submit' and @class='button-1 login-button']");
    By Btn_MyAccount= By.linkText("My account");

  public void openLoginLink(){
      Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
      clickButton(btn_LoginLink);
  }
  public void enterEmailAndPassword(String EmailText,String PasswordText){
      sendText(btn_Email,EmailText);
      sendText(btn_Password,PasswordText);
  }
  public void pressLoginButton(){

      clickButton(Btn_Login);
  }

  public String getCurrentUrl(){

      return Hooks.driver.getCurrentUrl();
  }

  public boolean isDisplayMyAccount(){
      return isDisplay(Btn_MyAccount);
  }
    public void clickButton(By element){

        Hooks.driver.findElement(element).click();
    }
    public void sendText(By element,String Value){

        Hooks.driver.findElement(element).sendKeys(Value);
    }
    public boolean isDisplay(By element){
        return Hooks.driver.findElement(element).isDisplayed();

    }
}