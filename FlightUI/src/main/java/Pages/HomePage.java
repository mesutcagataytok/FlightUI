package Pages;
/**
 * Created by onur on 10/12/21.
 */

import Locators.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Locator {

    private WebDriverWait wait;
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public LoginPage loginPage() {

        sleep(1000);
        return new LoginPage(driver);
    }

}
