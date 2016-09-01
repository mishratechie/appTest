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
 * Created by Ashutosh on 31-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class MyTestCase extends BrowserBase {

    HomePage homePage;


    @BeforeClass
    public void init() {

        System.setProperty("browser", "chrome");
        System.setProperty("env", "PROD");

    }

    @Test(enabled = false)
    public void mytestcase() throws IOException {

        homePage=new HomePage(driver);
        homePage.clickLogIn()
                .clickSignUpForAnAccount()
                .enterEmail()
                .clickSignUp()
                .verifyRegisterationMessage();






    }
}
