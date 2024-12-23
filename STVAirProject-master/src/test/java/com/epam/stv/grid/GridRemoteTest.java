package com.epam.stv.grid;

import com.epam.stv.pages.AirDefaultPage;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.epam.stv.locators.AirProjectLocators.START_URL;
/**
 * Created by Tatti on 11.10.2017.
 */
public class GridRemoteTest {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }

    private static void setDriver() {
        //        appropriate System Variables have already added

//        String exePath = "C:\\Chromedriver\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", exePath);


    /*    DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        capabilities.setPlatform(Platform.WINDOWS);
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setPlatform(Platform.WINDOWS);
//        try {
//            driver = new RemoteWebDriver(new 	URL("http://localhost:4444/wd/hub"), capabilities);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

    }

    @BeforeClass(description = "Start browser")
    public void startBrowser() {
        driver = getDriver();
        driver.get(START_URL);
    }

    @BeforeClass(dependsOnMethods = "startBrowser", description = "Add implicit wait and maximize window")
    public void addImplicitly() {
        // set a certain implicit wait timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Maximize browser window
        driver.manage().window().maximize();
    }

    @Test
    public void clickOnOtherCountryLink(){
        new AirDefaultPage(driver).clickOnOtherCountryLink();


     */
    }
}
