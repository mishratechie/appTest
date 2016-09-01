package com.appdirect.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ashutosh on 31-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class Firefox {


    public static  WebDriver driver=null;


    public WebDriver getFirefoxDriver() {

        System.out.println("launching Firefox browser");
        return driver=new FirefoxDriver();
    }


}
