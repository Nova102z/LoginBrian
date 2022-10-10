package com.automation.stepdef;


import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {


    @Before
    public void setUp(){
        ConfigReader.initProperties();
        DriverUtils.initDriver();

    }

    @After
    public void quit(){
        DriverUtils.getDriver().quit();
    }
}
