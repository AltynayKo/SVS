package com.epam.stv.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Tatti on 13.10.2017.
 */
public class AirBookingOverviewPage extends AirFactoryPage {

    @FindBy(xpath = "//a[@href='/en-EU/my-transavia/booking/booking-details/']")
    private WebElement bookingDetailsLink;

    public AirBookingOverviewPage(WebDriver driver){
        super(driver);
    }

    public AirBookingDetailsPage clickOnBookingDetailsLink(){
        bookingDetailsLink.click();
        return new AirBookingDetailsPage(driver);
    }


}
