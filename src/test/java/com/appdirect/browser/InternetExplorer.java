package com.appdirect.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Ashutosh on 02-Sep-16.
 */

/*
* Contains InternetExplorer browser initialization code
* */
public class InternetExplorer {

    public static WebDriver driver = null;

    public WebDriver getDriver(String driverResource) {

        System.out.println("launching IE browser");
        System.setProperty("webdriver.ie.driver", driverResource + "/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        return driver = new InternetExplorerDriver();
    }
}
