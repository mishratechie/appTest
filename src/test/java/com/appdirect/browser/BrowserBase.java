package com.appdirect.browser;

import com.appdirect.common.Helper;
import com.appdirect.properties.PropertiesInitializer;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ashutosh on 31-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class BrowserBase {

    protected static WebDriver driver;
    protected static String environmentToRun;
    protected static String browserToRun;
    protected static String driverResource;

    @BeforeMethod
    public void startBrowser() throws IOException {

        environmentToRun = System.getProperty("env");
        browserToRun = System.getProperty("browser");
        driverResource = System.getProperty("driverLocation");

        System.out.println("\nenvironmentToRun=" + environmentToRun + "\nbrowserToRun=" + browserToRun + "\ndriverResource=" + driverResource);

        if (browserToRun.equalsIgnoreCase("firefox")) {

            Firefox firefox = new Firefox();
            driver = firefox.getFirefoxDriver();
            driver.manage().window().maximize();
        } else if (browserToRun.equalsIgnoreCase("chrome")) {

            Chrome chrome = new Chrome();
            driver = chrome.getChromeDriver(driverResource);
            driver.manage().window().maximize();
        } else if (browserToRun.equalsIgnoreCase("edge")) {

            MicrosoftEdge microsoftEdge = new MicrosoftEdge();
            microsoftEdge.getIEDriver(driverResource);
            driver.manage().window().maximize();

        }

        // driver.get(PropertiesInitializer.getInstance(BrowserBase.environmentToRun).getBaseURL());

        driver.navigate().to(PropertiesInitializer.getInstance(BrowserBase.environmentToRun).getBaseURL());
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

       /* do {

            verifyPageHasLoaded(driver);

        } while (!verifyPageHasLoaded(driver).equalsIgnoreCase("complete"));*/



    }

    public  String verifyPageHasLoaded(WebDriver driver) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String state = (String) js.executeScript("return document.readystate");
        System.out.println("Page load  : " + state);
        return state;
    }


    @AfterMethod
    public void tearDown() {

        driver.close();
        driver.quit();
    }

}
