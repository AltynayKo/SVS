package com.epam.stv.design;

import com.epam.stv.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.epam.stv.locators.AirProjectLocators.START_URL;
import static com.epam.stv.locators.AirProjectLocators.GREEN_PANEL;

/**
 * Created by Tatiana_Sauchanka on 10/11/2017.
 */
public class BasicTest {
    protected WebDriver driver;


    @BeforeClass(description = "Start browser")
    public void setUp() {
        driver = DriverSingleton.getDriver();
        driver.get(START_URL);

        WebElement expectedElement = (new WebDriverWait(driver, Duration.ofSeconds(50))).
                until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver webDriver) {
                        return webDriver.findElement(GREEN_PANEL);
                    }
                });
    }


    /*@BeforeClass (dependsOnMethods = "setUp" )
    public void enableJavaScript(){
    }*/

    /*@BeforeClass (dependsOnMethods = "setUp" )
    public void catchaHadnle(){

    }

/*    @BeforeClass(dependsOnMethods = "setUp", description = "Add implicite wait and maximize window")
    public void addImplicitly() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
*/
    //auto test fix
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        DriverSingleton.closeDriver();
    }

    }

