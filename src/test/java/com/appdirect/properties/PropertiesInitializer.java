package com.appdirect.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Ashutosh on 30-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class PropertiesInitializer {


    private static PropertiesInitializer instance =null;



    private Properties properties = null;

    private PropertiesInitializer(String ENV) throws FileNotFoundException, IOException{


        this.properties=new Properties();

        File fileUserProp = new File("./src/test/resources/props/"+ENV+".properties");
        //String pathUserProp = fileUserProp.getAbsolutePath();
        //System.out.println(pathUserProp);
        properties.load(new FileInputStream(fileUserProp));
    }

    public static PropertiesInitializer getInstance(String env) throws FileNotFoundException, IOException{
        if(instance==null){
            instance=new PropertiesInitializer(env);
        }

        return instance;
    }



    public  String getBaseURL(){
        return properties.getProperty("base.url");
    }



}
