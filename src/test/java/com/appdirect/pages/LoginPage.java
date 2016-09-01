package com.appdirect.pages;

import com.appdirect.common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ashutosh on 01-Sep-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class LoginPage {

    private WebDriver driver;
    private By signupforaccount = By.linkText("Sign up for an account");
    private By signup = By.name("Sign Up");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage clickSignUpForAnAccount() {

        driver.findElement(signupforaccount).click();
        return new SignUpPage(driver);
    }
}
