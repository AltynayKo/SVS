package com.epam.stv.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

/**
 * Created by Tatiana_Sauchanka on 10/11/2017.
 */
public class AirHomePage extends AirFactoryPage {

    @FindBy(css = "#desktop")
    private WebElement wantToGoPanel;

    @FindBy(css = "#routeSelection_DepartureStation-input")
    private WebElement fromField;

    @FindBy(css = "#routeSelection_ArrivalStation-input")
    private WebElement toField;

    @FindBy(css = "#dateSelection_IsReturnFlight-datepicker")
    private WebElement datePicker;

    @FindBy(xpath = "//label[@for='dateSelection_IsReturnFlight']")
    private WebElement returnCheckBox;

    @FindBy(css = "#booking-passengers-input")
    private WebElement passengersContainer;

    @FindBy(xpath = "//div[@class='togglepanel']/div[@class='passengers']")
    private WebElement passengersPanel;

    @FindBy(xpath = "//div[@data-testid='service-block-card-homepage___manage_booking-card-content']")
    private WebElement manageYourBookingItem;

    @FindBy(css = ".stamp.icon-font.icon-account")
    private WebElement bookingIcon;

    @FindBy(css = "div.selectfield.adults button.button.button-secondary.increase")
    private WebElement adultsIncreaseButton;

    @FindBy(css = "div.selectfield.children button.button.button-secondary.increase")
    private WebElement childrenIncreaseButton;

    @FindBy(xpath = ".//button[contains(text(),'Save')]")
    private WebElement saveButton;

    @FindBy(css = "div.panel_section.panel_section--button>div.panel_section-button-container")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@href='/en-EU/book-a-flight/flights/Deeplink/?m=combi&s=false&v=false']")
    private WebElement multiDestinationLink;

    public AirHomePage (WebDriver driver){
        super(driver);
    }

    public boolean isWantToGoPanelDisplayed(){
        WebElement dynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='Container_container__wlx_v Container_noPaddingXs__DpJ_5']")));
        return dynamicElement.isDisplayed();
    }

    public boolean isFromFieldDisplayed(){
        return fromField.isDisplayed();
    }

    public boolean isToFieldDisplayed(){
        return toField.isDisplayed();
    }

    public boolean isBookingIconDisplayed(){
        return bookingIcon.isDisplayed();
    }

    public boolean isDatePickerDisplayed(){
        return datePicker.isDisplayed();
    }

    public boolean isPassengersPanelDisplayed(){
        return passengersPanel.isDisplayed();
    }

    public boolean isSearchEnabled(){
        return searchButton.isEnabled();
    }

    public AirHomePage clickOnReturnCheckBox() {
        returnCheckBox.click();
        return new AirHomePage(driver);
    }

    public AirHomePage clickOnBookingIcon() {
        System.out.println("Navigate to Manage booking page");
        bookingIcon.click();
        return new AirHomePage(driver);
    }

    public AirHomePage clickOnPassengersContainer(){
        passengersContainer.click();
        return  this;
    }

    public AirHomePage clickOnManageYourBookingItem(){
        manageYourBookingItem.click();
        return  this;
    }

    public AirHomePage clickOnSaveButton(){
        saveButton.click();
        return  this;
    }

    public AirHomePage inputIntoFromField(String departurePlace){
       fromField.sendKeys(departurePlace);
        return this;
    }

    public AirHomePage inputIntoToField(String destinationPlace){
        toField.sendKeys(destinationPlace);
        return this;
    }

    public AirHomePage clickOnPlusAdultsIcon(){
        adultsIncreaseButton.click();
        return this;
    }

    public AirHomePage clickOnPlusChildrenIcon(){
        childrenIncreaseButton.click();
        return this;
    }

    public AirHomePage clickOnSearchButton(){
        searchButton.click();
        return this;
    }

    public AirSearchPage clickOnMultiDestinationLink(){
        multiDestinationLink.click();
        return  new AirSearchPage(driver);
    }

    private String getDatePickerAttribute() {
        String s = datePicker.getAttribute("placeholder");
        return s;
    }

    public boolean isReturnCheckBoxUnChecked(){
        String attribute = getDatePickerAttribute();
        return attribute.equals("Single flight");
    }

    public boolean isReturnCheckBoxChecked(){
        String attribute = getDatePickerAttribute();
        return attribute.equals("dd-mm-yyyy");
    }

}
