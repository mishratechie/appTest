package com.appdirect.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Ashutosh on 31-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class MicrosoftEdge {

    public static WebDriver driver=null;


    public WebDriver getIEDriver(String driverResource){

        System.out.println("launching Edge browser");
        System.setProperty("webdriver.edge.driver", driverResource+"/MicrosoftWebDriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        return driver=new InternetExplorerDriver();
    }
}
