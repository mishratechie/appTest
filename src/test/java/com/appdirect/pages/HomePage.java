package com.appdirect.pages;

import com.appdirect.browser.BrowserBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ashutosh on 31-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class HomePage {

    private WebDriver driver;
    private By login = By.linkText("Log In");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogIn() {

        driver.findElement(login).click();
        return new LoginPage(driver);
    }


}
