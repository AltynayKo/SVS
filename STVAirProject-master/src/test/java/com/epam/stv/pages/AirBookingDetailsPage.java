package com.epam.stv.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Tatti on 15.10.2017.
 */
public class AirBookingDetailsPage extends AirFactoryPage {

    @FindBy(id = "price-breakdown")
    private WebElement priceBreakDownSection;

    public AirBookingDetailsPage(WebDriver driver){
        super(driver);
    }

    public AirBookingDetailsPage scrollPage(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)", "");
//        ((JavascriptExecutor)driver).executeScript("window.scrollBy(" + x + ","
//                + y + ");");
        return this;
    }

    public boolean isPriceBreakDownSectionDisplayed(){
        return priceBreakDownSection.isDisplayed();
    }

}
