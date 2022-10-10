package com.automation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverUtils {

    static WebDriver driver;

    public static void initDriver(){

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
        options.addArguments(" --disable-blink-features=AutomationControlled");
        options.addArguments("--incognito");
        options.merge(options);


        switch(ConfigReader.getProperty("du.browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get(ConfigReader.getProperty("url"));
    }

    public static WebDriver getDriver(){
        return driver;
    }



}
