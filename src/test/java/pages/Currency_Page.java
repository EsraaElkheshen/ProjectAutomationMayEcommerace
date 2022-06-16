package pages;

 import org.openqa.selenium.By;

 import org.openqa.selenium.JavascriptExecutor;
 import org.openqa.selenium.WebElement;
 import stepDefinations.Hooks;

 import java.util.List;

public class Currency_Page {

     JavascriptExecutor js;
    By drpdwn_Currency= By.xpath("//select//option[text()='Euro']");
    By txt_Feature= By.xpath("//div//*[text()='Featured products']");
    By List_Element= By.xpath("//span[@class='price actual-price']");


   public void navigateToCurrency() {
      clickButton(drpdwn_Currency);
  }
  public void scrollDown(){
      scrollDownPage();
  }
  String EuroCurrency;
     public String validateCurrency(){
         List<WebElement> elements=Hooks.driver.findElements(By.xpath("//span[@class='price actual-price']"));
         System.out.println("Number of elements:" +elements.size());
         for(int i=0; i<elements.size(); i++){
              EuroCurrency=elements.get(i).getText();
             System.out.println(EuroCurrency);
     }
         return EuroCurrency;
     }


   public void scrollDownPage(){
        js = (JavascriptExecutor) Hooks.driver;
       js.executeScript("window.scrollBy(0,250)", "");

  }



    public void clickButton(By element){

        Hooks.driver.findElement(element).click();
    }
    public void sendText(By element,String value){

        Hooks.driver.findElement(element).sendKeys(value);
    }

}
