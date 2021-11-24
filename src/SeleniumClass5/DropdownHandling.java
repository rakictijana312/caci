package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandling {
    public static String url="http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDD= driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDD);// create object of select class

//        select.selectByIndex(2);//by index
//        Thread.sleep(1000);
//
//        select.selectByVisibleText("Wednesday"); //by visible text
//        Thread.sleep(1000);
//
//        select.selectByValue("Sunday"); //by value
//
//
        // how to get size off dropdowns?
          List<WebElement> allOptions = select.getOptions();
          int size=allOptions.size();
          System.out.println(size);

         //how we getting all text
          for(int i=0 ; i<size; i++){
          String optionText= allOptions.get(i).getText();
              System.out.println(optionText);
              select.selectByIndex(i);
              Thread.sleep(2000);

          }



    }
}
