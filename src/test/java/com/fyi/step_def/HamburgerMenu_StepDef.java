package com.fyi.step_def;

import com.fyi.pages.HamburgerMenuPage;
import com.fyi.utilities.BrowserUtilities;
import com.fyi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HamburgerMenu_StepDef {
    HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();
    List<String> actualMenuOptions;

    @When("the user locates and clicks the Hamburger Menu")
    public void theUserLocatesAndClicksTheHamburgerMenu() {

        hamburgerMenuPage.hamburgerMenu.click();


        actualMenuOptions = new ArrayList<>();


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (WebElement eachMenu : hamburgerMenuPage.hamburgerMenuOptions) {
            String text = (String) js.executeScript("return arguments[0].textContent;", eachMenu);
            actualMenuOptions.add(text.trim());
        }

        System.out.println(actualMenuOptions);

    }



    @Then("the following menu options should be displayed:")
    public void the_following_menu_options_should_be_displayed(List<String> expectedMenuOptions) {

        Assert.assertEquals(expectedMenuOptions,actualMenuOptions);
    }



}
