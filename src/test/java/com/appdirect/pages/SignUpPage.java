package com.appdirect.pages;

import com.appdirect.common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Ashutosh on 01-Sep-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class SignUpPage {

    private WebDriver driver;
    private By thankyoumsg = By.xpath(".//div[@class='adb-local_alert--content']/h3");
    private By signupbutton = By.name("userSignupButton");
    private By signin = By.name("signin");
    private By email = By.name("emailAddress");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage enterEmail() {

        driver.findElement(email).sendKeys(Helper.generateRandomEmailId());
        return this;
    }

    public SignUpPage clickSignUp() {

        driver.findElement(signupbutton).click();
        return this;
    }

    public SignUpPage verifyRegisterationMessage() {

        WebDriverWait webDriverWait = new WebDriverWait(driver, 8000);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(thankyoumsg));

        String message = driver.findElement(thankyoumsg).getText();
        System.out.println(message);

        Assert.assertEquals(message, "Thanks for registering.");
        return this;
    }

}
