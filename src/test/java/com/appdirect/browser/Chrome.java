package com.appdirect.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chrome {

    public static WebDriver driver;


    public WebDriver getChromeDriverAtSpecificLocation(String ChromeApp, String driverResource) {

        //e.g. ChromeApp="C:/Program Files (x86)/Google/Chrome/Application/chrome.exe";
        System.setProperty("webdriver.chrome.driver", driverResource + "/chromedriver.exe");
        System.setProperty("webdriver.chrome.logfile", "ChromeDriver/chromedriver.log");
        ChromeOptions options = new ChromeOptions();
        options.setBinary(ChromeApp);
        options.addArguments("--no-sandbox");
        options.addArguments("start-maximized");


        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        return driver = new ChromeDriver(capabilities);
    }

    public WebDriver getChromeDriver(String driverResource) {

        System.out.println("launching Chrome browser");
        System.setProperty("webdriver.chrome.driver", driverResource + "/chromedriver.exe");
        return driver = new ChromeDriver();

    }


}
