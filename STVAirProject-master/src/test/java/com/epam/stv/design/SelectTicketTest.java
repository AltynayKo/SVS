package com.epam.stv.design;

import com.epam.stv.pages.AirDefaultPage;
import com.epam.stv.pages.AirHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.stv.locators.AirProjectLocators.FROM_TEXT;


/**
 * Created by Tatti on 14.10.2017.
 */
//The test is related to test-cases#2, 8
public class SelectTicketTest extends BasicTest {

    @Test
    public void clickOnOtherCountryLink() {
        new AirDefaultPage(driver).clickOnOtherCountryLink();
    }

    @Test(dependsOnMethods = {"clickOnOtherCountryLink"})
    public void assertWantToGoPanelIsDisplayed() {
        boolean b = new AirHomePage(driver).isWantToGoPanelDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test(dependsOnMethods = {"assertWantToGoPanelIsDisplayed"})
    public void assertFromFieldIsDisplayed() {
        boolean b = new AirHomePage(driver).isFromFieldDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test(dependsOnMethods = {"assertFromFieldIsDisplayed"})
    public void inputFromPlace() {
        new AirHomePage(driver).inputIntoFromField(FROM_TEXT);
    }

    @Test(dependsOnMethods = {"inputFromPlace"})
    public void inputDestinationPlace() {
        String destinationText = "Paris";
        new AirHomePage(driver).inputIntoToField(destinationText);
    }

    @Test(dependsOnMethods = {"inputDestinationPlace"})
    public void clickOnPassengersContainer() {
        new AirHomePage(driver).clickOnPassengersContainer();
    }

    @Test(dependsOnMethods = {"clickOnPassengersContainer"})
    public void assertIsPassengersPanelDisplayed() {
        boolean b = new AirHomePage(driver).isPassengersPanelDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test(dependsOnMethods = {"assertIsPassengersPanelDisplayed"})
    public void clickOnPlusAdultsIcon() {
        new AirHomePage(driver).clickOnPlusAdultsIcon();
    }

    @Test(dependsOnMethods = {"clickOnPlusAdultsIcon"})
    public void clickOnPlusChildrenIcon() {
        new AirHomePage(driver).clickOnPlusChildrenIcon();
    }
//    need to assert increasing

    //    need to investigate
    @Test(dependsOnMethods = {"clickOnPlusChildrenIcon"})
    public void clickOnSaveButton() {
        new AirHomePage(driver).clickOnSaveButton();
    }

    @Test(dependsOnMethods = {"assertFromFieldIsDisplayed"})
    public void assertSearchIsDisplayed() {
        boolean b = new AirHomePage(driver).isSearchEnabled();
        Assert.assertEquals(b, true);
    }


}
