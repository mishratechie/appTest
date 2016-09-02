package com.appdirect.browser;

import com.appdirect.properties.PropertiesInitializer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ashutosh on 02-Sep-16.
 */

/*
* This is a base class for all available Browsers
* As we want to start the browser with our home page url up for test cases we put this functionality under @BeforeMethod so that we can run this before every method
* */
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
            driver = firefox.getDriver();

        } else if (browserToRun.equalsIgnoreCase("chrome")) {

            Chrome chrome = new Chrome();
            driver = chrome.getDriver(driverResource);

        } else if (browserToRun.equalsIgnoreCase("edge")) {

            MicrosoftEdge microsoftEdge = new MicrosoftEdge();
            microsoftEdge.getDriver(driverResource);


        } else if (browserToRun.equalsIgnoreCase("ie")) {
            InternetExplorer internetExplorer = new InternetExplorer();
            internetExplorer.getDriver(driverResource);

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(PropertiesInitializer.getInstance(BrowserBase.environmentToRun).getBaseURL());
        driver.manage().window().maximize();

    }


    @AfterMethod
    public void tearDown() {

        driver.close();
        driver.quit();
    }

}
