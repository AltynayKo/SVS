package com.epam.stv.design;

import com.epam.stv.pages.AirDefaultPage;
import com.epam.stv.pages.AirHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Tatiana_Sauchanka on 10/11/2017.
 */

//The test is related to test-case#1
import static com.epam.stv.locators.AirProjectLocators.HOME_PAGE_URL;

public class AirDefaultPageTest extends BasicTest {

    @Test (groups={"beginner"})
    public void assertOtherCountryItemIsDisplayed() {
        boolean b = new AirDefaultPage(driver).isOtherCountryItemDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test (groups={"beginner"},dependsOnMethods = {"assertOtherCountryItemIsDisplayed"})
    public void clickOnOtherCountryLink(){
       new AirDefaultPage(driver).clickOnOtherCountryLink();
    }

    @Test (groups={"beginner"},dependsOnMethods = {"clickOnOtherCountryLink"})
    public void inspectAirHomePageOpened(){
        String registerURL = new AirHomePage(driver).assertCurrentURL();
        Assert.assertEquals(registerURL,HOME_PAGE_URL);
    }
}


