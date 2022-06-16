package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import stepDefinations.Hooks;

public class Register_Page {
    public Select select;
    By btn_RegisterLink= By.linkText("Register");
    By btn_Gender= By.xpath("//input[@id='gender-female']");
    By txtbox_firstName= By.xpath("//input[@id='FirstName']");
    By txtbox_lastName= By.xpath("//input[@id='LastName']");
    By drpdown_Day= By.xpath("//select[@name='DateOfBirthDay']");
    By txtbox_Month= By.xpath("//select[@name='DateOfBirthMonth']");
    By txtbox_Year= By.xpath("//select[@name='DateOfBirthYear']");
    By txt_Email= By.xpath("//input[@id='Email']");
    By txt_companyName= By.xpath("//input[@id='Company']");
    By txt_Password= By.xpath("//input[@id='Password']");
    By txt_confirmPassword= By.xpath("//input[@id='ConfirmPassword']");
    By btn_Register= By.xpath("//button[@id='register-button']");
    public By txt_sucessMessage= By.xpath("//div[text()='Your registration completed']");
    By btn_Contiue= By.xpath("//a[@class='button-1 register-continue-button']");
    By btn_LogOut= By.linkText("Log out");

    public void openRegisterLink(){

        clickButton(btn_RegisterLink);
    }
    public void enterPersonalData(String firstname,String lastname,int day,
                                  int month, String year,String email,String company)
    {
        clickButton(btn_Gender);
        sendText(txtbox_firstName,firstname);
        sendText(txtbox_lastName,lastname);
        selectByIndex(drpdown_Day,day);
        selectByIndex(txtbox_Month,month);
        selectByVisibleText(txtbox_Year,year);
        sendText(txt_Email,email);
        sendText(txt_companyName,company);
    }
    public void enterPassword(String password)
    {
        sendText(txt_Password,password);
        sendText(txt_confirmPassword,password);
    }
    public void pressOnRegisterButton() {
        clickButton(btn_Register);
    }
    public boolean issucessMessageDisplay(){
        return isDisplay(txt_sucessMessage);

    }
    public void cotinue(){

        clickButton(btn_Contiue);
    }

    public void sendText(By element,String Value){

        Hooks.driver.findElement(element).sendKeys(Value);
    }
    public boolean isDisplay(By element){
        return Hooks.driver.findElement(element).isDisplayed();

    }
    public void clickButton(By element){

        Hooks.driver.findElement(element).click();
    }

    public void selectByIndex(By element,int number){
        select=new Select(Hooks.driver.findElement(element));
        select.selectByIndex(number);
    }

    public void selectByVisibleText(By element,String text){
        select=new Select(Hooks.driver.findElement(element));
        select.selectByVisibleText(text);
    }

    public void selectByText(By element,String value){
        select=new Select(Hooks.driver.findElement(element));
        select.selectByValue(value);
    }
    public String GetCssColour(By element) {
       // String Colour = Hooks.driver.findElement(element).getCssValue("color");
        String hex = Color.fromString(Hooks.driver.findElement(element).getCssValue("color")).asHex();
        return hex;

    }
    public void userLogOut(){
        clickButton(btn_LogOut);
    }

 
}
