package com.appdirect.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ashutosh on 02-Sep-16.
 */
public class LoginPage {

    private WebDriver driver;
    private By signupforaccount = By.linkText("Sign up for an account");
    private By signup = By.name("Sign Up");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5000);
        webDriverWait.until(ExpectedConditions.urlContains("login"));
        String url = driver.getCurrentUrl();
        if(!url.contains("login"))
        {
            System.err.println("This is not the HOME page");
            throw new IllegalStateException("This is not required page, current page is: "+driver.getCurrentUrl());
        }

    }

    public SignUpPage clickSignUpForAnAccount() {

        driver.findElement(signupforaccount).click();
        return new SignUpPage(driver);
    }
}
