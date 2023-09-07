package Tests;


import Dictionary.Constants;
import Pages.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class MainTest extends InitialTest implements Constants {

    WebDriverWait wait;
    WebDriver driver;

    @Test
    public void T01_FlightSearchErrorForSameInputFromTo(){

        logger.info("Case 1 : User enters same values for from and to areas");

        LoginPage loginPage = homePage.loginPage();

        loginPage.fromTextBox(fromText_Istanbul);
        loginPage.ClicktoTextBoxSelectFirst();

        loginPage.ToTextBox(toText_Istanbul);
        loginPage.ClickFromTextBoxSelectFirst();

        logger.info("Case 1 : User can enters same values for from and to areas. This is bug.");
        // Buraya ne yazabilirim ??
    }


    @Test
    public void T02_FlightNumberAndFlightsAreListed(){

        logger.info("Case 2 : The user enters different from and to areas. It is seen that the number of flights and flights are listed.");

        LoginPage loginPage = homePage.loginPage();

        loginPage.fromTextBox(fromText_Istanbul);
        loginPage.ClicktoTextBoxSelectFirst();

        loginPage.ToTextBox(toText_Los_Angeles);
        loginPage.ClickFromTextBoxSelectFirst();

        loginPage.searchList();
    }

    @Test
    public void T03_FlightNumberAndFlightsAreNotListed(){

        logger.info("Case 3 : The user enters different from and to areas. It is seen that the number of flights and flights are not listed.");

        LoginPage loginPage = homePage.loginPage();

        loginPage.fromTextBox(fromText_Istanbul);
        loginPage.ClicktoTextBoxSelectFirst();

        loginPage.ToTextBox(toText_New_York);
        loginPage.ClickFromTextBoxSelectFirst();

        loginPage.searchList();
    }
}
