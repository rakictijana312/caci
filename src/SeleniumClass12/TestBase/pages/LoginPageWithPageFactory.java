package SeleniumClass12.TestBase.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reviewSelenium4.CommonMethods;

import java.util.List;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@id = 'txtPassword']")
    public WebElement passwordTextBox;

    @FindBy(css = "input#btnLogin")
    public WebElement loginBtn;

//    @FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr")
//    public List<WebElement> tableRows;

    public LoginPageWithPageFactory() {
        WebDriver driver;
    //    PageFactory.initElements(driver, this);
    }

}