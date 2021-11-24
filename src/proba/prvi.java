package proba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prvi {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//for windows add .exe
        WebDriver driver = new ChromeDriver();//lunch the browser
        driver.get("https://google.com/");//navigate to the specific url


    }


}
