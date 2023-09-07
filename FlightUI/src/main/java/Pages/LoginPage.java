package Pages;
/**
 * Created by onur on 10/12/21.
 */

import Locators.Locator;
import Xpaths.LoginConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends Locator implements LoginConstants {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void fromTextBox(String name) {
        sleep(1000);
        SendById(fromTextBox,name);
    }

    public void ToTextBox(String name) {
        sleep(1000);
        SendById(toTextBox,name);
    }

    public void ClicktoTextBoxSelectFirst() {
        sleep(1000);
        ClickByXpath(toTextBoxSelectFirst);
    }

    public void ClickFromTextBoxSelectFirst() {
        sleep(1000);
        ClickByXpath(FromTextBoxSelectFirst);
    }

    public void searchList() {
        sleep(1000);
        GetSearchResultList();
    }
}
