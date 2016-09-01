package com.appdirect.common;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ashutosh on 31-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class Helper {

    public static String generateRandomEmailId() {

        String emailID = RandomStringUtils.randomAlphabetic(8);
        String email = emailID + "@yopmail.com";
        System.out.println(email);
        return email;
    }
}
