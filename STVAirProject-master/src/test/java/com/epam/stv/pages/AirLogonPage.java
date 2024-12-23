package com.epam.stv.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Tatti on 13.10.2017.
 */
public class AirLogonPage extends AirFactoryPage {

    public AirLogonPage (WebDriver driver){
        super(driver);
    }

    @FindBy (className = "panel-bbl")
    private WebElement viewBookingPanel;

    @FindBy (id = "retrieveBookingByLastname_RecordLocator")
    private WebElement bookingNumberField;

    @FindBy (id = "retrieveBookingByLastname_LastName")
    private WebElement lastNameField;

    @FindBy (id = "retrieveBookingByLastname_FlightDate-datepicker")
    private WebElement flightDatePicker;

    @FindBy (xpath =".//button[contains(text(),'View booking')]")
    private WebElement viewBookingButton;

    public boolean isViewBookingPanelDisplayed(){
        return viewBookingPanel.isDisplayed();
    }

    public AirLogonPage inputBookingNumber(String bookingNumber) {
        bookingNumberField.isDisplayed();
        bookingNumberField.sendKeys(bookingNumber);
        return this;
    }

    public AirLogonPage inputLastName(String lastName) {
        lastNameField.isDisplayed();
        lastNameField.sendKeys(lastName);
        return this;
    }

    public AirLogonPage inputDate(String calendarDate) {
        flightDatePicker.isDisplayed();
        flightDatePicker.sendKeys(calendarDate);
        return this;
    }

    public AirBookingOverviewPage pressBookingButton(){
        viewBookingButton.isDisplayed();
        viewBookingButton.click();
        return new AirBookingOverviewPage(driver);
    }


}
