package com.epam.stv.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Tatiana_Sauchanka on 10/11/2017.
 */
public class AirDefaultPage extends AirFactoryPage {

    @FindBy(xpath = "//a[@href='/en-EU/home']")
    private WebElement otherCountryItem;

    public AirDefaultPage (WebDriver driver){
        super(driver);
    }

    public AirHomePage clickOnOtherCountryLink() {
        System.out.println("Navigate to main page");
        otherCountryItem.click();
        return new AirHomePage(driver);
    }

    public boolean isOtherCountryItemDisplayed(){
        return otherCountryItem.isDisplayed();
    }


}

