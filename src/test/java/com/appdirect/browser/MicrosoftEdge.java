package com.appdirect.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Ashutosh on 02-Sep-16.
 */

/*
* Contains MicrosoftEdge browser initialization code
* */
public class MicrosoftEdge{

    public static WebDriver driver = null;

    public WebDriver getDriver(String driverResource) {

        System.out.println("launching Edge browser");
        System.setProperty("webdriver.edge.driver", driverResource + "/MicrosoftWebDriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        return driver = new InternetExplorerDriver();
    }
}
