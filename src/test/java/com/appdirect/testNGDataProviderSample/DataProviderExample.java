package com.appdirect.testNGDataProviderSample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Ashutosh on 9/21/2016.
 */
public class DataProviderExample {

    @DataProvider(name="my-data")
    public Object[][] dataproviderMethod(){

        return new Object[][]{{"data one"},{"data two"}};
    }

    //This will get data from same class
    @Test(enabled = false,dataProvider = "my-data")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }

    //This will get data from another class
    @Test(enabled = false,dataProvider = "data-provider",dataProviderClass=SeparateDataProviderClass.class)
    public void testMethod2(String data) {
        System.out.println("Data is: " + data);
    }

    //Print Multiple data //Observe the method parameters
    @Test(enabled = true,dataProvider="getData",dataProviderClass = SeparateDataProviderClass.class)
    public void setData(String username, String password)
    {
        System.out.println("you have provided username as::"+username);
        System.out.println("you have provided password as::"+password);
    }
}
