package com.epam.stv.design;

import com.epam.stv.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.stv.locators.AirProjectLocators.AIR_SEARCH_PAGE;
import static com.epam.stv.locators.AirProjectLocators.OUTBOUND_FROM_TEXT;

/**
 * Created by Tatti on 15.10.2017.
 */

//The test is related to test-case#9
public class MultipleDestinationTest extends AirDefaultPageTest {

    @Test(dependsOnGroups = "beginner")
    public void inspectWantToGoPanelIsDisplayed() {
        boolean b = new AirHomePage(driver).isWantToGoPanelDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test(dependsOnMethods = "inspectWantToGoPanelIsDisplayed")
    public void clickOnBookingDetailsLink(){
        new AirHomePage(driver).clickOnMultiDestinationLink();
    }

    @Test (dependsOnMethods = {"clickOnBookingDetailsLink"})
    public void inspectAirSearchPageOpened(){
        String registerURL = new AirSearchPage(driver).assertCurrentURL();
        Assert.assertEquals(registerURL,AIR_SEARCH_PAGE);
    }

    @Test (dependsOnMethods = {"inspectAirSearchPageOpened"})
    public void inspectSearchPanelIsDisplayed() {
        boolean b = new AirSearchPage(driver).isSearchPanelDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test(dependsOnMethods = {"inspectSearchPanelIsDisplayed"})
    public void inputOutbountFromtText() {
        new AirSearchPage(driver).inputOutboundFromField(OUTBOUND_FROM_TEXT);
    }

}
