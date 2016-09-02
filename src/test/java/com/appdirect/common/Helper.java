package com.appdirect.common;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ashutosh on 02-Sep-16.
 */

/*
* This class contains all the static methods which has unit responsibility
* */
public class Helper {

    public static String generateRandomEmailId() {

        String emailID = RandomStringUtils.randomAlphabetic(8);
        String email = emailID + "@yopmail.com";
        System.out.println(email);
        return email;
    }

    public static String jScriptExecutor(WebDriver driver, String jscript) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String jScriptResult = (String) js.executeScript("return " + jscript);

        return jScriptResult;

    }

}
