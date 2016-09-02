package com.appdirect.pages;

import com.appdirect.browser.BrowserBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ashutosh on 02-Sep-16.
 */


public class HomePage {

    private WebDriver driver;
    private By login = By.linkText("Log In");

    public HomePage(WebDriver driver) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, 5000);
        webDriverWait.until(ExpectedConditions.urlContains("appdirect"));
        String url = driver.getCurrentUrl();
        if(!url.contains("appdirect.com"))
        {
            System.err.println("This is not the HOME page");
        }
        this.driver = driver;
    }

    public LoginPage clickLogIn() {

        driver.findElement(login).click();
        return new LoginPage(driver);
    }


}
