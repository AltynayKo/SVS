package com.epam.stv.design;

import com.epam.stv.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.stv.locators.AirProjectLocators.*;

/**
 * Created by Tatti on 15.10.2017.
 */

//The test is related to test-case#4
public class AirBookingDetailsTest extends ManageBookingTest {

    @Test(dependsOnGroups = "manageBooking")
    public void clickOnBookingDetailsLink() {
        new AirBookingOverviewPage(driver).clickOnBookingDetailsLink();
    }

    @Test(dependsOnMethods = {"clickOnBookingDetailsLink"})
    public void assertAirBookingDetailsPageOpened() {
        String registerURL = new AirBookingOverviewPage(driver).assertCurrentURL();
        Assert.assertEquals(registerURL, BOOKING_DETAILS_PAGE_URL);
    }

    @Test(dependsOnMethods = {"assertAirBookingDetailsPageOpened"})
    public void scrollThePage() {
        new AirBookingDetailsPage(driver).scrollPage();
    }

    @Test(dependsOnMethods = {"scrollThePage"})
    public void assertPriceBreakDownPanelVisible() {
        boolean b = new AirBookingDetailsPage(driver).isPriceBreakDownSectionDisplayed();
        Assert.assertEquals(b, true);
    }


}
