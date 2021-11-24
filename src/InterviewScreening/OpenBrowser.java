package InterviewScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        // set the property for chrome driver, specify its location via the webdriver.chrome.driver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // instantiate an instance of ChromeDriver, which will be driving our browser:
        WebDriver driver = new ChromeDriver();

        // navigate to the specific url
        driver.get("http://google.com");
    }}

