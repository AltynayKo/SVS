package com.epam.stv.design;

import com.epam.stv.pages.AirBookingOverviewPage;
import com.epam.stv.pages.AirDefaultPage;
import com.epam.stv.pages.AirHomePage;
import com.epam.stv.pages.AirLogonPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.stv.locators.AirProjectLocators.*;

/**
 * Created by Tatti on 13.10.2017.
 */

//The test is related to test-case#3
public class ManageBookingTest extends BasicTest {

    @Test (groups={"manageBooking"})
    public void clickOnOtherCountryLink(){
        new AirDefaultPage(driver).clickOnOtherCountryLink();
    }

    @Test (groups={"manageBooking"},dependsOnMethods = {"clickOnOtherCountryLink"})
    public void assertWantToGoPanelIsDisplayed() {
        boolean b = new AirHomePage(driver).isWantToGoPanelDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test (groups={"manageBooking"},dependsOnMethods = {"assertWantToGoPanelIsDisplayed"})
    public void clickOnManageYourBookingItem(){
        new AirHomePage(driver).clickOnManageYourBookingItem();
    }

//    need to add waiting
    @Test (groups={"manageBooking"},dependsOnMethods = {"clickOnManageYourBookingItem"})
    public void assertBookingIconIsDisplayed() {
        boolean b = new AirHomePage(driver).isBookingIconDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test (groups={"manageBooking"},dependsOnMethods = {"assertBookingIconIsDisplayed"})
    public void clickOnBookingIcon(){
        new AirHomePage(driver).clickOnBookingIcon();
    }

    @Test (groups={"manageBooking"},dependsOnMethods = {"clickOnBookingIcon"})
    public void inspectAirLogonPageOpened(){
        String registerURL = new AirLogonPage(driver).assertCurrentURL();
        Assert.assertEquals(registerURL,LOGON_PAGE_URL);
    }

    @Test (groups={"manageBooking"},dependsOnMethods = {"inspectAirLogonPageOpened"})
    public void assertViewBookingPanelDisplayed(){
        boolean b = new AirLogonPage(driver).isViewBookingPanelDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test(groups={"manageBooking"},dependsOnMethods = {"inputFlightDate"})
    public void inputBookingNumber() {
        new AirLogonPage(driver).inputBookingNumber(BOOKING_NUMBER);
    }

    @Test(groups={"manageBooking"},dependsOnMethods = {"inputBookingNumber"})
    public void inputLastName() {
        new AirLogonPage(driver).inputLastName(LAST_NAME);
    }

    @Test(groups={"manageBooking"},dependsOnMethods = {"assertViewBookingPanelDisplayed"})
    public void inputFlightDate() {
        new AirLogonPage(driver).inputDate(FLIGHT_DATE);
    }

    @Test (groups={"manageBooking"},dependsOnMethods = {"inputLastName"})
    public void clickOnViewBookingButton(){
        new AirLogonPage(driver).pressBookingButton();
    }

    @Test (groups={"manageBooking"},dependsOnMethods = {"clickOnViewBookingButton"})
    public void assertAirBookingOverviewPageOpened(){
        String registerURL = new AirBookingOverviewPage(driver).assertCurrentURL();
        Assert.assertEquals(registerURL,BOOKING_OVERVIEW_PAGE_URL);
    }


}
