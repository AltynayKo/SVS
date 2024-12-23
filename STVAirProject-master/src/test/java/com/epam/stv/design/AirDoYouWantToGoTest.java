package com.epam.stv.design;

import com.epam.stv.pages.AirDefaultPage;
import com.epam.stv.pages.AirHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Tatti on 12.10.2017.
 */

//The test is related to test-case#1
public class AirDoYouWantToGoTest extends BasicTest {

    @Test
    public void clickOnOtherCountryLink(){
        new AirDefaultPage(driver).clickOnOtherCountryLink();
    }

    @Test (dependsOnMethods = {"clickOnOtherCountryLink"})
    public void assertWantToGoPanelIsDisplayed() {
        boolean b = new AirHomePage(driver).isWantToGoPanelDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test (dependsOnMethods = {"assertWantToGoPanelIsDisplayed"})
    public void assertFromFieldIsDisplayed() {
        boolean b = new AirHomePage(driver).isFromFieldDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test (dependsOnMethods = {"assertFromFieldIsDisplayed"})
    public void assertToFieldIsDisplayed() {
        boolean b = new AirHomePage(driver).isToFieldDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test (dependsOnMethods = {"assertToFieldIsDisplayed"})
    public void assertDatePickerDisplayed() {
        boolean b = new AirHomePage(driver).isDatePickerDisplayed();
        Assert.assertEquals(b, true);
    }

    @Test (dependsOnMethods = {"assertDatePickerDisplayed"})
    public void assertReturnCheckBoxIsChecked(){
        boolean b = new AirHomePage(driver).isReturnCheckBoxChecked();
        Assert.assertEquals(b, true);
    }

    @Test (dependsOnMethods = {"assertReturnCheckBoxIsChecked"})
    public void clickOnReturnCheckBox() {
       new AirHomePage(driver).clickOnReturnCheckBox();
    }

    @Test (dependsOnMethods = {"clickOnReturnCheckBox"})
    public void assertReturnCheckBoxIsUnchecked(){
        boolean b = new AirHomePage(driver).isReturnCheckBoxUnChecked();
        Assert.assertEquals(b, true);
    }

    @Test (dependsOnMethods = {"assertReturnCheckBoxIsUnchecked"})
    public void clickOnPassengersContainer() {
        new AirHomePage(driver).clickOnPassengersContainer();
    }

    @Test (dependsOnMethods = {"clickOnPassengersContainer"})
    public void assertIsPassengersPanelDisplayed() {
        boolean b = new AirHomePage(driver).isPassengersPanelDisplayed();
        Assert.assertEquals(b, true);
    }














}
