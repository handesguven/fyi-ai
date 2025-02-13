package com.fyi.pages;

import com.fyi.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HamburgerMenuPage {

    public HamburgerMenuPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//div[@class=\"menu-collapse\"])[1]")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//ul[@class=\"u-nav u-unstyled u-nav-1\"]//a")
    public List<WebElement> hamburgerMenuOptions;

   public void clickTheOption(String option) {
       JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

       for (WebElement eachMenu : hamburgerMenuOptions) {
           String text = (String) js.executeScript("return arguments[0].textContent;", eachMenu);

           if (text.equalsIgnoreCase(option)) {
               js.executeScript("arguments[0].click();", eachMenu);
               break;
           }
       }
   }


}
