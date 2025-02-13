package com.fyi.pages;

import com.fyi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermOfServicePage {

    public TermOfServicePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".u-custom-menu.u-nav-container")
    public WebElement customMenu;

    @FindBy(xpath = "(//a[@href=\"terms.html\"])[3]")
    public WebElement termsOfServiceLink;

    @FindBy(css = "p.u-small-text.u-text.u-text-variant.u-text-1")
    public WebElement fyiFyi;

    @FindBy(xpath = "//h1")
    public WebElement termsOfServiceTitle;




    public void the_user_clicks_on_the_link(String linkName) {
        if (linkName.equals("Terms of services")) {
          termsOfServiceLink.click();
        } else {
            throw new IllegalArgumentException("Link not found: " + linkName);
        }
    }

}
