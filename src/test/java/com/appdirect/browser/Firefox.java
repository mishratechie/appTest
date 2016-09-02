package com.appdirect.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ashutosh on 02-Sep-16.
 */

/*
* Contains Firefox browser initialization code
* */
public class Firefox {


    public static WebDriver driver = null;

    public WebDriver getDriver() {

        System.out.println("launching Firefox browser");
        return driver = new FirefoxDriver();
    }


}
