package com.appdirect.pages;

import com.appdirect.common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Ashutosh on 01-Sep-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class SignUpPage {
    private WebDriver driver;
    private By thankyoumsg = By.xpath("//div[@class='adb-local_alert--content']/h3");
    private By signupbutton = By.name("userSignupButton");
    private By signin = By.name("signin");
    private By email = By.name("emailAddress");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    public SignUpPage enterEmail(){

        driver.findElement(email).sendKeys(Helper.generateRandomEmailId());
        System.out.println("clickSignUpForAnAccount - Performed");
        return this;
    }
    public SignUpPage clickSignUp(){

        driver.findElement(signupbutton).click();
        System.out.println("signupbutton - Performed");
        return this;
    }
    public SignUpPage verifyRegisterationMessage(){

        String message=driver.findElement(thankyoumsg).getText();
        System.out.println(message);

        Assert.assertEquals(message,"Thanks for registering.");
        return this;
    }

}
