package com.appdirect.tests;

import com.appdirect.browser.BrowserBase;
import com.appdirect.pages.HomePage;
import com.appdirect.pages.LoginPage;
import com.appdirect.pages.SignUpPage;
import com.appdirect.properties.PropertiesInitializer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Ashutosh on 02-Sep-16.
 */

public class MyTestCase extends BrowserBase {

    HomePage homePage;

    //Uncomment if you want to debug it without using surefire debugger

  /*@BeforeClass
    public void init() {

        System.setProperty("browser", "chrome");
        System.setProperty("env", "PROD");

    }
*/
    /*
    * Here in the below test case we only create the object of home page and rest object creation of the pages are taken care by the page object method which on click will move to other page
    * I have tried to stick to fluent programming principles making the code readable enough.
    * */
    @Test(enabled = true)
    public void mytestcase() throws IOException {

        homePage = new HomePage(driver);
        homePage.clickLogIn()
                .clickSignUpForAnAccount()
                .enterEmail()
                .clickSignUp()
                .verifyRegisterationMessage();

    }

}
