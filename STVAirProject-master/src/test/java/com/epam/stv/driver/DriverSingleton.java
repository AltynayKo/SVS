package com.epam.stv.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleton {
    private static WebDriver driver;
    private DriverSingleton(){}
    public static WebDriver getDriver(){
        String name = "firefox";
        if (driver==null) {
            switch (name) { //System.getProperty("browser")
                case "firefox": {
                    driver = new FirefoxDriver();
                    break;
                }
                case "edge": {
                    driver = new EdgeDriver();
                    break;
                }
                default: {
                    driver = new ChromeDriver();
                }
            }
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
