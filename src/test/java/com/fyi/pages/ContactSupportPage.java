package com.fyi.pages;

import com.fyi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactSupportPage {

    public ContactSupportPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@title='Contact Support']")
    public WebElement contactSupport;

    @FindBy(xpath = "//span[@class='follow-up-hint']/..")
    public WebElement submitRequestHeader;

    @FindBy(id = "query")
    public WebElement searchInput;

    @FindBy(xpath = "//h1[@class='search-results-subheading']")
    public WebElement searchResultHeader;
}
