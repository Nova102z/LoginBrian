package com.automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    public static Properties prop;

    public static void initProperties(){
        FileInputStream fs = null;
        try{
            fs = new FileInputStream("src/test/resources/data/configuration.properties");
            prop = new Properties();
            prop.load(fs);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String str){
        return prop.getProperty(str);
    }
}
