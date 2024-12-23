package com.epam.stv.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Tatti on 15.10.2017.
 */
public class AirSearchPage extends AirFactoryPage {

    @FindBy(id = "openJawRouteSelection_DepartureStationOutbound-input")
    private WebElement outboundFromField;

    @FindBy(className = "panel--logo-search")
    private WebElement searchPanel;

    public AirSearchPage(WebDriver driver){
        super(driver);
    }

    public boolean isSearchPanelDisplayed(){
        return searchPanel.isDisplayed();
    }

    public AirSearchPage inputOutboundFromField(String text){
        outboundFromField.isDisplayed();
        outboundFromField.sendKeys(text);
        return this;
    }

}
