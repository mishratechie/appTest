package com.appdirect.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Ashutosh on 02-Sep-16.
 */

/*
*
* We make the PropertiesInitializer a singleton to ensure at a given point we only have one object of the class
* */
public class PropertiesInitializer {


    private static PropertiesInitializer instance;

    private Properties properties;

    private PropertiesInitializer(String ENV) throws FileNotFoundException, IOException {


        this.properties = new Properties();

        File fileUserProp = new File("./src/test/resources/props/" + ENV + ".properties");
        properties.load(new FileInputStream(fileUserProp));
    }

    public static PropertiesInitializer getInstance(String env) throws IOException {
        if (instance == null) {
            instance = new PropertiesInitializer(env);
        }

        return instance;
    }


    public String getBaseURL() {
        return properties.getProperty("base.url");
    }


}
