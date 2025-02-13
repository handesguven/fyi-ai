package com.fyi.step_def;

import com.fyi.pages.HamburgerMenuPage;
import com.fyi.pages.TermOfServicePage;
import com.fyi.utilities.BrowserUtilities;
import com.fyi.utilities.ConfigurationReader;
import com.fyi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class TermsOfServicePage_StepDef {
    TermOfServicePage termOfServicePage = new TermOfServicePage();
    HamburgerMenuPage hamburgerMenuPage =new HamburgerMenuPage();
    String actualTitle;
    @Given("the user navigates to main page")
    public void theUserNavigatesToMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fyiUrl"));

    }

    @And("the user clicks the {string} link")
    public void theUserClicksTheLink(String option) {
        hamburgerMenuPage.clickTheOption(option);
    }



    @Then("the title of the page should be {string}")
    public void theTitleOfThePageShouldBe(String expectedTitle) {
        actualTitle = termOfServicePage.termsOfServiceTitle.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }




    @When("the user scrolls to the bottom of the page")
    public void the_user_scrolls_to_the_bottom_of_the_page() {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(termOfServicePage.customMenu);


    }
    @Then("the copyright text {string} should be displayed correctly")
    public void the_copyright_text_should_be_displayed_correctly(String expectedText) {

       String actualText= termOfServicePage.fyiFyi.getText();
       Assert.assertEquals(expectedText,actualText);
    }



}
